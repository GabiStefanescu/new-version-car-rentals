package com.car.rentals.newversioncarrentals;

import com.car.rentals.newversioncarrentals.javafx.JavafxApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewVersionCarRentalsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(NewVersionCarRentalsApplication.class, args);
        Application.launch(JavafxApplication.class, args);
    }

}
