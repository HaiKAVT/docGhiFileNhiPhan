import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<SanPham> list = new ArrayList<>();

        list.add(new  SanPham(1, "oto", "huyndai", 244));

        writeToFile("sanpham.txt", list);



        List<SanPham> sanPhamsDataFromFile = readDataFromFile("sanpham.txt");
        for (SanPham sp: list) {
            System.out.println(sp);
        }
    }
    public  static void writeToFile(String path, List<SanPham> sanPhams) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sanPhams);
        oos.close();
    }




    public static List<SanPham> readDataFromFile(String path){
            List<SanPham> sanPhams = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                 sanPhams = (List<SanPham>) ois.readObject();
                 fis.close();
                 ois.close();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }


        return sanPhams;
    }

}
