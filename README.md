🏨 Smart Hostel Room Allocation System

A full-stack Spring Boot (Spring MVC) web application that manages hostel rooms and automatically allocates rooms to students based on capacity and facility requirements.

The application is containerized using Docker and deployed on Render, making it fully cloud-ready and publicly accessible via a live URL.

🚀 Features
🧑‍💼 Admin / Management Features

Add new hostel rooms

View all available rooms

Search and filter rooms by:

Minimum capacity

AC availability

Attached washroom

Automatic and optimized room allocation

⚙️ Room Allocation Logic

Allocates the smallest possible room that satisfies:

Required student capacity

AC requirement

Washroom requirement

Displays “No room available” if no suitable room exists

🧠 Technology Stack
Layer	Technology
Language	Java 17
Backend Framework	Spring Boot
Web Framework	Spring MVC
View Engine	Thymeleaf
ORM	Spring Data JPA
Database	H2 (In-Memory)
Build Tool	Maven
Containerization	Docker
Deployment	Render (Docker-based deployment)
Version Control	Git & GitHub
🏗️ Application Architecture

The project follows the Spring MVC (Model–View–Controller) architecture:

Controller  →  Service  →  Repository  →  Database


Controller layer handles HTTP requests

Service layer contains business & allocation logic

Repository layer interacts with the database using JPA

Thymeleaf is used for server-side rendering of UI

📂 Project Structure
Hostel-Allocation
├── Dockerfile
├── pom.xml
├── mvnw
├── src
│   └── main
│       ├── java
│       │   └── com.akash.hostel_allocation
│       │       ├── controller
│       │       ├── service
│       │       ├── repository
│       │       └── model
│       └── resources
│           ├── templates
│           │   ├── rooms.html
│           │   ├── add-room.html
│           │   └── allocate.html
│           └── application.properties

🖥️ UI Pages
URL	Description
/rooms	View all rooms
/add-room	Add new hostel room
/allocate	Allocate room based on requirements
🐳 Docker & Render Deployment

The application is fully containerized using Docker

Uses a multi-stage Docker build:

Build stage with Maven Wrapper

Runtime stage with lightweight JRE

Deployed on Render using Docker runtime

Ensures portability, consistency, and easy cloud deployment

🌍 Live Deployment

🔗 Live URL (Render):
👉 Add your Render deployment link here

▶️ Run Locally
Prerequisites

Java 17+

Git

Steps
git clone https://github.com/AkashSolanki1/Hostel-Allocation.git
cd Hostel-Allocation
./mvnw spring-boot:run


Open in browser:

https://hostel-allocation-8.onrender.com/rooms

🧪 Database

Uses H2 In-Memory Database

No external database setup required

Data resets on application restart

✅ Assignment Requirements Covered

✔ Spring MVC implementation

✔ Room management & allocation logic

✔ Functional and usable UI

✔ Clean, modular code structure

✔ Error handling for invalid allocations

✔ Dockerized deployment

✔ Live deployment on Render

✔ GitHub repository with multiple commits

🧠 Key Learnings

Designing Spring MVC applications

Writing optimized allocation algorithms

Using Thymeleaf for server-side UI rendering

Dockerizing Java applications

Deploying backend services on Render

Handling Java version compatibility in cloud environments

👨‍💻 Author

Akash Solanki
🎓 B.Tech CSE | Java Developer
🔗 GitHub: https://github.com/AkashSolanki1

📜 License

This project is developed for educational and evaluation purposes.

⭐ Reviewer Note

This application is Dockerized and deployed on Render, fulfilling all deployment requirements with a publicly accessible live URL.
