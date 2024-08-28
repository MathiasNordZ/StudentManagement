@SuppressWarnings("preview")
public class Administration
{
    public static void main(String[] args)
    {

        // Input age equal to or above 17, else it will ouput an error.

        Student bidataStudent1 = new Student();


        bidataStudent1.setStudentName("Mathias");
        String nameOfStudent = bidataStudent1.getStudentName();

        if (nameOfStudent.equals("John"))
        {
            System.out.println("Navnet er likt");
        }
        else
        {
            System.out.println("Navnet er forskjellig");
        }

        try
        {
            bidataStudent1.setAge(18);
            System.out.println(bidataStudent1.getAge());
        }
        catch(IllegalArgumentException i)
        {
            System.out.println("Object was not created. Invalid input given." + i);
        }
    }
}
