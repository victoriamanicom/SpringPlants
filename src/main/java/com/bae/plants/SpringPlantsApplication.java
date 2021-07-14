package com.bae.plants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPlantsApplication {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(SpringPlantsApplication.class, args);
//		PlantController controller = beanBag.getBean(PlantController.class);
//		System.out.println("Controller:" + controller);
//		PlantServiceList service = beanBag.getBean(PlantServiceList.class);
//		System.out.println("Service:" + service);
	}

}
