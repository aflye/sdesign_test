package com.mycompany.javautil;
import java.util.Scanner;
public class JavaUtil {
    static Scanner sf = new Scanner(System.in);
    static boolean is_on = true;
    static boolean is_main_on = true;
    public static void main(String[] args) {     
       while(is_main_on)  { 
        System.out.println("Press p key to continue with prompts");
        System.out.println("Press m key to continue with Model-Based Testing");
        System.out.println("Press d key to continue with Identify Default Transitions");
        System.out.println("Press c key to continue with Multiple-Condition Testing");

        switch (sf.next()) {
            //checking on the sequence for all on EFSM
            case "p" -> {
                is_main_on = false;
                VendingMachine vmInstance = new VendingMachine();
                while(is_on){
                    menu(vmInstance);
                }
            }
            case "m" -> ModelTestCase();
            case "d" -> IdentityDefaultTestCase();
            case "c" -> MultipleConditionlTestCase();

            default -> System.out.println("Invalid Input");           
        }
       }
    }
    private static void menu(VendingMachine vm){
       Scanner myScanner = new Scanner(System.in);
       System.out.println("DRIVER for the vending machine");
       System.out.println("0. coin()");
       System.out.println("1. small_cup()");
       System.out.println("2. large_cup()");
       System.out.println("3. sugar()");
       System.out.println("4. tea()");
       System.out.println("5. insert_large_cups(int n)");
       System.out.println("6. insert_small_cups(int)");
       System.out.println("7. set_price(int p)");
       System.out.println("8. cancel()");
       System.out.println("9. dispose()");
       
       System.out.println("");

       System.out.println("q. Quit Vending Machine class driver");

       if(myScanner.hasNextInt()){
           int main_menu_sel = myScanner.nextInt();
           int x;
           switch (main_menu_sel) {
               case 0 -> {
                   x = vm.Coin();
                   System.out.println("case coin : "+String.valueOf(x));
               }
               case 1 -> {
                   x = vm.SmallCup();
                   System.out.println("case small_cup : "+String.valueOf(x));
               }
               case 2 -> 
               { 
                   x = vm.LargeCup();
                   System.out.println("case large_cup : "+String.valueOf(x));
               }
               case 3 -> {
                   x = vm.Sugar();
                   System.out.println("case sugar : "+String.valueOf(x));
               }
               case 4 -> {
                   x = vm.Coffee();
                   System.out.println("case tea : "+String.valueOf(x));
               }
               case 5 ->
               {
                   x = vm.InsertLargeCups(5);
                   System.out.println("case insert_large_cups : "+String.valueOf(x));
               }
               case 6 -> {
                   x = vm.InsertSmallCups(10);
                   System.out.println("case insert_small_cups : "+String.valueOf(x));

               }
               case 7 -> 
               {
                   x = vm.SetPrice(25);
                   System.out.println("case set_price : "+String.valueOf(x));
               }
               case 8 ->{ 
                   x = vm.Cancel();
               System.out.println("case cancel : "+String.valueOf(x));

               }
               case 9 ->{
               x = vm.Dispose();
               System.out.println("case dispose : "+String.valueOf(x));  
               }
               default -> System.out.println("Invalid Selection");
           }
       }
       else{
           String menu_sel = myScanner.next();
           switch (menu_sel) {
               case "q":
                   is_on = false;
                   System.exit(0);
               default:
                   System.out.println("Invalid Selection");
                   break;
           }
       }              
    }       

    private static void ModelTestCase() {
        System.out.println("-------------ModelTestCase--------------");
        VendingMachine vmInstance = new VendingMachine();
            int x = 0;
            x = vmInstance.SetPrice(25);
            System.out.println("case SetPrice : "+String.valueOf(x));
            x = vmInstance.InsertLargeCups(5);
            System.out.println("case InsertLargeCups : "+String.valueOf(x));
            x = vmInstance.Coin();
            System.out.println("case Coin : "+String.valueOf(x));
            x = vmInstance.LargeCup();
            System.out.println("case LargeCup : "+String.valueOf(x));
            x = vmInstance.Coffee();
            System.out.println("case Coffee : "+String.valueOf(x));
            x = vmInstance.Dispose();
            System.out.println("case Dispose : "+String.valueOf(x));
    }
       private static void IdentityDefaultTestCase() {
        System.out.println("--------------IdentityDefaultTestCase-------------");
        VendingMachine vmInstance = new VendingMachine();
            int x = 0;
            x = vmInstance.SetPrice(50);
            System.out.println("case SetPrice : "+String.valueOf(x));
            x = vmInstance.InsertLargeCups(5);
            System.out.println("case InsertLargeCups : "+String.valueOf(x));
            x = vmInstance.Coin();
            System.out.println("case Coin : "+String.valueOf(x));
            x = vmInstance.Dispose();
            System.out.println("case Dispose : "+String.valueOf(x));
    }
          private static void MultipleConditionlTestCase() {
        System.out.println("-------------MultipleConditionlTestCase--------------");
        VendingMachine vmInstance = new VendingMachine();
            int x = 0;
            x = vmInstance.SetPrice(30);
            System.out.println("case SetPrice : "+String.valueOf(x));
            x = vmInstance.InsertLargeCups(4);
            System.out.println("case InsertLargeCups : "+String.valueOf(x));
            x = vmInstance.Coin();
            System.out.println("case Coin : "+String.valueOf(x));
            x = vmInstance.SmallCup();
            System.out.println("case SmallCup : "+String.valueOf(x));
            x = vmInstance.Coffee();
            System.out.println("case Coffee : "+String.valueOf(x));
            x = vmInstance.Sugar();
            System.out.println("case Sugar : "+String.valueOf(x));
            x = vmInstance.Dispose();
            System.out.println("case Dispose : "+String.valueOf(x));
    }
}
