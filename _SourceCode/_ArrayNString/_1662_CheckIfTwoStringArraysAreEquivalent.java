public class _1662_CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return arrayStringsAreEqual_sol2(word1, word2);
    }

    public static boolean arrayStringsAreEqual_sol1(String[] word1, String[] word2) {
        String str1 = "", str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }

        return str1.equals(str2);
    }

    public static boolean arrayStringsAreEqual_sol2(String[] word1, String[] word2) {
        StringBuilder strBld1 = new StringBuilder();
        StringBuilder strBld2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            strBld1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            strBld2.append(word2[i]);
        }

        return strBld1.toString().equals(strBld2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ac", "b"};
        String[] word2 = {"a", "bc"};

        boolean result = arrayStringsAreEqual(word1, word2);

        System.out.println("Result: " + result);
    }
}
