package com.gifty.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hcakb on 8/20/2017.
 */

@Component
public class DbSeeder implements CommandLineRunner {
    private UsersRepository usersRepository;

    public DbSeeder(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Users users1 = new Users(
                "Shamim",
                "Chow"
        );

        Users users2 = new Users(
                "Saif",
                "Rah"
        );
        this.usersRepository.deleteAll();

        List<Users> usersList = Arrays.asList(users1, users2);
        this.usersRepository.save(usersList);
    }
}
