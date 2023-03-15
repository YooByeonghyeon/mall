package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.CustomerCenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerCenterApplication.class })
public class CucumberSpingConfiguration {}
