import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter a positive integer: ");
//        int num = myScanner.nextInt();
//
//        // write your code here to print the appropriate message(s)
//        // described below
//
//        if (num <= 0) {
//            System.out.println("That's not a positive number, try again.");
//        } else {
//            if (num % 2 == 1) {
//                if (num % 5 == 0) {
//                    System.out.println("That's divisible by 5");
//                    }
//                if (num % 7 == 0) {
//                    System.out.println("That's divisible by 7");
//                    }
//                if ((num % 5 != 0) && (num % 7 != 0)) {
//                    System.out.println("That's not divisible by 5 or 7");
//                    }
//                }
//            if (num % 2 == 0) {
//                if (num > 1000) {
//                    System.out.println("Big Even number!");
//                    }
//                else if ((num < 1000) && (num > 100)) {
//                    System.out.println("Medium Even Number!");
//                    }
//                else {
//                    System.out.println("Small Even Number!");
//                }
//            }
//        }

// TEST CASE 1: 10 customers
        double costOfMeal1 = 125.45;
        Bill dinner1 = new Bill(costOfMeal1, 10);
        System.out.println("Dinner 1 total cost: " + dinner1.billInfo());

        // add tip to dinner1
        boolean tipAdded = dinner1.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 1 total cost: " + dinner1.billInfo());

        // try adding tip again to dinner1
        tipAdded = dinner1.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 1 total cost: " + dinner1.billInfo());
        System.out.println(); // print blank line

        // TEST CASE 2: 7 customers
        double costOfMeal2 = 87.09;
        Bill dinner2 = new Bill(costOfMeal2, 7);
        System.out.println("Dinner 2 total cost: " + dinner2.billInfo());

        // add tip to dinner2
        tipAdded = dinner2.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 2 total cost: " + dinner2.billInfo());

        // try adding tip again to dinner2
        tipAdded = dinner2.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 2 total cost: " + dinner2.billInfo());
        System.out.println(); // print blank line

        // TEST CASE 3: 2 customers
        double costOfMeal3 = 58.50;
        Bill dinner3 = new Bill(costOfMeal3, 2);
        System.out.println("Dinner 3 total cost: " + dinner3.billInfo());

        // add tip to dinner3
        tipAdded = dinner3.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 3 total cost: " + dinner3.billInfo());

        // try adding tip again to dinner3
        tipAdded = dinner3.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 3 total cost: " + dinner3.billInfo());
        System.out.println(); // print blank line

        // TEST CASE 4: 1 customer
        double costOfMeal4 = 27.00;
        Bill dinner4 = new Bill(costOfMeal4, 2);
        System.out.println("Dinner 4 total cost: " + dinner4.billInfo());

        // add tip to dinner4
        tipAdded = dinner4.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 4 total cost: " + dinner4.billInfo());

        // try adding tip again to dinner4
        tipAdded = dinner4.addTip();
        if (tipAdded) {
            System.out.println("Tip was successfully added!");
        } else {
            System.out.println("Total cost already includes tip; tip was not added again!");
        }
        System.out.println("Dinner 4 total cost: " + dinner4.billInfo());
    }
}