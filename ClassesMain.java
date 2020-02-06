public class ClassesMain
{
    public static void main(String[] args)
    {
        Car ferrari ;
        ferrari=new Car();
        ferrari.model="Ferrari F430";
        ferrari.seats=4;
        ferrari.colour="Red";
        ferrari.display();

        Car tesla=new Car();
        tesla.model="Model 5";
        tesla.colour="Black";
        tesla.seats=4;
        tesla.display();

        Car audi=new Car();
        audi.model="Audi 505";
        audi.colour="Blue";
        audi.seats=4;
        audi.display();
/*Object creation has two steps a) Object declaration b) memory allocation
         Car test; //test is called object reference variable
         test=new Car();//memory allocation
 */
    }
}
