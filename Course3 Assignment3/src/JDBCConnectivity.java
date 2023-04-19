/**
 * File name: JDBCConnectivity.java
 * Author: Kevin Christian Decena
 * Date created: 07/07/2022
 *
 * Details: the program connects to mySQL table and displays certain data. it can also filter the table based on the specific registered date
 */

import java.sql.*;
import java.util.Scanner;

public class JDBCConnectivity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/JDBC", "root", "root1234"); //establish connection with mySQL
                Statement stmt = conn.createStatement();

                String option;
                do {
                    System.out.println("Select Option: ");
                    System.out.println("1 to Retrieve all the user policy details");
                    System.out.println("2 to Retrieve user policies where registered date is less than ‘2012-01-01’");
                    System.out.println("3 to Quit");
                    option = input.nextLine();

                    if (Integer.parseInt(option) == 1) {
                        String strSelect = "select*from user_policies";//sql statement to print table
                        System.out.println("The SQL statement is: " + strSelect + "\n");

                        ResultSet rset = stmt.executeQuery(strSelect);


                        System.out.println("user policy details: ");
                        System.out.printf("%20s%10s%18s%15s\n", "Policy Number", "User ID ", "Date Registered ", "Policy Type ID");//prints all sql table columns
                        int rowCount = 0;

                        while (rset.next()) {//print data from sql
                            String policy_no = rset.getString("policy_no");
                            int user_id = rset.getInt("user_id");
                            Date date_registered = rset.getDate("date_registered");
                            String policy_type_id = rset.getString("policy_type_id");
                            System.out.printf("%17s%10s%18s%15s\n", policy_no, user_id, date_registered, policy_type_id);
                            ++rowCount;
                        }
                        System.out.println("**************************************************************");
                    }//end if

                    else if (Integer.parseInt(option) == 2) {
                        String strSelect = "select*from user_policies where date_registered < '2012-01-01';"; //statement to filter the table with the specified date
                        System.out.println("The SQL statement is: " + strSelect + "\n");

                        ResultSet rset = stmt.executeQuery(strSelect);

                        System.out.println("user policy details: ");
                        System.out.printf("%20s%10s%18s%15s\n", "Policy Number", "User ID ", "Date Registered ", "Policy Type ID");//prints all sql table columns with the specific row/s
                        int rowCount = 0;

                        while (rset.next()) {//print data from sql
                            String policy_no = rset.getString("policy_no");
                            int user_id = rset.getInt("user_id");
                            Date date_registered = rset.getDate("date_registered");
                            String policy_type_id = rset.getString("policy_type_id");
                            System.out.printf("%17s%10s%18s%15s\n", policy_no, user_id, date_registered, policy_type_id);
                            ++rowCount;
                        }
                        System.out.println("**************************************************************");
                    }
                } while (Integer.parseInt(option) != 3);
                System.out.println("Good Bye!");


        }//end try

        catch(SQLException ex) {
            ex.printStackTrace();
        }
        input.close(); //scanner close
    }//end main

}//endJDBCConnectivity