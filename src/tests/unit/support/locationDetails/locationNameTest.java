package tests.unit.support.locationDetails;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.LocationDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class locationNameTest {
    private String name;
    private String expectedValue;
    private String location;
    private String info;
    private List<String> services = new ArrayList<>();

    public locationNameTest(String name, String expectedValue) {
        this.name = name;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {"Vivo City Shopping Centre", "Vivo City Shopping Centre"},
                {"Crescent Mall", "Crescent Mall"},
                {"Dam Sen Parklands", "Dam Sen Parklands"},
                {"Ho Chi Minh City, Downtown", "Ho Chi Minh City, Downtown"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetName() throws Exception {
        LocationDetails locationDetails = new LocationDetails(name,location,info,services);
        assertEquals(expectedValue,locationDetails.getName());
    }

    @Test
    public void testSetName() throws Exception {
        LocationDetails locationDetails = new LocationDetails(name,location,info,services);
        locationDetails.setName(expectedValue);
        assertEquals(expectedValue,locationDetails.getName());
    }

}
