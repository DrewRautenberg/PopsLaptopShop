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

            //user input
            name = JOptionPane.showInputDialog("Name");
            baseSalary = Integer.parseInt(JOptionPane.showInputDialog("Base salary"));
            tier = JOptionPane.showInputDialog("Tier");
            numBasic = Integer.parseInt(JOptionPane.showInputDialog("Number of basic laptops sold"));
            numPremium = Integer.parseInt(JOptionPane.showInputDialog("Number of premium laptops sold"));
            namDeluxe = Integer.parseInt(JOptionPane.showInputDialog("Number of deluxe laptops sold"));

            //Calculations
            double salesTotal = (numBasic * basic) + (numPremium * premium) + (namDeluxe * deluxe);

            //Calculate commission amount
            int commTotal = (numBasic * basicComm) + (numPremium * premiumComm) + (namDeluxe * deluxeComm);

            //Calculate Bonus Amount


        }



}
