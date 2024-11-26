# Installation guide for WCA on VSCode

This document gives infomration on installing software tools with IDE VSCode that are needed to run ***Watson Code Assistant For Enterprise Java*** **(WCA4EJ)**

Last updated: Nov 21th, 2024

## Prerequisite
- Watson Code Assistant installed
- If its not, follow the following [guide](https://github.com/sidharthmittal25/wca4ej-workshop/blob/main/labs-e2eWebApp/WCA-installation.md)

## Environment setup 

### 1. Java 11 installation

- Add java to `PATH` variable and set `JAVA_HOME` envitonment variable
- **For Mac**:
  - Install homebrew via terminal
      ```bash
      /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
      ```
  - Install openjdk 11 via homebrew
      ```bash
      brew install openjdk@11
      ```
      ```bash
      brew link --force --overwrite openjdk@11
      ```
  - Change JAVA_HOME version
      ```bash
      export JAVA_HOME=$(/usr/libexec/java_home -v 11)
      ```
  - Check if JAVA version is updated (showing V11)
      ```bash
      echo $JAVA_HOME
      ```
  - If its not showing the right version, run the following lines to symlink
      ```bash
      sudo ln -sfn /opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk
      ```
  - Rerun the following
      ```bash
      export JAVA_HOME=$(/usr/libexec/java_home -v 11)
      ```
  - Check if JAVA version is updated (showing V11)
      ```bash
      echo $JAVA_HOME
      ```

- **For Windows**:
  - [Download Java for Windows](https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=406&field_operating_system_target_id=436&field_architecture_target_id=All&field_java_package_target_id=396)

  - Open Environment variables using windows search bar (search for edit environment variables in the search bar)
  
  ![image](https://github.com/user-attachments/assets/d0099fe2-72c1-4594-8b5f-8075f2d6bced)

  - Set JAVA_HOME variable using Environment variables (click on new if you do not have a JAVA_HOME set or click on edit to change the existing JAVA_HOME, and point it to the Java you installed in the earlier steps:
    
  ![image](https://github.com/user-attachments/assets/cbb009b7-159a-48d2-8bb6-c113968477b0)

    ```bash
    JAVA_HOME= C:\Program Files\Java\jdk-11
    ```
    
  - Add Java to PATH using Environment variables:
 
  ![image](https://github.com/user-attachments/assets/8925e501-5db6-449b-9ad4-eef44ea253cf)
 
    ```bash
    %JAVA_HOME%\bin
    ```
