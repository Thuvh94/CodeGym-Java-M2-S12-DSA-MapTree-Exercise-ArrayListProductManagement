import Management.PriceComparator;
import Management.ProductManager;
import Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void display(List list){
        Iterator<Product> products = list.iterator();
        while (products.hasNext())
            System.out.println(products.next());
    }
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Test display all
        System.out.println("===Test findAll===");
        productManager.display();

        // Test add
        System.out.println("=== Test add ===");
        productManager.add(new Product(6,"Honda",45000000));
        productManager.display();

        // Test update
        System.out.println("=== Test update===");
        productManager.update(1,new Product(1,"Nokia",18500000));
        productManager.display();

        // Test findById
        System.out.println("=== Test find by id ===");
        System.out.println(productManager.findById(5));
        System.out.println(productManager.findById(10));

        // Test findByName
        System.out.println("=== Test find by name ===");
        System.out.println(productManager.findByName("LG"));

        // Test delete
        System.out.println("=== Test delete===");
        productManager.delete(3);
        productManager.display();

        // Test find by price
        System.out.println("=== test find by price===");
        System.out.println(productManager.findByPrice(24000000));

        // Test sort ascending order by comparator
        System.out.println("===Test sort ascending order===");
        PriceComparator priceComparator = new PriceComparator();
        List<Product> products = productManager.findAll();
        Collections.sort(products, priceComparator);
        display(products);

        // Test sort descending order by comparator
        System.out.println("===Test sort decscending order===");
        Collections.sort(products,Collections.reverseOrder(priceComparator));
        display(products);
    }
}
