package sayibulma;

public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        boolean varMi=false;
        int aranacak=5;
        
        for(int sayi:sayilar){
            if(sayi==aranacak){
             varMi=true;
             break;
            }
        }
        
        if(varMi) System.out.println("Sayı mevcuttur");
        else System.out.println("Sayı mevcut değildir");
    }
}