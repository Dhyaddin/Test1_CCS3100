import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5_5 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char n,cv,ot = '0',ov,pf;
		int numTick, v=1, x=1, i=1;
		double total = 0, cTypeA = 0, cTypeC = 0, cTypeS = 0, cTypeA1= 0, cTypeC1 = 0, cTypeS1 = 0 ;
		
		do{
			System.out.println("\n******* VISITOR " + v + "**********" );
			
			System.out.print("\nEnter your nationality (Malaysian(M) | Foreigner (F)): " );
			n = in.next().charAt(0);
			
			switch (n) {
			
			case 'M':
				do {
					System.out.print("Choose category of visitor (A-Adult, C-Children, S-Senior): " );
					cv = in.next().charAt(0);
						
						switch(cv) {
							
						case 'A': 
							System.out.print("Number of ticket: ");
							numTick = in.nextInt();	
							
							cTypeA += numTick * 48.00;
							
							System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeA));
							
							break;
							
						case 'C': 
							System.out.print("Number of ticket: ");
							numTick = in.nextInt();	
							
							cTypeC += numTick * 21.00;
							
							System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeC));
								
							break;
							
						case 'S': 
							System.out.print("Number of ticket: ");
							numTick = in.nextInt();	
							
							cTypeS += numTick * 26.00;
							
							System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeS));
								
							break;
							
						default: System.out.println("Wrong Input. Try again !"); break;
						
						}
						
						System.out.print("Buy other ticket (Y/N) ?: ");
						ot = in.next().charAt(0);
						if(ot =='N') {
							total = cTypeA + cTypeC + cTypeS ;
							System.out.println("The total payment for VISITOR " + v + " is RM" + df.format(total));
							i=0;
						}
					
				}while(i != 0);
				
			break;
			
			case 'F':
				cTypeA = 0;
			    cTypeC = 0; 
			    cTypeS = 0;
				do {
				System.out.print("From which part? ((I)-Kad/Working Permit/Dependent Pass, (O)-Others): " );
				pf = in.next().charAt(0);
				
				if (pf == 'I' || pf == 'i') {
						System.out.print("Choose category of visitor (A-Adult, C-Children, S-Senior): " );
						cv = in.next().charAt(0);
							
							switch(cv) {
								
							case 'A': 
								System.out.print("Number of ticket: ");
								numTick = in.nextInt();	
								
								cTypeA += numTick * 53.00;
								
								System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeA));
								
								break;
								
							case 'C': 
								System.out.print("Number of ticket: ");
								numTick = in.nextInt();	

								cTypeC += numTick * 28.00;
								
								System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeC));
									
								break;
								
							case 'S': 
								System.out.print("Number of ticket: ");
								numTick = in.nextInt();	

								cTypeS += numTick * 53.00;
								
								System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeS));
									
								break;
								
							default: System.out.println("Wrong Input. Try again !"); break;
							
							}
				}
				else if (pf == 'O' || pf == 'o') {
						System.out.print("Choose category of visitor (A-Adult, C-Children, S-Senior): " );
						cv = in.next().charAt(0);
							
							switch(cv) {
								
							case 'A': 
								System.out.print("Number of ticket: ");
								numTick = in.nextInt();	
								
								cTypeA1 += numTick * 93.00;
								
								System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeA1));
								
								break;
								
							case 'C': 
								System.out.print("Number of ticket: ");
								numTick = in.nextInt();	
								
								cTypeC1 += numTick * 48.00;
								
								System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeC1));
									
								break;
								
							case 'S': 
								System.out.print("Number of ticket: ");
								numTick = in.nextInt();	

								cTypeS1 += numTick * 93.00;
								
								System.out.println("Visitor type " + cv + " charge: RM" + df.format(cTypeS1));
									
								break;
								
							default: System.out.println("Wrong Input. Try again !"); break;
							
							}
				}
				else {
		            System.out.println("Wrong Input. Try again !");
		            continue; // Continue to the next iteration
		        }
				
				System.out.print("Buy other ticket (Y/N) ?: ");
				ot = in.next().charAt(0);
				
				
				}while(ot != 'N');
				
				total = cTypeA + cTypeC + cTypeS + cTypeA1 + cTypeC1 + cTypeS1;
			    System.out.println("The total payment for VISITOR " + v + " is RM" + df.format(total));
				
				break;
			
			default: System.out.println("Wrong Input. Try again !"); break;
			}
			
			System.out.print("\nEnter another visitor (Y/N) ?: ");
			ov = in.next().charAt(0);
			if(ov =='N') {
				x=0;
			}else {
				v++;
			}
			
		}while(x != 0);
		
		in.close();
	}
}
