package ro.ase.csie.cts.g1092.seminar9.singleton;

public class InterfaceModule {
	Logger logger;
	
	public InterfaceModule() {
		//logger = new Logger();
		//logger = Logger.getTheLogger();
		logger = Logger.getTheLogger("UILogs.txt","ui");
	}
}
