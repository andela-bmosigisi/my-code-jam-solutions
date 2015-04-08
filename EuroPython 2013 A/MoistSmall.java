	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class MoistSmall{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-small-practice-1.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall1.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int i = 1; i <= testcases; i++){
				int cost = 0; 
				int skaters_no = input.nextInt();
				input.nextLine();
				String[] skaters = new String[skaters_no];
				for(int j = 0; j < skaters.length; j++){
					skaters[j] = input.nextLine();	
				}
				for(int m = 1; m < skaters.length; m++){
					boolean for_cost = false;
					for(int n = m; n > 0; n--){
						String string1 = skaters[n];
						String string2 = skaters[n-1];
						int temp = string1.compareTo(string2);
						if(temp < 0){
							swap(skaters, n, n-1);
							for_cost = true;
						}
						else{
							break;
						}
					}
					if(for_cost){
						cost++;
					}
				}
				printOutput.println("Case #"+i+": "+cost+"");
			}
			
		}
		public static void swap(String[] arr, int a, int b){
			String temp = arr[b];
			arr[b] = arr[a];
			arr[a] = temp;			
		}
	}	