package CryptoGraphy;

import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        System.out.println("Please write the MSG for Encryption!");
        Scanner scan = new Scanner(System.in);
        String outPut = scan.nextLine();
        scan.close();
        System.out.println(encryption(outPut));
    }


    public static String encryption(String text){
        text = text.toUpperCase();
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int asciNum = text.charAt(i);
            if(asciNum >= 65 && asciNum <= 77){
                asciNum += 13;
                result += Character.toString(asciNum);
            }
            else if (asciNum >= 78 && asciNum <= 90) {
                asciNum -= 13;
                result += Character.toString(asciNum);
            }
            else {
                result += Character.toString(asciNum);
            }
        }
        return result;
    }
}
