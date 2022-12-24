/**
 * Dastekin created on 24.12.2022 the Generator-Class inside the package - firststeps
 */
package firststeps;

import org.mockito.internal.matchers.GreaterThan;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Generator implements Machine{

    private List<String> ArrayListExamples = new ArrayList();
    private TreeSet<String> TreeSetExample = new TreeSet();
    private TreeMap<Integer,String> TreeMapExample = new TreeMap<>();


    @Override
    public void addOneToList(String lipton) {
        this.ArrayListExamples.add(lipton);

    }

    @Override
    public void AddOneToTreeMap(int objectID, String prospan) {
        this.TreeMapExample.put(objectID,prospan);

    }

    @Override
    public void AddOneToTreeSet(String bebivita) {
        this.TreeSetExample.add(bebivita);
    }

    @Override
    public int getListSize() {
        return this.ArrayListExamples.size();
    }

    @Override
    public int getTreeMapSize() {
        return this.TreeMapExample.size();
    }

    @Override
    public int getTreeSetSize() {
        return this.TreeSetExample.size();
    }


}
