# MotorCrud
Simple RestApi Application Using Springboot

This Project Consists of a User Interface Webpage where changes to the data in the Database can be made.

To View the Main Webpage First the User need to Authenticated using Custom made Login Form, If the User is Authorized User can View and make changes based on the roles authenticated.
  * Every Logged In User Can View the Main Webpage.
  * Manager Role User can Add the Data / Update the existing Data to the Database.
  * Admin Role User can Make all the CRUD Operation i.e Add,Update and Delete the Data to the Database.

#### Restrict Urls Based on Role - [Security Config](https://github.com/WideCarSupporter/MotorCrud/blob/dev_branch/src/main/java/com/aditya/motorcrud/Security/SecurityConfig.java)
#### Custom Login - [First need to Login to View](https://github.com/WideCarSupporter/MotorCrud/blob/dev_branch/src/main/resources/templates/motors/fancy-login.html)
#### Main Webpage - [View all the Data in Database](https://github.com/WideCarSupporter/MotorCrud/blob/dev_branch/src/main/resources/templates/motors/list-motors.html)
#### Update The Data Form - [Add / Changes to Data](https://github.com/WideCarSupporter/MotorCrud/blob/dev_branch/src/main/resources/templates/motors/motor-form.html)
