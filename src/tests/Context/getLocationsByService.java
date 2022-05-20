package tests.Context;


import main.ContextManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class getLocationsByService {
    public String service;
    public List<String> expectedResults;

    public getLocationsByService(String service, List<String> expectedResults) {
        this.service = service;
        this.expectedResults = expectedResults;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {
                        "shops",//0
                        Arrays.asList(
                                "Vivo City Shopping Centre",
                                "Crescent Mall",
                                "Dam Sen Parklands",
                                "Ho Chi Minh City, Downtown"
                        )
                },
                {
                        "RESTAURANTS",//1
                        Arrays.asList(
                                "Vivo City Shopping Centre",
                                "Crescent Mall",
                                "Dam Sen Parklands",
                                "Ho Chi Minh City, Downtown"
                        )
                },
                {
                        "cinema",//2
                        Arrays.asList(
                                "Vivo City Shopping Centre",
                                "Crescent Mall"
                        )
                },
                {
                        "Ferris wheel",//3
                        Arrays.asList(
                                "Dam Sen Parklands"
                        )
                },
                {
                        "bowling",//4
                        Arrays.asList(
                                "Vivo City Shopping Centre",
                                "Ho Chi Minh City, Downtown"
                        )
                },
                {
                        "market",//5
                        Arrays.asList(
                                "Ho Chi Minh City, Downtown"
                        )
                },
                {
                        "restaurants",//6
                         Arrays.asList(
                                 "Vivo City Shopping Centre",
                                 "Crescent Mall",
                                 "Dam Sen Parklands",
                                 "Ho Chi Minh City, Downtown"
                         )
                },
                {
                        "",
                        Arrays.asList()
                },
                {
                        "ewfwrwsdfwwwrerw",
                        Arrays.asList()
                },
                {
                        "”#$%%^@&*&",
                        Arrays.asList()
                },
                {
                        "f",
                        Arrays.asList()
                },
        };
        return Arrays.asList(data);
    }

    @Before
    public void before() throws Exception {
        Field communicatorField = (ContextManager.class).getDeclaredField("communicator");
        communicatorField.setAccessible(true);
        communicatorField.set(null, com.zeroc.Ice.Util.initialize());

        Method initMethod = (ContextManager.class).getDeclaredMethod("iniLocationMapper");
        initMethod.setAccessible(true);
        initMethod.invoke(null);

        Method readCityInfoMethod = (ContextManager.class).getDeclaredMethod("readCityInfo");
        readCityInfoMethod.setAccessible(true);

        Field field = (ContextManager.class).getDeclaredField("cityInfo");
        field.setAccessible(true);
        field.set(null, readCityInfoMethod.invoke(null));
    }

    @Test
    public void testGetLocationByService() throws Exception {
        Method method = (ContextManager.class).getDeclaredMethod("getLocationsByService", String.class);
        method.setAccessible(true);
        List<String> results = (List<String>) method.invoke(null, service);
        assertEquals("Should be equal", expectedResults, results);
    }
}
