import java.util.Arrays;
import java.util.List;

public class OrdemNumerica {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        var numerosOrdenados = numeros.stream().sorted();
        System.out.println("Inicial:");
        numeros.forEach(System.out::println);
        System.out.println("Final:");
        numerosOrdenados.forEach(System.out::println);
    }

}
