package tests.Sensor;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

@RunWith(Parameterized.class)
public class sensorTestInvalid {
    @Parameterized.Parameter(0)
    public String name;

    @Parameterized.Parameter(1)
    public String type;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"TuanAnh", "AQI"},
                {"Jack", "Hot"},
                {"", "Location"},
                {"David", ""},
                {"", ""},
                {"***", "////"}};
        return Arrays.asList(data);
    }


    @Test(expected = NoSuchElementException.class)
    public void testThrows() {
        Sensor sensor = new Sensor(name,type);
    }



}
