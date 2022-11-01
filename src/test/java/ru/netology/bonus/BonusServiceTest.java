package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateForAll(int amount, boolean isRegistered, int expected) {

        BonusService service = new BonusService();

        int actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}