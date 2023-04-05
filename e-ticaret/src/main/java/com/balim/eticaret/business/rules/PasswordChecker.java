package com.balim.eticaret.business.rules;

import com.balim.eticaret.dataAccess.abstracts.OrderRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/*@Service
@AllArgsConstructor
public class PasswordChecker {
    private OrderRepository ordersRepository;

    public static boolean checkPassword(String enteredPassword, String userPassword) {
        String hashedPassword = DigestUtils.sha256Hex(enteredPassword);
        return hashedPassword.equals(userPassword);
    }
}*/
public interface PasswordChecker{
    boolean checkIfExistPassword(String enteredPassword,String password);
}
