package com.bookstore;

import com.bookstore.domain.User;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.UserRole;
import com.bookstore.service.UserService;
import com.bookstore.utlity.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	private final UserService userService;

	@Autowired
	public BookstoreApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
//		User user1 = new User();
//		user1.setFirstName("John");
//		user1.setLastName("Adams");
//		user1.setUsername("j");
//		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
//		user1.setEmail("JAdams@gmail.com");
//		Set<UserRole> userRoles = new HashSet<>();
//		Role role1= new Role();
//		role1.setRoleId(1);
//		role1.setName("ROLE_USER");
//		userRoles.add(new UserRole(user1, role1));
//
//		userService.createUser(user1, userRoles);
//
//		User user2 = new User();
//		user2.setFirstName("Idan");
//		user2.setLastName("Busso");
//		user2.setUsername("idan");
//		user2.setPassword(SecurityUtility.passwordEncoder().encode("loloftw1234"));
//		user2.setEmail("idanbusso@gmail.com");
//		Set<UserRole> userRolesB = new HashSet<>();
//		Role role2 = new Role();
//		role2.setRoleId(1);
//		role2.setName("ROLE_USER");
//		userRolesB.add(new UserRole(user2, role2));
//
//		userService.createUser(user2, userRolesB);
	}
}
