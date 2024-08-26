public class Student {
    private boolean criminalRecord;
    private int studentNumber;
    private String email;
    private char grade;
    private int socialSecurityNumber;
    private int age;
    private String gender;
    private String educationBackground;
    private String levelOfEducation;
    private String academicField;
    private String studentName;

    // Get method for social security number.
    private int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Get method for age.
    public int getAge() {
        return age;
    }

    // Get method for student name.
    public String getStudentName() {
        return studentName;
    }

    // Get method for criminal record.
    private boolean getCriminalRecord() {
        return criminalRecord;
    }

    // Get method for academic field.
    public String getAcademicField() {
        return academicField;
    }

    // Get method for levelOfEducation.
    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    // Get method for educationBackground
    public String getEducationBackground() {
        return educationBackground;
    }

    // Get method for gender.
    public String getGender() {
        return gender;
    }

    // Get method for student number.
    private int getStudentNumber() {
        return studentNumber;
    }

    // Get method for email.
    public String getEmail() {
        return email;
    }

    // Get method for grade.
    private int getGrade()
    {
        return grade;
    }

    // Set method for social security number.
    private void setSocialSecurityNumber(int providedSocialNumber)
    {
        socialSecurityNumber = providedSocialNumber;
    }
    // Set method for age.
    public void setAge(int providedAge)
    {
        age = providedAge;
    }
    // Set method for student name.
    public void setStudentName(String providedName)
    {
        studentName = providedName;
    }
    // Set method for grades.
    private void setGrade(char providedGrade)
    {
        grade = providedGrade;
    }
    // Set method for academic field
    public void setAcademicField(String providedAcademicField)
    {
        academicField = providedAcademicField;
    }

    public void setStudentNumber(int providedStudentNumber)
    {
        studentNumber = providedStudentNumber;
    }

    public void setStudentInfo(String providedStudentName, int providedStudentAge, int providedStudentNumber, String providedStudyProgram)
    {
        setStudentName(providedStudentName);
        setAge(providedStudentAge);
        setStudentNumber(providedStudentNumber);
        setAcademicField(providedStudyProgram);

    }
}
