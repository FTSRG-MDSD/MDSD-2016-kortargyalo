var gulp = require('gulp');
var ts = require('gulp-typescript');
var tsd = require('gulp-tsd');
var concat = require('gulp-concat');
var minify = require('gulp-uglify');
var sourcemaps = require('gulp-sourcemaps');
var sass = require('gulp-sass');
var browserSync = require('browser-sync');
var tsProject = ts.createProject('tsconfig.json');

gulp.task('tsd', function (callback) {
    tsd({
        command: 'reinstall',
        config: 'tsd.json'
    }, callback);
});

gulp.task('scripts', ['tsd'], function () {
    tsProject.sortOutput = true;
    tsProject.declarationFiles = false;
    tsProject.noExternalResolve = true;
    gulp.src(['typings/**/*.d.ts', 'ts/**/*.ts'])
        .pipe(sourcemaps.init())
        .pipe(ts(tsProject))
        .pipe(concat('visualizer.min.js'))
        .pipe(minify())
        .pipe(sourcemaps.write('.'))
        .pipe(gulp.dest('js'));
});

gulp.task('scripts-reload', ['scripts'], function () {
    browserSync.reload({stream: true});
});

gulp.task('sass', function () {
    gulp.src('sass/**/*.scss')
        .pipe(sass.sync().on('error', sass.logError))
        .pipe(gulp.dest('css'));
});

gulp.task('sass-reload', ['sass'], function () {
    browserSync.reload();
});

gulp.task('watch', ['scripts', 'sass'], function () {
    browserSync({
        server: {baseDir: '.'},
        port: 4000
    });
    gulp.watch('sass/**/*.scss', ['sass-reload']);
    gulp.watch('ts/**/*.ts', ['scripts-reload']);
});

gulp.task('default', ['scripts', 'sass']);