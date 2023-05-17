package device.domain;

import device.DeviceApplication;
import device.domain.MachineAdded;
import device.domain.MachineDelete;
import device.domain.MachineUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Machine_table")
@Data
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String name;

    @ElementCollection
    private List<SizeId> sizeId;

    @Embedded
    private MachineSize machineSize;

    @PostPersist
    public void onPostPersist() {
        MachineAdded machineAdded = new MachineAdded(this);
        machineAdded.publishAfterCommit();

        MachineUpdated machineUpdated = new MachineUpdated(this);
        machineUpdated.publishAfterCommit();

        MachineDelete machineDelete = new MachineDelete(this);
        machineDelete.publishAfterCommit();
    }

    public static MachineRepository repository() {
        MachineRepository machineRepository = DeviceApplication.applicationContext.getBean(
            MachineRepository.class
        );
        return machineRepository;
    }
}
