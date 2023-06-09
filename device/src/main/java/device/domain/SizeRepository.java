package device.domain;

import device.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sizes", path = "sizes")
public interface SizeRepository
    extends PagingAndSortingRepository<Size, Long> {}
