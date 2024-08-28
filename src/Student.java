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

    /**
     * Constructor for Student
     * @param providedStudentName
     * @param providedStudentAge
     * @param providedStudentNumber
     * @param providedStudyProgram
     */
    public Student(String providedStudentName, int providedStudentAge, int providedStudentNumber, String providedStudyProgram)
    {
        setStudentName(providedStudentName);
        setAge(providedStudentAge);
        setStudentNumber(providedStudentNumber);
        setAcademicField(providedStudyProgram);
    }

    /**
     * Constructor for Student
     * @param providedStudentName
     * @param providedStudentAge
     * @param providedStudentNumber
     */
    public Student(String providedStudentName, int providedStudentAge, int providedStudentNumber)
    {
        setStudentName(providedStudentName);
        setAge(providedStudentAge);
        setStudentNumber(providedStudentNumber);
    }

    /**
     * Constructor for Student, containing no parameters
     */
    public Student() {

    }

    /**
     * Method to return age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Method to return studentName
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Method to return academicField
     * @return academicField
     */
    public String getAcademicField() {
        return academicField;
    }

    /**
     * Method to return studentNumber
     * @return studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * Used to set age of the student in new student object.
     * Does not return any value.
     * In case of invalid age, will throw an exception
     * of type IllegalArgumentException.
     * @param providedAge input age provided by user.
     */
    public void setAge(int providedAge)
    {
        // Check if provided age is 17, or above.
        if(providedAge < 17)
        {
            throw new IllegalArgumentException();
        }

        age = providedAge;
    }

    /**
     * This method is used to set the name of a student.
     * If the parameter providedName is empty, or contains numbers
     * the program will throw an exception
     * @param providedName
     */
    public void setStudentName(String providedName)
    {
        if(providedName.isEmpty() || providedName.matches(".*[[0-9]!#$%&/()=?`^*_:;>].*"))
        {
            throw new IllegalArgumentException();
        }

        studentName = providedName;
    }

    /**
     * Method used to set the academicField, if parameter is empty,
     * or contains nymbers. The program will throw an exception.
     * @param providedAcademicField
     */
    public void setAcademicField(String providedAcademicField)
    {
        if(providedAcademicField.isEmpty() || providedAcademicField.matches(".*[[0-9]!#$%&/()=?`^*_:;>].*"))
        {
            throw new IllegalArgumentException();
        }

        academicField = providedAcademicField;
    }

    /**
     * This method is used to set student number.
     * If student number is less than 100000, an exception will be thrown
     * @param providedStudentNumber
     */
    public void setStudentNumber(int providedStudentNumber)
    {
        if(providedStudentNumber < 100000)
        {
            throw new IllegalArgumentException();
        }

        studentNumber = providedStudentNumber;
    }
}
