import java.util.Scanner;
public class ArrayMethods
{
    //Passing by reference
    //both arrays a and b points to the same memmory location
    public static void main(String [] args)
    {
        int a[]=new int[]{1,2,3,4,5};
        displayArray(a);
        int z[]=getValues();
        displayArray(z);
    }
    public static void displayArray(int[] b)
    {
        for(int i=0;i<b.length;i++)
            System.out.println("Values of b[" +i+ "] : "+b[i]);
    }

    public static int[] getValues()//return array of integer type
    {
        System.out.println("Enter the values for the array");
        int temp[]=new int[5];
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=sc.nextInt();

        }
        return temp;
    }
}
