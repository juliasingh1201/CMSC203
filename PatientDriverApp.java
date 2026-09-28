/*
 * Class: CMSC203
 * Instructor: Huseyin Aygun
 * Description: Driver class that creates a patient and three procedures,
 * displays the information, and calculates procedure statistics. * 
 * Due: 09/27/2026
 * Platform/compiler: Eclipse / Java
 *
 * I pledge that I have completed the programming assignment
 * independently. I have not copied my code from a student or any source.
 * I have not given my code to any student.
 *
 * Print your Name here: Julia Singh
 */


import java.util.Scanner;

public class PatientDriverApp {

    // Reads patient information from the keyboard and creates a Patient object
    public static Patient inputPatient(Scanner input) {

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter street address: ");
        String streetAddress = input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.print("Enter state: ");
        String state = input.nextLine();

        System.out.print("Enter ZIP code: ");
        String zipCode = input.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = input.nextLine();

        System.out.print("Enter emergency contact phone number: ");
        String emergencyContactPhoneNumber = input.nextLine();

        Patient patient = new Patient(
                firstName,
                middleName,
                lastName,
                streetAddress,
                city,
                state,
                zipCode,
                phoneNumber,
                emergencyContactName,
                emergencyContactPhoneNumber
        );

        return patient;
    }


    // Creates the first procedure using the no-argument constructor
    public static Procedure createProcedure1() {

        Procedure procedure = new Procedure();

        procedure.setProcedureName("Physical Exam");
        procedure.setDate("07/20/2026");
        procedure.setPractitionerName("Dr. Irvine");
        procedure.setCharges(250.00);

        return procedure;
    }


    // Creates the second procedure using the procedure name and date constructor
    public static Procedure createProcedure2() {

        Procedure procedure = new Procedure(
                "X-ray",
                "07/20/2026"
        );

        procedure.setPractitionerName("Dr. Jamison");
        procedure.setCharges(550.43);

        return procedure;
    }


    // Creates the third procedure using the all-attribute constructor
    public static Procedure createProcedure3() {

        Procedure procedure = new Procedure(
                "Blood Test",
                "07/20/2026",
                "Dr. Smith",
                1400.75
        );

        return procedure;
    }


    // Displays all patient information
    public static void displayPatient(Patient patient) {

        System.out.println("\nPatient Information");
        System.out.println("-------------------");
        System.out.println("Name: " + patient.buildFullName());
        System.out.println("Name (Last, First Middle): "
                + patient.getLastFirstMiddle());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Phone: " + patient.getPhoneNumber());
        System.out.println("Phone valid: "
                + patient.isValidPhoneNumber());
        System.out.println("Emergency Contact: "
                + patient.buildEmergencyContact());
        System.out.println("Emergency Phone valid: "
                + patient.isValidEmergencyPhoneNumber());
        System.out.println("Contact Summary: "
                + patient.getContactSummary());
    }


    // Displays information for one procedure
    public static void displayProcedure(Procedure procedure) {

        System.out.println("Procedure: "
                + procedure.getProcedureName());
        System.out.println("Date: "
                + procedure.getDate());
        System.out.println("Practitioner: "
                + procedure.getPractitionerName());
        System.out.println("Charge: "
                + procedure.getFormattedCharge());
        System.out.println("Category: "
                + procedure.getChargeCategory());
    }


    // Displays all three procedures in a table
    public static void displayProcedureTable(
            Procedure p1, Procedure p2, Procedure p3) {

        System.out.println("\nProcedures");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-20s %-12s %-18s %-12s %-10s%n",
                "Procedure", "Date", "Practitioner",
                "Charge", "Category");
        System.out.println("-------------------------------------------------------------");

        System.out.printf("%-20s %-12s %-18s %-12s %-10s%n",
                p1.getProcedureName(),
                p1.getDate(),
                p1.getPractitionerName(),
                p1.getFormattedCharge(),
                p1.getChargeCategory());

        System.out.printf("%-20s %-12s %-18s %-12s %-10s%n",
                p2.getProcedureName(),
                p2.getDate(),
                p2.getPractitionerName(),
                p2.getFormattedCharge(),
                p2.getChargeCategory());

        System.out.printf("%-20s %-12s %-18s %-12s %-10s%n",
                p3.getProcedureName(),
                p3.getDate(),
                p3.getPractitionerName(),
                p3.getFormattedCharge(),
                p3.getChargeCategory());

        System.out.println("-------------------------------------------------------------");
    }


    // Calculates the total charges for all three procedures
    public static double calculateTotalCharges(
            Procedure p1, Procedure p2, Procedure p3) {

        return p1.getCharges()
                + p2.getCharges()
                + p3.getCharges();
    }


    // Calculates the average charge for all three procedures
    public static double calculateAverageCharge(
            Procedure p1, Procedure p2, Procedure p3) {

        return calculateTotalCharges(p1, p2, p3) / 3.0;
    }


    // Finds the procedure with the highest charge
    public static Procedure findHighestChargeProcedure(
            Procedure p1, Procedure p2, Procedure p3) {

        Procedure highest = p1;

        if (p2.getCharges() > highest.getCharges()) {
            highest = p2;
        }

        if (p3.getCharges() > highest.getCharges()) {
            highest = p3;
        }

        return highest;
    }


    // Counts how many procedures have charges of at least $1000
    public static int countExpensiveProcedures(
            Procedure p1, Procedure p2, Procedure p3) {

        int count = 0;

        if (p1.isExpensiveProcedure()) {
            count++;
        }

        if (p2.isExpensiveProcedure()) {
            count++;
        }

        if (p3.isExpensiveProcedure()) {
            count++;
        }

        return count;
    }


    // Displays the procedure summary
    public static void displaySummary(
            Procedure p1, Procedure p2, Procedure p3) {

        double total = calculateTotalCharges(p1, p2, p3);
        double average = calculateAverageCharge(p1, p2, p3);
        Procedure highest = findHighestChargeProcedure(p1, p2, p3);
        int expensiveCount = countExpensiveProcedures(p1, p2, p3);

        System.out.println("\nSummary");
        System.out.println("-------");
        System.out.printf("Total Charges: $%,.2f%n", total);
        System.out.printf("Average Charge: $%,.2f%n", average);

        System.out.println("Highest Charge Procedure: "
                + highest.getProcedureName());

        System.out.println("Number of Expensive Procedures: "
                + expensiveCount);
    }


    // Main method that runs the Patient Application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Patient Application");
        System.out.println("===================");

        Patient patient = inputPatient(input);

        Procedure procedure1 = createProcedure1();
        Procedure procedure2 = createProcedure2();
        Procedure procedure3 = createProcedure3();

        displayPatient(patient);

        displayProcedureTable(
                procedure1,
                procedure2,
                procedure3
        );

        displaySummary(
                procedure1,
                procedure2,
                procedure3
        );

        System.out.println("\nThe program was developed by a Student: Julia Singh 09/27/26");
        input.close();
    }
}