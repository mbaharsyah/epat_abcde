package repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	private TaskRepository repo;
	public static void main(String[] args){
		MainClass app = new MainClass(new TaskRepository());
		
		boolean exit = false;
		do {
			app.showMenu();
			int input = app.readInput();
			if (input==9) exit=true;
		} while (!exit);
	}
	
	public MainClass(TaskRepository repo)
	{
		this.repo = repo; 
	}
	
	public void showMenu(){
		System.out.println("Welcome to To Do List Application");
		showCurrentList();
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
	}
	
	public int readInput(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	
		scanner.nextLine();
		
		switch(input){
		case 1:
			System.out.println("1");
			showCurrentList();
			break;
			
		case 2:
			System.out.println("Enter Task Name");
			String taskname = scanner.nextLine();
			addTask(taskname);
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		case 9:

			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
		return input;
	}
	
	public void addTask(String taskName) {
		Task task = new Task();
		task.setName(taskName);
		repo.add(task);
	}
	
	public void showCurrentList() {
		List<Task> taskList = repo.getTasks();
		
		for (Task s : taskList){
			System.out.println(s.getName());
		}
	}
}
