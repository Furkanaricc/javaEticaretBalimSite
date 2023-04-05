package com.balim.eticaret.dataAccess.abstracts;

import com.balim.eticaret.entitiy.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
    boolean existsByOrderNumber(Long id);

}
