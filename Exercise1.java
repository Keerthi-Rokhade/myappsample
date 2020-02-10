import java.util.Scanner;

public class Exercise1 {
    public static int model;
    public static float price,price1,temp;

    public static void main(String[] args) {

        selectmodel();

        options();

        discount();

        payment();

    }


    public static int selectmodel() {
        // int model;
        System.out.println("Enter the model of the car required");
        System.out.println("Enter 1 for Hatchback, 2 for Saloon, 3 for Estate");
        Scanner sc = new Scanner(System.in);
        model = sc.nextInt();

        {
            switch (model) {
                case (1):
                    System.out.println("You have selected Hatchback.");
                    System.out.println("Price of Hatchback Rs 5.35 lakh.");
                    price = 535000;
                    break;
                case (2):
                    System.out.println("You have selected Saloon.");
                    System.out.println("Price of Saloon Rs 4.95 lakh.");
                    price = 495000;
                    break;
                case (3):
                    System.out.println("You have selected Estate.");
                    System.out.println("Price of Estate is Rs 6.25 lakh.");
                    price = 625000;
                    break;
                default:
                    System.out.println("Invalid number. Enter the number again.");
                    selectmodel();
            }
            temp=price;
        }
        return model;
    }

    public static void options() {
        int option, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, extras;
        String extra = "Y";
        System.out.println("Do you wish to add optional extras?\nY/N");
        Scanner ex = new Scanner(System.in);
        extra = ex.nextLine();

        while (extra.equalsIgnoreCase("Y")) {
            System.out.println("Enter the optional extras required ");
            System.out.println("1:Set of luxury seats  Price=45000\n" +
                    "2:Satellite navigation  Price=5500\n" +
                    "3:Parking sensors  Price=10000\n" +
                    "4:Bluetooth connectivity  Price=350\n" +
                    "5:Sound System  Price=1000");
            Scanner op = new Scanner(System.in);
            option = op.nextInt();

            switch (option) {
                case 1:
                    price1 = price1 + 45000;
                    System.out.println("Price of optional extras:" + price1);
                    break;
                case 2:
                    price1 = price1 + 5500;
                    System.out.println("Price of optional extras:" + price1);
                    break;
                case 3:
                    price1 = price1 + 10000;
                    System.out.println("Price of optional extras:" + price1);
                    break;
                case 4:
                    price1 = price1 + 350;
                    System.out.println("Price of optional extras:" + price1);
                    break;
                case 5:
                    price1 = price1 + 1000;
                    System.out.println("Price of optional extras:" + price1);
                    break;
                default:
                    System.out.println("You entered a wrong number");

            }
            System.out.println("Do you wish to add other optional extras\nY/N");
            //Scanner ex = new Scanner(System.in);

            extra = ex.nextLine();
        }
        System.out.println("The total price of car including optional extras selected= "+(price+price1));
            return;
    }

    public static void discount()
    {
       float discountprice;
        String old="Y";
        System.out.println("Are you an existing customer? Y/N");
        Scanner scan=new Scanner(System.in);
         old=scan.nextLine();
        if (old.equalsIgnoreCase("Y"))
        {
            System.out.println("Existing customers are offered a discount of 10% off  any optional extras and 10% off the price of the car");
            discountprice=(float)((price1*0.1)+(temp*0.1));
            System.out.println("Discount price= "+discountprice);
            price=price-discountprice;
            System.out.println("New price after discount= "+price);
            cartrade();
        }
        else
        {
            System.out.println("You are offered 5% off on the price of car");
            discountprice=(float)(temp*0.05);
            System.out.println("Discount price= "+discountprice);
            price=price-discountprice;
            System.out.println("New price after discount= "+price);
            cartrade();
        }

        return;
    }

    public static void cartrade()
    {
        String car="Y";
        String car1="Y";
        int trade;
        System.out.println("Do you have an old car to trade? Y/N");
        Scanner tr=new Scanner(System.in);
        car=tr.nextLine();
        while(car.equalsIgnoreCase("Y"))
        {

            System.out.println("Price offered for your old car by Snazzy Autos is ");
            trade=tr.nextInt();
            if(trade>10000&&trade<100000)
            {
                price = price - trade;
                System.out.println("Price after car trade=" + price);
                break;
            }
            else
            {
                System.out.println("The price entered is not in the range");
                System.out.println("Do you wish to enter again? Y/N");
                Scanner tr1=new Scanner(System.in);
                car1=tr1.nextLine();
                car=car1;

            }

        }
       return;
    }

    public static void payment()
    {
        float cashback,equalpayments;
        String pay="Y";
        int emi,x;
        System.out.println("Do you wish to make full payment ? Y/N");
        Scanner scan=new Scanner(System.in);
        pay=scan.nextLine();
        if(pay.equalsIgnoreCase("Y"))
        {
            System.out.println("You will receive 1% cashback on total price or the chosen optional extras free");
            cashback=(float)(price*0.01);
            if(cashback>price1)
            {
                System.out.println("Best offer is to get a cashback of "+cashback);
                System.out.println("Optional extras price is "+price1);
            }
            else
            {
                System.out.println("Best offer is to get optional extras free which costs "+price1);
                System.out.println("Cashback is "+cashback);
            }

            System.out.println("Do you wish to get cashback or optionals extras free?");
            System.out.println("Enter 1 for cashback or 2 for optionals extras free");
            x=scan.nextInt();
            if(x==1)
            {
                price=price-cashback;
                System.out.println("Yow will receive a cashback of "+ cashback);
                System.out.println("Final price of the car will be "+price);
            }
            else
            {
                System.out.println("Final price of the car will be "+(price-price1));
            }

        }

        else
        {
            System.out.println("Enter 1 if you wish to make equal payments for 4 years with no extra charges");
            System.out.println("Or enter 2 if you wish to make equal payments for 7 years with 5% increase on the total price");
            emi=scan.nextInt();
            if(emi==1)
            {

                equalpayments=price/48;
                System.out.println("Final price of the car="+price);
                System.out.println("Equal monthly payments= "+equalpayments);
            }

            else
            {
                price=price+(float)(price*0.05);
                System.out.println("Final price of car with 5% increase in the price=  "+price);
                equalpayments=price/84;
                System.out.println("Equal monthly payments= "+equalpayments);
            }

        }

    }

}




