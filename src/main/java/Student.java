public class Student {
    // Fields to store student details
    private int id; // Student ID
    private String name; // Student name
    private int grade; // Student grade
    private int feesPaid; // Fees paid by the student
    private int feesTotal; // Total fees for the student

    // Constructor to initialize the Student object
    public Student(int id, String name, int grade) {
        this.id = id; // Set the student's ID
        this.name = name; // Set the student's name
        this.grade = grade; // Set the student's grade
        this.feesPaid = 0; // Initialize fees paid to 0
        this.feesTotal = 30000; // Assuming total fees is 30000
    }

    // Method to set the student's grade
    public void setGrade(int grade) {
        this.grade = grade; // Update the student's grade
    }

    // Method to update the fees paid by the student
    public void payFees(int fees) {
        feesPaid += fees; // Add the paid fees to the total fees paid
        School.updateTotalMoneyEarned(fees); // Update the school's total money earned
    }

    // Getter methods to access the student's details
    public int getId() {
        return id; // Return the student's ID
    }

    public String getName() {
        return name; // Return the student's name
    }

    public int getGrade() {
        return grade; // Return the student's grade
    }

    public int getFeesPaid() {
        return feesPaid; // Return the fees paid by the student
    }

    public int getFeesTotal() {
        return feesTotal; // Return the total fees for the student
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid; // Calculate and return the remaining fees
    }

    // Overriding the toString method to display student details
    @Override
    public String toString() {
        return "Student's name: " + name + ", Total fees paid so far: $" + feesPaid; // Return student details as a string
    }
}
