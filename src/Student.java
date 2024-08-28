/**
 * Documentation for class Student
 * @author Mathias Nord
 * @version 0.0.1
 * @since 0.0.1
 * This is the documentation of the class Student.
 * which holds information of students which includes
 * name, age, study program and student number
 */
public class Student {
    private int studentNumber;
    private int age;
    private String academicField;
    private String studentName;

    public Student(String providedStudentName, int providedStudentAge, int providedStudentNumber, String providedStudyProgram)
    {
        setStudentName(providedStudentName);
        setAge(providedStudentAge);
        setStudentNumber(providedStudentNumber);
        setAcademicField(providedStudyProgram);
    }

    public Student(String providedStudentName, int providedStudentAge, int providedStudentNumber)
    {
        setStudentName(providedStudentName);
        setAge(providedStudentAge);
        setStudentNumber(providedStudentNumber);
    }

    public Student() {

    }

    // Get method for age.
    public int getAge() {
        return age;
    }

    // Get method for student name.
    public String getStudentName() {
        return studentName;
    }

    // Get method for academic field.
    public String getAcademicField() {
        return academicField;
    }

    // Get method for student number.
    public int getStudentNumber() {
        return studentNumber;
    }

    // Set method for age.
    // Sjekk før du setter verdi
    // Hvis riktig - sett
    // Ellers avbryt objekt opprettelse

    /**
     * Used to set age of the student in new student object.
     * Does not return any value.
     * In case of invalid age, will throw an exception
     * of type IllegalArgumentException.
     * @param providedAge input age provided by user.
     */
    public void setAge(int providedAge)
    {

        // blokke for å prøve
        // kaster unntak
        if(providedAge >= 17)
        {
            age = providedAge;
        }
        else
        {
            // Kast et unntak
            throw new IllegalArgumentException();
        }

    }
    // Set method for student name.
    public void setStudentName(String providedName)
    {
        studentName = providedName;
    }
    // Set method for academic field
    public void setAcademicField(String providedAcademicField)
    {
        academicField = providedAcademicField;
    }
    // Set method for student number
    public void setStudentNumber(int providedStudentNumber)
    {
        if(providedStudentNumber >= 100000)
        {
            studentNumber = providedStudentNumber;
        }
    }

    /*
    public void setStudentInfo(String providedStudentName, int providedStudentAge, int providedStudentNumber, String providedStudyProgram)
    {
        setStudentName(providedStudentName);
        setAge(providedStudentAge);
        setStudentNumber(providedStudentNumber);
        setAcademicField(providedStudyProgram);
    }
     */
}
