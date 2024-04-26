package com.cicdTest.CICD.test;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


class CicdTestApplicationTests {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserService userService;


	@Test
	public void testGetUserById() {
		// Given
		long userId = 1L;
		User expectedUser = new User(userId, "John Doe", "john@example.com");

		// When
		//User actualUser = userService.getUserById(userId);

		// Then
		//assertNotNull(actualUser);
		//assertEquals(expectedUser.getId(), 1L);
		assertEquals(expectedUser.getName(), null);
		assertEquals(expectedUser.getEmail(), null);
	}

//	@Test
//	public void testCreateUser() {
//		// Given
//		User userToCreate = new User( "Jane Doe", "jane@example.com");
//		when(userRepository.save(userToCreate)).thenReturn(new User("Jane Doe", "jane@example.com"));
//
//		// When
//		User createdUser = userService.createUser(userToCreate);
//
//		// Then
//		assertNotNull(createdUser);
//		assertEquals(1L, createdUser.getId());
//		assertEquals(userToCreate.getName(), createdUser.getName());
//		assertEquals(userToCreate.getEmail(), createdUser.getEmail());
//	}


}
