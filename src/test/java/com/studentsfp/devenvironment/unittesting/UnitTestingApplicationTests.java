package com.studentsfp.devenvironment.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class UnitTestingApplicationTests {

    @Test
    void contextLoads() {
		String place = "La Mancha";
        String message = String.format("En un lugar de %s de cuyo nombre no me acuerdo...",place);
        Assert.doesNotContain(message, place+".", "¡Quijote te mienten con la provincia!");
    }

}
