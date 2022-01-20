package excercise2;

import java.util.Scanner;

public class ManageEastAsiaCountries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EastAsiaCountries[] country = new EastAsiaCountries[11];
		int n = country.length;;
		int ch;
		do {
			System.out.println("\n\n              MENU               ");
			System.out.println("==================================");
			System.out.println("1. Input the information of 11 countries in East Asia");
			System.out.println("2. Display the information of country you've just input");
			System.out.println("3. Search the information of country by user-entered name");
			System.out.println("4. Display the information of countries sorted name in ascending order");
			System.out.println("5. Exit");
			System.out.println("==================================");
			
		
			System.out.println("Please choise one option: ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					
					try {
						addCountryInformation(country);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					country[0].display();
					for(int i=0;i<3;i++) {
						System.out.print("\n"+country[i].getCountryCode()+" \t\t"+country[i].getCountryName()+" \t"+country[i].getTotalArea()+" \t\t"+country[i].getCountryTerrain());
					}
					break;
				case 3:
					System.out.println("Enter the name you want to search for: ");
					String name = sc.next();
					
					country[0].display();
					for(int i=0;i<3;i++) {
						if(country[i].getCountryName().equals(name)) {
							System.out.print("\n"+country[i].getCountryCode()+" \t\t"+country[i].getCountryName()+" \t"+country[i].getTotalArea()+" \t\t"+country[i].getCountryTerrain());
						}
					}
					
					break;
				case 4:
					System.out.println("");
					for (int i = 0; i < 3; i++)
			        {
			            for (int j = i + 1; j < 3; j++) {
			            	if(country[i].getCountryName().compareTo(country[j].getCountryName())>0) {
			            		EastAsiaCountries temp = country[i];
			            		country[i] = country[j];
			            		country[j] = temp; 
			            		
			            	}
			            }
			        }
					
					country[0].display();
					for(int i=0;i<3;i++) {
							System.out.print("\n"+country[i].getCountryCode()+" \t\t"+country[i].getCountryName()+" \t"+country[i].getTotalArea()+" \t\t"+country[i].getCountryTerrain());
					}
					break;
				default:
					break;
			}
			
		}while(ch!=0);
	}
	public static void addCountryInformation(EastAsiaCountries[] count) throws Exception{
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter the number of country do you want to input?");
//		int n = sc.nextInt();
		for(int i=0;i<3;i++) {
			count[i]=new EastAsiaCountries();
			count[i].input();
		}
	}
	
}
