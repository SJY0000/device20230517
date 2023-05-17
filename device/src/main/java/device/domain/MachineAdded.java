package device.domain;

import device.domain.*;
import device.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private Long id;
    private String code;
    private String name;
    private List<SizeId> sizeId;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
