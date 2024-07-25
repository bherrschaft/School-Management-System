import java.util.List;

public class School {
    // Fields to store lists of teachers and students and the total money earned and spent
    private List<Teacher> teachers; // List of teachers
    private List<Student> students; // List of students
    private static int totalMoneyEarned; // Total money earned by the school
    private static int totalMoneySpent; // Total money spent by the school

    // Constructor to initialize the School object
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers; // Set the list of teachers
        this.students = students; // Set the list of students
        totalMoneyEarned = 0; // Initialize total money earned to 0
        totalMoneySpent = 0; // Initialize total money spent to 0
    }

    // Getter methods to access the lists of teachers and students
    public List<Teacher> getTeachers() {
        return teachers; // Return the list of teachers
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher); // Add a teacher to the list
    }

    public List<Student> getStudents() {
        return students; // Return the list of students
    }

    public void addStudent(Student student) {
        students.add(student); // Add a student to the list
    }

    // Static methods to access and update the total money earned and spent
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned; // Return the total money earned
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned; // Update the total money earned
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent; // Return the total money spent
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent; // Update the total money spent
    }
}
