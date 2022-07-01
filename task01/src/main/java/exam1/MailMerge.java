package exam1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MailMerge {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/nursakinah/Downloads/thankyou.csv");
        FileReader fr2 = new FileReader ("/Users/nursakinah/Downloads/tour_packages.csv");
        FileReader fr3 = new FileReader ("/Users/nursakinah/Downloads/thankyou.txt");
        FileReader fr4 = new FileReader ("/Users/nursakinah/Downloads/tour_packages.txt");
        
       
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader(fr2);
        BufferedReader br3 = new BufferedReader(fr3);
        BufferedReader br4 = new BufferedReader(fr4);

        // array of the names. 
        //String thankyou = "first_name, last_name, address, years\n" + "Harry, Potter, 4 Privet Drive\n, Little Whinging, 2";
        //String tourpackage = "salutations, last_name, package_name, price" + "Mr\t Flinstone, Jurassic Park, 300";

    

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

        try {

            while ((line=br3.readLine()) != null) {
                System.out.println(line);
                
            }
            
        } catch (IOException e) {

            e.printStackTrace();
        }

        try {

            while ((line=br4.readLine()) != null) {
                System.out.println(line);
                
            }
            
        } catch (IOException e) {

            e.printStackTrace();
        }


        fr.close();
        br.close();
    }
}
