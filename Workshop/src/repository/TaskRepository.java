package repository;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
	
	private List<Task> tasks;
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public TaskRepository() {
		tasks = new ArrayList<>();
	}                                                                                                                 
	
	public void add(Task task) {
		tasks.add(task);
	}

	public boolean contains(Task task) {
		return tasks.contains(task);
	}

}
