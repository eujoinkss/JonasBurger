
package dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Criptografia {
    
        public static String criptografar(String txt){
        try{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] messageDigest = md.digest(txt.getBytes());
        
        BigInteger n = new BigInteger(1, messageDigest);
        
        String hashtext = n.toString(16);
        
        while(hashtext.length() < 32){
            hashtext = "0" + hashtext;
        }
        
        return hashtext;
      }catch(NoSuchAlgorithmException e){
          throw new RuntimeException(e);
    }
    }
    
}
