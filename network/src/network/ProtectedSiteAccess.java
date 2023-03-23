package network;

import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ProtectedSiteAccess {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel pane = new JPanel(new GridLayout(2,2));
        
        JLabel lbl_username = new JLabel("Username");
        JTextField username = new JTextField();
        JLabel lbl_password = new JLabel("Password");
        JPasswordField password = new JPasswordField();
        
        pane.add(lbl_username);
        pane.add(username);
        pane.add(lbl_password);
        pane.add(password);
        
        
        int res =JOptionPane.showConfirmDialog(frame,pane,"Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
       if (res==JOptionPane.OK_OPTION){
           String u = username.getText();
           char[] p =password.getPassword();
           Authenticator.setDefault(new CustomeAuthenticator(u,p));
           try {
               URL url = new URL("https://www.asm.edu.np/dashboard.html");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                
                InputStream stream = conn.getInputStream();
                InputStreamReader r = new InputStreamReader(stream);
                
                int c;
                while((c = r.read())!= -1){
                    System.out.println((char)c);
                }
                
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("you cancel the login");
        }

    }

    private static class CustomeAuthenticator extends Authenticator {

        private String uname;
        private char[] pwd;

        public CustomeAuthenticator(String u, char[] p) {
            
            this.uname = u;
            this.pwd = p;
        }
        
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(uname, pwd);
        }
        }
    }
