package tests.Sensor;

import helper.SensorData;
import main.AllSensors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Sensor;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AllSensorTestInvalidName {
    @Parameterized.Parameter(0)
    public String name;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"abc"},
                {"anna"},
                {"RMIT"},
                {"\r"},
                {"n"},
                {""},
                {" "},
                {"+++"}};
        return Arrays.asList(data);
    }


    @Test(expected = FileNotFoundException.class)
    public void testThrows() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        AllSensors sensor = new AllSensors(name);
        Method method = AllSensors.class.getDeclaredMethod("getSensorData");
        method.setAccessible(true);
        SensorData data = (SensorData) method.invoke(sensor);

    }


}
