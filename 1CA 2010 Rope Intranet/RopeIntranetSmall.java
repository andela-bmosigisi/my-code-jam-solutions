	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class RopeIntranetSmall{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-small-practice.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				int cross = 0;
				int wires_no = input.nextInt();
				int[][] wires = new int[wires_no][2];
				for(int m = 0; m < wires_no; m++){
					wires[m][0] = input.nextInt();
					wires[m][1] = input.nextInt();
				}	
				//boolean[][] check = new boolean[wires_no][wires_no];
				
				for(int m = 0; m < wires_no; m++){
					int a = wires[m][0];
					int b = wires[m][1];
					
					for(int j = m; j < wires_no; j++){
						if((a < wires[j][0] && wires[j][1] < b)|| (a > wires[j][0] && b < wires[j][1])){
							cross++;
						}
					}
				}
				
				printOutput.println("Case #"+n+": "+cross+"");
			}
			
		}
	}	