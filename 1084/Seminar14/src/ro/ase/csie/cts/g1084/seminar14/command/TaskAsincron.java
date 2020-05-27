package ro.ase.csie.cts.g1084.seminar14.command;

public class TaskAsincron extends TaskAsincronAbstract{

	//stare specifica task-ului
	float timeout;
	
	//referinta catre executant
	InterfataModuleJoc modul;
	
	public TaskAsincron(String denumnireTask, 
			float timeout , InterfataModuleJoc modulExecutant) {
		super(denumnireTask);
		this.timeout = timeout;
		this.modul = modulExecutant;
	}

	@Override
	public void executaTask(int prioritate) {
		this.modul.executaActiune();
	}

}
