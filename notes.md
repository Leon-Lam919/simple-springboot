file structure:
├───.mvn
│   └───wrapper
├───.settings
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───example
│   │   │           └───simple_spingboot
│   │   └───resources
│   │       ├───static
│   │       └───templates
│   └───test
│       └───java
│           └───com
│               └───example
│                   └───simple_spingboot
└───target
    ├───classes
    │   └───com
    │       └───example
    │           └───simple_spingboot
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-archiver
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    ├───surefire-reports
    └───test-classes
        └───com
            └───example
                └───simple_spingboot

[x] created end point 
[x] change ports
[x] add new endpoints
[ ] connect to DB
- learn/explain what @SpringBootApplication is
- learn/explain what @RestController
- learn/explain what @GetMapping
    - Maps the file path for HTTP request
    - ex: "/" is the home path
    - ex: "home" maps to the "home" page of the website and etc...
