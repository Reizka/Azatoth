package com.renny.gametracker;

import com.renny.gametracker.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class GametrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(GametrackerApplication.class, args);

	}

	@GetMapping("/user")
	public List<User> getCurrentUser() {
		return List.of(new User(1L, "Renny", null, 25, ""));
	}

}
