**WebAutomation-TestNG-OrangeHRM**

In this repository, I have automated the OrangeHRM with different scenario. Create Smoke & Master Suite for easy execution. Also generated the Allure Report for better visibility.

**Technology used:**

- Selenium Webdriver
- TestNG Framework
- Java
- Gradle
- Intellij idea
- Allure Report

** How to run this project**

- Clone this project
- Hit the following command into the terminal:
 ```gradle clean test```
 
- For generating Allure Report, use these commands:
```allure generate allure-results --clean -o allure-report``` and
```allure serve allure-results```

** Assigned Work Scenario:**

1. log in as an admin to https://opensource-demo.orangehrmlive.com/
2. Go to the PIM menu and create a new employee. Save the employee firstname, lastname, employeeid, username and password into JSONArray file. Generate random password which meets the following criteria:
For a strong password, please use a hard-to-guess combination of text with upper and lower-case characters, symbols and numbers. Assert if employee is created successfully.
3. Now go to the dashboard again and search by the employee id to check if the employee is found _(could not generate because in the dashboard panel, there is no search functionality exist. There I have search for the employee username from ADMIN tab)_
4. Now go to the Directory menu and search by employee name and check if the employee is found
5. Logout of the session.
6. Now log in with the newly created employee creds
7. Assert your full name is showing beside the profile icon.
8. Go to my info
9. Scroll down and select Gender and Blood Type as O+ and save it. Then logout the user.
10. Create a smoke suite configuration that will run only the following features (positive cases only):

- Login to admin
- search by the employee id if found
- logout admin and login to the employee id you created last
- Update the blood Group as AB-
- Logout the user

**Test case sheet:**

https://docs.google.com/spreadsheets/d/1-RC1HgEJm_2bM41JdL4L5vdZrwB3cjjycT649Tx8DF0/edit?usp=sharing

#   O r a n g e H R M - A u t o m a t i o n - T e s t i n g 


 
 ![Screenshot_2](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/a84607df-8478-46b0-9077-59a01cce6989)
![Screenshot_4](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/ae941147-e27b-4ded-bb88-6ec7010e6daf)

![Screenshot_3](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/de68780d-1353-4ef2-9a85-b2945c76fcf8)
![Screenshot_5](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/d6424946-b846-4f0a-b8be-dd6a97415a81)
