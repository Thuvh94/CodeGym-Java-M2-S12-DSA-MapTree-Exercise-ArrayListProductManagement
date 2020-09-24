package Management;

import Model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductManager implements IManager<Product> {
    static List<Product> productList = new ArrayList<Product>();
    static {
        productList.add(new Product(1,"Toshiba",20000000));
        productList.add(new Product(2,"LG",60000000));
        productList.add(new Product(3,"Sony",50000000));
        productList.add(new Product(4,"Dell",90000000));
        productList.add(new Product(5,"Toshiba",24000000));
    }
    @Override
    //Add: Before adding, check if ID is existed or not.
    public void add(Product newObject) {
        if(isExisted(newObject.getId()))
            productList.add(newObject);
    }

    @Override
    public void update(int id, Product newObject) {
        if(isExisted(id))
            productList.set((int) (id-1), newObject);
    }

    @Override
    public void delete(int id) {
        if(isExisted(id))
            productList.remove(id);
    }

//    @Override
//    public  void display() {
//
//    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> outputProducts = new ArrayList<>();
        for(Product product: productList){
            if(product.getName().equals(name)){
                outputProducts.add(product);
            }
        }
        return outputProducts;
    }

    @Override
    public List<Product> findAll() {
        List<Product> outputList = new ArrayList<>();
        for (Product product:productList) {
            outputList.add(product);
        }
        return outputList;
    }

    public boolean isExisted(int id){
        for (Product product: productList) {
            if(id == product.getId())
                return true;
        }
        return false;
    }
}
