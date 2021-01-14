package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.p2.data.Bank;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

@SpringBootTest
public class BankTests {

    @Test
    void testBankName() {
        String bankName = "BancoMolón";
        Bank bank = new Bank();
        bank.setName(bankName);
        String innerName =bank.getName();
        //TODO add apache commons lang dependency
        Assert.isTrue(innerName.equals(bankName), "El set de bank no funciona");
    }

}
