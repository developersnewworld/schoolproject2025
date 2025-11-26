<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>School Home Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css'/>">
</head>
<body>
    <header>
        <h1>Welcome to the School Management System</h1>
    </header>
    <nav>
        <ul>
            <li><a href="<c:url value='/students'/>">View Students</a></li>
            <li><a href="<c:url value='/addStudent'/>">Add Student</a></li>
        </ul>
    </nav>
    <main>
        <h2>Home</h2>
        <p>This is the home page of the school management application.</p>
    </main>
    <footer>
        <p>&copy; 2023 School Management System</p>
    </footer>
</body>
</html>