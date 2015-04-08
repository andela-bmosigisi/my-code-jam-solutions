
    import java.io.BufferedReader;  
    import java.io.FileReader;  
    import java.io.FileWriter;  
    import java.io.IOException;  
    import java.util.HashSet;  
      
    /** 
     * @author Zhenyi 2013 Dec 21, 2013 13:11:17 PM 
     */  
    public class FileFixIt {  
        public static void main(String[] args) throws IOException {  
            BufferedReader in = new BufferedReader(new FileReader(  
                    "A-small-practice.in"));  
            FileWriter out = new FileWriter(  
                    "A-small-practice.out");  
            // BufferedReader in = new BufferedReader(new  
            // FileReader("C:/Users/Zhenyi/Downloads/A-large-practice.in"));  
            // FileWriter out = new  
            // FileWriter("C:/Users/Zhenyi/Downloads/A-large-practice.out");  
      
            int T = new Integer(in.readLine());  
      
            for (int cases = 1; cases <= T; cases++) {  
                String[] st = new String(in.readLine()).split("\\s");  
                int N = new Integer(st[0]);  
                int M = new Integer(st[1]);  
      
                int result = 0;  
      
                HashSet<String> hs1 = new HashSet<String>();  
      
                for (int i = 0; i < N; i++) {  
                    String[] st1 = new String(in.readLine()).split("/");  
                    String stTmp = "";  
                    for (int j = 1; j < st1.length; j++) {  
                        stTmp = stTmp + "/" + st1[j];  
                        hs1.add(stTmp);  
                    }  
                }  
				
				System.out.println(hs1);
                for (int i = 0; i < M; i++) {  
                    String[] st2 = new String(in.readLine()).split("/");  
                    String stTmp = "";  
                    for (int j = 1; j < st2.length; j++) {  
                        stTmp = stTmp + "/" + st2[j];  
						
                        if (!hs1.contains(stTmp)) {  
                            result++;  
                            hs1.add(stTmp);  
                        }  
                    }  
                }  
      
                out.write("Case #" + cases + ": " + result + "\n");  
      
            }  
            in.close();  
            out.flush();  
            out.close();  
        }  
    }  