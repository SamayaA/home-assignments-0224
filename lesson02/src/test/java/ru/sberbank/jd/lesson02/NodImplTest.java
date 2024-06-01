package ru.sberbank.jd.lesson02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class NodImplTest {
    private NodImpl nod;

    @BeforeEach
    void setUp() {
        nod = new NodImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCalculate() {
        Assertions.assertEquals(5, nod.calculate(15,20));
        Assertions.assertEquals(36, nod.calculate(144,36));
        Assertions.assertNotEquals(12, nod.calculate(144,36));


    }
}