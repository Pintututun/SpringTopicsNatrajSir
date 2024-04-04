package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class SelectTest {

	private static Logger logger = Logger.getLogger(SelectTest.class);
	static {
		try {
			// Create Layout out
			SimpleLayout layout = new SimpleLayout();
			// Create Appender object having layout obj
			ConsoleAppender appender = new ConsoleAppender(layout);
			// Add appender obj
			logger.addAppender(appender);

			// Logger level to retrieve log message
			//logger.setLevel(Level.DEBUG);// Default is DEBUG
			//logger.setLevel(Level.OFF);//Default is DEBUG
			logger.setLevel(Level.ALL);
			logger.info("com.nt.jdbc.SelectTest::Log4j Setup ready");
		} catch (Exception e) {
			e.printStackTrace();
			logger.fatal("com.nt.jdbc.SelectTest::Problem while setting up Log4j");
		}
	}

	public static void main(String args[]) throws Exception {

		logger.debug("com.nt.jdbc.SelectTest::start of main(-) method");
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// Load jdbc driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.debug("com.nt.jdbc.SelectTest:JDBC driver class loaded");
			// Establish the connection(Road)
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Priyabrata");

			logger.info("com.nt.jdbc.SelectTest::Connection is established with DB s/w");
			// Create JDBC Statement object(Vehicle)
			if (con != null) {
				st = con.createStatement();
				logger.debug("com.nt.jdbc.SelectTest:JDBC Statement object is created");
			}
			// Send and execute SQL SELECT Query in Db s/w and get JDBC ResultSet Object
			if (st != null) {
				rs = st.executeQuery("SELECT * FROM STUDENT");
				logger.debug("com.nt.jdbc.SelectTest:SQL query is send to DB s/w for execution and Result set object is generated");
			}
			if (rs != null) {

				while (rs.next() != false) {
					System.out.println(
							rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                 logger.warn("com.nt.jdbc.SelectTest::The records of ResultSet objects are retrieved using getString(-) for all columns...change them accordingly");
				}
				logger.debug("com.nt.jdbc.SelectTest::ResultSet obj is processed");
			}
		} catch (SQLException se) {
			se.printStackTrace();
			logger.error("comnt.jdbc.SelectTest::known DB problem::"+se.getMessage()+" SQL error code"+se.getErrorCode());
		} catch (Exception e) {
			logger.fatal("com.nt.jdbc.SelectTest::known DB problem::"+e.getMessage());
			e.printStackTrace();
		} finally {
			logger.debug("com.nt.jdbc.SelectTest:Closing JDBC objects");
			// Close jdbc objects
			try {
				if (rs != null) {
					rs.close();
					logger.debug("com.nt.jdbc.SelectTest:ResultSet object is closed");
				}
			} catch (SQLException se) {
				se.printStackTrace();
				logger.error("com.nt.jdbc.SelectTest:Problem in closing in ResultSet object"+se.getMessage());
			}
			try {
				if (st != null) {
					st.close();
					logger.debug("com.nt.jdbc.SelectTest:Statement object is closed");
				}
			} catch (SQLException se) {
				se.printStackTrace();
				logger.error("com.nt.jdbc.SelectTest:Problem in closing Statement object"+se.getMessage());
			}
			try {
				if (con != null) {
					con.close();
					logger.debug("com.nt.jdbc.SelectTest:Connection object is closed");
				}
			} catch (SQLException se) {
				se.printStackTrace();
				logger.error("com.nt.jdbc.SelectTest:Problem in closing Connection object"+se.getMessage());
			}

		}
              logger.debug("com.nt.jdbc.SelectTest:end of main(-) method");
	}
}
