//package com.cicdTest.CICD.test;
//
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
////@RunWith(MockitoJUnitRunner.class)
//class UserServiceTest {
//
//    @InjectMocks
//    UserService userService;
//
//    @Mock
//    UserRepository userRepository;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void getUserById() {
//        User user=new User("Avi","avipatel8224@gmail.com");
//        Mockito.when(userRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(user));
//        User result = userService.getUserById(12L);
//        assertEquals(user.getName(),"Avi");
//    }
//
//}