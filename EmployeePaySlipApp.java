import java.util.*;

class Employee {
String empName, empId, address, mailId, mobileNo;
double basicPay;
Scanner sc = new Scanner(System.in);
void readDetails() {
System.out.println("Enter employee name:");
empName = sc.nextLine();
System.out.println("Enter employee Id:");
empId = sc.nextLine();
System.out.println("Enter Address:");
address = sc.nextLine();
System.out.println("Enter mailId:");
mailId = sc.nextLine();
System.out.println("Enter mobile number:");
mobileNo = sc.nextLine();
System.out.println("Enter Basic pay:");
basicPay = sc.nextDouble();
}

void displayDetails() {
System.out.println("\n---Employee Details---");
System.out.println("Name: " + empName);
System.out.println("ID: " + empId);
System.out.println("Address: " + address);
System.out.println("Mail ID: " + mailId);
System.out.println("Mobile No: " + mobileNo);
System.out.println("Basic Pay: " + basicPay);
}
}

class Programmer extends Employee {
void generatePaySlip() {
double da = basicPay * 97 / 100;
double hra = basicPay * 10 / 100;
double pf = basicPay * 12 / 100;
double staffClub = basicPay * 1 / 100;
double gross = basicPay + da + hra;
double net = gross - (pf + staffClub);

displayDetails();
System.out.println("Designation: Programmer");
System.out.println("DA: " + da);
System.out.println("HRA: " + hra);
System.out.println("PF: " + pf);
System.out.println("Staff Club: " + staffClub);
System.out.println("Gross Pay: " + gross);
System.out.println("Net Pay: " + net);
}
}

class AssistantProfessor extends Employee {
void generatePaySlip() {
double da = basicPay * 110 / 100;
double hra = basicPay * 20 / 100;
double pf = basicPay * 12 / 100;
double staffClub = basicPay * 5 / 100;
double gross = basicPay + da + hra;
double net = gross - (pf + staffClub);

displayDetails();
System.out.println("Designation: Assistant Professor");
System.out.println("DA: " + da);
System.out.println("HRA: " + hra);
System.out.println("PF: " + pf);
System.out.println("Staff Club: " + staffClub);
System.out.println("Gross Pay: " + gross);
System.out.println("Net Pay: " + net);
}
}

class AssociateProfessor extends Employee {
void generatePaySlip() {
double da = basicPay * 130 / 100;
double hra = basicPay * 30 / 100;
double pf = basicPay * 12 / 100;
double staffClub = basicPay * 10 / 100;
double gross = basicPay + da + hra;
double net = gross - (pf + staffClub);

displayDetails();        
System.out.println("Designation: Associate Professor");
System.out.println("DA: " + da);        
System.out.println("HRA: " + hra);        
System.out.println("PF: " + pf);        
System.out.println("Staff Club: " + staffClub);        
System.out.println("Gross Pay: " + gross);      
 System.out.println("Net Pay: " + net);
}
}

class Professor extends Employee {
void generatePaySlip() {
double da = basicPay * 140 / 100;
double hra = basicPay * 40 / 100;
double pf = basicPay * 12 / 100;
double staffClub = basicPay * 15 / 100;
double gross = basicPay + da + hra;
double net = gross - (pf + staffClub);

        displayDetails();
        System.out.println("Designation: Professor");
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club: " + staffClub);
        System.out.println("Gross Pay: " + gross);
        System.out.println("Net Pay: " + net);
    }
}

public class EmployeePaySlipApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Designation:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline

        switch (choice) {
            case 1:
                Programmer p = new Programmer();
                p.readDetails();
                p.generatePaySlip();
                break;
            case 2:
                AssistantProfessor ap = new AssistantProfessor();
                ap.readDetails();
                ap.generatePaySlip();
                break;
            case 3:
                AssociateProfessor asp = new AssociateProfessor();
                asp.readDetails();
                asp.generatePaySlip();
                break;
            case 4:
                Professor ps = new Professor();
                ps.readDetails();
                ps.generatePaySlip();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}