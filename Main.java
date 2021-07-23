import java.io.FileInputStream;
import java.io.InputStream

import com.musicg.fingerprint.FingerPrintSimilarity;
import com.musicg.wave.Wave;

public class Compare {
  float result;
  
  public void match() {
    
    String audio1 = "superiormusician.wav";
    String audio2 = "savedtone.wav";
   
   try {
     
     InputStream fis1 = null,fis2=null;
          fis1 = new FileInputStream(audio1);
          fis2 = new FileInputStream(audio2);
     Wave wave1 = new Wave(fis1), wave2 = new Wave(fis2);
     FingerprintSimilarity similarity;
     similarity = wave1.getFingerprintsimilarity(wave2)
     similarity1 = similarity.getSimilarity()*100;
     int baseline = 80;
     
     if similarity1 > baseline {
       System.out.println("Not similar")
      }
   }catch(Exception e){        }
   
   System.out.println(similarity1); }
  
public static void main(String... args) {
  new Compare().match();
}}
