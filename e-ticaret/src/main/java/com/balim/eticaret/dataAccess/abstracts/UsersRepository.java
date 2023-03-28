package com.balim.eticaret.dataAccess.abstracts;


import com.balim.eticaret.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {
    boolean existsByUserId(Long id); //spring jpa keywords
}