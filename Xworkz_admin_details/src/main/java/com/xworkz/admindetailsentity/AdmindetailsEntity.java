package com.xworkz.admindetailsentity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "admin_details_table")
public class AdmindetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String Name;
    @Column(name = "age")
    private int Age;
    @Column(name = "email")
    private String Email;
    @Column(name = "password")
    private String Password;
    @Column(name = "confirmpassword")
    private String ConfirmPassword;
    @Column(name = "phonenumber")
    private String Phonenumber;

}
