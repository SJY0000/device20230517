package device.infra;

import device.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SizeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Size>> {

    @Override
    public EntityModel<Size> process(EntityModel<Size> model) {
        return model;
    }
}
