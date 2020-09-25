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


        // Test sort ascending order by comparator
        System.out.println("===Test sort ascending order===");
        PriceComparator priceComparator = new PriceComparator();
        List<Product> products = new ArrayList<>();
        products = productManager.findAll();
        Collections.sort(products, priceComparator);
        display(products);

        // Test sort descending order by comparator
        System.out.println("===Test sort decscending order===");
        Collections.sort(products,Collections.reverseOrder(priceComparator));
        display(products);
    }
}
