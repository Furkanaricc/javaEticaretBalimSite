package com.balim.eticaret.business.rules;

import com.balim.eticaret.core.utilities.exceptions.BusinessException;
import com.balim.eticaret.dataAccess.abstracts.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserBusinessRules {
    private UsersRepository usersRepository;
    public void checkIfUserExists(Long userId,String eMail){
        if(this.usersRepository.existsByUserId(userId,eMail)){
            throw new BusinessException("User id,email  already exists.");
        }
    }
}
