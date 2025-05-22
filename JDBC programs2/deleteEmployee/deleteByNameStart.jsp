<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>
<%
    String startLetter = request.getParameter("startLetter");
    Connection conn = null;
    PreparedStatement deleteStmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";
        String password = ""; // Update if needed

        conn = DriverManager.getConnection(url, user, password);

        // Delete employees where name starts with the given letter
        String deleteSQL = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
        deleteStmt = conn.prepareStatement(deleteSQL);
        deleteStmt.setString(1, startLetter + "%");
        int deletedCount = deleteStmt.executeUpdate();

        out.println("<h3 style='color:blue;'>Deleted " + deletedCount + " employee(s) starting with '" + startLetter + "'</h3>");

        // Display remaining records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Salary Report</h2>");
        out.println("<pre>");
        while (rs.next()) {
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("Emp_No   : " + rs.getInt("Emp_No"));
            out.println("Emp_Name : " + rs.getString("Emp_Name"));
            out.println("Basic    : " + rs.getDouble("BasicSalary"));
        }
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (deleteStmt != null) deleteStmt.close();
        if (conn != null) conn.close();
    }
%>
</body>
</html>
