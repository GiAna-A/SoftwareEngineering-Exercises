package spielwiese.src.duplikateFinden;

public class Duplikat {
    public   void findeDuplikate(UniMitglied[] uniMitglieds) {
        for (int i = 0; i < uniMitglieds.length; i++) {
            for (int j = i + 1; j < uniMitglieds.length; j++) {
                if (uniMitglieds[i] == uniMitglieds[j]) {
                    System.out.println("Duplikat gefunden!");

                }

            }

        }
    }
}
