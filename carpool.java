import java.util.Scanner;

class carpool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles per day: ");
        double totalMiles = scan.nextDouble();

        System.out.println("Enter cost per gallon: ");
        double costPerGallon = scan.nextDouble();

        System.out.println("Enter average miles: ");
        double milesPerGallon = scan.nextDouble();

        System.out.println("Enter parking fees: ");
        double parkingFees = scan.nextDouble();

        System.out.println("Enter tolls per day: ");
        double tolls = scan.nextDouble();

        double gasUsed = totalMiles / milesPerGallon;
        double Cost = gasUsed * costPerGallon + parkingFees + tolls;

        System.out.println("Your daily driving cost:" + Cost);

    }
}
