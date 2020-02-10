import java.util.Scanner;
import java.util.Arrays;

public class ArrayInitialize
{
    public static void main(String [] args)
    {
        // Initializing assignment using index
        int[] a=new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 50;
        a[3] = 30;
        a[4] = 80;

        // using one statement during creation
        int d[]=new int[]{1,2,3,4,5};

        //Using arrays.fill
        int b[]=new int[5];
        Arrays.fill(b,5);
        for(int i=0;i<d.length;i++)
        {
            System.out.println(b[i]);
        }

        // using for loop
        int c[]=new int[5];
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);

        }

        //user input
        int e[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integers");
        for(int i=0;i<e.length;i++)
        e[i]=sc.nextInt();

        for(int i=0;i<e.length;i++)
        {
            System.out.println(+e[i]);
        }

    }


}
