package com.examensarbete.bank.service;

import com.examensarbete.bank.domain.User;
import com.examensarbete.bank.domain.security.UserRole;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface UserService {


    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);
    User saveUser (User user);
    void save (User user);
    User createUser(User user, Set<UserRole> userRoles);


    List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);

}
