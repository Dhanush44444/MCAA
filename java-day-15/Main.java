import java.util.*;
class Patient {
    String name;
    String phone;
    int roomNo;
    String condition;
    double bill;
    boolean recovery; 
    public Patient(String name, String phone, int roomNo, String condition, double bill, boolean recovery) {
        this.name = name;
        this.phone = phone;
        this.roomNo = roomNo;
        this.condition = condition;
        this.bill = bill;
        this.recovery = recovery;
    } 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Room No: " + roomNo);
        System.out.println("Condition: " + condition);
        System.out.println("Bill: " + bill);
        System.out.println("Recovered: " + (recovery ? "Yes" : "No"));
        System.out.println("-------------------------");
    }
} 
public class Main{
    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void addPatient() {
        System.out.println("Enter patient details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Room No: ");
        int roomNo = sc.nextInt();
        sc.nextLine();  
        System.out.print("Condition: ");
        String condition = sc.nextLine();
        System.out.print("Bill: ");
        double bill = sc.nextDouble();
        System.out.print("Recovered (true/false): ");
        boolean recovery = sc.nextBoolean();
        sc.nextLine();  
        patients.add(new Patient(name, phone, roomNo, condition, bill, recovery));
        System.out.println("Patient added successfully!");
    }
    public static void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients to display.");
        } else {
            System.out.println("Patient Details:");
            for (Patient p : patients) {
                p.display();
            }
        }
    } 
    public static void updateRecoveryStatus() {
        System.out.print("Enter patient's name to update recovery status: ");
        String name = sc.nextLine();
        boolean found = false; 
        for (Patient p : patients) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.print("Is the patient recovered? (true/false): ");
                p.recovery = sc.nextBoolean();
                sc.nextLine();
                found = true;
                System.out.println("Recovery status updated successfully!");
                break;
            }
        } 
        if (!found) {
            System.out.println("Patient not found.");
        }
    }  
        public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Update Recovery Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    displayPatients();
                    break;
                case 3:
                    updateRecoveryStatus();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4); 
        sc.close();
    }
}