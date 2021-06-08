package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
try {
    Socket socket=new Socket("ptt.cc",23);

    InputStream is =socket.getInputStream();
    for (int i=0;i<500;i++){
int data= is.read();
System.out.print((char) data);
    }
}catch (IOException e){
    e.printStackTrace();
}
    }
}
