package service;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import domain.Product;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

@Service
public class ProductService {

    //TODO load from mongodb
    private final String test_data = new File(getClass().getClassLoader()
                                                        .getResource("TestData.json")
                                                        .getFile()).getAbsolutePath();

    public List<Product> getAllProducts() {

        Type type = new TypeToken<Collection<Product>>() {}.getType();
        Gson gson = new Gson();
        List<Product> products;
        try {
            products = gson.fromJson(new JsonReader(new FileReader(test_data)), type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.format("Could not read file from %s", test_data));
        }

        return products;
    }

    public Product getProductById(String id) {
        //TODO if this service class is used then reduce the duplicate
        Type type = new TypeToken<Collection<Product>>() {}.getType();
        Gson gson = new Gson();
        List<Product> products;
        try {
            products = gson.fromJson(new JsonReader(new FileReader(test_data)), type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.format("Could not read file from %s", test_data));
        }
        return products.stream().filter(t -> t.getId().equals(id)).findAny().get();
    }

    public void addProduct(Product product) {
        //TODO if this service class is used then reduce the duplicate
        Type type = new TypeToken<Collection<Product>>() {}.getType();
        Gson gson = new Gson();
        List<Product> products;
        try {
            products = gson.fromJson(new JsonReader(new FileReader(test_data)), type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.format("Could not read file from %s", test_data));
        }
        products.add(product);
    }


}
