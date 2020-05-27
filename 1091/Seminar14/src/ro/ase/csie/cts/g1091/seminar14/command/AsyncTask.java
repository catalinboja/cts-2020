package ro.ase.csie.cts.g1091.seminar14.command;

public class AsyncTask implements AsyncTaskInterface {
	
	//task state
	String taskDetails;
	
	//reference to the receiver
	ModuleInterface module;
	
	
	public AsyncTask(String taskDetails, ModuleInterface module) {
		super();
		this.taskDetails = taskDetails;
		this.module = module;
	}


	@Override
	public void doAction(String log) {
		System.out.println("Performing an asyncronous task: " + log);
		module.doTheJob();
	}

}
