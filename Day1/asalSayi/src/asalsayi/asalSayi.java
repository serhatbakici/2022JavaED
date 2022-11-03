package asalsayi;

public class asalSayi {

    public static void main(String[] args) {
        int sayi=3;
        boolean check=false;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0) check=true;
        }
        
        if(!check) System.out.println("Sayı asal");
        else    System.out.println("Sayı asal değil");
    }
}
