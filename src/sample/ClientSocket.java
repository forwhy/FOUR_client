package sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class ClientSocket{
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;

    public ClientSocket()
    {
        try {
            connection = new Socket(InetAddress.getByName("127.0.0.1"), 5432);
            output = new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());
        }
        catch (IOException e) {}
    }

    public static void sendData(Object obj)
    {
        try {
            output.flush();
            output.writeObject(obj);
        }
        catch (IOException e) {}
    }
}