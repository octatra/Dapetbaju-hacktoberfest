package Program_bulan;
import java.util.Scanner;
public class Bulan {
  public static void main(String[] args){
      int kodeBulan;
      String namaBulan;
      Scanner scan = new Scanner(System.in);
      System.out.println("Kode Bulan (1....12) : " );
      kodeBulan = scan.nextInt();
      
         if (kodeBulan == 1) {
          namaBulan = "JANUARI";
       } else 
          if (kodeBulan == 2) {
             namaBulan = "FEBRUARI";
          } else 
              if (kodeBulan == 3) {
               namaBulan = "MARET";
            } else 
                if (kodeBulan == 4) {
                 namaBulan = "APRIL";
              } else 
                  if (kodeBulan == 5) {
                   namaBulan = "MEI";
              } else 
                    if (kodeBulan == 6) {
                    namaBulan = "JUNI";
                } else 
                     if (kodeBulan == 7) {
                      namaBulan = "JULI";
                  } else 
                       if (kodeBulan == 8) {
                        namaBulan = "AGUSTUS";
                   } else 
                        if (kodeBulan == 9) {
                         namaBulan = "SEPTEMBER";
                     } else 
                          if (kodeBulan == 10) {
                           namaBulan = "OKTOBER";
                      } else 
                            if (kodeBulan == 11) {
                            namaBulan = "NOVEMBER";
                      } else 
                             if (kodeBulan == 12) {
                              namaBulan = "DESEMBER";
                       } else 
                              namaBulan = "SALAH KODE BULAN";
         
          System.out.println(namaBulan);
          
                      
      }
      
      
  }

