package com.practice.jdbc_setup1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Connection con = DatabaseConnection.getConnection();
		Scanner sc = new Scanner(System.in);
		
		if(con != null) {
			try {
				con.close();
				String str = sc.nextLine();
				System.out.println("Connection closed!");
			} catch(SQLException e) {
				System.out.println("SQLException occurs!!!");
			}
		}
	}
}