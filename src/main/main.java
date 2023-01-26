package main;

/**
 *
 * @author davinky
 */
import encrypt.encrypt;
import decrypt.decrypt;
import java.io.File;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int cmode; //choose mode
        String finp; //user file input
        
        encrypt enc = new encrypt();
        decrypt dec = new decrypt();
        
        try {            
            System.out.println("1. Encryption\n2. Decryption\n");
            System.out.print("Choose: ");
            cmode = keyb.nextInt();            
            switch (cmode) {
                case 1:
                    keyb.nextLine(); //refresh                    
                    System.out.println("[+] Enter your [txt] file to encrypt: ");
                    System.out.print("File name: ");
                    finp = keyb.nextLine();
                    File fileEn = new File(finp);
                    if (fileEn.exists() && finp.contains(".txt")){
                        enc.enc(fileEn);
                    } else {
                        System.err.println("Error: File '" + finp + "'not found");
                    }
                    break;
                case 2:
                    keyb.nextLine(); //refresh
                    System.out.println("[+] Enter your [txt] file to decrypt: ");
                    System.out.print("File name: ");
                    finp = keyb.nextLine();
                    File fileDe = new File(finp);
                    if (fileDe.exists() && finp.contains(".txt")){
                        dec.dec(fileDe);
                    } else {
                        System.err.println("Error: File '" + finp + "' not found");
                    }                    
                    break;
                default:
                    System.err.println("Invalid input");                    
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
