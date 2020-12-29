package com.rental.boardgame.project;

import com.rental.boardgame.project.domain.Boardgame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyProjectApplication.class, args);


        Boardgame boardgame = new Boardgame("7 cudów", "author", "strategic", 2015, "2,3,4");
        System.out.println("Hello Kamil");
    }

}
