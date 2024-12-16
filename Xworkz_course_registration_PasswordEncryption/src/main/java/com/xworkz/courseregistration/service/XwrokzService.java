package com.xworkz.courseregistration.service;

import com.xworkz.courseregistration.dto.XworkzDTO;
import com.xworkz.courseregistration.entity.XworkzEntity;

import java.util.Map;

public interface XwrokzService {
    boolean save(XworkzDTO dto);

    Map<String, String> validate(XworkzDTO dto);

    boolean getValidationErrors(XworkzDTO dto);

    String getNameByEmailAndPassword(String email, String password);

    XworkzEntity getUserByEmailAndPassword(String email, String password);
}
