package lesson3;

public class Scanner {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = input.nextLine();
        String[] strings = string.split(" ");
        String word2 = strings[1];
        String wordReplace =" "+strings[2];
        String string2 = string.replace(word2, "\nконечно\n");
        String string3 = string2.replace(wordReplace, strings[2]);
        System.out.println(string3);
        System.out.printf("Напечатано сегодня в %1$tA, в %1$tH:%1$tM.".toUpperCase(), date);
    }
}
