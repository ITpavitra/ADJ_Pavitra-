<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Salary Report</title>
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
    double grandSalary = 0;

    try {
        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Change this to your MySQL password if needed
        String dbURL = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";
        String pass = ""; // Use your password here if set

        conn = DriverManager.getConnection(dbURL, user, pass);

        if (empno != null && empname != null && salary != null) {
            String insertSQL = "INSERT INTO Emp (Emp_No, Emp_Name, BasicSalary) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, Integer.parseInt(empno));
            pstmt.setString(2, empname);
            pstmt.setDouble(3, Double.parseDouble(salary));
            pstmt.executeUpdate();
        }

        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Salary Report</h2>");
        out.println("<pre>");
        while (rs.next()) {
            int eno = rs.getInt("Emp_No");
            String ename = rs.getString("Emp_Name");
            double sal = rs.getDouble("BasicSalary");

            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("Emp_No    : " + eno);
            out.println("Emp_Name  : " + ename);
            out.println("Basic     : " + sal);
            grandSalary += sal;
        }
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("Grand Salary : " + grandSalary);
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");

        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
