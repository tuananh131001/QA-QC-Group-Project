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
public class locationTest {
    private String name;
    private String location;
    private String expectedValue;
    private String info;
    private List<String> services = new ArrayList<>();

    public locationTest(String name, String location, String expectedValue) {
        this.name = name;
        this.location = location;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {"Vivo City Shopping Centre", "A", "A"},
                {"Crescent Mall", "B", "B"},
                {"Dam Sen Parklands", "C", "C"},
                {"Ho Chi Minh City, Downtown", "D", "D"}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetLocation() throws Exception {
        LocationDetails locationDetails = new LocationDetails(name,location,info,services);
        assertEquals(expectedValue,locationDetails.getLocation());
    }

    @Test
    public void testSetLocation() throws Exception {
        LocationDetails locationDetails = new LocationDetails(name,location,info,services);
        locationDetails.setLocation(expectedValue);
        assertEquals(expectedValue,locationDetails.getLocation());
    }


}
