import java.util.HashSet;

public class Duplicados {
    public static void main(String[] args) {
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        HashSet<String> set = new HashSet<>();

        for (String fruit : array1) {
            set.add(fruit);
        }

        for (String fruit : array2) {
            if (set.contains(fruit)) {
                System.out.println(fruit);
                set.remove(fruit);
            }
        }
    }
}