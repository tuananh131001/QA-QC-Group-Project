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
public class infoTest {
    private String name;
    private String location;
    private String info;
    private String expectedValue;
    private List<String> services = new ArrayList<>();

    public infoTest(String name, String location, String info, String expectedValue) {
        this.name = name;
        this.info = info;
        this.location = location;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {"Vivo City Shopping Centre", "A", "Vivo City Shopping Centre is a major regional shopping centre in the southern suburb of Ho Chi Minh City, Vietnam. It is the second largest shopping centre in the southern suburbs of Ho Chi Minh City, by gross area, and contains the only H&M store in that region.",
                                                        "Vivo City Shopping Centre is a major regional shopping centre in the southern suburb of Ho Chi Minh City, Vietnam. It is the second largest shopping centre in the southern suburbs of Ho Chi Minh City, by gross area, and contains the only H&M store in that region."},
                {"Crescent Mall", "B","Crescent Mall Shopping Centre is located 10km South of the Ho Chi Minh City central business district(CBD) and includes Banana Republic, Baskin Robins, CGV Cinema, Bobapop and over 130 specialty stores.",
                                    "Crescent Mall Shopping Centre is located 10km South of the Ho Chi Minh City central business district(CBD) and includes Banana Republic, Baskin Robins, CGV Cinema, Bobapop and over 130 specialty stores."},
                {"Dam Sen Parklands", "C", "The Dam Sen Parklands area was created as part of the rejuvenation of the industrial upgrade undertaken for World Expo 1988. The Parklands area is spacious with plenty of green and spaces for all ages. A big lake promenade stretches the area of Dam Sen Parklands.",
                                              "The Dam Sen Parklands area was created as part of the rejuvenation of the industrial upgrade undertaken for World Expo 1988. The Parklands area is spacious with plenty of green and spaces for all ages. A big lake promenade stretches the area of Dam Sen Parklands."},
                {"Ho Chi Minh City, Downtown", "D", "The Ho Chi Minh City central business district (CBD), or 'the City' is located on a central point in district One. The point, known at its tip as Central Point, slopes upward to the north-west where 'the city' is bounded by parkland and the inner city suburb of District 3, District 4 and District 5.",
                                        "The Ho Chi Minh City central business district (CBD), or 'the City' is located on a central point in district One. The point, known at its tip as Central Point, slopes upward to the north-west where 'the city' is bounded by parkland and the inner city suburb of District 3, District 4 and District 5."},
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetInfo() throws Exception {
        LocationDetails locationDetails = new LocationDetails(name,location,info,services);
        assertEquals(expectedValue,locationDetails.getInfo());
    }

    @Test
    public void testSetInfo() throws Exception {
        LocationDetails locationDetails = new LocationDetails(name,location,info,services);
        locationDetails.setInfo(expectedValue);
        assertEquals(expectedValue,locationDetails.getInfo());
    }

}
