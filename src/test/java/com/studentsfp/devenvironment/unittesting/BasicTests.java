package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.data.Student;
import com.studentsfp.devenvironment.unittesting.p2.data.CardType;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class BasicTests {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void castingTest(){
        Double num = 1.;
        String txt = "1";
        Integer i = 1;
        Assert.isTrue(num.equals(i),"Double to int is not the same");
        Assert.isTrue(StringUtils.equals(txt,i.toString()),"String to int not the same");
    }

    @Test
    void overrideTest(){
        Student std = new Student();
        std.setName("Pepito");
        std.setMark(4.95);
        log.info(std.toString());
        std.setMark(8);
        log.info(std.toString());
        Assert.notNull(std,"El estudiante es nulo!");
    }

    @Test
    void enumSandbox(){
        CardType cardType = CardType.CREDIT;
        log.info(String.format("El valor del enum es %s",cardType));
        String txt = "DEBIT";
        CardType cardType2 = CardType.valueOf(txt);
        Assert.notNull(cardType,"Tarjeta incorrecta");
    }
}
