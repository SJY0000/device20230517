package device.infra;

import device.config.kafka.KafkaProcessor;
import device.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class SizeViewViewHandler {

    @Autowired
    private SizeViewRepository sizeViewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenSizeAdded_then_CREATE_1(@Payload SizeAdded sizeAdded) {
        try {
            if (!sizeAdded.validate()) return;

            // view 객체 생성
            SizeView sizeView = new SizeView();
            // view 객체에 이벤트의 Value 를 set 함
            sizeView.setId(sizeAdded.getId());
            // view 레파지 토리에 save
            sizeViewRepository.save(sizeView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
