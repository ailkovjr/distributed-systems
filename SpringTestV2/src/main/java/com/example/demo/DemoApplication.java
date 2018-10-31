package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@Entity
@RestController
class Demo {
	@Id
	@GeneratedValue
	Long demoId;

	ArrayList<String> demo = new ArrayList<>();

	public Demo(){}

	@RequestMapping("/")
	String sayHi(){
		return "Hello World!";
	}

	@GetMapping("/readAll")
	public String getDemo() {
        return demo.toString();
    }
	@PostMapping("/postNew")
    public void setDemo(String demoText) {
        demo.add(demoText);;
    }
}

interface DemoRepository extends CrudRepository<Demo, Long> {
 
}
