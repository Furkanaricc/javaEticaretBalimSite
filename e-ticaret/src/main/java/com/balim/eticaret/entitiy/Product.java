package com.balim.eticaret.entitiy;
import javax.persistence.CascadeType;
import lombok.*;

import javax.persistence.*;


@Data
@Table(name ="Products")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productId;
    @Column
    String name ;
    //Category table dan ıd çekiyorum.
    @ManyToOne (cascade = CascadeType.REMOVE)
    @JoinColumn(name="categoryId")
    Category category;
    @Column
    String brand;
    @Column
    int stock;
    @Column
    double price;
    @Column
    String description;



}
