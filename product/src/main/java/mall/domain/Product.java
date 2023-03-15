package mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mall.ProductApplication;

@Entity
@Table(name = "Product_table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(DeliveryCompleted deliveryCompleted) {
        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStock(DeliveryCancled deliveryCancled) {
        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancled.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
