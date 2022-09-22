package assinment6;

import java.util.Scanner;

public class RegisterVechile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("|_________________________________|");
			System.out.println("| choose your vechile             |");
			System.out.println("| 1.CAR                           |");
			System.out.println("| 2.Auto                          |");
			System.out.println("| 3.MotorBike                     |");
			System.out.println("| 4.EXIST                         |");
			System.out.println("|_________________________________|");
			System.out.println("enter the your chooice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("thanks for choosing the car");
				System.out.println("enter the your pavoriet number to rigister number");
				String reg = sc.next();
				FourWheeler car = new Car(reg);
				System.out.println(car.regNumber);
				System.out.println(car.equals(car));
				System.out.println("car is a FourWheeler "+car.getNumberOfWheels());
				break;
			case 2:
				System.out.println("thanks for choosing the auto");
				System.out.println("enter the your pavoriet number to rigister number");
				String reg1 = sc.next();
				ThreeWheeler  auto = new Auto(reg1);
				System.out.println(auto.regNumber);
				System.out.println(auto.equals(auto));
				System.out.println("auto is ThreeWheeler vechile "+auto.getNumberOfWheels());
				break;
			case 3:
				System.out.println("thanks for choosing the bike");
				System.out.println("enter the your pavoriet number to rigister number");
				String reg2 = sc.next();
				TwoWheeler bike = new MotorBike(reg2);
				System.out.println(bike.regNumber);
				System.out.println(bike.equals(bike));
				System.out.println("bike is TwoWheeler "+bike.getNumberOfWheels());
				break;
			case 4:
				System.out.println("visit agian");
				System.exit(0);
			default:
				System.out.println("enter the 1 to 4 only");

			}
		}
	}

}
