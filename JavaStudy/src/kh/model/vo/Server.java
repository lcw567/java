package kh.model.vo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void server() {
        int port = 3000;
        ServerSocket server = null;

        try {
            server = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            while (true) {
                Socket client = server.accept();
                System.out.println("Client connected: " + client.getInetAddress().getHostAddress());
                
                // 이후 코드는 통신 관련 코드...
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null && !server.isClosed()) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.server();
    }
}
