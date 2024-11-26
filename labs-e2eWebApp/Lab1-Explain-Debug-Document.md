# Lab1: Explain, Debug, Documentation

This document gives step-by-step guide to finish Lab1.

## Lab1 covers:

- Introduction to Explainataion feature of WCA
- Introduction to Documentation feature of WCA

### 1. Code Asset Download

Git clone [GitHub repository](https://github.com/sidharthmittal25/wca4ej-workshop/tree/main) to your location of choice.


### 2. Lab setup

- Open the cloned repository via VScode and navigate to e2eWebApp directory/folder
- Once done, open the following files via the search bar at the top of VScode application
  - UsersApi.java
  - UsersApiTest.java
  - Index.html
  - create-user.js
  - styles.css
<img width="723" alt="image" src="https://github.com/user-attachments/assets/286f83d0-3a79-4480-b07c-2db23821ae9f">


### 3. Testing out the application
- Navigate to the **backend** directory/folder of the e2eWebApp and run the following command
  ```bash
  /gradlew test”
  ```
- You can see that there are failures
<img width="690" alt="image" src="https://github.com/user-attachments/assets/c2e429ab-5e66-4efc-9b15-1b43bd1736f6">
- Click on the report to open the file
- Scroll to line 74/75 to reveal the failed test case
<img width="690" alt="image" src="https://github.com/user-attachments/assets/51796dc6-0198-4f80-afe5-45b0c6efc5d7">
- Open up UsersApiTest.java and scroll to lines 69 – 100
<img width="683" alt="image" src="https://github.com/user-attachments/assets/d805ab13-e4cd-478e-831e-a6bf3652f9bf">
- Here is the failed test case. We can see the /users endpoint failed to create a user
- Open up UsersApi.java and go to lines 39 - 46
<img width="684" alt="image" src="https://github.com/user-attachments/assets/2b62bec3-5224-4c5a-8367-233896370fcc">
- You can see the method is passing a 404 status code which is causing the error

### 4. Code Summary Feature in UsersApi.java
- Right click on the file name and use the explain feature
<img width="511" alt="image" src="https://github.com/user-attachments/assets/34ea48fb-11a4-460a-a930-0b9a3c86e04c">
- Then click on the explain feature of the first method
<img width="680" alt="image" src="https://github.com/user-attachments/assets/9963ece5-a55a-4e47-b692-a89e107f984d">
- As you can see, these are the capabilities of WCA where we are able to explain a code based on file level and method level

### 5. Debug (Change Summary Feature)
- From the code explanation, the method is implemented wrong. Change line 43 from “404” to “201”
- Save the changes via Ctrl S

### 6. Documentation
- With these bugs, its good to document your code to ensure readability for the next developer
- Click on document code lens for the login method in the same file (UsersApi.java)
- Copy and paste the new documentation above the method
<img width="763" alt="image" src="https://github.com/user-attachments/assets/52858094-573f-4bc8-b421-8d422702a247">

### 7. Rerun tests
- Ensure you are in the **backend** directory/folder of the e2eWebApp and run the following command
  ```bash
  /gradlew test”
  ```
- You should be seeing all tests pass after the changes made!
<img width="877" alt="image" src="https://github.com/user-attachments/assets/5a2ef43c-7c1a-4de2-834d-b88986d961f4">





