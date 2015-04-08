/** @author Brian solution to java code jam
	problem 1A 2008 minimum scalar product */
	
	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class vectorScalarLarge{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-large-practice.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileLarge.txt");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			int testCases = input.nextInt();
			for(int n = 1; n <= testCases; n++){
				long sum = 0; 
				int size = input.nextInt();
				long[] inputsa = new long[size];
				long[] inputsb = new long[size];
				for(int i = 0; i < size; i++){
					inputsa[i] = input.nextLong();
					//System.out.println(inputsa[i]);				
				}	
				for(int i = 0; i < size; i++){
					inputsb[i] = input.nextLong();
					//System.out.println(inputsb[i]);				
				}	
				Arrays.sort(inputsa);
				Arrays.sort(inputsb);
				for(int i = 0, j = (size - 1); i < size; i++ , j--){
					long tempProd = inputsa[i] * inputsb[j];
					sum = sum + tempProd;				
				}
				printOutput.println("Case #"+n+": "+sum+"");
			}
		
		}
		
	}