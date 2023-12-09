import java.util.Stack;

public class DishwashingSimulation {
    public static void main(String[] args) {
        Stack<String> dirtyPlates = new Stack<>();
        Stack<String> cleanPlates = new Stack<>();

        // Adding dirty plates to the dirty plates stack
        dirtyPlates.push("Plate 1");
        dirtyPlates.push("Plate 2");
        dirtyPlates.push("Plate 3");
        dirtyPlates.push("Plate 4");
        dirtyPlates.push("Plate 5");


        // Displaying the number of dirty plates before washing
        System.out.println("Number of dirty plates before washing \t: " + dirtyPlates);

        // Moving plates from the dirty plates stack to the clean plates stack
        while (!dirtyPlates.isEmpty()) {
            String plate = dirtyPlates.pop();
            cleanPlates.push(plate);
        }

        // Displaying the number of clean plates after washing
        System.out.println("Number of clean plates after washing \t: " + cleanPlates);

        // Displaying the list of clean plates that have been washed
        System.out.println("List of clean plates:");
        for (String plate : cleanPlates) {
            System.out.println(plate);
        }
    }
}
    
