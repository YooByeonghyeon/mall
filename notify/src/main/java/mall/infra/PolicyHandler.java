package mall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import mall.config.kafka.KafkaProcessor;
import mall.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCancled'"
    )
    public void wheneverDeliveryCancled_Notify(
        @Payload DeliveryCancled deliveryCancled
    ) {
        DeliveryCancled event = deliveryCancled;
        System.out.println(
            "\n\n##### listener Notify : " + deliveryCancled + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCancled'"
    )
    public void wheneverOrderCancled_Notify(
        @Payload OrderCancled orderCancled
    ) {
        OrderCancled event = orderCancled;
        System.out.println(
            "\n\n##### listener Notify : " + orderCancled + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCompleted'"
    )
    public void wheneverDeliveryCompleted_Notify(
        @Payload DeliveryCompleted deliveryCompleted
    ) {
        DeliveryCompleted event = deliveryCompleted;
        System.out.println(
            "\n\n##### listener Notify : " + deliveryCompleted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_Notify(@Payload OrderPlaced orderPlaced) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener Notify : " + orderPlaced + "\n\n"
        );
        // Sample Logic //

    }
}
