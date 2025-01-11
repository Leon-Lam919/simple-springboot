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

- [x] created end point 
- [x] change ports
- [x] add new endpoints
- [x] connect to DB
# Things to learn
- learn/explain what @SpringBootApplication is
- learn/explain what @RestController
- learn/explain what @GetMapping
    - Maps the file path for HTTP request
    - ex: "/" is the home path
    - ex: "home" maps to the "home" page of the website and etc...

#Creating simple chat backend
1. add dependencies
2. Enable websocket configuration
3. Create WebSocket Handler
4. Define Endpoint Mapping
5. Test websocket
6. profit?

MVP:
- Have a working backend
    - Create each endpoint for the frontend to connect to:
        - General chat (broadcast messages to everyone in the room) --> GenChat branch
        - Private messages (DMs to people, one on one)
        - Group chats
            - select members to join and start chatting
- Have a presentable frontend
    - login page
    - chatrooms on left hand side
    - list of friends in contact with on top
    - list of group chats in seperate tab?


