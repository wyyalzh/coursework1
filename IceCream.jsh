String studentNumber = "32803938";
String last6Digits = studentNumber.substring(studentNumber.length() - 6);
int vanillaPrice = Integer.parseInt(last6Digits.substring(last6Digits.length() - 2));
int chocolatePrice = Integer.parseInt(last6Digits.substring(2, 4));
int strawberryPrice = Integer.parseInt(last6Digits.substring(0, 2));
import java.util.Scanner;
public class IceCreamShop {
        public void orderIceCream() {
                Scanner scanner = new Scanner(System.in);
        
                int vanillaPrice = 38; 
                int chocolatePrice = 39; 
                int strawberryPrice = 80; 
                int conePrice = 100;
        
                System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
                String flavorChoice = scanner.nextLine().trim().toLowerCase();
        
                int pricePerScoop;
                switch (flavorChoice) {
                        case "v":
                            pricePerScoop = vanillaPrice;
                            break;
                        case "c":
                            pricePerScoop = chocolatePrice;
                            break;
                        case "s":
                            pricePerScoop = strawberryPrice;
                            break;
                        default:
                            System.out.println("We don't have that flavour.");
                            return;
                }
        
                System.out.println("How many scoops would you like?");
                int scoops = scanner.nextInt();
        
                if (scoops < 1) {
                        System.out.println("We don't sell just a cone.");
                        return;
                } else if (scoops > 3) {
                        System.out.println("That's too many scoops to fit in a cone.");
                        return;
                }
        
                int totalPricePence = conePrice + (pricePerScoop * scoops);
                int pounds = totalPricePence / 100;
                int pence = totalPricePence % 100;
        
                System.out.printf("That will be %d.%02d please.%n", pounds, pence);
        }
}
IceCreamShop shop = new IceCreamShop();
 shop.orderIceCream();