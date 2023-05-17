package device.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MachineView_table")
@Data
public class MachineView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
