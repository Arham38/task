public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Learn Git"));
        manager.addTask(new Task(2, "Create Pull Request"));

        manager.showTasks();
    }
}