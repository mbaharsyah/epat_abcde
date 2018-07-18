package repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class RepositoryTests {
	
	TaskRepository repo;
	
	@Before
	public void setup() {
		repo=new TaskRepository();
	}

	@Test
	public void testAddingTask() {
		// GIVEN new task object
		Task task = new Task();
		
		// WHEN task is added to the repo
		repo.add(task);
		
		// THEN the repo contains the new task
		assertTrue(repo.contains(task));
	}

}
