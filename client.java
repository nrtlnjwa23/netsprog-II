import java.util.Scanner;
import java.net.*;
import java.io.*;

public class client
{
  public static void main(String[]args) throws 
UnknownHostException,IOException
  {
    String message, temp;
    Scanner sc = new Scanner(System.in);
    Socket s  = new Socket("192.168.74.130", 52051);
    Scanner s1 = new Scanner(s.getInputStream());
    System.out.println("Enter your message:");
    message = sc.next();
    PrintStream p = new PrintStream(s.getOutputStream());
    p.println(message);
    temp = s1.nextLine();
    System.out.println(temp);
  }
}
# netsprog-II
