	import java.text.DecimalFormat;
	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class B{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("B-small-attempt0.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				double total_time = 0.0;
				double farm_price = input.nextDouble();
				double inc_rate = input.nextDouble();
				double target = input.nextDouble();
				double ckie_rate = 2.0;
				double ttime =	farm_price / ckie_rate;
				
				
				double time_towait = target / ckie_rate;
				total_time = (farm_price / ckie_rate) + (target / (inc_rate+ckie_rate)); 
				
				while(time_towait >= total_time){
					 
					ckie_rate = ckie_rate + inc_rate;
					time_towait = (target / ckie_rate) + ttime;
					ttime = ttime + (farm_price / ckie_rate);
					total_time = ttime + (target / (ckie_rate + inc_rate));
					
				}
				printOutput.println("Case #"+n+": "+new DecimalFormat("0.0000000").format(time_towait)+"");
			}
			
		}
	}	