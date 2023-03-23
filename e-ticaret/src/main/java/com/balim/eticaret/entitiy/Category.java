package com.balim.eticaret.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="Category")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long categoryId;
    @Column
    String categoryName;



}
