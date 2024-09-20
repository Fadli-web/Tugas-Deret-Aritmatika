
/**
 * tugasDeretArit
 */
import java.util.Scanner;

public class tugasDeretArit {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int nilaiatas,nilaibawah,beda = 0,pilihan;

        System.out.println("masukkan nilai atas ;");
        nilaiatas = n.nextInt();
        System.out.println("masukkan nilai bawah : ");
        nilaibawah = n.nextInt();
        System.out.println("masukkan operasi loop(1)\n while(2)");
        pilihan= n.nextInt();
        System.out.println("masukkan berapa beda nya");
        beda = n.nextInt();
      
      int k = 0;
      if(pilihan == 1)
      {
        for(int i = nilaiatas; i <=nilaibawah; i+=beda)
        System.out.println(i + "");
    
      }
else if(pilihan == 2){
     int i = nilaiatas;
while (i <= nilaibawah) {
    System.out.println(i +"");
    i += beda;
}
}else{
    System.out.println("Data tidak valid");
}
        
        }
}
