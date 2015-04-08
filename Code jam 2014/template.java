/**code jam template */

	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class Template{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-small-practice.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				int variable = 0;
								
			
				printOutput.println("Case #"+n+": "+variable+"");
			}
			
		}
	}	