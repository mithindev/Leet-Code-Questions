class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = words.length;

        char[] letters = brokenLetters.toCharArray();

        for (String word : words) {

            for (char ch : letters) {
                if (word.contains(String.valueOf(ch))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}