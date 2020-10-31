
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        if (baseValue == null) return valueToBeAdded;
        if (valueToBeAdded == null) return baseValue;
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        if (valueToBeReversed == null) return null;
        char[] arr = valueToBeReversed.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
        return new String(arr);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        // Assumption: if the length is odd, return the middle char; 
        //             if it's even, return the on the left of "middle"
        if (word == null) return null;
        return word.charAt((word.length() - 1) / 2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        if (value == null || value.length() == 0 || charToRemove == null) 
            return value;
        StringBuilder sb = new StringBuilder();
        for (char ch : value.toCharArray()) {
            if (ch != charToRemove) sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        // Assumption: there are no punctuations and characters that don't 
        //              form a word;
        //             there might be duplicate spaces
        if (sentence == null) return null;
        int index = sentence.length() - 1;
        while (index >= 0 && sentence.charAt(index) == ' ') index--;
        int end = index;
        while (index >= 0 && sentence.charAt(index) != ' ') index--;
        StringBuilder sb = new StringBuilder();
        for (int i = index + 1; i <= end; i++) {
            sb.append(sentence.charAt(i));
        }
        return sb.toString();
    }
}
