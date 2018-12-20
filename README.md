The aim of this repository is to learn Spring Boot and develop a CRUD application regarding a Car Repair Shop so as to deeply understand design patterns regarding the 3-tier Architecture used by this MVC framework.

<h5>This is a project made in the days of <strong>Project Future</strong>(powered by Peiraus Bank, Code.Hub ,Regeneration)</h5>

<h3>Getting Started</h3>

After importing the project, simply fire up your server (tomcat's port is set to 8081) and click the following:
http://localhost:8081/

The Login page (username/password) is validating the input via the database's password records which are hash encrypted. In order to login and test out the application the following login credentials are given [username/password] :

- User_Role: user / pass1234
- Admin_Role: admin / pass1234

Ρegarding Hash Encryption, user, administrator in these credentials have deliberately the same value. More specifically, even though they have the same (string) value, they are stored differently to our database. More specifically, User_Role Password is encrypted as: $10$FKg42N1H9SytX7kr6m7TGu8T4uOcAdF5DTZOrI69CxPMVuVMm9iiy


<h3>Users's Index Page</h3>

<p>Depending on the user's credentials the webpage shall display the current Repair status of the car as stored to the database including information about the Repair (date cost..).</p>

<h3>Admin's Index Page</h3>

The index page consists of the following:

<strong>-Contributors page</strong>

<strong>-Display All Contributors</strong>

<strong>-User/Owner of a Car page</strong>

   a. Create New User Entry

   b. Display All Entries

   c. Update/Delete an Entry

<strong>-Car Repair Shop page</strong>

   a. Create New Repair Entry

   b. Display All Entries

   c. Update/Delete an Entry

<strong>-Search the Database (via User Input)</strong>

   a. For a user's AFM (National Insurance number) display all available db records

   b. For a user's Email Adress display all available db records

<h1>-Built With</h1>

  [Apache Maven](https://maven.apache.org/)  <br>
  [Spring Boot](https://spring.io/projects/spring-boot)  <br>
  [Intellij Idea](https://www.jetbrains.com/idea/)<br>
  [Mysql Server](https://dev.mysql.com/downloads/mysql/)



The project was developed in collaboration with: [Panos Makris](https://github.com/MrMak21)
