import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class describes methods used to manage Staff objects. Staff can be
 * added to or removed from the workers ArrayList (hired or fired), and can
 * be assigned to particular shifts.
 * @author Andrew
 */
public class StaffManager {
    private ArrayList<Staff> workers = new ArrayList<>();
    private ArrayList<Staff> morningShift = new ArrayList<>();
    private ArrayList<Staff> dayShift = new ArrayList<>();
    private ArrayList<Staff> swingShift = new ArrayList<>();
    private ArrayList<ArrayList<Staff>> shiftList = new ArrayList<>();
    private Staff genericEmployeeA = new Staff("Anne", 29);
    private Staff genericEmployeeB = new Staff("Bob", 21);
    private Staff genericEmployeeC = new Staff("Cassidy", 23);
    
    // Constructor populates default employees, sets up three shifts
    StaffManager() {
        workers.add(genericEmployeeA);
        workers.add(genericEmployeeB);
        workers.add(genericEmployeeC);
        shiftList.add(morningShift); //morningShift is element 0
        shiftList.add(dayShift); //dayShift element 1
        shiftList.add(swingShift); //swingShift element 2
    }
    
    /**
     * This method allows the hiring (creation) of new Staff objects.
     * The user is prompted to provide the name and age for the Staff object.
     */
    public void hireStaff() {
        Scanner in = new Scanner(System.in);
        String newHireName;
        int newHireAge;
        System.out.println("Enter the new employee's name:");
        newHireName = in.nextLine();
        System.out.println("Enter the new employee's age:");
        newHireAge = in.nextInt();
        Staff staff = new Staff(newHireName, newHireAge);
        workers.add(staff);
        System.out.println("Employee added.");
    }
    
    /**
     * This method fires (deletes) existing Staff objects. Staff are removed
     * from the workers ArrayList and any shifts they are assigned to.
     */
    public void fireStaff() {
        Scanner in = new Scanner(System.in);
        String employee;
        Staff workerToBeFired = null;
        System.out.println("Enter the name of employee to fire:");
        employee = in.nextLine();
        
        /* This loop compares the names of existing workers to the name
         * enter by the user, removing any matches.
         * The user must enter the employee's name correctly.
         */
        for (Staff worker : workers) {
            String staffName = worker.getStaffName();
            if (staffName.equalsIgnoreCase(employee)) {
                workerToBeFired = worker;
            }
        }
        System.out.println(workerToBeFired.getStaffName() + " has been fired.");
        workers.remove(workerToBeFired);
        
        //This loop removes the fired worker from any assigned shifts.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < shiftList.get(i).size(); j++) {
                if (shiftList.get(i).get(j).getStaffName().equalsIgnoreCase(employee)) {
                    System.out.println(shiftList.get(i).get(j).getStaffName()
                            + " has been removed from their shift(s).");
                    shiftList.get(i).remove(j);
                }

            }
        }
        
    }
    
    /**
     * @return the workers ArrayList, containing all Staff
     */
    public ArrayList<Staff> getStaff() {
        return workers;
    }
    
    /**
     * This method prints a simple ArrayList containing existing Staff objects'
     * names and ages (i.e. [Staff1Name: Staff1Age, Staff2Name: Staff2Age... ])
     */
    public void printStaff() {
        System.out.println(workers);
    }
    
    public void modifyStaff() {
        Scanner in = new Scanner(System.in);
        String name;
        String newName;
        int newAge;
        System.out.println("Enter the name of the employee to edit:");
        name = in.nextLine();
        for (Staff employee : workers) {
            if (employee.getStaffName().equalsIgnoreCase(name)) {
                System.out.println("Enter " + employee.getStaffName() +"'s "
                        + "new name:");
                newName = in.nextLine();
                employee.setStaffName(newName);
                System.out.println("Enter " + newName + "'s new age:");
                newAge = in.nextInt();
                employee.setStaffAge(newAge);
            }
        }
    }
    
    /**
     * This method allows for an existing Staff object to be added to one of
     * three pre-set ArrayLists known as 'shifts'. The 'shifts' are nested
     * inside an outer ArrayList, declared as shiftList in the class.
     */
    public void addToShift() {
        Scanner in = new Scanner(System.in);
        int userSelection = 0;
        String employee;
        
        // User must enter an existing Staff object's name correctly.
        System.out.println("Enter the name of employee to add to shift:");
        employee = in.nextLine();
        System.out.printf("To which shift should the employee be added?%n"
                + "1.) Morning%n"
                + "2.) Day%n"
                + "3.) Swing%n");
        userSelection = in.nextInt();
        
        switch (userSelection) {
            case 1: for (Staff worker : workers) {
                if (worker.getStaffName().equalsIgnoreCase(employee)) {
                    morningShift.add(worker);
                    System.out.println(worker.getStaffName()
                            + " has been added to the morning shift.");
                }
            }; break;
            case 2: for (Staff worker: workers) {
                if (worker.getStaffName().equalsIgnoreCase(employee)) {
                    dayShift.add(worker);
                    System.out.println(worker.getStaffName()
                            + " has been added to the day shift.");
                }
            }; break;
            case 3: for (Staff worker: workers) {
                if (worker.getStaffName().equalsIgnoreCase(employee)) {
                    swingShift.add(worker);
                    System.out.println(worker.getStaffName()
                            + " has been added to the night shift.");
                }
            }; break;
            default: System.out.println("Invalid Option.");
        }
    } //addToShift() close
    
    /**
     * This method removes a Staff object (employee) from any assigned shifts.
     * As written, it expects there to be only three shifts. Elements of the
     * shiftList ArrayList are accessed sequentially, if a Staff object's name
     * is found in the nested ArrayList(s), that Staff object is removed.
     */
    public void removeFromShift() {
        Scanner in = new Scanner(System.in);
        int userSelection = 0;
        String employee;
        System.out.println("Enter the name of employee to remove from shift:");
        employee = in.nextLine();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < shiftList.get(i).size(); j++) {
                if (shiftList.get(i).get(j).getStaffName().equalsIgnoreCase(employee)) {
                    System.out.println(shiftList.get(i).get(j).getStaffName()
                            + " has been removed from their shift.");
                    shiftList.get(i).remove(j);
                }
                
            }
        }
    }
    
    /**
     * This method prints all shifts, including the staff working the shift
     */
    public void printShifts() {
        System.out.println("Morning Crew:");
        for (int i = 0; i < shiftList.get(0).size(); i++) {
            System.out.println(shiftList.get(0).get(i).getStaffName());
        }
        System.out.println("--------");
        System.out.println("Day Crew:");
        for (int i = 0; i < shiftList.get(1).size(); i++) {
            System.out.println(shiftList.get(1).get(i).getStaffName());
        }
        System.out.println("--------");
        System.out.println("Swing Crew:");
         for (int i = 0; i < shiftList.get(2).size(); i++) {
            System.out.println(shiftList.get(2).get(i).getStaffName());
        }
    }
    
}
