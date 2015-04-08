import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class RCommentLarge {
    
   
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        File file = new File("E-large-practice.in");
        FileOutputStream outputFile = new FileOutputStream("outputFileLarge.out");
		PrintStream printOutput = new PrintStream(outputFile);
		Scanner input = new Scanner(file);
	
       StringBuilder sb = new StringBuilder();
        while(input.hasNext()){
            sb.append(input.nextLine()); 
			sb.append("\n");
        }
        
        int first_cm = sb.indexOf("/*");
        ArrayList ot = new ArrayList();
		ot.add(first_cm);
        
        for(int i=first_cm;i<sb.length();i++){
			if(i != sb.length() - 1){
            if((sb.charAt(i)=='/')&&(sb.charAt(i+1)=='*') && (i != first_cm)){
                Integer num = new Integer(i);
                ot.add(num);
            }
            else if((sb.charAt(i)=='*')&&(sb.charAt(i+1)=='/')){
				if(ot.size() != 0){
                Integer num = (Integer)ot.get(ot.size() - 1);
                sb.delete(num.intValue(), i+2);
                i = num.intValue();
                ot.remove(ot.size() - 1);
                
            }
			}
			}
        }
        printOutput.println("Case #1:\n"+sb.toString());
        
    }
}
