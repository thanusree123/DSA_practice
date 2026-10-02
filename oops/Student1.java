public class Student1 {
    String name;
    int grade;

    // DEFAULT CONSTRUCTOR ONLY (0 parameters)
    public Student1() {
        this.name = "Not assigned";
        this.grade = 0;
    }

    // Setter for Name
    public void setName(String newName) {
        this.name = newName;
    }

    // Setter for Grade (Validates that input is between 0 and 100)
    public void setGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
        } else {
            System.out.println("Invalid grade! Grade must be between 0 and 100.");
        }
    }

    // Display Method
    public void displayinfo() {
        System.out.println("Name: " + name + " | Grade: " + grade);
    }

    public static void main(String[] args) {
        // Step 1: Create student object using Default Constructor
        Student1 s1 = new Student1();

        // Output right after birth: Name: Not assigned | Grade: 0
        s1.displayinfo();

        // Step 2: Assign/Update values using setters
        s1.setName("John");
        s1.setGrade(10);

        // Output after updating: Name: John | Grade: 10
        s1.displayinfo();
    }
}