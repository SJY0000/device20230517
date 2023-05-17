package device.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import device.config.kafka.KafkaProcessor;
import device.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MachineRepository machineRepository;

    @Autowired
    SizeRepository sizeRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MachineAdded'"
    )
    public void wheneverMachineAdded_SizeAdd(
        @Payload MachineAdded machineAdded
    ) {
        MachineAdded event = machineAdded;
        System.out.println(
            "\n\n##### listener SizeAdd : " + machineAdded + "\n\n"
        );

        // Sample Logic //
        Size.sizeAdd(event);
    }
}
