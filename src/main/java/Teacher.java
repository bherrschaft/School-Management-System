public class Teacher {
    // Fields to store teacher details
    private int id; // Teacher ID
    private String name; // Teacher name
    private int salary; // Teacher salary
    private int salaryEarned; // Total salary earned by the teacher

    // Constructor to initialize the Teacher object
    public Teacher(int id, String name, int salary) {
        this.id = id; // Set the teacher's ID
        this.name = name; // Set the teacher's name
        this.salary = salary; // Set the teacher's salary
        this.salaryEarned = 0; // Initialize salary earned to 0
    }

    // Method to set the teacher's salary
    public void setSalary(int salary) {
        this.salary = salary; // Update the teacher's salary
    }

    // Method to update the salary earned by the teacher
    public void receiveSalary(int salary) {
        salaryEarned += salary; // Add the received salary to the total salary earned
        School.updateTotalMoneySpent(salary); // Update the school's total money spent
    }

    // Getter methods to access the teacher's details
    public int getId() {
        return id; // Return the teacher's ID
    }

    public String getName() {
        return name; // Return the teacher's name
    }

    public int getSalary() {
        return salary; // Return the teacher's salary
    }

    public int getSalaryEarned() {
        return salaryEarned; // Return the total salary earned by the teacher
    }

    // Overriding the toString method to display teacher details
    @Override
    public String toString() {
        return "Teacher's name: " + name + ", Total salary earned so far: $" + salaryEarned; // Return teacher details as a string
    }
}
