package com.balim.eticaret.business.rules;

import com.balim.eticaret.core.utilities.exceptions.BusinessException;
import com.balim.eticaret.dataAccess.abstracts.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserBusinessRules {
    private UsersRepository usersRepository;
    public void checkIfUserExists(String eMail){
        if(this.usersRepository.existsByUserId(eMail)){
            throw new BusinessException("E-mail  already exists.");
        }
    }
}
