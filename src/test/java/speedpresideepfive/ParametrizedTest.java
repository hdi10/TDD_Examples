/**
 * Dastekin created on 13.12.2022 the ParametrizedTest-Class inside the package - SpeedPresiDeepDive
 */
package speedpresideepfive;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        Object [][] data = new Object[] [] {
                {0,0,0},{1,1,0},
                {2,1,1},{3,2,1},
                {4,3,1},{5,5,0},
                {6,8,-2}};
        return Arrays.asList(data);
        }

        public int expected, input1, input2;

    public ParametrizedTest(int expected, int input1,
                            int input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;

    }

    @Test
    public void executeParameterizedTest() throws Exception {
        Assert.assertEquals(expected,new Calculator().add(input1,input2));
    }

}
