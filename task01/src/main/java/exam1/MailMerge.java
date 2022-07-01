package exam1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MailMerge {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/nursakinah/Downloads/thankyou.csv");
        FileReader fr2 = new FileReader ("/Users/nursakinah/Downloads/tour_packages.csv");
        
       
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader(fr2);

        String line = "";
        line = line.replaceAll("[^a-zA-Z0-9]", " ");
        
        try {

            while ((line=br.readLine()) != null) {
                System.out.println(line);
                
            }
            
        } catch (IOException e) {

            e.printStackTrace();
        }

        try {

            while ((line=br2.readLine()) != null) {
                System.out.println(line);
                
            }
            
        } catch (IOException e) {

            e.printStackTrace();
        }


        fr.close();
    }
}
           

