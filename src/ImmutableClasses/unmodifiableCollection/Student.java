package ImmutableClasses.unmodifiableCollection;

public class Student {

    private final String name;
    private final StringBuilder StudentNotes;

    public Student(String name, StringBuilder studentNotes) {
        this.name = name;
        StudentNotes = studentNotes;
    }

    public String getName() {
        return name;
    }

    public StringBuilder getStudentNotes() {
        return StudentNotes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StudentsNotes=" + StudentNotes +
                '}';
    }
}
