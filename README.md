 # Hospital-Management-System 
- This is a simple hospital management system created using java swing.
- To run this project in your local machine:
1. Open your terminal/CMD then:
2. Clone the project to your directory of choice using the command below
*  > git clone https://github.com/makaubenson/Hospital-Management-System.git
3. Go to the project directory and cut and paste the **hospital.sql**, **license**, **readme.md**,**mysql-connector-java-5.1.23-bin.jar**,**rs2xml.jar** from the project directory to a directory of your choosing.
4. Open your local server and create a database named hospital.
5. Import the **hospital.sql** file that you just cut from the project directory.
6. Make sure you are already inside the database you just created before importing.
7. After the <addr> import is complete, the database will load two tables, **patient** and **patientreport**.
8. Now open your IDE(eg netbeans), click file menu, click OPEN PROJECT, locate your cloned project then
9. Select the folder containing the project files, i.e the folder containing the files below.
  ![image](https://user-images.githubusercontent.com/59168713/124477388-a6f32c80-ddac-11eb-908f-690d337ee34c.png)
10. Locate a package named **project**, then **ConnectionProvider.java** file, from which you should configure the line below to match your configurations: 
  -  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","your_db_username","your_db_password");
  - e.g   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","benson","benson");
  
11. Right click the Libraries folder in the project directory, choose add library then browse for the libraries named which you just cut from the project directory: 
    * mysql-connector-java-5.1.23-bin.jar
    * rs2xml.jar
12. The already defined logins are:
     #### username        password
        * benson      benson
        * lisper      lisper
        * faith       faith
        * alexander   alexander
        * steve       steve
  
13. Locate login.java in the source packages, open it and run it using any of the above defined logins. 

  
14.Congratulations, you made it to the last step.
