public class ArraysJava
{
    public static void main(String [] args)
    {
        int a[]=new int[]{1,2,3,4,5};
        int b[]=a;
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

        int z=b[0];
        System.out.println("value of z = "+z);
    }
}
