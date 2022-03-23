import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSLList {
    @Test
    public void testInsert() {
        SLList sll = new SLList();
        SLList sllVery = new SLList();
        int[] intA = new int[] { 2, 6, 5 };
        for (int i : intA) {
            sll.addFirst(i);
        }
        int[] intB = new int[] { 2, 6, 10, 5 };
        for (int i : intA) {
            sllVery.addFirst(i);
        }
        sll.insert(10, 1);
        // assertEquals(sllVery, sll);
        sll.reverseIteratively();
        assertEquals(sllVery, sll);
    }
}
