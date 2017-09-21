import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/* A2 Pops Laptop Shop
    * AUTHOR:  Drew Rautenberg
    * Description:
    */
public class PopsLaptopShop {
        public static void main(String[] args) {
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
            String tier;
            int numBasic = 0;
            int numPremium = 0;
            int namDeluxe = 0;

            //calculation variables
            double salesTotal;
            int commTotal;
            double bonusAmnt;

            //user input
            name = JOptionPane.showInputDialog("Name");
            baseSalary = Integer.parseInt(JOptionPane.showInputDialog("Base salary"));
            tier = JOptionPane.showInputDialog("Tier");
            numBasic = Integer.parseInt(JOptionPane.showInputDialog("Number of basic laptops sold"));
            numPremium = Integer.parseInt(JOptionPane.showInputDialog("Number of premium laptops sold"));
            namDeluxe = Integer.parseInt(JOptionPane.showInputDialog("Number of deluxe laptops sold"));

            //Calculations
            salesTotal = (numBasic * basic) + (numPremium * premium) + (namDeluxe * deluxe);

            //Calculate commission amount
            commTotal = (numBasic * basicComm) + (numPremium * premiumComm) + (namDeluxe * deluxeComm);

            //Calculate Bonus Amount
            if ((salesTotal >= 0) && (salesTotal <2500)){
                bonusAmnt = 0;
            }
            else if ((salesTotal >= 2500) && (salesTotal <5500)){
                bonusAmnt = salesTotal *0.01;
            }
            else if ((salesTotal >= 5500) && (salesTotal <10500)){
                bonusAmnt = 75 + (0.02 * (salesTotal - 5500));
            }
            else if ((salesTotal >= 10500) && (salesTotal <13500)){
                bonusAmnt = 125 + (0.03 * (salesTotal - 10500));
            }
            else {
                bonusAmnt = 375;
            }


        }



}
