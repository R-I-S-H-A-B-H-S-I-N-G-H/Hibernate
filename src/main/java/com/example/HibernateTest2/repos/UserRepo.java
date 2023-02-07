package com.example.HibernateTest2.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.HibernateTest2.entities.User;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {
    void save(User user);

}
