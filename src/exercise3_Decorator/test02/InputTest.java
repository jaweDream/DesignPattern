package exercise3_Decorator.test02;

import java.io.*;

public class InputTest {



    public static void main(String[] args) {

        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Jawe\\Desktop\\test.txt")));
            while((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int n = 5;
        System.out.println((int) (Math.sqrt(2*(double)n + 0.25) - 0.5));
    }
}
