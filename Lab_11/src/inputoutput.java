
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.*;
public class inputoutput
{
    public static void main(String[] args)
    {
        int s=0,w=0,c=0,sp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data");
        String Data = sc.nextLine();
        char array[]=new char[Data.length()];
        try 
        {
            int a=0,b=1;
            FileWriter output = new FileWriter("OOPS_Q1.txt");
            output.write(Data);
            output.close();
            FileReader input = new FileReader("OOPS_Q1.txt");
            input.read(array);
            String text = new String(array);
            c = text.length();
            int state = a;
            for(int i =0;i<text.length();i++)
            {
                char ch= text.charAt(i);  
                if (ch == ' ' || ch == '\n' || ch == '\t') 
                state = a;
                else if (state == a) 
                { 
                    state = b; 
                    w++; 
                } 
                if(Character.isWhitespace(ch))
                sp++;
                if(ch=='.')
                s++;
            }
            System.out.println("No. of Sentences: "+s);
            System.out.println("No. of words: "+w);
            System.out.println("No. of Characters: "+c);
            System.out.println("No. of White Spaces: "+sp);
        }
        catch (Exception e) {
        e.getStackTrace();
        }
    }
}

