package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.foodwiring.FoodPanda;
import com.lts.jbased.AppConfig;
import com.lts.jbased.Vehicle;
import com.lts.setter.Employee;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*FoodPanda foodpanda=context.getBean(FoodPanda.class);
		List<String> menuList = foodpanda.showMenu("Chinese");
		for(String iterator: menuList )
			System.out.println(iterator);
		Employee employee1=context.getBean(Employee.class);
		System.out.println("emp1"+employee1);
		Employee employee2=context.getBean(Employee.class);
		System.out.println("emp2"+employee2);
		employee2.setName("ram");
		System.out.println("emp1"+employee1);
		System.out.println("emp2"+employee2);
		Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle);*/
		ShapeFactory shapef=context.getBean(ShapeFactory.class);
		shapef.printArea(5, 6);

	}
}
