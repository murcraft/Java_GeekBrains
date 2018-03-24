public class Dog {
    public static void main(String[] args) {
        //Shift+Ctrl+Enter - перейти на новую строку с нужным отступом - www.devcolibri.com/2151
        String s;
        s = aport("косточка", 20);
        System.out.println(s);
    }

    static String aport(String it, int amount) {
        String result = "Пожеванная " + it + ", количество: " + amount;
        return result;
    }
}
