package by.epam.jmp.less0310;

/**
 * Created by Ruslan_Arifullin on 3/10/2017.
 */
class Hope {
    static int m() {
        return 4;
    }
}

public class Nope {
    static Hope ob;

    public static void main(String[] args) {
        System.out.println(ob.m());
        System.out.println(ob.m() > 0);
    }
}
