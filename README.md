# MotorCrud
Simple RestApi Application Using Springboot

This Project Consists of a User Interface Webpage where changes to the data in the Database can be made.

To View the Main Webpage First the User need to Authenticated using Custom made Login Form, If the User is Authorized User can View and make changes based on the roles authenticated.
  * Every Logged In User Can View the Main Webpage.
  * Manager Role User can Add the Data / Update the existing Data to the Database.
  * Admin Role User can Make all the CRUD Operation i.e Add,Update and Delete the Data to the Database.

#### Restrict Urls Based on Role - [Security Config](https://github.com/Sai-Adithya-717/MotorCrud/blob/dev_branch/src/main/java/com/aditya/motorcrud/Security/SecurityConfig.java)
#### Custom Login - [First need to Login to View](https://github.com/Sai-Adithya-717/MotorCrud/blob/dev_branch/src/main/resources/templates/motors/fancy-login.html)

![image](https://github.com/Sai-Adithya-717/MotorCrud/assets/66526551/ee9c3f16-9dd0-4754-b114-21f772bf66a8)


#### Main Webpage - [View all the Data in Database](https://github.com/Sai-Adithya-717/MotorCrud/blob/dev_branch/src/main/resources/templates/motors/list-motors.html)

Admin Role User View Webpage
![image](https://github.com/WideCarSupporter/Sai-Adithya-717/assets/66526551/3e5bdc7e-d29d-4758-b749-5e40d2c522f2)

Customer Role User View Webpage
![image](https://github.com/Sai-Adithya-717/MotorCrud/assets/66526551/9c925475-20b3-410c-97aa-39f8079673d6)



#### Update The Data Form - [Add / Changes to Data](https://github.com/Sai-Adithya-717/MotorCrud/blob/dev_branch/src/main/resources/templates/motors/motor-form.html)

![image](https://github.com/Sai-Adithya-717/MotorCrud/assets/66526551/cf9a06a9-71de-4ede-9a37-3846618836f5)

Deleting the Data - Warning message
![image](https://github.com/WideCarSupporter/MotorCrud/assets/66526551/f793fa8e-9347-4ac9-a850-50f43ece394f)



##### Note: The Entity Table need to be created in Database with same number of columns and Roles,authorities tables need to be created and changes withrespect to schema / database and user and password to login to database user credentials need to be updated in application properties.
