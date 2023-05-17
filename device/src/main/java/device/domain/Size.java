package device.domain;

import device.DeviceApplication;
import device.domain.SizeAdded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Size_table")
@Data
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String size;

    @PostPersist
    public void onPostPersist() {
        SizeAdded sizeAdded = new SizeAdded(this);
        sizeAdded.publishAfterCommit();
    }

    public static SizeRepository repository() {
        SizeRepository sizeRepository = DeviceApplication.applicationContext.getBean(
            SizeRepository.class
        );
        return sizeRepository;
    }

    public static void sizeAdd(MachineAdded machineAdded) {
        /** Example 1:  new item 
        Size size = new Size();
        repository().save(size);

        SizeAdded sizeAdded = new SizeAdded(size);
        sizeAdded.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(machineAdded.get???()).ifPresent(size->{
            
            size // do something
            repository().save(size);

            SizeAdded sizeAdded = new SizeAdded(size);
            sizeAdded.publishAfterCommit();

         });
        */

    }
}
