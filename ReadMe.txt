##Skill Rating Service
#Project Overview
The Skill Rating Service is a web application designed to allow users to rate various skills and provide feedback. Built with Spring Boot, this service facilitates skill assessments and notifications, enhancing user engagement and skill development.

##Features

- Skill Rating: Users can rate skills and leave comments.

- Notifications: Real-time notifications for skill ratings and updates.

- Email Alerts: Automated email notifications for new ratings and comments.

##Technologies Used
- Spring Boot: Framework for building the backend services.

- Spring Data JPA: For database interactions and ORM support.

- Spring Security: To handle authentication and authorization.

- Thymeleaf: Template engine for rendering views.

- JavaMailSender: For sending email notifications.

- Docker: Containerization of the application for consistent deployment.

Prerequisites
Java 11 or higher: Ensure you have JDK 11 or newer installed.

Maven: For project build and dependency management.

Docker (optional): To run the application in a containerized environment.

Installation and Setup
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/DhiaGhouma/AppWebDistribue
cd AppWebDistribue
Build the Project:

Using Maven:

bash
Copy
Edit
mvn clean install
Run the Application:

Without Docker:

bash
Copy
Edit
mvn spring-boot:run
With Docker:

Build the Docker image:

bash
Copy
Edit
docker build -t AppWebDistribue .
Run the Docker container:

bash
Copy
Edit
docker run -p 8080:8080 AppWebDistribue
Access the Application:

Open your browser and navigate to http://localhost:8080 to access the application.

Usage
User Registration: Sign up by providing your email and password.

Login: Use your credentials to log in.

Rate Skills: Navigate to the skills section, select a skill, and provide a rating and comment.

Notifications: Receive real-time notifications for your ratings and comments.

API Endpoints
User Endpoints
POST /api/users/register: Register a new user.

POST /api/users/login: Authenticate and obtain a token.

Skill Endpoints
GET /api/skills: Retrieve all skills.

GET /api/skills/{id}: Get details of a specific skill.

POST /api/skills/{id}/rate: Rate a skill.

Notification Endpoints
GET /api/notifications: Fetch all notifications for the logged-in user.

Database Schema
The application uses a relational database with the following key entities:

User: Represents the users of the application.

Skill: Represents the skills available for rating.

Rating: Represents the ratings given by users to skills.

Notification: Represents notifications sent to users.

Contributing
We welcome contributions to enhance the functionality and performance of the Skill Rating Service. To contribute:

Fork the repository.

Create a new branch (git checkout -b feature-name).

Make your changes.

Commit your changes (git commit -am 'Add new feature').

Push to the branch (git push origin feature-name).

Create a new Pull Request.

Please ensure that your code adheres to the existing coding standards and that you have written appropriate tests for your changes.

License
Distributed under the MIT License. See LICENSE for more information.

Acknowledgments
Spring Boot: For providing a robust framework for building Java applications.

Spring Data JPA: For simplifying database interactions.

Spring Security: For ensuring secure authentication and authorization.

Thymeleaf: For seamless integration with Spring and HTML templates.

H2 Database: For lightweight, in-memory database during development.

JavaMailSender: For handling email notifications.

Docker: For containerizing the application.

Contact
For any inquiries or feedback, please contact:

Email: ghoumadhia01@example.com

GitHub: DhiaGhouma