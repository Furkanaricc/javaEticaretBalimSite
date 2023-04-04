package com.balim.eticaret.business.rules;

import com.balim.eticaret.core.utilities.exceptions.BusinessException;
import com.balim.eticaret.dataAccess.abstracts.AdminsRepository;

public class AdminBusinessRules {
    private AdminsRepository adminsRepository;
    public void checkIfAdminExists(String adminName){
        if(this.adminsRepository.existsByAdminName(adminName)){
            throw new BusinessException("Aynı isimde kategori oluşturulamaz.");
        }
    }
}
