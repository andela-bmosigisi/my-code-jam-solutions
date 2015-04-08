/**code jam template */

	import java.util.Scanner;
	import java.util.ArrayList;
	import java.io.File;
	import java.io.*;
	
	
	public class FixItSmall{
	
		public static void main(String[] args) throws Exception{
			
			File file = new File("A-small-practice.in");
			FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
			PrintStream printOutput = new PrintStream(outputFile);
			Scanner input = new Scanner(file);
			
			int testcases = input.nextInt();
			for(int n = 1; n <= testcases; n++){
				int variable = 0;
				int exist_dirno = input.nextInt();
				int new_dirno = input.nextInt();
				input.nextLine();
				ArrayList<String> dirs = new ArrayList(); 	//existing directories
				for(int i = 0; i < exist_dirno; i++){
					dirs.add(input.nextLine());		
					//System.out.println(dirs.get(i));
				}
				
				for(int m = 0; m < new_dirno; m++){
				String new_dirs = input.nextLine();
				String[] new_dir = new_dirs.split("/");
				String temp = "";
				/*for(int t = 0; t < new_dir.length; t++){
					System.out.println(new_dir[t]);
				
				}*/
				for(int j = 1; j < new_dir.length; j++){
					String adir = new_dir[j];
					//System.out.println(adir);
					
					temp = temp + "/" + adir;
					
					if(!hasit(dirs, temp)){
						variable++;
						dirs.add(temp);	
					}
				}
				
				}
				printOutput.println("Case #"+n+": "+variable+"");
			}
			
		}
		public static boolean hasit(ArrayList a, String b){
			for(int i = 0; i < a.size(); i++){
				if((a.get(i)).equals(b))
					return true;
			}
			return false;
		}
	}	