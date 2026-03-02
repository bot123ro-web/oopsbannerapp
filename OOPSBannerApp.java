public class OOPSBannerApp {

    public static void printMessage(String message, java.util.Map<Character, String[]> map) {

        int height = 7;

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = map.get(message.charAt(i));
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        java.util.Map<Character, String[]> charMap = new java.util.HashMap<>();

        charMap.put('O', new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        charMap.put('P', new String[] {
            "*******  ",
            "**     **",
            "**     **",
            "*******  ",
            "**       ",
            "**       ",
            "**       "
        });

        charMap.put('S', new String[] {
            " *****  ",
            "*     * ",
            "*       ",
            " *****  ",
            "      * ",
            "*     * ",
            " *****  "
        });

        String message = "OOPS";
        printMessage(message, charMap);
    }
}