<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task Management System API</title>
</head>
<body>
    <h1>Task Management System API</h1>

    <h2>Prerequisites</h2>
    <ul>
        <li><strong>Java Development Kit (JDK 17+):</strong> Download and install JDK 17 or above. Ensure that <code>JAVA_HOME</code> is set in your environment variables.</li>
        <li><strong>Apache Maven 3.9.9+:</strong> Download and install Apache Maven. Ensure that <code>MAVEN_HOME</code> is set in your environment variables.</li>
        <li><strong>IDE:</strong> You can use Spring Tool Suite (STS) or any Java IDE like IntelliJ IDEA or Eclipse.</li>
    </ul>

    <h2>Steps to Run the Application</h2>
    
    <h3>Step 1: Clone the Repository</h3>
    <p>Clone the repository from GitHub and navigate to the project directory:</p>
    <pre><code>
    git clone https://github.com/Mohasin-Shaikh-Dev/Task-Management-System.git
    cd Task-Management-System/TaskManagmentSystem
    </code></pre>

    <h3>Step 2: Build the Application</h3>
    <p>Use Maven to build the application:</p>
    <pre><code>
    mvn clean install
    </code></pre>

    <h3>Step 3: Run the Application</h3>
    <p>You can run the Spring Boot application using the following command:</p>
    <pre><code>
    mvn spring-boot:run
    </code></pre>

    <h3>Step 4: Access the Application</h3>
    <p>Once the application is running, you can access it through <a href="http://localhost:8082">http://localhost:8082</a>.</p>

    <h3>Step 5: Authentication Setup (Spring Security)</h3>
    <p>The application is secured with Spring Security using basic authentication. The credentials for authentication are:</p>
    <ul>
        <li><strong>Username:</strong> admin</li>
        <li><strong>Password:</strong> admin123</li>
    </ul>

    <h3>Step 6: Testing the Application</h3>
    <p>You can test the application using Postman or any other API testing tool. Below are some common API requests:</p>

    <table border="1">
        <thead>
            <tr>
                <th>Request Type</th>
                <th>Endpoint</th>
                <th>Request Body</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>GET</td>
                <td>/tasks</td>
                <td>None</td>
            </tr>
            <tr>
                <td>POST</td>
                <td>/tasks</td>
                <td>
                    <pre><code>
                    {
                        "title": "Sample Task",
                        "description": "This is a sample task",
                        "dueDate": "2024-12-31",
                        "status": "PENDING"
                    }
                    </code></pre>
                </td>
            </tr>
            <tr>
                <td>PUT</td>
                <td>/tasks/{id}</td>
                <td>
                    <pre><code>
                    {
                        "title": "Updated Task",
                        "description": "This is an updated task",
                        "dueDate": "2024-12-25",
                        "status": "IN_PROGRESS"
                    }
                    </code></pre>
                </td>
            </tr>
            <tr>
                <td>DELETE</td>
                <td>/tasks/{id}</td>
                <td>None</td>
            </tr>
            <tr>
                <td>PATCH</td>
                <td>/tasks/{id}/complete</td>
                <td>None</td>
            </tr>
        </tbody>
    </table>

    <h3>Step 7: Test the Application</h3>
    <p>You can run the tests for the application using the following Maven command:</p>
    <pre><code>
    mvn test
    </code></pre>

    <h3>Bonus: Spring Security Authentication</h3>
    <p>The application uses Spring Security for securing the task-related endpoints. When making API requests, ensure you use the following credentials:</p>
    <ul>
        <li><strong>Username:</strong> admin</li>
        <li><strong>Password:</strong> admin123</li>
    </ul>

</body>
</html>
