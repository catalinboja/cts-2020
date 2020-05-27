package ro.ase.csie.cts.g1091.seminar14.command;

import java.util.ArrayList;

public class TaskManager {
	ArrayList<AsyncTaskInterface> tasks = new ArrayList<>();
	
	public void addTask(AsyncTaskInterface taks) {
		tasks.add(taks);
	}
	
	//you can handle them in any way
	public void executeTasks() {
		for(AsyncTaskInterface task : tasks)
			task.doAction("Executing a task");
	}
	
}
