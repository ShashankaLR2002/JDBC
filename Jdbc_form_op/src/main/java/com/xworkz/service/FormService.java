package com.xworkz.service;

import com.xworkz.dto.FormDB;

public interface FormService {
    void saveForm(FormDB form);  
   public  FormDB getFormById(int id);  
   public  FormDB getFormByContact(long contact);  
   public  boolean verifyPasswordForUser(String email, String password);  
    public boolean deleteFormById(int id);  
    public boolean updateFormByEmail(String email, FormDB updatedForm); 


}
