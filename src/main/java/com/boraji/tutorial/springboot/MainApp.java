package com.boraji.tutorial.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MainApp {
   public static void main(String[] args) {
	   System.setProperty("server.servlet.context-path", "/test");
      SpringApplication.run(MainApp.class, args);
   }
}
