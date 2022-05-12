package tests.Sensor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;
import java.util.Iterator;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class test0nonextiterator {
    @Parameterized.Parameter(0)
    public String name;
    @Parameterized.Parameter(1)
    public String type;
    @Parameterized.Parameter(2)
    public Integer seconds;
    @Parameterized.Parameter(3)
    public Integer loops;
    @Parameterized.Parameter(4)
    public String expected;
    @Parameterized.Parameter(5)
    public Integer expectedSeconds;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Jack", "AQI", 0,2,"200", 14},
                {"Jack", "Location", 0,3,"A", 0},
                {"Jack", "Temperature",0,3, "10", 4},
                {"David", "AQI",0,2, "200", 14},
                {"David", "Location",0,3, "A", 0},
                {"David", "Temperature",0,3, "10", 4}};
        return Arrays.asList(data);
    }

    @Test
    public void testGetCurrent() throws NoSuchFieldException, IllegalAccessException {
        Sensor sensor = new Sensor(name, type);
        LinkedHashMap<String,Integer> data = sensor.getData();
        Field secondField = Sensor.class.getDeclaredField("iterator");
        secondField.setAccessible(true);
        assertEquals(sensor.getCurrentValue() , expected);
    }
    @Test
    public void testGetSec() throws NoSuchFieldException, IllegalAccessException {
        Sensor sensor = new Sensor(name, type);
        LinkedHashMap<String,Integer> data = sensor.getData();
        Field iteratorField = Sensor.class.getDeclaredField("iterator");
        Field secondField = Sensor.class.getDeclaredField("seconds");
        secondField.setAccessible(true);
        iteratorField.setAccessible(true);
        Integer value = (Integer) secondField.get(sensor);
        value = value -1;
        assertEquals(value, expectedSeconds);
    }
}
