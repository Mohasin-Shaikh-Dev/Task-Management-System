<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Task Management System </h1>

<h2>Prerequisites</h2>
<p>Before running the application, make sure the following tools are installed and set up:</p>
<ul>
    <li><strong>Java Development Kit (JDK 17+)</strong><br>
        Download and install JDK 17 or above from <a href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Oracle's website</a>.
        <br>Ensure that <code>JAVA_HOME</code> is set in your environment variables.
    </li>
    <li><strong>Apache Maven 3.9.9+</strong><br>
        Download and install Apache Maven from <a href="https://maven.apache.org/download.cgi">Maven's official website</a>.
        <br>Ensure that <code>MAVEN_HOME</code> is set in your environment variables.
    </li>
    <li><strong>IDE</strong>: You can use Spring Tool Suite (STS) or any Java IDE like IntelliJ IDEA or Eclipse for a smoother development experience.</li>
</ul>

<h2>Steps to Run the Application</h2>

<h3>Step 1: Clone the Repository</h3>
<p>Clone the repository from GitHub and navigate to the project directory:</p>
<pre><code>git clone https://github.com/Mohasin-Shaikh-Dev/Task-Management-System.git
cd Task-Management-System/TaskManagmentSystem</code></pre>

<h3>Step 2: Build the Application</h3>
<p>Use Maven to build the application:</p>
<pre><code>mvn clean install</code></pre>

<h3>Step 3: Run the Application</h3>
<p>You can run the Spring Boot application using the following command:</p>
<pre><code>mvn spring-boot:run</code></pre>

<h3>Step 4: Access the Application</h3>
<p>Once the application is running, you can access it through the following URL in your web browser or API client:</p>
<pre><code>http://localhost:8082</code></pre>

<h3>Step 5: Authentication Setup (Spring Security)</h3>
<p>The application is secured with Spring Security using basic authentication. The credentials for authentication are:</p>
<pre><code>Username: admin
Password: admin123</code></pre>

<h3>Step 6: Testing the Application</h3>
<p>You can test the application using Postman or any other API testing tool. Below are some common API requests:</p>

<h4>API Endpoints</h4>
<table border="1">
    <thead>
        <tr>
            <th>Action</th>
            <th>Endpoint</th>
            <th>Method</th>
            <th>Request Body</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>GET all tasks</td>
            <td>/tasks</td>
            <td>GET</td>
            <td>None</td>
        </tr>
        <tr>
            <td>Create a new task</td>
            <td>/tasks</td>
            <td>POST</td>
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
            <td>Update task</td>
            <td>/tasks/{id}</td>
            <td>PUT</td>
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
            <td>DELETE a task</td>
            <td>/tasks/{id}</td>
            <td>DELETE</td>
            <td>None</td>
        </tr>
        <tr>
            <td>PATCH to mark task as complete</td>
            <td>/tasks/{id}</td>
            <td>PATCH</td>
            <td>None</td>
        </tr>
        <tr>
            <td>GET task by ID</td>
            <td>/tasks/{id}</td>
            <td>GET</td>
            <td>None</td>
        </tr>
    </tbody>
</table>

<h3>Step 7: Test the Application</h3>
<p>Use the following command to run tests for the application:</p>
<pre><code>mvn test</code></pre>

</body>
</html>
