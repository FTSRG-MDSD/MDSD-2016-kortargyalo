var visualizer;
window.onload = function (e) {
    init();
    animate();
};
function init() {
    visualizer = new Object();
    initScene();
    initMisc();
    createObstacle({
        x: 8,
        y: 0,
        z: 8
    }, {
        x: 8,
        y: 24,
        z: 8
    });
    createObstacle({
        x: 8,
        y: 24,
        z: 8
    }, {
        x: 32,
        y: 16,
        z: 32
    });
    createObstacle({
        x: 8,
        y: 40,
        z: 8
    }, {
        x: 16,
        y: 16,
        z: 16
    });
    createDrone({
        x: 34,
        y: 5,
        z: 24
    }, {
        x: 4,
        y: 2,
        z: 4
    });
    createRegion({
        x: 0,
        y: 0,
        z: 0
    }, {
        x: 128,
        y: 128,
        z: 128
    });
    document.body.appendChild(visualizer.renderer.domElement);
    window.addEventListener('resize', onWindowResize, false);
}
function initScene() {
    visualizer.camera = new THREE.PerspectiveCamera(45, window.innerWidth / window.innerHeight, 1, 10000);
    visualizer.camera.position.set(-500, 500, 500);
    visualizer.scene = new THREE.Scene();
    var ambientLight = new THREE.AmbientLight(0x808080);
    visualizer.scene.add(ambientLight);
    var directionalLight = new THREE.DirectionalLight(0xffffff, 0.8);
    directionalLight.position.set(350, 1750, 450);
    var d = 200;
    directionalLight.shadowCameraLeft = -d;
    directionalLight.shadowCameraRight = d;
    directionalLight.shadowCameraTop = d;
    directionalLight.shadowCameraBottom = -d;
    directionalLight.castShadow = true;
    directionalLight.shadowMapWidth = 4096;
    directionalLight.shadowMapHeight = 4096;
    directionalLight.shadowCameraFar = 10000;
    directionalLight.shadowDarkness = 0.5;
    visualizer.scene.add(directionalLight);
    function setUpGroundTexture(url) {
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
    var geometry = new THREE.PlaneGeometry(1024, 1024);
    var material = new THREE.MeshPhongMaterial({
        map: texture,
        specularMap: spec,
        side: THREE.DoubleSide
    });
    var plane = new THREE.Mesh(geometry, material);
    plane.rotation.x = -Math.PI / 2;
    plane.castShadow = false;
    plane.receiveShadow = true;
    visualizer.scene.add(plane);
}
function initMisc() {
    visualizer.renderer = new THREE.WebGLRenderer({
        antialias: true
    });
    visualizer.renderer.setClearColor(0x000000);
    visualizer.renderer.setPixelRatio(window.devicePixelRatio);
    visualizer.renderer.setSize(window.innerWidth, window.innerHeight);
    visualizer.renderer.shadowMap.enabled = true;
    visualizer.renderer.shadowMap.type = THREE.PCFSoftShadowMap;
    visualizer.controls = new THREE.OrbitControls(visualizer.camera, visualizer.renderer.domElement);
    visualizer.controls.target.set(0, 0, 0);
    visualizer.controls.update();
}
function onWindowResize() {
    visualizer.camera.aspect = window.innerWidth / window.innerHeight;
    visualizer.camera.updateProjectionMatrix();
    visualizer.renderer.setSize(window.innerWidth, window.innerHeight);
}
function animate() {
    setTimeout(function () {
        requestAnimationFrame(animate);
    }, 1000 / 25);
    render();
}
function render() {
    visualizer.renderer.render(visualizer.scene, visualizer.camera);
}
function createObstacle(position, size) {
    var geometry = new THREE.BoxGeometry(size.x, size.y, size.z);
    var material = new THREE.MeshPhongMaterial({
        map: THREE.ImageUtils.loadTexture('texture/obstacle.png')
    });
    var cube = new THREE.Mesh(geometry, material);
    cube.position.set(position.x, position.y + (size.y / 2) + 0.05, position.z);
    cube.castShadow = true;
    cube.receiveShadow = true;
    visualizer.scene.add(cube);
}
function createRegion(position, size) {
    var geometry = new THREE.BoxGeometry(size.x, size.y, size.z);
    var material = new THREE.MeshPhongMaterial({
        map: THREE.ImageUtils.loadTexture('texture/region.png'),
        side: THREE.DoubleSide,
        transparent: true,
        depthWrite: false
    });
    var cube = new THREE.Mesh(geometry, material);
    cube.position.set(position.x, position.y + (size.y / 2) + 0.05, position.z);
    visualizer.scene.add(cube);
}
function createDrone(position, size) {
    var geometry = new THREE.BoxGeometry(size.x, size.y, size.z);
    var material = new THREE.MeshPhongMaterial({
        color: 0x00ffff
    });
    var cube = new THREE.Mesh(geometry, material);
    cube.position.set(position.x, position.y + (size.y / 2) + 0.05, position.z);
    cube.castShadow = true;
    cube.receiveShadow = true;
    visualizer.scene.add(cube);
}
