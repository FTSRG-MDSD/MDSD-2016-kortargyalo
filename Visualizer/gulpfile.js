var gulp = require('gulp');
var ts = require('gulp-typescript');
var concat = require('gulp-concat');
var minify = require('gulp-uglify');
var sourcemaps = require('gulp-sourcemaps');
var sass = require('gulp-sass');
var tsProject = ts.createProject('tsconfig.json');

gulp.task('scripts', function () {
    tsProject.sortOutput = true;
    tsProject.declarationFiles = false;
    tsProject.noExternalResolve = true;
    gulp.src(['typings/browser.d.ts', 'typings/browser/**/*.d.ts', 'ts/**/*.ts'])
        .pipe(sourcemaps.init())
        .pipe(ts(tsProject))
        .pipe(concat('visualizer.min.js'))
        .pipe(minify())
        .pipe(sourcemaps.write('.'))
        .pipe(gulp.dest('js'));
});

gulp.task('sass', function () {
    gulp.src('sass/**/*.scss')
        .pipe(sass.sync().on('error', sass.logError))
        .pipe(gulp.dest('css'));
});

gulp.task('watch', ['scripts', 'sass'], function () {
    gulp.watch('ts/**/*.ts', ['scripts']);
    gulp.watch('sass/**/*.scss', ['sass']);
});

gulp.task('default', ['scripts', 'sass']);