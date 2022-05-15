package tests.AllSensor;

import helper.SensorData;
import main.AllSensors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AllSensorGetSensorData {
    @Parameterized.Parameter(0)
    public String username;
    @Parameterized.Parameter(1)
    public String expectedUserName;
    @Parameterized.Parameter(2)
    public Boolean expectedSignal;
    @Parameterized.Parameter(3)
    public String expectedLocationSensorType;
    @Parameterized.Parameter(4)
    public int expectedTempertureSensorType;
    @Parameterized.Parameter(5)
    public int expectedAQISensorType;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"David", "David",true, "A", 10,200},
                {"Jack", "Jack",true, "A", 10,200}
        };
        return Arrays.asList(data);
    }

    @Test
    public void dataRetrievedTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        AllSensors sensor = new AllSensors(username);
        Method method = AllSensors.class.getDeclaredMethod("getSensorData");
        method.setAccessible(true);
        SensorData data = (SensorData) method.invoke(sensor);
        Field signal = AllSensors.class.getDeclaredField("signal");
        signal.setAccessible(true);
        Boolean signalRes = (Boolean) signal.get(sensor);
        assertEquals(expectedUserName, data.username);
        assertEquals(expectedSignal, signalRes);
        assertEquals(expectedLocationSensorType, data.location);
        assertEquals(expectedTempertureSensorType, data.temperature);
        assertEquals(expectedAQISensorType, data.aqi);
    }

}
