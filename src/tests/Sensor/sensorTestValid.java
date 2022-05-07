package tests.Sensor;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class sensorTestValid {
    @Parameterized.Parameter(0)
    public String name;

    @Parameterized.Parameter(1)
    public String type;
    @Parameterized.Parameter(2)
    public String expected;
    @Parameterized.Parameter(3)
    public String expectedType;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Jack", "AQI", "Jack", "AQI"},
                {"Jack", "Temperature", "Jack", "Temperature"},
                {"Jack", "Location", "Jack", "Location"},
                {"David", "AQI", "David", "AQI"},
                {"David", "Temperature", "David", "Temperature"},
                {"David", "Location", "David", "Location"}};
        return Arrays.asList(data);
    }


    @Test
    public void testGetUserName() {
        Sensor sensor = new Sensor(name, type);
        assertEquals(sensor.getUsername(), expected);
    }
    @Test
    public void testGetType() {
        Sensor sensor = new Sensor(name, type);
        assertEquals(sensor.getType(), expectedType);
    }
}
