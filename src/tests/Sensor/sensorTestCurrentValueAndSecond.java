package tests.Sensor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class sensorTestCurrentValueAndSecond {
    @Parameterized.Parameter(0)
    public String name;

    @Parameterized.Parameter(1)
    public String type;
    @Parameterized.Parameter(2)
    public Integer seconds;
    @Parameterized.Parameter(3)
    public String expected;
    @Parameterized.Parameter(4)
    public Integer expectedSeconds;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Jack", "AQI", 10,"200", 14},
                {"Jack", "Location", 1,"A", 0},
                {"Jack", "Temperature",3, "10", 4},
                {"David", "AQI",10, "200", 14},
                {"David", "Location",1, "A", 0},
                {"David", "Temperature",3, "10", 4}};
        return Arrays.asList(data);
    }


    @Test
    public void testGetCurrent() {
        Sensor sensor = new Sensor(name, type);
        assertEquals(sensor.getCurrentValue(), expected);
    }
    @Test
    public void testGetSec() throws NoSuchFieldException, IllegalAccessException {
        Sensor sensor = new Sensor(name, type);
        sensor.getCurrentValue();
        Field secondField = Sensor.class.getDeclaredField("seconds");
        secondField.setAccessible(true);
        Integer fieldValue = (Integer) secondField.get(sensor);
        assertEquals(fieldValue, expectedSeconds);

    }

}
