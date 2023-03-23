package com.balim.eticaret.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Admins")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {
    @Id
    @Column
    String adminName;
    @Column
    String Email;
    @Column
    String password;
}
