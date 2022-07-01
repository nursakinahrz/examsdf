package exam1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/nursakinah/Downloads/thankyou.csv");
       
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        line = line.replaceAll("[^a-zA-Z0-9]", " ");
        
        try {

            while ((line=br.readLine()) != null) {
                System.out.println(line);
                
            }
            
        } catch (IOException e) {

            e.printStackTrace();
        }

        fr.close();
    }
}
           

