import java.io.*;
import java.util.Scanner;
import java.text.*;


public class CHammer{
	public static void main(String[] args) throws IOException{
	
	
		File file = new File("B-small-practice.in");
		FileOutputStream outputFile = new FileOutputStream("outputFile.out");
		PrintStream printOutput = new PrintStream(outputFile);
		Scanner input = new Scanner(file);
		
		final double ACC = 9.8;
		
		int testcases = input.nextInt();		
		for(int i = 1; i <= testcases; i++){
			int vel = input.nextInt();
			int dis = input.nextInt();
			
			double temp = (dis * ACC) / (vel * vel);
			
			double degr = (StrictMath.asin(temp))/2;
			double angle = degr * 180 / Math.PI;
			
			DecimalFormat df = new DecimalFormat("0.0000000");
			
		
		printOutput.println("Case #"+i+": "+df.format(angle)+"");
		}
	}
}