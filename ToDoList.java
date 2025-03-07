package Project_biginner;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	    private ArrayList<String> tasks;

	    public ToDoList() {
	        tasks = new ArrayList<>();
	    }

	    public void addTask(String task) {
	        tasks.add(task);
	    }

	    public void removeTask(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            tasks.remove(index);
	        } else {
	            System.out.println("Invalid task number.");
	        }
	    }

	    public void displayTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks in the list.");
	        } else {
	            for (int i = 0; i < tasks.size(); i++) {
	                System.out.println((i + 1) + ". " + tasks.get(i));
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ToDoList toDoList = new ToDoList();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nTo-Do List:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. Display Tasks");
	            System.out.println("4. Exit");
	            System.out.println("______Enter your choice: _________");
	            
	            choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task: ");
	                    String task = scanner.nextLine();
	                    toDoList.addTask(task);
	                    break;
	                case 2:
	                    System.out.print("Enter task number to remove: ");
	                    int taskNumber = scanner.nextInt();
	                    toDoList.removeTask(taskNumber - 1);
	                    break;
	                case 3:
	                    toDoList.displayTasks();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);
	    }
}
