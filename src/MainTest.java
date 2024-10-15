import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testGeneratePowerSet_emptySet() {
        List<Integer> inputSet = Collections.emptyList();
        List<List<Integer>> powerSet = Main.generatePowerSet(inputSet);
        assertEquals(Collections.singletonList(Collections.emptyList()), powerSet);
    }

    @Test
    public void testGeneratePowerSet_singleElementSet() {
        List<Integer> inputSet = Collections.singletonList(1);
        List<List<Integer>> powerSet = Main.generatePowerSet(inputSet);
        assertEquals(Arrays.asList(Collections.emptyList(), Collections.singletonList(1)), powerSet);
    }

    @Test
    public void testGeneratePowerSet_twoElementSet() {
        List<Integer> inputSet = Arrays.asList(1, 2);
        List<List<Integer>> powerSet = Main.generatePowerSet(inputSet);
        assertEquals(Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(2), Arrays.asList(1, 2)), powerSet);
    }

    @Test
    public void testGeneratePowerSet_threeElementSet() {
        List<Integer> inputSet = Arrays.asList(1, 2, 3);
        List<List<Integer>> powerSet = Main.generatePowerSet(inputSet);
        assertEquals(Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(2), Arrays.asList(1, 2),
                Collections.singletonList(3), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(1, 2, 3)), powerSet);
    }
}