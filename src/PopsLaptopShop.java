    /* A2 Pops Laptop Shop
    * AUTHOR:  Drew Rautenberg
    * Description:
    */
import javax.swing.*;
public class PopsLaptopShop {
        public static void main(String[] args){
            //Variable Declaration
            //laptop types
            double basic = 450.90;
            double premium = 850.50;
            double deluxe = 1350.95;

            //commission amounts
            int basicComm = 50;
            int premiumComm = 100;
            int deluxeComm = 150;
            final int SUPER_BONUS = 1000;

            //user information
            String name;
            int baseSalary;
            String startingTier;
            int numBasic;
            int numPremium;
            int namDeluxe;

            //calculation variables
            double salesTotal;
            int commTotal;
            double bonusAmt;

            //user input
            name = JOptionPane.showInputDialog("Name");
            baseSalary = Integer.parseInt(JOptionPane.showInputDialog("Base salary"));
            startingTier = JOptionPane.showInputDialog("Tier");
            numBasic = Integer.parseInt(JOptionPane.showInputDialog("Number of basic laptops sold"));
            numPremium = Integer.parseInt(JOptionPane.showInputDialog("Number of premium laptops sold"));
            namDeluxe = Integer.parseInt(JOptionPane.showInputDialog("Number of deluxe laptops sold"));

            //Calculations
            salesTotal = (numBasic * basic) + (numPremium * premium) + (namDeluxe * deluxe);

            //Calculate commission amount
            commTotal = (numBasic * basicComm) + (numPremium * premiumComm) + (namDeluxe * deluxeComm);

            //Calculate Bonus Amount
            if ((salesTotal >= 0) && (salesTotal <2500)){
                bonusAmt = 0;
            }
            else if ((salesTotal >= 2500) && (salesTotal <5500)){
                bonusAmt = salesTotal *0.01;
            }
            else if ((salesTotal >= 5500) && (salesTotal <10500)){
                bonusAmt = 75 + (0.02 * (salesTotal - 5500));
            }
            else if ((salesTotal >= 10500) && (salesTotal <13500)){
                bonusAmt = 125 + (0.03 * (salesTotal - 10500));
            }
            else {
                bonusAmt = 375;
            }

            System.out.println("Salesperson: " + name);
            System.out.println("Starting Tier: " + startingTier);
            System.out.printf("Base Salary: $%.2f" + baseSalary);
            System.out.printf("Commission: $%.2f" + commTotal);
            System.out.printf("Bonus: $%.2f" + bonusAmt);

        }
}