package com.balim.eticaret.business.rules;

import com.balim.eticaret.dataAccess.abstracts.OrderRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PasswordChecker {
    private OrderRepository ordersRepository;

    public static boolean checkIfExistsPassword(String enteredPassword, String storedPassword) {
        String hashedPassword = DigestUtils.sha256Hex(enteredPassword);
        return hashedPassword.equals(storedPassword);
    }

}
