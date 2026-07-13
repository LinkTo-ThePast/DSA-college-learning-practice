package lesson_11;

public class MainArray {

    // interface I want to represent here:
    // a static sequence of integers
    // support the following operations:
    /**
     * 1) build(x): make a new data structure from items in X
     * 2) len(): return fixed size
     * 3) iter_seq(): output x0, x2, ...., xn-1
     * 4) get_at(i): return xi
     * 5) set_at(i,x): modify xi with new value X
     */

    // solution to the problem: data structure -> STATIC ARRAY

    // strength
    int firstItem = 23;
    // magic resistance
    int secondItem = 17;
    // ability power
    int thirdItem = 18;

    // multiplier
    int FINAL_MULTIPLIER = 2;
    // using static array
    int[] statsLevels = {23,17,18};

    private void buffProcess(int[] statsLevels) {

        for (int i = 0; i < statsLevels.length; i++)
        {
            statsLevels[i] = statsLevels[i] * FINAL_MULTIPLIER;
        }
    }

}
