package decrypt;

/**
 *
 * @author davinky
 */
import java.io.*;
import java.util.Scanner;
import code.codeChr;

public class decrypt {
    public void dec(File nameFile) {
        codeChr cr = new codeChr();
        try {
            File file = new File(nameFile.getAbsolutePath());
            String nOF = file.getName().replace(".txt", "");
            File fOut = new File(nOF + "-decrypt.txt");
            fOut.createNewFile();
            Scanner scanr = new Scanner(file);
            String asd, res;
            while(scanr.hasNextLine()) {
                FileWriter fw = new FileWriter(fOut.getName(), true);
                asd = scanr.nextLine();
                for (int i = 0; i < asd.length(); i++) {
                    int j = i + 1;
                    if(j>=asd.length()) break;                    
                    char outL = asd.charAt(i);
                    char outR = asd.charAt(j);
                    res = cr.decChr(outL + "" + outR);
//                    System.out.print(res);
                    fw.append(res);
                    fw.flush();
                    i++;
                }
                fw.append("\n");
                fw.flush();
//                System.out.println("");                
            }
            System.out.println("[+] Decrypt success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
