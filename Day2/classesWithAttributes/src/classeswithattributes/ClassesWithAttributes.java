package classeswithattributes;

public class ClassesWithAttributes {
    public static void main(String[] args) {
/*      Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Excalibur");
        product.setKod("123L");
        product.setPrice(5000);
        product.setStockAmount(5);
*/

        Product product = new Product(1, "Laptop", "Excalibur", 5000, 5, "123L");

        
        



        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        
        System.out.println(product.getKod());
        
        
    }
}
