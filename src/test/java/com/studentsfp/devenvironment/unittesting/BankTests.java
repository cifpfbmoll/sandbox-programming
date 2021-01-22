package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.p2.data.Account;
import com.studentsfp.devenvironment.unittesting.p2.data.Bank;
import com.studentsfp.devenvironment.unittesting.p2.data.BankOperationsHelper;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class BankTests {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Test
    void testBankName() {
        String bankName = "BancoMolón";
        Bank bank = new Bank();
        bank.setName(bankName);
        String innerName = bank.getName();
        //TODO add apache commons lang dependency
        Assert.isTrue(innerName.equals(bankName), "El set de bank no funciona");
    }

    @Test
    void testAccountCreation() {
        Long start = System.currentTimeMillis();
        Account account = BankOperationsHelper.initAccount("saNostra"
                , 20.
                , "pepito", "juanito");
        Long end = System.currentTimeMillis();
        Assert.isTrue(account.getBalance().equals(20.), "balance is wrong");
        Assert.isTrue(StringUtils.equals("saNostra", account.getBank().getName())
                , "Bank mek");
        log.info("test successful in " + (end-start) + " ms");
        log.info(String.format("Test super cool finished in %s ms",end-start));
    }

}
