package device.infra;

import device.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "machineViews",
    path = "machineViews"
)
public interface MachineViewRepository
    extends PagingAndSortingRepository<MachineView, Long> {}
