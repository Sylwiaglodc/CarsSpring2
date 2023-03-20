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
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		SpringApplication.run(CarsSpringApplication.class, args);
		
		Cars c = appContext.getBean("cars", Cars.class);
		
		System.out.println(c.toString());
		((AbstractApplicationContext) appContext).close();
		
	
	}
	
	@Autowired
	CarsRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Cars c1 = new Cars(1, "AR", "gulia", 4, 4.0, true);
		repo.save(c1);
		
		Cars c2 = new Cars(2, "AR", "Stelvio", 6, 2.0, true);
		repo.save(c2);
		
		Cars c3 = new Cars(3, "Nissan", "GTR", 8, 4.0, true);
		repo.save(c3);
		
		Cars c4 = new Cars(4, "ford", "focus", 4, 2.0, false);
		repo.save(c4);
		

		((AbstractApplicationContext) appContext).close();
	}
	
}
