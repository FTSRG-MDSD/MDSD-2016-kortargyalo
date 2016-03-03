/// <reference path="../typings/browser.d.ts" />
/// <reference path="visualizer.ts" />

module DroneVisualizer {

    $(document).ready(() => {
        var visualizer = new Visualizer();
        visualizer.resize(window.innerWidth, window.innerHeight);
        $(document.body).append(visualizer.domElement);
        $(window).resize(() => {
            visualizer.resize(window.innerWidth, window.innerHeight);
        });
        visualizer.start();
    });
}
