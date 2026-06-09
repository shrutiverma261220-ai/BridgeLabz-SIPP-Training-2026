import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee, discountPercent, discount, finalFee;

        System.out.print("Enter Student Fee: ");
        fee = input.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        discountPercent = input.nextDouble();

        discount = (fee * discountPercent) / 100;
        finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}