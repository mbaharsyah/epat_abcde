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
	
	public void delete(String taskName) {
		Task taskToDelete = null;
		for (Task task : tasks) {
			if (task.getName().equals(taskName)) {
				taskToDelete = task;
			}
		}
		tasks.remove(taskToDelete);
	}

	public boolean contains(Task task) {
		return tasks.contains(task);
	}

}
