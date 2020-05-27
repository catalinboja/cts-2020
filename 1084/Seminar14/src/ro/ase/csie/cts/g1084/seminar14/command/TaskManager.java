package ro.ase.csie.cts.g1084.seminar14.command;

import java.util.ArrayList;

public class TaskManager {
	
	ArrayList<TaskAsincronAbstract> taskuri = 
			new ArrayList<>();
	
	public void adaugaTask(TaskAsincronAbstract task) {
		taskuri.add(task);
	}
	
	public void executaTask() {
		if(this.taskuri.size() > 0) {
			TaskAsincronAbstract task = taskuri.get(0);
			taskuri.remove(0);
			task.executaTask(1000);
		}
	}
	
}
