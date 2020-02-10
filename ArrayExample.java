public class ArrayExample {
    public static void main(String[] args) {
        /*1.Declare the array
          2.Allocate memory
          3.Initialize the array
         */

        int a[];
        int[] b;

        a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 50;
        a[3] = 30;
        a[4] = 80;

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Value of a [" + i + "] : " + a[i]);
        }
    }
}
