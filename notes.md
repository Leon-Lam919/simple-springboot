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

# File information
- hello.java, chat.java --> request model that takes in the values from the client side
- Greeting.java, Global_chat.java --> response model, returns a formatted message from the server side to the client side
- GreetingController.java, GlobalChatController.java --> Listens for messages sent to the /hello endpoint, processes the information to return to client, then it is sent to the /topic/greeting endpoint where the client is subscribed to recieve the message

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
        [ x ] General chat (broadcast messages to everyone in the room) --> GenChat branch
        - Private messages (DMs to people, one on one)
        - Group chats
            - select members to join and start chatting
- Have a presentable frontend
    - login page
    - chatrooms on left hand side
    - list of friends in contact with on top
    - list of group chats in seperate tab?

# TODO
[ ] Create private messages endpoint in the server side
    [ ] Create username/ password authentication for any new users trying to enter
    [ ] Create MYSql DB to store passwords/ usernames
[ x ] Add username to every msg sent (client side, ask for username)
[ ] 
[ ]
[ ]
