package ru.live.toofast;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class NetworkTest {

    @Test
    public void test() throws IOException, InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Server initialized");
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(9999);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Socket accept = null;
            try {
                accept = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try(BufferedReader is = new BufferedReader(new InputStreamReader(accept.getInputStream()))){
                while (true){
                    String read = is.readLine();
                    if (Objects.isNull(read)) break;
                    System.out.println(read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        Thread.sleep(1000);

        Socket socket = new Socket("localhost", 9999);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("Hello Server");
        dataOutputStream.close();
        outputStream.close();
        socket.close();
    }
}
