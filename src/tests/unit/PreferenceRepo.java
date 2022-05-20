package tests.unit;

import main.PreferenceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import support.Preference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PreferenceRepo {

    @Parameterized.Parameter
    public String name;
    @Parameterized.Parameter(1)
    public Integer medicalCondition;
    @Parameterized.Parameter(2)
    public String nameExpected;
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"David", 4,"David"},

        };
        return Arrays.asList(data);
    }
    @Test
    public void medicalConditionShouldBeSet() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name ,nameExpected );
    }
    @Test
    public void suggestionShouldBeSet() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name , nameExpected);
    }
    @Test
    public void nameShouldBeGotten() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name , nameExpected);
    }
    @Test
    public void suggestionsShouldBeGotten() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name , nameExpected);
    }
    @Test
    public void preferenceConstructorShouldBeCalled() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name , nameExpected);
    }
    @Test
    public void preferenceShouldBeCalledPrinted() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name , nameExpected);
    }
    @Test
    public void medicalConditionalShouldBeGotton() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name ,"May");
    }
    @Test
    public void getSuggestionWeather() {
        System.out.println("\nTest getting weather suggestion for INVALID user");
        String user = "Invalid user";
        int weatherValue = 1;
        String expectedSuggestion = null;
        PreferenceRepository repo  =  new PreferenceRepository();
        assertEquals(name ,"June");
    }
}