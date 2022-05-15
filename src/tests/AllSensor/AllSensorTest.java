package tests.AllSensor;

import helper.SensorData;
import main.AllSensors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
public class AllSensorTest {

    private AllSensors sensors = new AllSensors("Jack");
    private AllSensors sensorsDavid = new AllSensors("David");
    @Test
    public void testGetSensorDataJack() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String expectedName = "Jack";
        String expectedLocation = "A";
        int expectedTemperature = 10;
        int expectedUvr = 200;
        Method method = AllSensors.class.getDeclaredMethod("getSensorData");
        method.setAccessible(true);
        SensorData data = (SensorData) method.invoke(sensors);
        assertEquals(expectedName, data.username);
        assertEquals(expectedTemperature, data.temperature);
        assertEquals(expectedUvr, data.aqi);
        assertEquals(expectedLocation, data.location);
    }
    @Test
    public void testGetSensorDataDavid() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String expectedName = "David";
        String expectedLocation = "A";
        int expectedTemperature = 10;
        int expectedUvr = 200;
        Method method = AllSensors.class.getDeclaredMethod("getSensorData");
        method.setAccessible(true);
        SensorData data = (SensorData) method.invoke(sensorsDavid);
        assertEquals(expectedName, data.username);
        assertEquals(expectedTemperature, data.temperature);
        assertEquals(expectedUvr, data.aqi);
        assertEquals(expectedLocation, data.location);
    }
}
