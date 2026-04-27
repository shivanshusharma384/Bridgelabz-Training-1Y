package jdbcAssignment;

import java.sql.*;

public class ProductCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    static final String USER = "root";
    static final String PASS = "root";

    // CREATE
    public static void insertProducts() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO product VALUES (?,?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Pen");
        ps.setInt(3, 5);
        ps.executeUpdate();

        ps.setInt(1, 2);
        ps.setString(2, "Notebook");
        ps.setInt(3, 20);
        ps.executeUpdate();

        ps.setInt(1, 3);
        ps.setString(2, "Pencil");
        ps.setInt(3, 8);
        ps.executeUpdate();

        con.close();
    }

    // READ
    public static void lowStock() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM product WHERE qty < 10");

        while (rs.next()) {
            System.out.println(rs.getInt("pid") + " " +
                    rs.getString("pname") + " " +
                    rs.getInt("qty"));
        }
        con.close();
    }

    // UPDATE
    public static void updateQty() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "UPDATE product SET qty = qty + 10 WHERE pid = 1");
        ps.executeUpdate();
        con.close();
    }

    // DELETE
    public static void deleteProduct() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "DELETE FROM product WHERE pid = 3");
        ps.executeUpdate();
        con.close();
    }

    public static void main(String[] args) throws Exception {
        insertProducts();
        lowStock();
        updateQty();
        deleteProduct();
    }
}
