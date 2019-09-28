package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import com.example.demo.dao.DAO;
import com.example.demo.model.Societe;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSocieteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSocieteApplication.class, args);
	}
	@Bean
	CommandLineRunner start(DAO c)
	{
		return args->{
			
			c.deleteAll();
			c.save(new Societe(1,"C1"));
			c.save(new Societe(2,"C2"));
			c.save(new Societe(3,"C3"));

			c.findAll().forEach(System.out::println);
		
	};

}
	
}

