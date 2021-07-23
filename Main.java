import java.io.FileInputStream;
import java.io.InputStream
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.musicg.fingerprint.FingerPrintSimilarity;
import com.musicg.wave.Wave;

public class Compare {
  float result;
  
  public void match() {
    
    String audio1 = "superiormusician.wav";
    String audio2 = "savedtone.wav";
   
   try {
     while (similarity <= finishline) {
       InputStream fis1 = null,fis2=null;
            fis1 = new FileInputStream(audio1);
            fis2 = new FileInputStream(audio2);
       Wave wave1 = new Wave(fis1), wave2 = new Wave(fis2);
       FingerprintSimilarity similarity;
       similarity = wave1.getFingerprintsimilarity(wave2)
       similarity1 = similarity.getSimilarity()*100;
       int baseline = 50;

       int finishline = 90;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // Add some stuff here, I really don't know what we could do for tone improvement.
       String s = br.readLine();

       if (similarity1 < baseline) {
         System.out.println("Similar")
        }
       else if (similarity1 > baseline) {
         Systemout.println("Not similar")
        }
       else if (similarity >= baseline) {
         System.out.println("You've got it!")
        }
     }catch(Exception e){        }

     System.out.println(similarity1); }
  }
public static void main(String... args) {
  new Compare().match();
}}
