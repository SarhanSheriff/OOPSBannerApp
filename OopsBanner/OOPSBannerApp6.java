public class OOPSBannerApp6 {
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", "  *****  ")
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " ******  "),
            String.join("", " *        "),
            String.join("", " *        "),
            String.join("", " *        ")
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " *        "),
            String.join("", " *        "),
            String.join("", "  *****  "),
            String.join("", "      * "),
            String.join("", "      * "),
            String.join("", " *****  ")
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                o[i] + "   " +
                o[i] + "   " +
                p[i] + "   " +
                s[i]
            );
        }
    }
}