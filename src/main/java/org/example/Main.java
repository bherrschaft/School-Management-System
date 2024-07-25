import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating teacher objects
        Teacher lizzy = new Teacher(1, "Lizzy", 500); // Create a teacher with ID 1, name Lizzy, and salary 500
        Teacher melissa = new Teacher(2, "Melissa", 700); // Create a teacher with ID 2, name Melissa, and salary 700
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600); // Create a teacher with ID 3, name Vanderhorn, and salary 600

        // Creating a list of teachers and adding the teacher objects to the list
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        // Creating student objects
        Student tamasha = new Student(1, "Tamasha", 4); // Create a student with ID 1, name Tamasha, and grade 4
        Student rakshith = new Student(2, "Rakshith", 12); // Create a student with ID 2, name Rakshith, and grade 12
        Student rabbi = new Student(3, "Rabbi", 5); // Create a student with ID 3, name Rabbi, and grade 5

        // Creating a list of students and adding the student objects to the list
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        // Creating a school object with the lists of teachers and students
        School ghs = new School(teacherList, studentList);

        // Students pay fees
        tamasha.payFees(5000); // Tamasha pays 5000 in fees
        rakshith.payFees(6000); // Rakshith pays 6000 in fees
        System.out.println("GHS has earned $" + School.getTotalMoneyEarned()); // Display the total money earned by the school

        // Paying teacher salaries
        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary()); // Lizzy receives her salary
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has $" + (School.getTotalMoneyEarned() - School.getTotalMoneySpent())); // Display the remaining money after paying Lizzy

        melissa.receiveSalary(melissa.getSalary()); // Melissa receives her salary
        System.out.println("GHS has spent for salary to " + melissa.getName() + " and now has $" + (School.getTotalMoneyEarned() - School.getTotalMoneySpent())); // Display the remaining money after paying Melissa

        // Displaying student and teacher details
        System.out.println(rakshith); // Display details of Rakshith
        System.out.println(melissa); // Display details of Melissa
    }
}
