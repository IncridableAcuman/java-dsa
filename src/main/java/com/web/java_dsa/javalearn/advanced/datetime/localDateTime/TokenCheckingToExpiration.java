package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class TokenCheckingToExpiration {
    public static void main(String[] args) {
        // 56. Token yaratilgan vaqt va expiration vaqtini berib, token expired yoki yo‘qligini aniqlang.
        LocalDateTime createdToken = LocalDateTime.now();
        LocalDateTime expiration = LocalDateTime.now().plusDays(7);
        if (!createdToken.isAfter(expiration)){
            System.out.println("Token does not expired");
        } else {
            System.out.println("Token expired");
        }
    }
}
