package easy.soc.hacks.ScheduleHelper;

import easy.soc.hacks.ScheduleHelper.interceptor.SiteInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ScheduleHelperApplication implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SiteInterceptor());
	}

	public static void main(String[] args) {
		SpringApplication.run(ScheduleHelperApplication.class, args);
	}
}
