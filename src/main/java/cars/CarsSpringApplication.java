package cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cars.beans.Cars;
import cars.controller.BeanConfiguration;
import cars.repository.CarsRepository;

@SpringBootApplication
public class CarsSpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CarsSpringApplication.class, args);
		
	
	}
	
	@Autowired
	CarsRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
				
				//Using an existing bean
			Cars c = appContext.getBean("cars",Cars.class);
			c.setMake("Alfa Romeo");
				
			
				//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
				((AbstractApplicationContext) appContext).close();
				
	}

}
