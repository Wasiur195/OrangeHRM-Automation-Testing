WebAutomation-TestNG-OrangeHRM
In this repository I have automated the OrangeHRM with different scenario. Create Smoke & Master Suite for easy execution. Also generated the Allure Report for better visibility.

Technology used:
Selenium Webdriver
TestNG Framework
Java
Gradle
Intellij idea
Allure Report
How to run this project
Clone this project

Hit the following command into the terminal: gradle clean test

For generating Allure Report use these commands: allure generate allure-results --clean -o allure-report and allure serve allure-results

Assigned Work Scenerio:
log in as a admin to https://opensource-demo.orangehrmlive.com/

Go to PIM menu and create a new employee. Save the employee firstname, lastname, employeeid, username and password into JSONArray file. Generate random password which meets following criteria: For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers. Assert if employee is created successfully.

Now go to the dashboard again and search by the employee id to check if the employee is found (could not generate because in the dashboard panel, there is no search functionality exist. There i have search the employee username from ADMIN tab)

Now go to the Directory menu and search by employee name and check if the employee is found

Logout the session.

Now login with the newly created employee creds

Assert your full name is showing besides the profile icon.


Create a smoke suite configuration which will run only following features (positive cases only):

Login to admin
search by the employee id if found
logout admin and login to the employee id you created last
Update the blood Group as AB-
Logout the user
Test case sheet:
https://docs.google.com/spreadsheets/d/1AKjAu7iSBNI2xwp70czkzqSsnH5yqB3ezG7jvcUPHk4/edit?usp=sharing

Allure Report for Master Suite Execution:
![Screenshot_2](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/5f36eff3-f6e5-432d-9419-b80da25d6cb7)
![Screenshot_3](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/113ede91-d756-4f14-97af-36d4a92b9afd)
![Screenshot_5](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/aade6bc4-2a56-4eb4-891b-236a22603fbb)
![Screenshot_4](https://github.com/Wasiur195/OrangeHRM-Automation-Testing/assets/23733827/bb38756e-6fb1-4922-9c78-9dd5d141de9d)
