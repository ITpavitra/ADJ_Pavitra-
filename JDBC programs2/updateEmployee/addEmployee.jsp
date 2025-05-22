<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Salary Report</title>
</head>
<body>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    double grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";
        String password = ""; // Change this if your MySQL has a password

        conn = DriverManager.getConnection(url, user, password);

        // Insert the new employee
        String insertSQL = "INSERT INTO Emp (Emp_No, Emp_Name, BasicSalary) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(insertSQL);
        pstmt.setInt(1, Integer.parseInt(empno));
        pstmt.setString(2, empname);
        pstmt.setDouble(3, Double.parseDouble(basicsalary));
        pstmt.executeUpdate();

        // Display the salary report
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Salary Report</h2>");
        out.println("<pre>");
        while (rs.next()) {
            int eno = rs.getInt("Emp_No");
            String ename = rs.getString("Emp_Name");
            double sal = rs.getDouble("BasicSalary");
            grandTotal += sal;

            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("Emp_No    : " + eno);
            out.println("Emp_Name  : " + ename);
            out.println("Basic     : " + sal);
        }
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("Grand Salary : " + grandTotal);
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>
</body>
</html>
