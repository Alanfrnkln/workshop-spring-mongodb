package com.example.workshopmongodb.config;

import com.example.workshopmongodb.domain.User;
import com.example.workshopmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instatiation implements CommandLineRunner {
       @Autowired
       private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.deleteAll();
        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
