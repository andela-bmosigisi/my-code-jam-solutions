	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.io.File;
	import java.io.*;
	
	
	public class Dl{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("D-large.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileLarge.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				int blcks = input.nextInt();
				
				ArrayList<Double> naomi = new ArrayList(blcks);
				for(int i = 0; i < blcks; i++){
					naomi.add(input.nextDouble());
				}					
				ArrayList<Double> ken = new ArrayList(blcks);
				for(int j = 0; j < blcks; j++){
					ken.add(input.nextDouble());
				}
				Collections.sort(naomi);
				Collections.reverse(naomi);
				Collections.sort(ken);
				Collections.reverse(ken);
				
				ArrayList<Double> naomi1 = cloneList(naomi);
				ArrayList<Double> ken1 = cloneList(ken);
				
				int score1 = cheating(naomi, ken);
				int score2 = war(naomi1, ken1);
				printOutput.println("Case #"+n+": "+score1+" "+score2+"");
			}
			
		}
		public static int cheating(ArrayList naomi, ArrayList ken){
			int ans = naomi.size();
			while(!check(naomi, ken)){
				naomi.remove((naomi.size() - 1));			
				ken.remove(0);
				ans--;
			}
			return ans;
		}
		public static boolean check(ArrayList a, ArrayList b){
			//return true if doesn't have to cheat, false if he has to cheat
			if((a.size() != 0)&&(b.size() != 0)){
			double lst = (double) b.get(b.size() - 1);
			boolean[] flag = new boolean[b.size()];
			for(int i = (a.size() - 1); i >= 0; i--){
				if((double)a.get(i) > (double)b.get(i)){
					flag[i] = true;
				}			
			}
			for(int j = 0; j < flag.length; j++){
				if(!flag[j]){
					return false;
				}
			}
			}
			return true;
		}
		public static int war(ArrayList a, ArrayList b){
			int ans = a.size();
			for(int i = (a.size() - 1); i >= 0; i--){	
				double naom = (double)a.get(i);
				for(int j = (b.size() - 1); j >= 0; j--){
					if((double)b.get(j) > naom){
						b.remove(j);
						a.remove(i);
						ans--;
						break;
					}
				}
			}
			return ans;
		}
		public static ArrayList cloneList(ArrayList orig){
			ArrayList<Double> ans = new ArrayList();
			for(int i = 0; i < orig.size(); i++){
				ans.add((double)orig.get(i));
			}
			return ans;
		}
	}	