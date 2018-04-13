package tallybook.bim.co.nz.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "tallybook.bim.co.nz")
public class FeignConfiguration {

}
