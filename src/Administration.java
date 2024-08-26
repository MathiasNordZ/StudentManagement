@SuppressWarnings("preview")
public class Administration
{
    public static void main(String[] args)
    {
        Student bidataStudent1 = new Student();
        Student bidataStudent2 = new Student();
        Student bidataStudent3 = new Student();
        Student bidataStudent4 = new Student();

        // setAllValues(String, int, int, String)
        bidataStudent1.setStudentInfo("Mathias", 21, 12345, "BIDATA");

        int studentAge = bidataStudent1.getAge();
        String studentName = bidataStudent1.getStudentName();
        String academicField = bidataStudent1.getAcademicField();

        System.out.println("####################################");
        System.out.println("My name is " + studentName + ", I am " + studentAge + " years old, and I am studying " + academicField);
        System.out.println("####################################");
    }
}
