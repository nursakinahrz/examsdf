package exam;


//import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMain {
    
    public static void main(String[] args) throws IOException {

        System.out.println("connecting to host at port 80 ");
        Socket socket = new Socket("task02.chuklee.com", 80);
        System.out.println("connection accepted!");
        //duration here

        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);

        //2. read initial request
        ois.readUTF();

        //3. average
        int num [] = {97, 35, 82, 2, 45};
        float sum = 0;

        int i =0;
        while (i < num.length) {
            sum =+ num[i];
            i++;
        }

        float average = (sum/ num.length); 
        System.out.println("Average is: " + average);

        //4. 
       // Console cons = System.console();

        oos.writeUTF("type request id here");
        oos.writeUTF("Nursakinah Binte Abdul Razak");
        oos.writeUTF("nursakinah.arz@gmail.com");
        oos.writeFloat(average);

        //5. readboolean
    
        while (ois.readBoolean()) {
            


            
        }



        socket.close();

       
        
        //String input = cons.readLine(">");
        //String requestID = cons.readLine("> Type your request ID");
        //String email = cons.readLine("> Type your email");
        //String name = cons.readLine("> Type your name as per NRIC");

        /*while ((input !=null)) {
            if ("exit".equals(input)) {
                System.out.println("Goodbye.");
                break;
            }
            System.out.println(ois);*/


    
        //oos.writeUTF(requestID);
        //oos.writeUTF(email);
        //oos.writeUTF(name);
        //oos.flush();

        }

        //boolean response = ois.readBoolean();
        /*while (response = true) {
            System.out.println("SUCCESS");
            socket.close();

        } if (response = false) {

            socket.close();
            System.err.println("FAILED");
        }
        

    
        System.out.printf(">> %s\t %d", response, Integer);

    
        is.close();
        os.close();*/


    

}


