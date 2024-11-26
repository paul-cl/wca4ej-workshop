# Lab2: Code Generation

This document gives step-by-step guide to finish Lab2.

## Lab2 covers:

- Generating a frontend code based on a backend system


### 1. Create a frontend based on a REST API endpoint
- Open a new WCA Chat (Click on start new chat session) and have the empty **index.html** tab open
- <img width="559" alt="image" src="https://github.com/user-attachments/assets/0dfee1f3-5180-4560-8619-0865fa98167a">
- We are going to provide a REST API endpoint to create new users from UsersApi.java
- Type in this to the chat
    ```bash
    Here is a REST API endpoint to create new users:
    
    @RestController @AllArgsConstructor public class UsersApi { private UserRepository userRepository; private
    UserQueryService userQueryService; private PasswordEncoder passwordEncoder; private JwtService
    jwtService; private UserService userService; @RequestMapping(path = "/users", method = POST) public
    ResponseEntity createUser(@Valid @RequestBody RegisterParam registerParam) { User user =
    userService.createUser(registerParam); UserData userData = userQueryService.findById(user.getId()).get();
    return ResponseEntity.status(201).body(userResponse(new UserWithToken(userData,
    jwtService.toToken(user)))); }

    Make an HTML file that calls a script that can call this post endpoint to create a new user. Here is how to call it using a curl command:

    curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d
    '{ "user": { "username":"oscar", "email": "oscar@example.com", "password": "securePassword123" }}'

    Display a greeting message upon successful creation of an account. Display the error message when errors happen.
    ```
- You should receive a response which looks like this
- <img width="429" alt="image" src="https://github.com/user-attachments/assets/72f55805-58a9-4e3e-adfb-00d23f5cb38d">
- Copy and paste into **index.html**

### 2. Verify that application is working
- In a new terminal, navigate to the **backend** folder (cd backend from E2EWEBAPP) and run the following command
    ```bash
    ./gradlew bootRun
    ```
- Once it stays at around 83%, means its working as intended
- <img width="1188" alt="image" src="https://github.com/user-attachments/assets/6f46750d-5cd6-45ee-91ca-0069079253f8">
- Next is to deploy the frontend server
- Navigate to **frontend** folder (cd frontend from E2EWEBAPP) and run the following lines
    ```bash
    npm install -g http-server
    http-server .
    ```
- Click on one of the servers to open it in a browser
- <img width="1188" alt="image" src="https://github.com/user-attachments/assets/b141741a-31f4-48c9-8615-2913ce758a00">
- Test out the form by entering any random test data

### 3. Generation of javascript
- In the WCA chat window, type the following
    ```bash
    Seperate the script and create a new file for it
    ```
- The response will be a seperated html and javascript code
- <img width="534" alt="image" src="https://github.com/user-attachments/assets/1806fbbc-19f9-4561-a813-ee0ac1f26fce">
- <img width="534" alt="image" src="https://github.com/user-attachments/assets/0005af3a-f832-489c-b27e-2362635f2d1b">
- Paste the new HTML code into **index.html** and javascript code into **createUser.js**
- Ensure the script name in the **index.html** file matches the javascript file name
- <img width="615" alt="image" src="https://github.com/user-attachments/assets/7634f29e-e001-48ea-881f-08d60701e703">
- Repeat step 2 to test functionality of the script

### 4. Make the Create User page nicer
- In the WCA chat window, type
    ```bash
    Create a stylesheet to make this look nicer
    ```
- You should be receiving a response similar to the picture below
- <img width="953" alt="image" src="https://github.com/user-attachments/assets/ae796ab6-48a4-4135-87af-13f671433901">

- Copy and paste it into **style.css** file
- Delete the line that says “// Assisted by watsonx Code Assistant” from the CSS
- Next, connect this **style.css** with **index.html**
- <img width="609" alt="image" src="https://github.com/user-attachments/assets/b9ece7ba-fcba-405c-a56e-51a2488c8adf">
- Repeat step 2 to run the application
- You should be getting the following create user UI
- <img width="615" alt="image" src="https://github.com/user-attachments/assets/24443aa9-a03f-4728-946a-61c742893b23">

# More tips and tricks of using WCA
- [Getting code suggestions](https://cloud.ibm.com/docs/watsonx-code-assistant?topic=watsonx-code-assistant-wca-generate-code)
- [License code blocking](https://cloud.ibm.com/docs/watsonx-code-assistant?topic=watsonx-code-assistant-wca-license-reference)





