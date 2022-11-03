package loopdemo;

public class loopDemo {
    public static void main(String[] args) {
        
        //for
        for(byte i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");
        
        //while
        byte i=0;   
        while(i<=10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");
        
        //do-while
        byte j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<10);
        System.out.println("Do-While döngüsü bitti");
        
    }
}
