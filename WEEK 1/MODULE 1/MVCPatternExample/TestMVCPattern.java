package MVCPatternExample;

public class TestMVCPattern {
    public static void main(String[] args) {
        
        Student student = new Student("John Doe", "12345", "A");

       
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

        
        controller.updateView();

        
        controller.setStudentName("Jane Doe");
        controller.setStudentId("67890");
        controller.setStudentGrade("B");

        
        controller.updateView();
    }
}
