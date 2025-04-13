
/**
 * This class describes Staff objects, which represent employees. Staff objects
 * have names and ages which can be modified.
 * 
 * @author Andrew
 */
public class Staff {
    private String staffName;
    private int staffAge;
    
    /**
     * Constructor accepts a String an integer, assigning them to the Staff
     * object's staffName and staffAge respectively.
     * @param name
     * @param age 
     */
    Staff (String name, int age) {
        this.staffName = name;
        this.staffAge = age;
    }
    
    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge (int age) {
        this.staffAge = age;
    }
        
    public String getStaffName() {
        return staffName;
    } 
    
    public void setStaffName (String name) {
        this.staffName = name;
    }
    
    /**
     * @return a readable string giving the Staff object's name followed by age
     * i.e Matthew: 22 indicates a Staff with name Matthew and age 22.
     */
    public String toString() {
        return staffName + ": " + staffAge;
    }
}
