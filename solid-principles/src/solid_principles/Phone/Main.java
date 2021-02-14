  
package solid_principles.Phone;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase();
		PhoneOrder phoneOrder = new PhoneOrder();
		PhoneRepair phoneRepair = new PhoneRepair();
		String productDetail = "";

		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model name:");
			productDetail = sc.nextLine();
			System.out.println(phoneOrder.ProcessOrder(productDetail));
			break;

		case "repair":
			System.out.println("Is it the phone or the accessory that you want repaired?");
			String productType = sc.nextLine();
			if (productType.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name:");
				productDetail = sc.nextLine();
				System.out.println(phoneRepair.ProcessPhoneRepair(productDetail));
			}

			else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass:");
				productDetail = sc.nextLine();
				System.out.println(phoneRepair.ProcessAccessoryRepair(productDetail));
			}
			break;
		default:
			break;
		}

	}
}
