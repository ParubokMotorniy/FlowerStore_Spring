package com.app.Fools;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository repository)
    {

        userRepository = repository;
    }

    public List<AppUser> GetUsers()
    {
        return userRepository.findAll();
    }

    public void Add(@RequestBody AppUser user)
    {
        Optional<AppUser> emailFound = userRepository.FindUserByEmail(user.getEmail());
        if(emailFound.isEmpty())
        {
            userRepository.save(user);
        } else
        {
            System.out.println("The user already exists");
        }
    }

    public Optional<AppUser> CheckEmail(String email)
    {
        return userRepository.FindUserByEmail(email);
    }
}
