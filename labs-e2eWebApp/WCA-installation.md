# Installation guide for WCA on VSCode

This document gives infomration on installing software tools with IDE VSCode that are needed to run ***Watson Code Assistant For Enterprise Java*** **(WCA4EJ)**

Last updated: Nov 21th, 2024

### 1. Install VSCode

- [VSCode Official Website](https://code.visualstudio.com/download) for installation


### 2. WCA4EJ API Key

As of now, API Key will be provided by IBMers. Please reach out to IBMers for help on this.


### 3. Download WCA4EJ extension

Download the latest WCA4EJ Code VSCode Extension: [WCA4EJ Extensions](https://ibm.box.com/s/aznj47sm8g4lorhei4vszgovm6zvecg0)
(PLEASE notify IBMers if you cannot access this link).

### 4. Installing Wca4ej extension


#### After downloding the extension from **Step 3**, install the WCA4EJ using VSCode by 

- nevigating to extension tab and **install from VSIX** 

![screenshot](../images/VSC_extension_install.png)

- select the WCA4EJ drivers downloaded `wca-for-eja-***.vsix`
and click install.

![screenshot](../images/VSC_WCA4EJ_extension.png)

- restart VSCode if necessary

- Login with WCA4EJ API Key at the bottom left corner of VSCode. After successfully signed in, the number indicator should be gone.

![screenshot](../images/VSC_WCA4J_Sign_in.png)

- If you encoutner issue during autherization that says **"administrator needs to associate you with a deployment space"**, please reach out to IBMers to setup deployment space again for your API Key. 

![screenshot](../images/VSC_WCA4J_Sign_in_error_1.png)

### 5. Start Using WCA4EJ

You can check by navigating to the **watsonx Code Assistant** tab if your API Key is setup correctly by opening the chat window of WCA4EJ and chat with the model.

![screenshot](../images/VSC_chat_with_model.png)
