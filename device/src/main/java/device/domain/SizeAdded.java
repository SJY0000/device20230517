package device.domain;

import device.domain.*;
import device.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SizeAdded extends AbstractEvent {

    private Long id;
    private String size;

    public SizeAdded(Size aggregate) {
        super(aggregate);
    }

    public SizeAdded() {
        super();
    }
}
