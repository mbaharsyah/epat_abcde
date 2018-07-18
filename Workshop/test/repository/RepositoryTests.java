package repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class RepositoryTests {
	
	TaskRepository repo;
	
	@Before
	public void setup() {
		repo = new TaskRepository();
	}

	@Test
	public void testAddingTask() {
		String taskName = "TEST CASE";
		boolean success = false;
		
		// GIVEN new task object
		MainClass app = new MainClass(repo);
		
		// WHEN task is added to the repo
		app.addTask(taskName);
		
		// THEN the repo contains the new task
		for (Task task : repo.getTasks()) {
			if (task.getName().equals(taskName)) {
				success = true;
			}
		}
		assertTrue(success);
	}

}
