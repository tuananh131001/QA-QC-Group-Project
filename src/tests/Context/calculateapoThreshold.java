package tests.Context;

import helper.User;
import main.ContextManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class calculateapoThreshold {
    public Integer medicalConditionType;
    public Integer aqi;
    public Integer expectedVal;

    public  calculateapoThreshold(Integer medicalConditionType, Integer aqi, Integer expectedVal) {
        this.medicalConditionType = medicalConditionType;
        this.aqi = aqi;
        this.expectedVal = expectedVal;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 1, 0, 90},
                { 1, 39, 30},
                { 1, 50, 30},

                { 1, 45, 15},
                { 1, 55, 15},
                { 1, 105, 15},

                { 1, 98, 10},
                { 1, 125, 10},
                { 1, 130, 10},

                { 1, 157, 5},
                { 1, 197, 5},
                { 1, 200, 5},

                { 2, 0, 60},
                { 2, 49, 60},
                { 2, 60, 60},

                { 2, 51, 30},
                { 2, 60, 30},
                { 2, 100, 30},

                { 2, 101, 20},
                { 2, 113, 20},
                { 2, 155, 20},

                { 2, 154, 10},
                { 2, 195, 10},
                { 2, 200, 10},

                { 3, 0, 90},
                { 3, 56, 90},
                { 3, 50, 90},

                { 3, 31, 45},
                { 3, 69, 45},
                { 3, 100, 45},

                { 3, 101, 30},
                { 3, 122, 30},
                { 3, 150, 30},

                { 3, 151, 15},
                { 3, 177, 15},
                { 3, 200, 15},

                {1, -5, null},
                {1, 10000, null},
                {1, 483647, null},
                {1, -73647, null},
        };
        return Arrays.asList(data);
    }

    @Test
    public void testThreshHold() throws Exception {
        User user = new User();
        user.sensorData.aqi = this.aqi;
        user.medicalConditionType = this.medicalConditionType;
        Method method = (ContextManager.class).getDeclaredMethod("calculateapoThreshhold", User.class);
        method.setAccessible(true);
        Integer result = (Integer) method.invoke(null, user);
        System.out.println("Medical Condition: " + medicalConditionType + " & AQI: " + this.aqi);
        assertEquals("Should be equal", expectedVal, result);
    }
}
