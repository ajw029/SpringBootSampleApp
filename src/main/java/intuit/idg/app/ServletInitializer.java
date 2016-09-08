package intuit.idg.app;
/**
 * Project: IDG 
 * Class: ServletInitializer
 * Creator: awang3 - Anthony Wang
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletInitializer extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MuchApplication.class);
	}
}