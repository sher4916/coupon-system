package data_Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class Connection_Pool {
	private static Connection_Pool connection_Pool = new Connection_Pool();
	private Set<Connection> Connections;
	private Set<Connection> CloseConnections;

	private Connection_Pool() {
		Connections = new HashSet<>();
		CloseConnections = new HashSet<>();
	}

	/**
	 * this method creates the data base
	 * 
	 * @param url
	 *            the data base address
	 * 
	 */
	public void CreateDB(String url) {
		String tempUrl = new String(url);

		url = url + ";create = true";
		try (Connection conn1 = DriverManager.getConnection(url);) {
		} catch (SQLException e) {
		}

	}

	public void CreateConnections(String url, int ammount) {

	}

	/**
	 * this method will use the class Connection_Pool to return the single
	 * instance of the object which is the reference
	 * 
	 * @return single instance of the object which is the reference for the
	 *         connection_Pool
	 */
	public static Connection_Pool getInstance() {
		return connection_Pool;
	}

}
