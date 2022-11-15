package staticDemo;

public class ProductValidator {

    static
    {
        System.out.println("Static");
    }
    static
    {
        System.out.println("Static");
    }
    public ProductValidator()
    {
        System.out.println("Yapıcı block çalıştı");
    }

    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public void bisey(){

    }
}
