package switchdemo;

public class switchDemo {
    public static void main(String[] args) {
        char grade='A';
        
        switch(grade){
            case 'A': 
            case 'B': System.out.println("Mükemmel, geçtiniz");
            break;
            
            case 'C': System.out.println("İyi, geçtiniz");
            break;
            
            case 'D': System.out.println("Fena değil, geçtiniz");
            break;
            
            case 'F': System.out.println("Kaldınız");
            break;
            
            default: System.out.println("Geçersiz not");
            
        }
    }
}
