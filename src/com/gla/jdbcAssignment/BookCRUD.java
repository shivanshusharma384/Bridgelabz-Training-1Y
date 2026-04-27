package jdbcAssignment;

import java.sql.*;

public class BookCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    static final String USER = "root";
    static final String PASS = "root";

    // CREATE
    public static void addBook() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO books VALUES (?,?,?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Java Basics");
        ps.setString(3, "James Gosling");
        ps.setString(4, "Available");
        ps.executeUpdate();

        con.close();
    }

    // READ
    public static void showAvailable() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM books WHERE status='Available'");

        while (rs.next()) {
            System.out.println(rs.getString("title"));
        }
        con.close();
    }

    // UPDATE
    public static void issueBook() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "UPDATE books SET status='Issued' WHERE id=1");
        ps.executeUpdate();
        con.close();
    }

    // DELETE
    public static void deleteBook() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "DELETE FROM books WHERE id=1");
        ps.executeUpdate();
        con.close();
    }

    public static void main(String[] args) throws Exception {
        addBook();
        showAvailable();
        issueBook();
        deleteBook();
    }
}
