# 📌 Struts 2 + Hibernate Web Application  

## 📖 Overview  
This project demonstrates **Struts 2 + Hibernate** integration for user authentication and data retrieval. It includes **user registration, login, and user details fetching** from a **MySQL database**. The application follows the **MVC architecture** using Struts 2 actions, Hibernate ORM, and JSP for the frontend.

## 🚀 Features  
- **User Registration**: Stores user details in the database.  
- **User Login**: Validates credentials and redirects to the home page.  
- **Home Page**: Displays user details and provides a link to fetch user information.  
- **User Details Page**: Retrieves and displays user details based on the entered username.  

## 🏗️ Project Workflow  
1. **User Registration**  
   - User provides details.  
   - Data is stored in **MySQL** using **Hibernate**.  

2. **User Login**  
   - Credentials are validated.  
   - If valid, the user is redirected to the **home page**.  

3. **Home Page**  
   - Displays logged-in user information.  
   - Includes a **"User Details"** tab.  

4. **User Details Page**  
   - User enters a username.  
   - If found, details are **fetched from the database** and displayed on the JSP frontend.  

## 🛠️ Technologies Used  
- **Java 1.8**  
- **Struts 2**  
- **Hibernate ORM**  
- **Apache Tomcat 9**  
- **Eclipse Oxygen**  
- **JSP & Servlets**  
- **MySQL Database**  


## ⚙️ Setup Instructions  
### 1️⃣ Clone the Repository  
```sh  
git clone https://github.com/your-username/struts2-hibernate-project.git  
cd struts2-hibernate-project  

2️⃣ Import the Project in Eclipse
Open Eclipse Oxygen

Import as "Existing Java Project"

3️⃣ Configure Database
Update hibernate.cfg.xml with your MySQL credentials.

4️⃣ Run the Application
Deploy on Apache Tomcat 9.

Start the server and access the app



🎯 Future Enhancements
🔐 Password encryption for better security.

🛠️ Session management to prevent unauthorized access.

🎨 Improved UI with Bootstrap.
