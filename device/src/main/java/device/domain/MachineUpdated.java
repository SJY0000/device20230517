package device.domain;

import device.domain.*;
import device.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MachineUpdated extends AbstractEvent {

    private Long id;
    private String code;
    private String name;
    private List<SizeId> sizeId;

    public MachineUpdated(Machine aggregate) {
        super(aggregate);
    }

    public MachineUpdated() {
        super();
    }
}
