
import java.util.*;

class Bilgisayar extends Oyuncu {

    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();

    public Bilgisayar() {
    }

    public Bilgisayar(String oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int a) {
       skor++;
    }

    public Nesne[] getNesneListesi() {
        return nesneListesi;
    }

    public void setNesneListesi(Nesne[] nesneListesi) {
        this.nesneListesi = nesneListesi;
    }

    public int[] getNesnelistesi() {
        return nesnelistesi;
    }

    public void setNesnelistesi(int[] nesnelistesi) {
        this.nesnelistesi = nesnelistesi;
    }
    public void SkorGoster(Bilgisayar bilgisayar){
        System.out.print(bilgisayar.getOyuncuAdi()+"  :   "+bilgisayar.getSkor());
    };
  

    @Override
    
   public int nesneSec(){
        int secim,i;
        System.out.print("Nesneler : ");
         for(i=0;i<5;i++)
         {
             System.out.print("  "+nesnelistesi[i]);
         }
         System.out.println();
         System.out.print("Nesne Seciniz:  ");
          secim=random.nextInt(1, 6);
                 System.out.println(" random:  "+secim);
         return secim;
     
    }     

   
}