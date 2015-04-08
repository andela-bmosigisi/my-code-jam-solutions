	import java.util.Scanner;
	import java.util.Arrays;
	import java.io.File;
	import java.io.*;
	
	
	public class NumbersSmall{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("C-small-practice.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				double numb = 0;
				double answ = 0;
				int power = input.nextInt();
				
				numb = (Math.sqrt(5.0)) + 3;
				answ = Math.pow(numb, power);
				
				String ans = answ + "";
				int point_pos = 0;
				for(int i = 0; i < ans.length(); i++){
					if(ans.charAt(i) == '.'){	
						point_pos = i;
						break;
					}
				}
				String answer;
				if(point_pos == 1){
					answer = "00" + ans.charAt(point_pos - 1);
				}
				else if(point_pos == 2){
					answer = "0" + ans.charAt(point_pos - 2) +""+ans.charAt(point_pos - 1);
				}
				else{
					answer = ans.charAt(point_pos - 3) + ""+ ans.charAt(point_pos - 2) +""+ans.charAt(point_pos - 1);
				}
				
				printOutput.println("Case #"+n+": "+answer+"");
			}
			
		}
	}	