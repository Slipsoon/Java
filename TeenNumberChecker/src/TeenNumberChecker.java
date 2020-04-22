public class TeenNumberChecker {

    public static boolean hasTeen (int par1, int par2, int par3) {

        if (par1 >= 13 && par1 <= 19)
            return true;
        else if (par2 >= 13 && par2 <= 19)
            return true;
        else if (par3 >= 13 && par3 <= 19)
            return true;

        return false;
    }

    public static boolean isTeen (int par1) {
        return par1 >= 13 && par1 <= 19;
    }
}
