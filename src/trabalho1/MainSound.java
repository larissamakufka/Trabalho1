package trabalho1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainSound {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Bruna Schroeder\\Desktop\\FURB\\Prog II\\yeha-noha-vibes-blumenau-sc.mp3");
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(file);
        String str = "";
        boolean vdd = true; 

        while (vdd == true) {
            int dado = fis.read();
            if (dado != -1) {
                System.out.println(dado);
            } else {
                vdd = false;
            }
        }
    }
}
