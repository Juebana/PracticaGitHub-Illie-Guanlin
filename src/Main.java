import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // Aquí irá la lógica principal de la aplicación
        // Por ejemplo, un menú sencillo para agregar tareas, marcarlas como completadas y mostrar la lista

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Introduce la descripción de la tarea:");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    tasks.add(task);
                    System.out.println("Tarea agregada exitosamente.");
                    break;
                case 2:
                    System.out.println("Introduce el número de la tarea a marcar como completada:");
                    int taskIndex = scanner.nextInt();
                    if (taskIndex >= 0 && taskIndex < tasks.size()) {
                        tasks.get(taskIndex).setCompleted(true);
                        System.out.println("Tarea marcada como completada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No hay tareas.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            Task task = tasks.get(i);
                            System.out.println(i + ". " + task.getDescription() + " - " + (task.isCompleted() ? "Completada" : "Pendiente"));
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
