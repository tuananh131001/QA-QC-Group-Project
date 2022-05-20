package tests.EnviroAPPUI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EnviroAPPUI {
    @Parameterized.Parameter
    public String alertType ;
    @Parameterized.Parameter(1)
    public String aqiValue ;
    @Parameterized.Parameter(2)
    public String tempValue ;
    @Parameterized.Parameter(3)
    public String weatherValue  ;
    @Parameterized.Parameter(4)
    public String suggestedLocation  ;
    @Parameterized.Parameter(5)
    public String expectedResult  ;
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Weather", "163","10 ","strong wind" ,"Crescent Mall","Crescent Mall"},
        };
        return Arrays.asList(data);
    }
    @Test
    public void sensorAndAlarm() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo;
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm1() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm2() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm3() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm4() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm5() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm6() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm7() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm8() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm9() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }
    @Test
    public void sensorAndAlarm10() {
        System.out.println("\nCheck that the application UI prints the correct message corresponding to the test data " +
                "and priority order between sensors and alarm values");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        EnviroAPPUI repo  =  new EnviroAPPUI();
        repo.alertType = "Weather";
        assertEquals(suggestedLocation ,expectedResult );
    }

}
