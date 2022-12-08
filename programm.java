import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class programm {

        /**
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception {

                FileReader fr = new FileReader("input.txt");
                Scanner scan = new Scanner(fr);
                scan.hasNextLine();
                String s1 = scan.nextLine();
                String[] s2_array = s1.split("[^\\d-]");
                Integer numbers = Integer.parseInt(String.join("", s2_array));
                
                scan.hasNextLine();
                String s2 = scan.nextLine();
                String[] s3_array = s2.split("[^\\d-]");
                Integer numbers2 = Integer.parseInt(String.join("", s3_array));
                
                double result = Math.pow(numbers, numbers2);
                String result2 = " не определено";
               
                File file = new File("output.txt");
                try {
                        PrintWriter printWriter = new PrintWriter(file);
                        if (numbers == 0 && numbers2 == 0) {
                                printWriter.println(result2);
                                printWriter.close();
                        } else {
                                printWriter.println(result);
                                printWriter.close();
                        }
                } catch (FileNotFoundException ex) {

                }
        }
}
