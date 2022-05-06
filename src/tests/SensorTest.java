package tests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SensorTest {
    @ParameterizedTest
    @ValueSource(strings = {"Alex","AQI"})
    void testGetUserName(String input){

    }
}
