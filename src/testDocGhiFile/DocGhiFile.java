package testDocGhiFile;

import com.sun.glass.ui.ClipboardAssistance;

import java.io.*;

public class DocGhiFile {
    public static void main(String[] args) {
        doc();

    }
//    public static   void  ghi(){
//        File nguoi = new File("nguoi.txt");
//        FileWriter fileWriter = null;
//        try {
//            nguoi.createNewFile();
//            FileWriter fileWriter = new FileWriter(nguoi);
//            fileWriter.write("Hai VT ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    public static  void doc(){
        File nguoi = new File("nguoi.txt");
        try {
            FileReader fileReader = new FileReader(nguoi);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            fileReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
