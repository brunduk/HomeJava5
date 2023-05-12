import ru.netology.services.Calculate;

public class Main {
    public static void main(String[] args) {
        Calculate service = new Calculate();
        System.out.println(service.calculate(10000, 3000, 20000));

    }
}
