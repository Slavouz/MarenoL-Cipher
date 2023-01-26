package encrypt;

/**
 *
 * @author davinky
 */
import java.io.*;
import java.util.Scanner;
import code.codeChr;

public class encrypt {
    public void enc(File nameFile) {
        codeChr cr = new codeChr();
        try {
            File file = new File(nameFile.getAbsolutePath());            
            String nameOutputFile = nameFile.getName().replace(".txt", "");
            File fOut = new File(nameOutputFile + "-encrypt.txt");
            fOut.createNewFile();            
            Scanner scanr = new Scanner(file);
            String asd, out = "";
            while(scanr.hasNextLine()) {                
                try (FileWriter fw = new FileWriter(fOut.getName(), true)) {
                    asd = scanr.nextLine();
                    for (int i = 0; i < asd.length(); i++) {
                        out += cr.encChr(asd.charAt(i));
                    }
                    fw.append(out + "\n");
                    fw.flush();
                }
//                System.out.println(out);
                out = "";                
            }
            System.out.println("[+] Encrypt Success");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
