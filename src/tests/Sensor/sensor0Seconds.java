package tests.Sensor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Objects;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class sensor0Seconds {
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
                {"Jack", "AQI", 0,"200", 10},
                {"Jack", "Location", 0,"A", 14},
                {"Jack", "Temperature",0, "10", 2},
                {"David", "AQI",0, "200", 10},
                {"David", "Location",0, "A", 14},
                {"David", "Temperature",0, "10", 2}};
        return Arrays.asList(data);
    }

    @Test
    public void testGetCurrent0() throws NoSuchFieldException, IllegalAccessException {
        Sensor sensor = new Sensor(name, type);
        Field secondField = Sensor.class.getDeclaredField("seconds");
        secondField.setAccessible(true);
        Integer fieldValue = (Integer) secondField.get(sensor);
        while((Integer) secondField.get(sensor) > 1){
            sensor.getCurrentValue();
        }
        assertEquals(sensor.getCurrentValue(), expected);
    }
    @Test
    public void testGetSec0() throws NoSuchFieldException, IllegalAccessException {
        Sensor sensor = new Sensor(name, type);
        Field secondField = Sensor.class.getDeclaredField("seconds");
        secondField.setAccessible(true);
        Integer fieldValue = (Integer) secondField.get(sensor);
        while((Integer) secondField.get(sensor) != 0){
            sensor.getCurrentValue();
        }
        sensor.getCurrentValue();
        assertEquals((Integer) secondField.get(sensor) , expectedSeconds);
    }
}
