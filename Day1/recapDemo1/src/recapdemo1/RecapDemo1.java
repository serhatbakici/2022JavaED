package recapdemo1;

public class RecapDemo1 {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        int enBuyuk=sayi1;
        
        if(sayi2>enBuyuk){
            enBuyuk=sayi2;
        }
        if(sayi3>enBuyuk){
            enBuyuk=sayi2;
        }
        
        System.out.println("En büyük : "+enBuyuk);
        
    }
}
