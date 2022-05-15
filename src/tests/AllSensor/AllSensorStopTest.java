package tests.AllSensor;

import helper.SensorData;
import main.AllSensors;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class AllSensorStopTest {
    private AllSensors sensors = new AllSensors("Jack");
    @Test
    public void StopTest() throws IllegalAccessException, NoSuchFieldException {
        sensors.stop();
        Field signal = AllSensors.class.getDeclaredField("signal");
        signal.setAccessible(true);
        Boolean data = (Boolean) signal.get(sensors);
        assertEquals(data,false);
    }
}
