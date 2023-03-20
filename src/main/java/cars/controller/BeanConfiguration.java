package cars.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cars.beans.Cars;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Cars cars() {
		Cars bean = new Cars(5, "Nissan", "Silvia", 5, 3.0, true);
		return bean;
	}

}
