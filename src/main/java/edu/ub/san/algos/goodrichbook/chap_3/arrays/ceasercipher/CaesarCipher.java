package edu.ub.san.algos.goodrichbook.chap_3.arrays.ceasercipher;

import java.util.Arrays;

/**
 * Created by san on 3/2/16 for algos.
 */
public class CaesarCipher {
    private char[] encoder = new char[26];
    private char[] decoder = new char[26];

    public CaesarCipher(int rotation) {
        for (int k = 0; k < 26; k++){
            encoder[k] = (char) ('A' + ((k + rotation) % 26));
            decoder[k] = (char) ('A' + ((k - rotation + 26) % 26));
        }
    }

    public String encode(String msg) {
        return transform(msg, encoder);
    }

    public String decode(String msg) {
        return transform(msg, decoder);
    }

    private String transform(String msg, char[] code) {
        char [] temp = msg.toCharArray();
        for(int k = 0; k < temp.length; k++) {
            if(Character.isUpperCase(temp[k])) {
                int j = temp[k] - 'A';
                temp [k] = code[j];
            }
        }
        return new String(temp);
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher(3);
        System.out.println("Encryption Code :\n" + Arrays.toString(cc.encoder));
        System.out.println("Decryption Code :\n" + Arrays.toString(cc.decoder));
        String msg = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
        System.out.println("Msg : " + msg);
        String encoded = cc.encode(msg);
        System.out.println("Encoded : " + encoded);
        String decoded = cc.decode(encoded);
        System.out.println("Decoded : " + decoded);

        System.out.println('X' - 'A');
    }
}
