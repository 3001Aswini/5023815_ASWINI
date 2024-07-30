package TaskManagementSystem;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        
        taskList.addTask(new Task("T001", "Task One", "In Progress"));
        taskList.addTask(new Task("T002", "Task Two", "Completed"));
        taskList.addTask(new Task("T003", "Task Three", "Pending"));

      
        System.out.println("All Tasks:");
        taskList.traverseTasks();

       
        System.out.println("\nSearch Result:");
        Task task = taskList.searchTask("T002");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

       
        taskList.deleteTask("T002");

       
        System.out.println("\nTasks After Deletion:");
        taskList.traverseTasks();
    }
}
