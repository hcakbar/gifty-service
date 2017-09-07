package domain;
import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private String description;
    private String price;
    private String url;

    public Product() {

    }

    public Product(String name, String description, String price, String url) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    @Override
    public String toString() {

        return "Product{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", price='" + price + '\'' +
            ", url='" + url + '\'' +
            '}';
    }
}
