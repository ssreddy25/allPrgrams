package assignment;

import java.util.Scanner;

public class BusPass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fare sp= new SeasonalPass();
		Fare audltpas=new AdultPass();
		Fare childpass=new ChildPass();
		Fare freePas=new FreePas();
		Fare pHcPass=new PhysicallyHandicappedPass();
		Fare SenPass=new SeniorsPass();
		SeasonalPass stsp=new StudentSeasonalPass();
		Fare onePass=new OneTime();
		
		while(true){
			System.out.println("*************************************");
			System.out.println("| select choose your pass           |");
			System.out.println("|1.SeasonalPass                     |");
			System.out.println("|2. OneTime                         |");
			System.out.println("|3. FreePas for only freedom fighter|");
			System.out.println("|4.StudentSeasonalPass              |");
			System.out.println("|5.ChildPass                        |");
			System.out.println("|6.AdultPass                        |");
			System.out.println("|7.PhysicallyHandicappedPass        |");
			System.out.println("|8.SeniorsPass                      |");
			System.out.println("|9.exist                            |");
			System.out.println("*************************************");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("enter the your destination in km");
				sp.destination=sc.nextInt();
				sp.calculateFare();
				sp.PrintFare();
				break;
			case 2:
				System.out.println("enter the your destination in km");
				onePass.destination=sc.nextInt();
				onePass.calculateFare();
				onePass.PrintFare();
				break;
			case 3:
				System.out.println("enter the your destination in km");
				freePas.destination=sc.nextInt();
				freePas.calculateFare();
				freePas.PrintFare();
				break;
			case 4:
				System.out.println("enter the your destination in km");
				stsp.destination=sc.nextInt();
				stsp.calculateFare();
				stsp.PrintFare();
				break;
			case 5:
				System.out.println("enter the your destination in km");
				childpass.destination=sc.nextInt();
				childpass.calculateFare();
				childpass.PrintFare();
				break;
			case 6:
				System.out.println("enter the your destination in km");
				audltpas.destination=sc.nextInt();
				audltpas.calculateFare();
				audltpas.PrintFare();
				break;
			case 7:
				System.out.println("enter the your destination in km");
				pHcPass.destination=sc.nextInt();
				pHcPass.calculateFare();
				pHcPass.PrintFare();
				break;
			case 8:
				System.out.println("enter the your destination in km");
				SenPass.destination=sc.nextInt();
				SenPass.calculateFare();
				SenPass.PrintFare();
				break;
			case 9:
				
				System.exit(0);
				break;
				default:
					System.out.println("enter the between the 1 to 9 only");
			}
			
		}
		
	}

}
