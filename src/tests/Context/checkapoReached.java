package tests.Context;


import helper.User;
import main.ContextManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class checkapoReached {
    public int apoThreshhold;
    public int userClock;
    public boolean expectedResult;

    public checkapoReached(int apoThreshhold, int userClock, boolean expectedResult) {
        this.apoThreshhold = apoThreshhold;
        this.userClock = userClock;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 1, 50, true},
                { 50, 50, true},
                { 51, 50, false},
                {100,40,false},
                {30,60,true},
                {40,40,true}
        };
        return Arrays.asList(data);
    }

    @Before
    public void before() throws Exception {
//        Field field = (ContextManager.class).getDeclaredField("users");
//        field.setAccessible(true);
    }

    @Test
    public void testCheckapoReached() throws Exception {
        User user = new User();
        user.apoThreshhold = apoThreshhold;
        user.clock = userClock;
        Method method = (ContextManager.class).getDeclaredMethod("checkapoReached", User.class);
        method.setAccessible(true);
        assertEquals("Result should be equal", expectedResult, method.invoke(null, user));
    }
}
