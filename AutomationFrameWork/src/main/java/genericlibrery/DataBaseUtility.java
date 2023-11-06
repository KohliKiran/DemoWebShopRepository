package genericlibrery;
/**
 * @Kiran
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

public class DataBaseUtility implements IAutoConstants{
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;
	/**
	 * This Method is Used To Connecting The DataBase
	 */
	public void establishaingConnectios() {
		try {
			dbdriver=new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(DATABASE_URL, DATABASE_UN, DATABASE_PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This Method Is Used To Read The Data From DataBase
	 * @param query
	 * @param columName
	 * @return
	 */
	public ArrayList ReadingDataFromDataBase(String query,String columName) {
		ArrayList list=new ArrayList();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(result.next()) {
				list.add(result.getString(columName));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * This Method Is Used To Close The DataBase Connection
	 */
	public void ClosingConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
