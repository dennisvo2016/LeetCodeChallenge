public class _387_FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        return firstUniqChar_sol2(s);
    }

    public static int firstUniqChar_sol1(String s) {
        char[] arrChar = s.toCharArray();
        int[] arrIntStr = new int[125]; //Represent to 0 -> 125 (99 -> 125 are letters) in ASCII table

        for (int i = 0; i < arrChar.length; i++) {
            int numStr = (int)arrChar[i];

            arrIntStr[numStr]++;
        }

        int result = -1;
        for (int i = 0; i < arrChar.length; i++) {
            int numStr = (int)arrChar[i];
            if (arrIntStr[numStr] == 1) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int firstUniqChar_sol2(String s) {
        //Warning: This solution will not run and throw exception TimeLimitExceed when the input String is too long
        char[] arrChar = s.toCharArray();
        int result = -1;

        for (int i = 0; i < arrChar.length; i++) {
            String currentChar = Character.toString(arrChar[i]);
            String tmpStr = s;

            int isUnique = tmpStr.length() - tmpStr.replaceAll(currentChar, "").length();

            if (isUnique == 1) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int result = firstUniqChar(s);

        System.out.println("Result: " + result);
    }

}
