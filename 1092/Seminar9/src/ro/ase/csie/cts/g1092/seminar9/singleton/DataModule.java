package ro.ase.csie.cts.g1092.seminar9.singleton;

public class DataModule {
	
	Logger logger;
	
	public DataModule() {
		//logger = new Logger();
		//logger = Logger.getTheLogger();
		
		logger = Logger.getTheLogger("XLogs.txt","data");
		logger.write("Init the data module");
	}
}
