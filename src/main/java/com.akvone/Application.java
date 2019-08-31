package com.akvone;

import com.akvone.core.CoreConfiguration;
import com.akvone.core.CoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
//    ConfigurableApplicationContext ctx = SpringApplication.run(Application.class);

    AnnotationConfigApplicationContext ctx
        = new AnnotationConfigApplicationContext(CoreConfiguration.class, CoreService.class);
    ctx.close();
    System.out.println("Return from main()");
  }
}
