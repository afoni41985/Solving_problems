package javarush.comparator;

import java.util.Comparator;

/*
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
