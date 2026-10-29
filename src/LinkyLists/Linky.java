package LinkyLists;

import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList linky = new LinkedList<>();

        // add nearest targets to automatic aim-radar atk in ACE COMBAT?
        linky.add("Aerial ship 1");
        linky.add("Ground ship 1");
        linky.add(null);

        // remove when a targets gets out of indicator zone
        // suppose that HEAD of the list item get out of the indicator zone
        linky.remove();

        System.out.println(linky.getFirst());
    }
}
