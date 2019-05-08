package com.examensarbete.bank.service.UserServiceImpl;

import com.examensarbete.bank.dao.UserDao;
import com.examensarbete.bank.domain.User;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
   static User user1;
    static User user2;
    static User user3;



  static   ArrayList<User> users;

   @InjectMocks
    public UserServiceImpl userService;

    @Mock
    public UserDao userDao;

    @BeforeAll
    static void setUpInstances(){
        user1 =new User();
        user2=new User();
        user3=new User();
        users=new ArrayList<>();
        user1.setUsername("Mohammed");
        user2.setUsername("Lina");
        user3.setUsername("John");

    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

    }
    @Test
    public void testGetByUserName() {


       when(userDao.findByUsername("mohammed")).thenReturn(user1);

        User user = userService.findByUsername("mohammed");

       assertEquals("Mohammed", user.getUsername());
    }
    @DisplayName("testing if an user email is exist")
    @Test
    public void  checkEmailExists (){

        user1.setEmail("mohammedalmahfoodh@yahoo.com");
        when(userDao.findByEmail("mohammedalmahfoodh@yahoo.com")).thenReturn(user1);
        User user = userService.findByEmail("mohammedalmahfoodh@yahoo.com");
        assertNotNull(user);
        assertTrue(userService.checkEmailExists("mohammedalmahfoodh@yahoo.com"));

    }
    @Test
    public void findUsersList (){
      ArrayList<User>spyUsersInDB;
       spyUsersInDB=spy(users);
       spyUsersInDB.add(user1);
       spyUsersInDB.add(user2);
       spyUsersInDB.add(user3);
       assertFalse(spyUsersInDB.isEmpty());
       assertEquals(3,spyUsersInDB.size());
        System.err.close();
        System.setErr(System.out);


    }

}

