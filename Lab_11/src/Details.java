
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Details 
{   
    public static void main(String[] args)
    {
        final String check_name = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$";
        final String check_phone= "^\\d{10}$";
        final Pattern name_Pattern = Pattern.compile(check_name);
        final Pattern phone_Pattern=Pattern.compile(check_phone);
        Scanner sc = new Scanner(System.in);
        String name[] = new String[3];
        String phone[] = new String[3];
        try
        {
            File file = new File("OOPS_Q2.txt");
            for(int i=0;i<3;i++)
            {
                System.out.print("Enter Name: ");
                name[i] = sc.nextLine();
                Matcher m1 = name_Pattern.matcher(name[i]);
                if(!m1.matches())
                {
                    System.out.println("Please enter a name without special characters and numbers");
                    i--;
                    continue;
                }
                System.out.print("Enter mobile number: ");
                phone[i] = sc.nextLine();
                Matcher m2 = phone_Pattern.matcher(phone[i]);
                if(!m2.matches())
                {
                    System.out.println("Please enter a 10-digit number");
                    i--;
                    continue;
                }
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            for(int i=0;i<3;i++)
            {
                writer.write(name[i]);
                writer.write("-");
                writer.write(phone[i]);
                writer.newLine();
            }
            writer.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
