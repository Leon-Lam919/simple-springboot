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
       - [x] General chat (broadcast messages to everyone in the room) --> GenChat branch
        - Private messages (DMs to people, one on one)
        - Group chats
            - select members to join and start chatting
- Have a presentable frontend
    - login page
    - chatrooms on left hand side
    - list of friends in contact with on top
    - list of group chats in seperate tab?

# TODO
-  [ ] Create private messages endpoint in the server side
    -   [ ] Create username/ password authentication for any new users trying to enter
    -   [ ] Create MYSql DB to store passwords/ usernames
- [x] Add username to every msg sent (client side, ask for username)
- [x] figure out the logout feat not working
- [ ] create user implementation file and add all necessary functions

#1/26
- Login created & mapped to correct static page
- TODO: 
  - [x] fix logout not working for static page

#1/27
- TODO: 
        - need to find out how to remap the index.html to the login page?
    - [ ] implement users making their own names/ passwords

# 1/28
- I think the issue might have to do with the way the MVCconfig is allowing to view the files, but after making changes to add/ remove home or index it still does not logout correctly.

# 1/29
- [x] look into Thymeleaf
- [x] figure out the logout feat not working
- [ ] look into adding user registration

# 1/31
- index file just needed to be moved to template folder for logout to map correctly due to using Thymeleaf

# 2/1
- [ ] look into adding user registration
- [x] create register page
- need to link it to the login page
- [ ] create DB that will hold user/ password information (salted)

# 2/3
- [ ] create DB that will hold user/ password information (salted)
    - figure out the schema, then implement
- [x] need to create docker images to then be ready to setup DB

# 2/5
- docker works, finally
- DB is setup, tables will need to be created
- use command 'docker-compose down -v && docker-compose up --build -d' to rebuild the docker container

# 2/9
- for accessing DB, use `docker-compose exec db mysql -u root -p`
- Created User table
    - need to create table for password/ any other necessary tables, CREATE SCHEMAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!

# 2/11
- added email col to db
- created entity model file called `user.java`
- created repo file to connect data layer into project

# 2/12
- added register page, not showing up on login with button to register and route to that page?

# 2/17
- fixed docker not updating and fixed login html page
- created a userServices interface that will need to be implemneted with another file

# 2/18
- worked on UserServicesImpl (still WIP)
- need to fix routing when running locally.
