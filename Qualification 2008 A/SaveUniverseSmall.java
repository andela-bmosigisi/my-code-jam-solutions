/**
 *
 * @author Brian
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class SaveUniverseSmall {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        File input = new File("A-small-practice.in");
		//File input = new File("testin.in");
		FileOutputStream outputFile = new FileOutputStream("outputFileSmall.out");
		PrintStream printOutput = new PrintStream(outputFile);
        Scanner inpt = new Scanner(input);
        int cases = inpt.nextInt();
		
        for(int n = 1; n <= cases;  n++){
            int no_eng = inpt.nextInt();
			inpt.nextLine();
            String[] engines = new String[no_eng];
            for(int i = 0; i < no_eng; i++){
                engines[i] = inpt.nextLine();
				
            }
            Arrays.sort(engines);
            int no_querries = inpt.nextInt();
			inpt.nextLine();
            String[] querries = new String[no_querries];
            for(int i = 0; i < no_querries; i++){
                querries[i] = inpt.nextLine();
			}
		
		boolean complete = false;
		int switches = 0;
		int position = 0;
		while(!complete){
			String[] querrs = createArray(position, querries);
			int flag = checkNt(engines, querrs);
			if(flag != -1){
				complete = true; 
			}
			else if(flag == -1){
				//all engines appear in the querry
				//String first_eng = querries[check(engines, querrs)]; 
				//printOutput.println(first_eng);
				//Engine appears last, first choice.
				position = check(engines, querrs) + position;
				switches++;
				}
			}
			 printOutput.println("Case #"+n+": "+switches+"");
		}
			
		}
    
      
	public static int checkNt(String[] eng, String[] quer){
	/*Method checks whether there's an engine which doesn't appear in the list
		Returns flag as -1 if all engines appear
		Returns flag as location of engine which doesn't appear*/
		
		boolean[] checker = new boolean[eng.length];
		int flag = -1;
		
		for(int i = 0; i < eng.length; i++){
			String temp = eng[i];
			for(int j = 0; j < quer.length; j++){
				if(temp.equals(quer[j])){
					checker[i] = true;
			
				}
			}
					
		}
		
		for(int n = 0; n < checker.length; n++){
			if(!checker[n]){
				flag = n;
				break;	
			}
		}
		return flag;
		
	}  
    public static int check(String[] eng, String[] quer){
	//Method checks which engine appears last and returns the index
          int no_eng = eng.length;
          int checkarr[] = new int[no_eng];
           for(int i=0; i < no_eng; i++){
             String temp = eng[i];
             int pos = 0;
             for(int j = 0; j < quer.length; j++){
                 if(temp.equals(quer[j])){
                     pos = j;
                     break;
                 }
             }
             checkarr[i] = pos;
            }
           int max = checkarr[0];
           
           for(int i = 1; i < checkarr.length; i++){
             if(checkarr[i] > max){
                 max = checkarr[i]; 
             }   
           }
          return max;
      } 
	  
	public static String[] createArray(int position, String[] querries){
		String[] temp = new String[(querries.length - position)];
		for(int i = position, j = 0; j < temp.length; i++, j++){
			temp[j] = querries[i];		
		}
		return temp;
	  
	}
    
	}
