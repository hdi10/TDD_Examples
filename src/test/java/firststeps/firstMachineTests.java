/**
 * Dastekin created on 24.12.2022 the firstMachineTests-Class inside the package - firststeps
 */
package firststeps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class firstMachineTests {

    @Test
    public void GutTestMachine(){
        Machine machine1 = new Generator();



        machine1.addOneToList("Lipton");

        machine1.AddOneToTreeMap(100,"prospan");
        //machine1.AddTwoToTreeMap(new objectID,new object());

        machine1.AddOneToTreeSet("bebivita");
        //machine1.AddTwoToTreeSet(new object);
        //machine1.AddThreeToTreeSet(new object);


        Assertions.assertEquals(1,machine1.getListSize());
        Assertions.assertEquals(1,machine1.getTreeMapSize());
        Assertions.assertEquals(1,machine1.getTreeSetSize());
    }

}
