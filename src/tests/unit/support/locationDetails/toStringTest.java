package tests.unit.support.locationDetails;

import org.junit.Test;
import support.LocationDetails;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

    public class toStringTest {
    private String name;
    private String location;
    private String info;
    private List<String> services;

    public toStringTest() {
    }

    @Test
    public void testToString() throws Exception {
        List<String> actual = Arrays.asList("cinema", "restaurants", "pool", "shops","bowling");
        LocationDetails locationDetails = new LocationDetails("Vivo City Shopping Centre","A","Vivo City Shopping Centre is a major regional shopping centre in the southern suburb of Ho Chi Minh City, Vietnam. It is the second largest shopping centre in the southern suburbs of Ho Chi Minh City, by gross area, and contains the only H&M store in that region.",actual);
        this.name = "Vivo City Shopping Centre";
        this.location = "A";
        this.info = "Vivo City Shopping Centre is a major regional shopping centre in the southern suburb of Ho Chi Minh City, Vietnam. It is the second largest shopping centre in the southern suburbs of Ho Chi Minh City, by gross area, and contains the only H&M store in that region.";
        this.services = actual;
        String expected = "LocationDetails [name=" + name + ", location=" + location + ", info=" + info + ", services=" + services + "]";
        assertEquals(expected,locationDetails.toString());
    }

}
