package spielwiese.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ChocolateIsBadException {
        List<Snack> list = new ArrayList<>();
        list.add(new VeganChocolate("Vegan", 0, "schmecktnicht", ChocolotyType.ZARTBITTER));
        list.add(new Chocolate("Lindt", 96, "süß", ChocolotyType.DUNKEL));
        list.add(new Snack("Snack", 96));
        list.add(new SaltSnack("Chips", 0));

Chocolate chocolate= new Chocolate("Vegan", 0, "schmecktnicht", ChocolotyType.ZARTBITTER);
        for (Snack iterator: list ) {
            System.out.println(iterator.getName().equals(chocolate.getName()));

        }

    }

    public static <T> void printSnackType(List<T> list) throws ChocolateIsBadException {
        for (T t : list) { //von unten aussieben

            if (t instanceof Chocolate) {
                throw new ChocolateIsBadException("Schoko ist schlecht für die Zähne");

            } else if (t instanceof VeganChocolate) {
                System.out.println(((VeganChocolate) t).getSweetType());
            } else if (t instanceof Sweet) {
                System.out.println(((Sweet) t).getSweetType());
            } else if (t instanceof SaltSnack) {
                System.out.println(((SaltSnack) t).getSaltSnack());
            } else if (t instanceof Snack) {
                System.out.println(((Snack) t).getKalorien());


            }

        }
    }
}
