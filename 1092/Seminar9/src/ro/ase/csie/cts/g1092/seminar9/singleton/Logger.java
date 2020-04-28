package ro.ase.csie.cts.g1092.seminar9.singleton;

public class Logger {
	
	//reference to the unique object
	private static Logger theLogger = null;

	String filter;
	String filename;
	
	public static synchronized Logger getTheLogger() {
		if(theLogger == null) {
			theLogger = new Logger();
		}
		
		return theLogger;
	}
	
	public static synchronized Logger getTheLogger(String filename, String filter) {
		if(theLogger == null) {
			theLogger = new Logger(filename, filter);
		}
		else
		{
			//implement a singleton registry and you create unique loggers for each filename
			//or
			if(!theLogger.filename.equals(filename))
				throw new UnsupportedOperationException();
		}
		
		return theLogger;
	}
	
	private Logger() {
		System.out.println("Creating the logger");
		filter = "";
		filename = "Logs.txt";
	}

	private Logger(String filename, String filter) {
		super();
		System.out.println("Creating the log for " + filename);
		
		this.filter = filter;
		this.filename = filename;
	}
	
	public void write(String msg) {
		System.out.println(msg  + " -> " + filename);
	}
	
	
}
