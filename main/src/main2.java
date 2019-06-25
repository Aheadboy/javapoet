import java.util.Random;

public class main2 {
    public static void main(String[] args) {
        System.out.println(AntiThief.getCopyRight("linjiejun"));

    }
}

class AntiThief {

    public static String getCopyRight(String authorStr) {
        int MAX = 64;
        int MIN = 33;
        Random rand = new Random();
        char[] authorAuth = new char[authorStr.length() * 2 + 1];

        for (int i = 0, j = 0; i < 1 + authorStr.length() * 2; i++) {
            if (i % 2 != 0) {
                authorAuth[i] = authorStr.charAt(j++);
            } else {
                authorAuth[i] = (char) (rand.nextInt(MAX - MIN + 1) + MIN);
            }
        }
//        return new String(authorAuth).substring(1, authorAuth.length - 1);
        String rtn = " @author " + new String(authorAuth);
        return rtn;
    }
}