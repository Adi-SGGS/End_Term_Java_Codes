import java.net.*;
import java.io.*;

public class Server {
    // initialize
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started");
            System.out.println("Waiting For Client...");
            socket = server.accept();
            System.out.println("Client connected");

            // takes input from client socket
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";
            // reads massage from client until ("Over") is sent
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Closing Connnector");
            // close connnection
            socket.close();
            in.close();

        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        {
            Server server = new Server(5000);
        }
    }

}
