package LinkyLists;

import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Objects;

public class Linky {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        // add nearest targets to automatic aim-radar atk in ACE COMBAT?
        linky.add("Aerial ship 1");
        linky.add("Ground ship 1");
        linky.add("AA ship 1");


        // remove when a targets gets out of indicator zone
        // suppose that HEAD of the list item get out of the indicator zone
        linky.remove();
        linky.removeLast();

        Iterator<String> linkyIterator = linky.iterator();

        while (linkyIterator.hasNext()) {
            if (linkyIterator.next().equals("AA ship 1"))
            {
                System.out.println("You must attack this ship first!");
            }
            else
            {
                System.out.println("There is no AA. Feel free to target any ship!");
            }
        }

        System.out.println(linky.getFirst());
    }
}
