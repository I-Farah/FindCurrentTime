package findCurrentTime;

import java.util.Scanner;

/**
 * Display current time using currentTimeMillis in GMT
 * Understanding the operators / and %
 * @author nitrocyborc
 * @version 8/25/2018
 */

public class FindCurrentTime {
	public static void main(String[] args) {
		//The currentTimeMillis method returns current time in milliseconds since midnight Jan 1 1970 GMT
		System.out.println("Find the current time in any of the 50 US states.");
		
		// total time since 1970 in milliseconds
		long totalSecondsMil = System.currentTimeMillis();
		
		// total time since 1970 in milliseconds to seconds
		long totalSeconds = totalSecondsMil / 1000;
		
		// current seconds
		long currentSeconds =  totalSeconds % 60;
		
		// total Minutes 
		long totalMinutes = totalSeconds / 60;
		
		//current Minutes
		long currentMinutes = totalMinutes % 60;
		
		//total Hours
		long totalHours = totalMinutes / 60;
		
		//current Hour
		long currentHour = (totalHours % 24);
		
		// get user US state
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Select State number [1 = Connecticut, 2 = Delaware, 3 = Florida, 4 = Georgia, 5 = Indiana, 6 = Kentucky, 7 = Maine, 8 = Maryland," 
		+ " 9 = Massachusetts, 10 = Michigan, 11 = New Hampshire, 12 = New Jersey, 13 = New York, 14 = North Carolina, 15 = Ohio, 16 = Pennsylvania, " 
		+ " 17 = Rhode Island, 18 = South Carolina, 19 = Tennessee, 20 = Vermont, 21 = Virginia, 22 = West Virginia, 23 = Alabama, 24 = Arkansas, 25 = Illinois, "
		+  "26 = Iowa, 27 = Kansas, 28 = Louisiana, 29 = Minnesota, 30 = Mississippi, 31 = Missouri, 32 = Nebraska, 33 = North Dakota, 34 = Oklahoma, 35 = South Dakota, "
		+ "36 = Texas, 37 = Wisconsin, 38 = Arizona, 39 = Colorado, 40 = Idaho, 41 = Montana, 42 = New Mexico, 43 = Oregon, 44 = Wyoming, 45 = California, 46 = Washington, "
		+ "47 = Nevada, 48 = Hawaii, 49 = Utah, 50 = Alaska]: ");
		int input = scan.nextInt();
		
		// determine the current time based on location
		if (input <= 22) {
			// states with both EST and CST zones
			if(input == 3 || input == 5 || input == 6 || input == 10 || input == 19) {
				// have to create new scanner or program terminates for some reason
				int i = 0;
				while(i < 1) {
					System.out.print("Type in EST(Eastern Time) or CST(CentralTime): ");
					Scanner scan2 = new Scanner(System.in);
					String input2 = scan2.nextLine();
					if(input2.equalsIgnoreCase("est")) {
						currentHour = (currentHour - 4) ;
						if (currentHour < 0) {
							currentHour = currentHour + 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
						}
						else if(currentHour > 12) {
							currentHour = currentHour - 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
						}
						else {
							if (currentHour == 0) {
								currentHour = (currentHour + 12);
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
							else {
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
						}
						i++;
					}
					else if(input2.equalsIgnoreCase("cst")) {
						currentHour = (currentHour - 5) ;
						if (currentHour < 0) {
							currentHour = currentHour + 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
						}
						else if(currentHour > 12) {
							currentHour = currentHour - 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
						}
						else {
							if (currentHour == 0) {
								currentHour = (currentHour + 12);
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
							else {
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
						}
						i++;
					}
				}
			}
			else {
				currentHour = (currentHour - 4) ;
				if (currentHour < 0) {
					currentHour = currentHour + 12;
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else if(currentHour > 12) {
					currentHour = currentHour - 12;
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
				}
				else {
					if (currentHour == 0) {
						currentHour = (currentHour + 12);
						System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
					}
					else {
						System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
					}
				}
			
		
			}
		}
		else if(input > 22 && input <= 37) {
			if(input == 27 || input == 32 || input == 33 || input == 35 || input == 36) {
				int i = 0;
				while(i < 1) {
					System.out.print("Type in MST (Mountain Time) or CST (Central Time): ");
					Scanner scan3 = new Scanner(System.in);
					String input2 = scan3.nextLine();
					if(input2.equalsIgnoreCase("cst")) {
						currentHour = (currentHour - 5) ;
						if (currentHour < 0) {
							currentHour = currentHour + 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
						}
						else if(currentHour > 12) {
							currentHour = currentHour - 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
						}
						else {
							if (currentHour == 0) {
								currentHour = (currentHour + 12);
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
							else {
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
						}
						i++;
					}
					else if(input2.equalsIgnoreCase("mst")) {
						currentHour = (currentHour - 6) ;
						if (currentHour < 0) {
							currentHour = currentHour + 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
						}
						else if(currentHour > 12) {
							currentHour = currentHour - 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
						}
						else {
							if (currentHour == 0) {
								currentHour = (currentHour + 12);
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
							else {
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
						}
						i++;
					}
				}
			}
			else {
				currentHour = (currentHour - 5) ;
				if (currentHour < 0) {
					currentHour = currentHour + 12;
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else if(currentHour > 12) {
					currentHour = currentHour - 12;
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
				}
				else {
					if (currentHour == 0) {
						currentHour = (currentHour + 12);
						System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
					}
					else {
						System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
					}
				}
			
			}
		}
		else if(input > 37 && input <= 44) {
			if(input == 27 || input == 32 || input == 33 || input == 35 || input == 36) {
				int i = 0;
				while(i < 1) {
					System.out.print("Type in MST (Mountain Time) or CST (Central Time): ");
					Scanner scan4 = new Scanner(System.in);
					String input2 = scan4.nextLine();
					if(input2.equalsIgnoreCase("cst")) {
						currentHour = (currentHour - 5) ;
						if (currentHour < 0) {
							currentHour = currentHour + 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
						}
						else if(currentHour > 12) {
							currentHour = currentHour - 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
						}
						else {
							if (currentHour == 0) {
								currentHour = (currentHour + 12);
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
							else {
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
						}
						i++;
					}
					else if(input2.equalsIgnoreCase("mst")) {
						currentHour = (currentHour - 6) ;
						if (currentHour < 0) {
							currentHour = currentHour + 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
						}
						else if(currentHour > 12) {
							currentHour = currentHour - 12;
							System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
						}
						else {
							if (currentHour == 0) {
								currentHour = (currentHour + 12);
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
							else {
								System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
							}
						}
						i++;
					}
				}
			}
			else {
				currentHour = (currentHour - 6) ;
				if (currentHour < 0) {
					currentHour = currentHour + 12;
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else if(currentHour > 12) {
					currentHour = currentHour - 12;
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
				}
				else {
					if (currentHour == 0) {
						currentHour = (currentHour + 12);
						System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
					}
					else {
						System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
					}
				}
			
			}
		
		
		}
		else if (input > 44 && input <= 47) {
					
			currentHour = (currentHour - 7) ;
			if (currentHour < 0) {
				currentHour = currentHour + 12;
				System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
			}
			else if(currentHour > 12) {
				currentHour = currentHour - 12;
				System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
			}
			else {
				if (currentHour == 0) {
					currentHour = (currentHour + 12);
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else {
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
			}			
					
		}
		else if (input == 48) {
			currentHour = (currentHour - 8) ;
			if (currentHour < 0) {
				currentHour = currentHour + 12;
				System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
			}
			else if(currentHour > 12) {
				currentHour = currentHour - 12;
				System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
			}
			else {
				if (currentHour == 0) {
					currentHour = (currentHour + 12);
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else {
					System.out.println("The current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
			}	
		}
		// oh, i forgot Utah. Who cares about Utah right. :]
		else if(input == 49) {
			currentHour = (currentHour - 6) ;
			if (currentHour < 0) {
				currentHour = currentHour + 12;
				System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
			}
			else if(currentHour > 12) {
				currentHour = currentHour - 12;
				System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
			}
			else {
				if (currentHour == 0) {
					currentHour = (currentHour + 12);
					System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else {
					System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
			}
		}
		else if(input == 50) {
			currentHour = (currentHour - 10) ;
			if (currentHour < 0) {
				currentHour = currentHour + 12;
				System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
			}
			else if(currentHour > 12) {
				currentHour = currentHour - 12;
				System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " PM");
			}
			else {
				if (currentHour == 0) {
					currentHour = (currentHour + 12);
					System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
				else {
					System.out.println("The current time is " + currentHour + " : " + currentMinutes + " : " + currentSeconds + " AM");
				}
			}
		}
		
	}
	
}
