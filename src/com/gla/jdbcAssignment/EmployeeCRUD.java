package jdbcAssignment;

import java.sql.*;

public class EmployeeCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    static final String USER = "root";
    static final String PASS = "root";

    // CREATE
    public static void addEmployee() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee VALUES (?,?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Rahul");
        ps.setDouble(3, 35000);
        ps.executeUpdate();

        con.close();
    }

    // READ
    public static void showHighSalary() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM employee WHERE salary > 30000");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getDouble(3));
        }
        con.close();
    }

    // UPDATE
    public static void increaseSalary() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement(
                "UPDATE employee SET salary = salary * 1.1 WHERE id = 1");
        ps.executeUpdate();
        con.close();
    }

    // DELETE
    public static void deleteLowSalary() throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        con.createStatement().executeUpdate(
                "DELETE FROM employee WHERE salary < 15000");
        con.close();
    }

    public static void main(String[] args) throws Exception {
        addEmployee();
        showHighSalary();
        increaseSalary();
        deleteLowSalary();
    }
}
