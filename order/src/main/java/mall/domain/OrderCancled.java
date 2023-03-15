package mall.domain;

import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String productName;
    private Long customerId;
    private Long productId;
    private Integer qty;

    public OrderCancled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancled() {
        super();
    }
}
