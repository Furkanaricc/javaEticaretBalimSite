package com.balim.eticaret.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="Orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @Column
     @GeneratedValue(strategy = GenerationType.AUTO)
    Long orderNumber;
    @ManyToOne
    @JoinColumn(name="productId")
    Product product;
   @Column
    int piece;
   @ManyToOne
    @JoinColumn(name = "address")
    User user;
    @Column
    int shippingCost;

}
