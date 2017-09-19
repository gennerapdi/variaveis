module.exports = function (grunt) {

    grunt.initConfig({

        auto_install : {
            local : {},
            subdir : {
                options : {
                    cwd : '',
                    stdout : true,
                    stderr : true,
                    failOnError : true
                }
            }
        },
        
        sass: {
        	dist: { 
        	    options: {
        	    	style: 'expanded',
        	        compress: false,
        	        sourcemap: 'none'
        	    },
        		files: {
        	        'css/bootstrap-override.css': 'sass/bootstrap-override.scss',
        	        'css/style.css': 'sass/style.scss'
        		}
    	    }
        },
        
		watch: {
			css: {
				files: '**/*.scss',
				tasks: ['sass']
			}
		},

        concat : {
            lib : {
                src : [
                    'assets/lib/jquery/dist/jquery.js',
                    'assets/lib/jquery-ui/jquery-ui.js',
                    'assets/lib/bootstrap/dist/js/bootstrap.js',
                    'assets/lib/angular/angular.js',
                    'assets/lib/angular-md5/angular-md5.js',             
                    'assets/lib/angular-ui-router/release/angular-ui-router.js',
                    'assets/lib/ngstorage/ngStorage.js'
                ],
                dest : 'dist/lib/lib.min.js'
            },
            md : {
                src : [
                    'assets/js/app.js',
                    'assets/js/app.route.js',
                    'assets/js/run/*.js',
                    'assets/js/handler/**/*.js',
                    'assets/js/controller/**/*.js',
                    'assets/js/service/*.js',
                    'assets/js/interceptor/*.js'
                ],
                dest : 'dist/js/md.min.js'
            },
            css : {
                src : [
                    'assets/lib/bootstrap/dist/css/bootstrap.css',
                    'assets/lib/font-awesome/css/font-awesome.css',
                    'assets/css/bootstrap-override.css',
                    'assets/css/style.css'
                ],
                dest : 'dist/css/styles.css'
            }
        },

        clean : {
            dist : [ 'dist/' ],
            files : [ 'dist/js/md.js', 'dist/lib/lib.js' ]
        },

        copy : {
            main : {
                files : [ {
                    expand : true,
                    cwd: 'assets/lib/font-awesome/fonts',
                    src : ['*.*'],
                    dest : 'dist/fonts/'
                }, {
                    expand : true,
                    cwd: 'assets/lib/bootstrap/fonts',
                    src : ['*.*'],
                    dest : 'dist/fonts/'
                }, {
                    expand : true,
                    src : [ 'assets/fonts/**' ],
                    dest : 'dist/'
                }, {
                    expand : true,
                    src : [ 'images/**' ],
                    dest : 'dist/'
                }, {
                    expand : true,
                    src : [ 'views/**' ],
                    dest : 'dist/'
                } ]
            }
        },

        uglify : {
            dist : {
                src : 'dist/js/md.js',
                dest : 'dist/js/md.min.js'
            }
        },

        karma : {
            teste : {
                configFile : 'karma.conf.js',
            },
            dev : {
                configFile : 'karma.conf.maven.desenvolvimento.js',
            },
            producao : {
                configFile : 'karma.conf.maven.producao.js',
            }
        },

        jshint : {
            options : {
                curly : true,
                eqeqeq : true,
                immed : true,
                latedef : true,
                newcap : true,
                noarg : true,
                sub : true,
                undef : false,
                unused : true,
                boss : true,
                eqnull : true,
                browser : true,
                globals : {
                    jQuery : true
                }
            },
            all : [ 'Gruntfile.js', 'js/**/*.js', 'test/**/*.js' ]
        },

        htmlmin : {
            all : {
                options : {
                    removeComments : true,
                    collapseWhitespace : true
                },
                files : [ {
                    'dist/index.html' : 'index-production.html'
                } ]
            }
        }

    });

    grunt.loadNpmTasks('grunt-auto-install');
    grunt.loadNpmTasks('grunt-replace');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-qunit');
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-connect');
    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-sass');
	grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-contrib-imagemin');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-htmlmin');
    grunt.loadNpmTasks('grunt-karma');

    grunt.registerTask('install',   [ 'auto_install' ]);
    grunt.registerTask('dev',       [ 'clean', 'concat', 'sass'/*, 'karma:dev'*/ ]);
    grunt.registerTask('prod',      [ 'auto_install', 'clean:dist', 'concat', 'sass', 'uglify', 'copy', 'htmlmin'/*, 'karma:producao'*/, 'clean:files' ]);

};
