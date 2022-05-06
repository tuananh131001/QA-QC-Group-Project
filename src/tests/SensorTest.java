package tests;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SensorTest {
    @Parameterized.Parameter(0)
    public String name;

    @Parameterized.Parameter(1)
    public String type;
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { "Jack","AQI" }, {  "Jack","Location" } };
        return Arrays.asList(data);
    }


    @Test
    public void testGetUserName(){
        Sensor sensor = new Sensor(name,type);
        assertEquals(sensor.getUsername(),"Jack");
    }
}
