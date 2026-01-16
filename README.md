# Online Reservation System

A Java-based web application that allows users to log in, book train reservations, and cancel tickets.  
The project is built using **Java Servlets**, **HTML/CSS**, and deployed on **Apache Tomcat**.

---

## 🚀 Features

- User Login (Servlet-based authentication)
- Train Ticket Reservation
- Ticket Cancellation using PNR
- Clean and simple user interface
- Deployed and tested on Apache Tomcat

---

## 🛠️ Tech Stack

- **Backend:** Java, Jakarta Servlets
- **Frontend:** HTML, CSS
- **Server:** Apache Tomcat 10
- **Database:** JDBC (Login module connected; reservation logic ready)
- **Tools:** VS Code, Git, GitHub

---

## 📂 Project Structure

OnlineReservationSystem
├── src
│ └── main
│ └── java
│ ├── servlet
│ │ ├── LoginServlet.java
│ │ ├── ReservationServlet.java
│ │ └── CancellationServlet.java
│ └── db
│ └── DBConnection.java
├── login.html
├── reservation.html
├── cancellation.html
├── style.css
└── WEB-INF
└── web.xml

yaml
Copy code

---

## ▶️ How to Run the Project

1. Install **Java (JDK 17+)**
2. Install **Apache Tomcat 10**
3. Deploy the project folder inside:
apache-tomcat/webapps/

markdown
Copy code
4. Start Tomcat:
startup.bat

markdown
Copy code
5. Open browser and access:
http://localhost:8080/OnlineReservationSystem/login.html

yaml
Copy code

---

## 🔑 Default Login Credentials

Username: admin
Password: admin123

yaml
Copy code

---

## 🧪 Functional Modules

- **Login Module:** Authenticates users using servlet logic
- **Reservation Module:** Accepts passenger details and generates PNR
- **Cancellation Module:** Cancels reservation using PNR

---

## 📌 Learning Outcomes

- Understanding of Java Servlets and HTTP lifecycle
- Handling GET and POST requests
- Working with Apache Tomcat
- Frontend–Backend integration
- Debugging common servlet errors (404, 405, 500)

---

## 👩‍💻 Author

**Asmita Maske**  
GitHub: https://github.com/maskeasmita730-png

---

## 📄 License

This project is created for educational and internship purposes.
