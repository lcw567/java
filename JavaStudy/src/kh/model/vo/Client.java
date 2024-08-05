package kh.model.vo;

import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public void client() {
        int port = 3000;
        String serverIP = "192.168.20.34"; // 서버의 IP 주소를 명시적으로 지정

        try {
            // 서버 IP 주소를 명시적으로 사용
            Socket socket = new Socket(serverIP, port);
            System.out.println("Connected to server at " + serverIP + ":" + port);
            
            // 이후 코드는 통신 관련 코드...
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.client();
    }
}
