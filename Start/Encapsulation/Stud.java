class Student {
    // private data (hidden)
    private int marks;

    // setter method
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // getter method
    public int getMarks() {
        return marks;
    }
}

public class Stud {
    public static void main(String[] args) {
        Student s = new Student();

        s.setMarks(85);
        System.out.println("Marks: " + s.getMarks());
    }
}