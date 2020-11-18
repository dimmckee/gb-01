package com.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String message = in.readUTF();
                        System.out.println(message);

                    }
                    if(str.equalsIgnoreCase("/end"))
                    {
                        break;
                    }

                    if(str.startsWith("/w"))
                    {
                        String to = str.split(" ")[1];
                        String msg = str.split(" ")[2];
                        server.wisperMsg(this, to, msg);
                    } else {
                        server.broadcastMsg("[" + this.clientName + "] " + str);
                    }
                    out.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                in.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                out.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                socket.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            server.remove_client(this);

        }
                } catch (IOException e) {
                    throw new RuntimeException("SWW", e);
                }

            }).start();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("...");
                    out.writeUTF(scanner.nextLine());
                } catch (IOException e) {
                    throw new RuntimeException("SWW", e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
