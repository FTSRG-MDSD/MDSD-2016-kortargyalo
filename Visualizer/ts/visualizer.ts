/// <reference path="../typings/browser.d.ts" />

module DroneVisualizer {

    export class Visualizer {

        private camera: THREE.PerspectiveCamera;
        private scene: THREE.Scene;
        private renderer: THREE.WebGLRenderer;
        private controls: THREE.OrbitControls;

        private lastFrame: number;

        constructor() {
            this.initCamera();
            this.initScene();
            this.initRenderer();
            this.initControls();
            this.scene.add(this.createGround());
            this.scene.add(this.createObstacle({ x: 8, y: 0, z: 8 }, { x: 8, y: 24, z: 8 }));
            this.scene.add(this.createObstacle({ x: 8, y: 24, z: 8 }, { x: 32, y: 16, z: 32 }));
            this.scene.add(this.createObstacle({ x: 8, y: 40, z: 8 }, { x: 16, y: 16, z: 16 }));
            this.scene.add(this.createRegion({ x: 0, y: 0, z: 0 }, { x: 128, y: 128, z: 128 }));
            this.scene.add(this.createDrone({ x: 35, y: 5, z: 24 }, { x: 4, y: 2, z: 4 }));
        }

        get domElement() {
            return this.renderer.domElement;
        }

        start() {
            var animate = (() => {
                requestAnimationFrame(animate);
                this.maybeRender();
            }).bind(this);
            animate();
            this.controls.update();
        }

        resize(width: number, height: number) {
            this.camera.aspect = width / height;
            this.camera.updateProjectionMatrix();
            this.renderer.setSize(width, height);
        }

        private maybeRender() {
            var hidden = document.hidden || document.msHidden;
            if (!hidden) {
                this.render();
            }
        }

        private render() {
            var now = Date.now();
            this.renderer.render(this.scene, this.camera);
            this.lastFrame = now;
        }

        private initCamera() {
            this.camera = new THREE.PerspectiveCamera(45, null, 1, 10000);
            this.camera.position.set(-500, 500, 500);
        }

        private initScene() {
            this.scene = new THREE.Scene();
            this.scene.add(new THREE.AmbientLight(0x808080));
            this.scene.add(this.createDirectionalLight());
        }

        private initRenderer() {
            this.renderer = new THREE.WebGLRenderer({
                antialias: true,
                clearColor: 0x000000,
                devicePixelRatio: window.devicePixelRatio
            });
            this.renderer.shadowMap.enabled = true;
            this.renderer.shadowMap.type = THREE.PCFSoftShadowMap;
        }

        private initControls() {
            this.controls = new THREE.OrbitControls(this.camera, this.domElement);
            this.controls.target.set(0, 0, 0);
        }

        private createDirectionalLight() {
            var directionalLight = new THREE.DirectionalLight(0xffffff, 0.8);
            directionalLight.position.set(350, 1750, 450);

            var d = 200;

            directionalLight.shadowCameraLeft = -d;
            directionalLight.shadowCameraRight = d;
            directionalLight.shadowCameraTop = d;
            directionalLight.shadowCameraBottom = -d;
            directionalLight.shadowCameraFar = 10000;

            directionalLight.castShadow = true;
            directionalLight.shadow.mapSize.width = 4096;
            directionalLight.shadow.mapSize.height = 4096;

            return directionalLight;
        }

        private createGround() {
            function setUpGroundTexture(url: string) {
                var texture = new THREE.TextureLoader().load(url);
                texture.minFilter = THREE.LinearMipMapLinearFilter;
                texture.magFilter = THREE.NearestFilter;
                texture.wrapS = THREE.RepeatWrapping;
                texture.wrapT = THREE.RepeatWrapping;
                texture.anisotropy = 2;
                texture.repeat.set(8, 8);
                return texture;
            }

            var texture = setUpGroundTexture("texture/grid.png");
            var spec = setUpGroundTexture("texture/grid_spec.png");

            var geometry = new THREE.PlaneGeometry(1024, 1024, 16, 16);
            var material = new THREE.MeshPhongMaterial({
                map: texture,
                specularMap: spec,
                side: THREE.DoubleSide
            });

            var plane = new THREE.Mesh(geometry, material);
            plane.rotation.x = -Math.PI / 2;
            plane.castShadow = false;
            plane.receiveShadow = true;

            return plane;
        }

        private createObstacle(position: any, size: any) {
            var geometry = new THREE.BoxGeometry(size.x, size.y, size.z);
            var material = new THREE.MeshPhongMaterial({
                map: THREE.ImageUtils.loadTexture('texture/obstacle.png')
            });
            var cube = new THREE.Mesh(geometry, material);
            cube.position.set(position.x, position.y + (size.y / 2) + 0.05, position.z);
            cube.castShadow = true;
            cube.receiveShadow = true;

            return cube;
        }

        private createRegion(position: any, size: any) {
            var geometry = new THREE.BoxGeometry(size.x, size.y, size.z);
            var borderTexture = THREE.ImageUtils.loadTexture('texture/region.png');
            borderTexture.magFilter = THREE.NearestFilter;
            var borderMaterial = new THREE.MeshPhongMaterial({
                map: borderTexture,
                emissiveMap: borderTexture,
                emissive: 0xffffff,
                side: THREE.DoubleSide,
                transparent: false,
                alphaTest: 0.5,
                depthWrite: true
            });
            var cube = new THREE.Mesh(geometry, borderMaterial);

            var transparentMatrial = new THREE.MeshPhongMaterial({
                color: 0xffffff,
                side: THREE.DoubleSide,
                transparent: true,
                opacity: 0.25,
                depthWrite: false
            });
            var sides = new THREE.Mesh(geometry, transparentMatrial);

            var obj = new THREE.Object3D();
            obj.add(cube);
            obj.add(sides);
            obj.position.set(position.x, position.y + (size.y / 2) + 0.05, position.z);

            return obj;
        }

        private createDrone(position: any, size: any) {
            var geometry = new THREE.BoxGeometry(size.x, size.y, size.z);
            var material = new THREE.MeshPhongMaterial({
                color: 0x00ff00
            });
            var cube = new THREE.Mesh(geometry, material);
            cube.position.set(position.x, position.y + (size.y / 2) + 0.05, position.z);
            cube.castShadow = true;
            cube.receiveShadow = true;
            return cube;
        }
    }
}