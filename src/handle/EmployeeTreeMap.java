package handle;
import java.util.TreeMap;
import java.util.Map;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employee IDs and names
        employeeMap.put(1003, "Pugal");
        employeeMap.put(1001, "Raju");
        employeeMap.put(1002, "Ram");
        employeeMap.put(1004, "Siva");

        // Print the names of all employees in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}
