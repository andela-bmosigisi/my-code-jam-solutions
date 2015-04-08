/** @author Brian solution to java code jam
	problem 1A 2008 minimum scalar product */
	
	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class vectorScalarSmall{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-small-practice.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.txt");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			int testCases = input.nextInt();
			for(int n = 1; n <= testCases; n++){
				int sum = 0; 
				int size = input.nextInt();
				int[] inputsa = new int[size];
				int[] inputsb = new int[size];
				for(int i = 0; i < size; i++){
					inputsa[i] = input.nextInt();
					//System.out.println(inputsa[i]);				
				}	
				for(int i = 0; i < size; i++){
					inputsb[i] = input.nextInt();
					//System.out.println(inputsb[i]);				
				}	
				Arrays.sort(inputsa);
				Arrays.sort(inputsb);
				for(int i = 0, j = (size - 1); i < size; i++ , j--){
					int tempProd = inputsa[i] * inputsb[j];
					sum = sum + tempProd;				
				}
				printOutput.println("Case #"+n+": "+sum+"");
			}
		
		}
		
	}