package device.common;

import device.DeviceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeviceApplication.class })
public class CucumberSpingConfiguration {}
