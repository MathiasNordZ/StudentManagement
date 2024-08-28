import java.util.Scanner;

@SuppressWarnings("preview")
public class Administration
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String nameInput = input.nextLine();

        System.out.println("Please enter age: ");
        String ageInput = input.nextLine();

        System.out.println("Please enter student number: ");
        String numberInput = input.nextLine();

        System.out.println("Please enter study program: ");
        String programInput = input.nextLine();



        Student bidataStudent1 = new Student();

        try {
            bidataStudent1.setStudentName(nameInput);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println("Object was not created. Invalid input given." + i);
        }

        try
        {
            bidataStudent1.setAge(22);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println("Object was not created. Invalid input given." + i);
        }

        try
        {
            bidataStudent1.setAcademicField("BIDATA");
        }
        catch(IllegalArgumentException i)
        {
            System.out.println("Object was not created. Invalid input given");
        }

        try
        {
            bidataStudent1.setStudentNumber(100256);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println("Object was not created. Invalid input.");
        }

        String name = bidataStudent1.getStudentName();
        int age = bidataStudent1.getAge();
        int student_number = bidataStudent1.getStudentNumber();
        String study_program = bidataStudent1.getAcademicField();

        System.out.println("Name of the student: " + name + "\nAge of the student: " + age + "\nStudent number: " + student_number + "\nStudy program: " + study_program);
    }
}
