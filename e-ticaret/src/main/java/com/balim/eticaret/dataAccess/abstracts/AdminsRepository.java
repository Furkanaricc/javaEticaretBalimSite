package com.balim.eticaret.dataAccess.abstracts;

import com.balim.eticaret.entitiy.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends JpaRepository<Admin,Integer> {
    //Aynı isimden ürün olup olmadığını kontrol eder.
    boolean existsByName(String name); //spring jpa keywords

}
