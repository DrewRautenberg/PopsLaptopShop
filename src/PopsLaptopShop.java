    /* A2 Pops Laptop Shop
    * AUTHOR:  Drew Rautenberg
    * Description:
    */
import javax.swing.*;
public class PopsLaptopShop {
        public static void main(String[] args){
            //Variable Declaration
            //Static variables
            final int SUPER_BONUS = 1000;
            final int MAX_VALID_SALARY = 10000;
            final int MAX_VALID_UNITS = 50;

            //laptop types
            double basic = 450.90;
            double premium = 850.50;
            double deluxe = 1350.95;

            //commission amounts
            int basicComm = 50;
            int premiumComm = 100;
            int deluxeComm = 150;

            //user information
            String name;
            double baseSalary;
            String startingTier;
            int numBasic;
            int numPremium;
            int numDeluxe;

            //calculation variables
            double salesTotal;
            double commTotal;
            double bonusAmt;
            String finalTier;
            double baseSalaryLimit;
            double superBonus = 0;
            String startingTierWord;
            double totCommBonus;
            double totMonthPay;
            String bonusMessage = "";

            //user input
            name = JOptionPane.showInputDialog("Name");
            do {
                baseSalary = Double.parseDouble(JOptionPane.showInputDialog("Base salary"));
            }while (baseSalary > MAX_VALID_SALARY);
            startingTier =JOptionPane.showInputDialog("Tier (T, M, or S)");
            do {
                numBasic = Integer.parseInt(JOptionPane.showInputDialog("Number of basic laptops sold"));
            }while (numBasic > MAX_VALID_UNITS);
            do {
                numPremium = Integer.parseInt(JOptionPane.showInputDialog("Number of premium laptops sold"));
            }while (numPremium > MAX_VALID_UNITS);
            do {
                numDeluxe = Integer.parseInt(JOptionPane.showInputDialog("Number of deluxe laptops sold"));
            }while (numDeluxe > MAX_VALID_UNITS);

            //Convert starting tier from single letter string to word
            switch (startingTier){
                case "S":
                    startingTierWord = "Starting";
                    break;
                case "M":
                    startingTierWord = "Middle";
                    break;
                case "T":
                    startingTierWord = "Top";
                    break;
                default:
                    startingTierWord = "Starting";
                    break;
            }

            //Calculations
            salesTotal = (numBasic * basic) + (numPremium * premium) + (numDeluxe * deluxe);

            //Calculate commission amount
            commTotal = (numBasic * basicComm) + (numPremium * premiumComm) + (numDeluxe * deluxeComm);

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

            //Calculate 75% of base salary
            baseSalaryLimit = baseSalary *.75;

            //Determine ending tier
            if (commTotal >= baseSalaryLimit){
                switch (startingTier){
                    case "S":
                        finalTier = "Middle";
                        bonusMessage = "Congratulations, " + name + ", you got promoted to the Middle tier.";
                        break;
                    case "M":
                        finalTier = "Top";
                        bonusMessage = "Congratulations, " + name + ", you got promoted to the Top tier.";
                        break;
                    case "T":
                        finalTier = "Top";
                        superBonus = SUPER_BONUS;
                        bonusMessage = "Congratulations, " + name + ", you got the Super Bonus because you were " +
                                "already in the top tier.";
                        break;
                    default:
                        finalTier = startingTierWord;
                        break;
                }
            }
            else{
                finalTier = startingTierWord;
                bonusMessage = "Sorry, " + name + ", you didn't get promoted this month.";
            }

            //Calculate total commission and bonus
            totCommBonus = commTotal + bonusAmt + superBonus;

            //Calculate total pay for the month
            totMonthPay = baseSalary + totCommBonus;

            //Outputs
            System.out.println("Salesperson: " + name);
            System.out.println("Starting Tier: " + startingTierWord);
            System.out.printf("Base Salary: $%,.2f\n", baseSalary);
            System.out.printf("Commission: $%,.2f\n", commTotal);
            System.out.printf("Bonus: $%,.2f\n", bonusAmt);
            System.out.printf("Super Bonus: $%,.2f\n", superBonus);
            System.out.printf("Total Commission and Bonus: $%,.2f\n", totCommBonus);
            System.out.printf("Total Monthly Pay: $%,.2f\n", totMonthPay);
            System.out.println("Final Tier: " + finalTier);
            System.out.println(bonusMessage);

        }
}