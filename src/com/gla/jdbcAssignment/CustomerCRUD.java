package jdbcAssignment;

import java.sql.*;

public class CustomerCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    static final String USER = "root";
    static final String PASS = "root";

    // CREATE
    public static void addCustomer() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO customers VALUES (?,?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Amit");
        ps.setString(3, "9876543210");
        ps.executeUpdate();

        con.close();
    }

    // READ (LIKE)
    public static void searchCustomer() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM customers WHERE name LIKE ?");
        ps.setString(1, "%Amit%");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("name") + " " +
                    rs.getString("phone"));
        }
        con.close();
    }

    // UPDATE
    public static void updatePhone() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "UPDATE customers SET phone='9999999999' WHERE id=1");
        ps.executeUpdate();
        con.close();
    }

    // DELETE
    public static void deleteCustomer() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "DELETE FROM customers WHERE id=1");
        ps.executeUpdate();
        con.close();
    }

    public static void main(String[] args) throws Exception {
        addCustomer();
        searchCustomer();
        updatePhone();
        deleteCustomer();
    }
}
