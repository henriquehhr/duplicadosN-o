import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
    String[] array1 = { "Morango", "Uva", "Acerola", "Manga" };
    String[] array2 = { "Pêra", "Caju", "Morango", "Kiwi", "Uva" };
    List<String> iguais = new ArrayList<String>();

    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i] == array2[j]) {
          iguais.add(array1[i]);
          break;
        }
      }
    }

    System.out.println(iguais);
  }
}
