package mall.domain;

import java.util.*;
import lombok.Data;
import mall.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private String address;
    private String status;
    private Long customerId;
}
