package exam;


import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMain {
    
    public static void main( String[] args ) throws IOException {

        System.out.println("connecting to localhost at port 80 ");
        Socket socket = new Socket("task02.chuklee.com", 80);
        System.out.println("connection accepted!");
        //duration here

        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);

        Console cons = System.console();

        ois.readUTF();
       
        String requestID = cons.readLine("> Type your request ID");
        String email = cons.readLine("> Type your email");
        String name = cons.readLine("> Type your name as per NRIC");

        while ((ois !=null)) {
            if ("exit".equals(ois)) {
                System.out.println("Goodbye.");
                break;
            }
            System.out.println(ois);


    
        oos.writeUTF(requestID);
        oos.writeUTF(email);
        oos.writeUTF(name);
        oos.flush();

        }

        boolean response = ois.readBoolean();
        while (response = true) {
            System.out.println("SUCCESS");
            socket.close();

        } if (response = false) {

            socket.close();
            System.err.println("FAILED");
        }
        

    
        System.out.printf(">> %s\n", response);

    
        is.close();
        os.close();


    

}
    
}


