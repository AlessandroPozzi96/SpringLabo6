package com.spring.henallux.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService {
    public String chooseGift(String hobby, int age) {
        String gift = "Tu as reçu un ";
        if (age < 5) {
            gift = "puzzle concernant ton hobby : " + hobby;
        }
        else
        {
            if (age < 10) {
                gift = "DVD concernant ton hobby : " + hobby;
            }
            else
            {
                gift = "livre concernant ton hobby : " + hobby;
            }
        }
        return gift;
    }
}
