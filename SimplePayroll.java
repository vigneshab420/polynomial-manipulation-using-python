import java.util.*;

class SimplePayroll {
    static String[] names = new String[100];
    static double[] salaries = new double[100];
    static int count = 0;
    static int[] undoIndex = new int[100];
    static int undoCount = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Show Payroll");
            System.out.println("3. Undo Last");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int ch;
            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            try {
                if (ch == 1) addEmployee();
                else if (ch == 2) showPayroll();
                else if (ch == 3) undoLast();
                else if (ch == 4) break;
                else System.out.println("Invalid choice!");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static void addEmployee() throws Exception {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        if (name.isEmpty() || salary <= 0) {
            throw new Exception("Invalid name or salary!");
        }

        names[count] = name;
        salaries[count] = salary;
        undoIndex[undoCount++] = count;
        count++;

        System.out.println("Employee added successfully!");
    }

    static void showPayroll() throws Exception {
        if (count <= 0) {
            System.out.println("No employees to show.");
            return;
        }

        System.out.println("\n--- Payroll ---");
        for (int i = 0; i < count; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + " - Salary: " + salaries[i]);
            }
        }
    }

    static void undoLast() throws Exception {
        if (undoCount <= 0) {
            throw new Exception("Nothing to undo!");
        }

        int index = undoIndex[--undoCount];
        System.out.println("Removed last added employee: " + names[index]);

        // Clear the entry
        names[index] = null;
        salaries[index] = 0;
    }
}
