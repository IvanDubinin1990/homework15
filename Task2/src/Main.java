import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.

        checkInput();

    }

    static void checkInput() {

        String POSIBLE_SYMBOL = " -АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯабвгдеёжзийклмнопрстуфхцчшщьыъэюя";
        System.out.println("Введите Фамилию, Имя, Отчество по порядку: ");
        String input = new Scanner(System.in).nextLine().trim();
        int checkProbel = 0;
        boolean check = true;

        for (int i = 0; i < input.length(); i++) {
            if (!POSIBLE_SYMBOL.contains(String.valueOf(input.charAt(i)))) {
                System.out.println("Ввод не корректен, введены недопустимые символы");
                check = false;
                break;
            }
            if (input.charAt(i) == ' ') {
                checkProbel++;
            }
        }

        if (check && checkProbel == 2) {
            System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')).trim());
            System.out.println("Имя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());
            System.out.println("Отчество: " + input.substring(input.lastIndexOf(' '), input.length()).trim());
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}