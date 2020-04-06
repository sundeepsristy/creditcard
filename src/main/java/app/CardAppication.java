package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This is the parent of Spring boot class
 */
@SpringBootApplication
public class CardAppication extends SpringBootServletInitializer {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CardAppication.class,args);
    }



}
