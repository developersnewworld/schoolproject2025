# School Web Application

This is a Maven-based web application for managing student information in a school. The application is structured to follow the Model-View-Controller (MVC) design pattern and is packaged as a .war file for deployment.

## Project Structure

```
school-webapp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── school
│   │   │           ├── config
│   │   │           │   └── WebAppConfig.java
│   │   │           ├── controller
│   │   │           │   ├── HomeController.java
│   │   │           │   └── StudentController.java
│   │   │           ├── model
│   │   │           │   └── Student.java
│   │   │           ├── repository
│   │   │           │   └── StudentRepository.java
│   │   │           └── service
│   │   │               └── StudentService.java
│   │   ├── resources
│   │   │   └── application.properties
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   ├── web.xml
│   │       │   └── views
│   │       │       ├── index.jsp
│   │       │       └── students.jsp
│   │       ├── css
│   │       │   └── styles.css
│   │       └── js
│   │           └── app.js
│   └── test
│       └── java
│           └── com
│               └── school
│                   └── controller
│                       └── StudentControllerTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Setup Instructions

1. **Clone the Repository**
   ```
   git clone <repository-url>
   cd school-webapp
   ```

2. **Build the Project**
   Use Maven to build the project and generate the .war file:
   ```
   mvn clean package
   ```

3. **Deploy the Application**
   The generated `.war` file can be found in the `target` directory. Deploy it to a servlet container such as Apache Tomcat.

## Usage

- Access the home page at `http://localhost:8080/school-webapp/`
- Navigate to the student management section to view and manage student information.

## Technologies Used

- Java
- Spring Framework
- JSP
- Maven
- CSS
- JavaScript

## Contributing

Feel free to submit issues or pull requests for improvements or bug fixes.