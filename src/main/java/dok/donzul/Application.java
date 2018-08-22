package dok.donzul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("dok.donzul.mapper")
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableConfigurationProperties({ DataSourceProperties.class, DonzulDBProperties.class})
//@ComponentScan
//@EnableScheduling
//public class Application extends SpringBootServletInitializer {
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}
//}
