package com.xworkz.admindetailsdto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdmindetailsDTO {

    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String confirmpassword;
    private String phonenumber;


}
