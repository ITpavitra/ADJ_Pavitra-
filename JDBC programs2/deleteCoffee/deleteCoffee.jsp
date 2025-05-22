<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Delete Coffee</title></head>
<body>
<%
    String idStr = request.getParameter("id");
    Connection conn = null;
    PreparedStatement deleteStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // your MySQL password if set

        conn = DriverManager.getConnection(url, user, password);

        // Delete the coffee by ID
        String deleteSQL = "DELETE FROM coffee WHERE id = ?";
        deleteStmt = conn.prepareStatement(deleteSQL);
        deleteStmt.setInt(1, Integer.parseInt(idStr));
        int rowsAffected = deleteStmt.executeUpdate();

        if (rowsAffected > 0) {
            out.println("<p style='color:green;'>Coffee record with ID " + idStr + " deleted successfully.</p>");
        } else {
            out.println("<p style='color:red;'>No coffee found with ID: " + idStr + "</p>");
        }

        // Display remaining records
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>Remaining Coffee Products</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");
        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getDouble("price") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) rs.close();
        if (selectStmt != null) selectStmt.close();
        if (deleteStmt != null) deleteStmt.close();
        if (conn != null) conn.close();
    }
%>
</body>
</html>
