//однострочный комментарий

/* многострочный
комментарий
*/

/**
 * author Created by Helen 24.03.2018
 */

//метод, функция, процедура, подпрограмма
public class Kitchen {

    //psvm+Tab
    public static void main(String[] args) {
        System.out.println("main");
        cookBreakfast();
        cookSoup();
    }

    static void cookSoup() {
        System.out.println("Boil water");
        System.out.println("...");
        System.out.println("Soup has done");
        //Ctrl + D - copy string
    }

    static void cookBreakfast() {
        System.out.println("Breakfast has done");
    }
}
