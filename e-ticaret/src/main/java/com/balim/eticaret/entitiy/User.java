package com.balim.eticaret.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long userId;
    @Column
    String firstName;
    @Column
    String secondName;
    @Column
    String userAdress;
    @Column
    String eMail;
    @Column
    String password;

}
