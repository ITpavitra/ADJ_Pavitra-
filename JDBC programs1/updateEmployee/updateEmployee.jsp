<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updated Employee Records</title>
</head>
<body>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salary = request.getParameter("salary");

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the Employee database
        String dbURL = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";
        String pass = ""; // Change to your MySQL password if set

        conn = DriverManager.getConnection(dbURL, user, pass);

        // Perform the update
        String updateSQL = "UPDATE Emp SET Emp_Name = ?, BasicSalary = ? WHERE Emp_No = ?";
        pstmt = conn.prepareStatement(updateSQL);
        pstmt.setString(1, empname);
        pstmt.setDouble(2, Double.parseDouble(salary));
        pstmt.setInt(3, Integer.parseInt(empno));

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            out.println("<h3 style='color:green;'>Employee record updated successfully!</h3>");
        } else {
            out.println("<h3 style='color:red;'>No employee found with Emp_No: " + empno + "</h3>");
        }

        // Show all employee data
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Updated Employee Table</h2>");
        out.println("<table border='1'><tr><th>Emp_No</th><th>Emp_Name</th><th>BasicSalary</th></tr>");
        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("Emp_No") + "</td>");
            out.println("<td>" + rs.getString("Emp_Name") + "</td>");
            out.println("<td>" + rs.getDouble("BasicSalary") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

        // Close connections
        rs.close(); stmt.close(); pstmt.close(); conn.close();

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
