package ro.ase.csie.cts.g1091.seminar9.singleton;

import java.util.HashMap;

public class DBConnection {
	
	String serverSocket = "127.0.0.1:3306";
	String database = "GameDB";
	String user = "dev";
	
	private static DBConnection theConnection = null;
	
	//the alternative as a SingletTon registry of you allow different unique connections based on IP
	private static HashMap<String, DBConnection> connections = new HashMap<>();
	
	
	private DBConnection(String serverSocket, String database, String user) {
		super();
		this.serverSocket = serverSocket;
		this.database = database;
		this.user = user;
		System.out.println("Creating a DBConnection to " + serverSocket);
	}

	private DBConnection() {
		System.out.println("Creating a DBConnection to " + serverSocket);
	}
	
	public static synchronized DBConnection getConnection() {
		
		//lazy instantiation
		if(theConnection == null) {
			theConnection = new DBConnection();
		}
		
		return theConnection; 
	}
	
	//return singletons from the singleton registry
	public static synchronized DBConnection getConnection(
			String serverSocket, String database, String user) {
		
		DBConnection connection = connections.get(serverSocket);
		
		//lazy instantiation
		if(connection == null) {
			connection = new DBConnection(serverSocket, database, user);
			connections.put(serverSocket, connection);
		}
		
		return theConnection; 
	}
	
}

