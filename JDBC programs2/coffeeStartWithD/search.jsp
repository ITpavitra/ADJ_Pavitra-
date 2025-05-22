<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results: Coffee Products Starting with 'D'</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>

<h2>Coffee Products Starting with 'D'</h2>

<%
    // Database connection details
    String url = "jdbc:mysql://localhost:3306/coffee";
    String user = "root"; // Replace with your MySQL username
    String password = ""; // Replace with your MySQL password

    Connection conn = null;

    try {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // SQL query to find coffee names starting with 'D'
        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";  // Changed to 'coffee_name'
        PreparedStatement ps = conn.prepareStatement(query);
        
        // Execute the query
        ResultSet rs = ps.executeQuery();

        // Check if we have results
        if (!rs.next()) {
            out.println("<p>No coffee products found starting with 'D'.</p>");
        } else {
%>

<!-- Table to display results -->
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price ($)</th>
        </tr>
    </thead>
    <tbody>
        <%
            // Loop through the results and display them in the table
            do {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>  <!-- Updated to 'coffee_name' -->
            <td><%= rs.getDouble("price") %></td>
        </tr>
        <%
            } while (rs.next());
        %>
    </tbody>
</table>

<%
        }
        
        // Close the ResultSet and PreparedStatement
        rs.close();
        ps.close();
    } catch (SQLException e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } catch (ClassNotFoundException e) {
        out.println("<p>Error: Unable to load the database driver.</p>");
    } finally {
        // Close the connection
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ignore) {}
        }
    }
%>

<br>
<a href="index.html">Back to Search</a>

</body>
</html>
