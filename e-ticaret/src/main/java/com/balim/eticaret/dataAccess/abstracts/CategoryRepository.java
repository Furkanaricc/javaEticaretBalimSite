package com.balim.eticaret.dataAccess.abstracts;

import com.balim.eticaret.entitiy.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
