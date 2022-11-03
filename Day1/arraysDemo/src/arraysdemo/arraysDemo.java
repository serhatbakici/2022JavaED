package arraysdemo;

public class arraysDemo {
    public static void main(String[] args) {
        
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Serhat";
        ogrenciler[1]="Ahmet";
        ogrenciler[2]="Emin";
        ogrenciler[3]="Seyda";
        
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------");
        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
