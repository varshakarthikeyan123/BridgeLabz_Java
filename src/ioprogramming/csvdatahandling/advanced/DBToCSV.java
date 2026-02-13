package ioprogramming.csvdatahandling.advanced;

import java.sql.*;
import java.io.*;

public class DBToCSV {

    public static void main(String[] args) {

        try (
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/testdb",
                        "root",
                        "password");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM employees");
                BufferedWriter bw = new BufferedWriter(new FileWriter("db_employees.csv"))
        ) {

            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            while (rs.next()) {

                bw.write(rs.getInt("id") + "," +
                        rs.getString("name") + "," +
                        rs.getString("department") + "," +
                        rs.getDouble("salary"));

                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
