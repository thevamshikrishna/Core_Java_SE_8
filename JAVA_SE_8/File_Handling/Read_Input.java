import java.io.*;
public class Read_Input {
    public static void main(String args[]) throws IOException {
//        DataInputStream d=new DataInputStream(System.in);
//        System.out.println("Enter your Name: ");
//        String name=d.readLine();
//        System.out.println(name);

//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter your Name: ");
//        String name=br.readLine();
//        System.out.println(name);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Age: ");
        String s=br.readLine();
       // int age=Integer.parseInt(br.readLine());
        int age=Integer.parseInt(s);

        System.out.println("My age is: "+age);
    }
}
