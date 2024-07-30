
public class MVCTest {
    public static void main(String[] args) {
        Student model = new Student("Dimitri", 123, 85.0);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Boris");
        controller.setStudentGrade(90.0);
        controller.updateView();
    }
}