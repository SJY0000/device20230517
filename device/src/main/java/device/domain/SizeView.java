package device.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SizeView_table")
@Data
public class SizeView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String size;
}
