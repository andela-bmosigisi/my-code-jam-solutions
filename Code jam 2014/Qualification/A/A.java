/**code jam template */

	import java.util.Scanner;
	import java.io.File;
	import java.io.*;
	
	
	public class A{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-small-attempt0.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				int flag = 0;
				int ans1 = input.nextInt();
				int[][] arrang1 = new int[4][4];
				int[][] arrang2 = new int[4][4];
				for(int i=0; i < 4; i++){
					for(int j=0; j < 4; j++){
						arrang1[i][j] = input.nextInt();					
					}
				}					
				int ans2 = input.nextInt();
				for(int i=0; i < 4; i++){
					for(int j=0; j < 4; j++){
						arrang2[i][j] = input.nextInt();					
					}
				}
				
				flag = solve(arrang1, arrang2, ans1, ans2);
				if(flag >= 1){
					printOutput.println("Case #"+n+": "+flag+"");
				}
				else if(flag == 0){
					printOutput.println("Case #"+n+": Bad magician!");
				}
				else{
					printOutput.println("Case #"+n+": Volunteer cheated!");
				}
				
			}
			
		}
		public static int solve(int[][] arrang1, int[][] arrang2, int ans1, int ans2){
			int flag = 0;
			int count = 0;			
			for(int i = 0; i < 4; i++){
				int check;
				check = arrang1[(ans1 - 1)][i];
				for(int j=0; j < 4; j++){
					if(check == arrang2[(ans2 - 1)][j]){
						count++;
						flag = check;
						break;
					}
				}
			}
			if(count == 0){
				return -1;
			}
			else if (count == 1){
				return flag;
			}
			else
				return 0;
		}
	}	