 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          // Assumption: the result of factorial will not be out of range
          if (number == null || number < 0) return null;
          int res = 1;
          while (number > 0) {
              res *= number--;
          }
          return res;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          // Assumption: there are only English characters(a-z, A-Z) 
          //            in the phrase
          if (phrase == null) return null;
          char[] arr = phrase.toCharArray();
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] == ' ') continue;
              if (i == 0 || arr[i - 1] == ' ') {
                  if (arr[i] >= 'a' && arr[i] <= 'z') {
                      arr[i] = (char)(arr[i] - 'a' + 'A');
                  }
                  sb.append(arr[i]);
              }
          }
          return sb.toString();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          // Assumption: there are only English characters(a-z/A-Z, Uppercase/Lowercase) 
          //            in the word
          if (word == null) return null;
          StringBuilder sb = new StringBuilder();
          char[] arr = word.toCharArray();
          for (char ch : arr) {
              int cur = ch + 3;
              if ((ch >= 'a' && ch <= 'z' && cur > 'z')
                    || (ch >= 'A' && ch <= 'Z' && cur > 'Z')) cur -= 26;
              sb.append((char) cur);
          }
          return sb.toString();
      }
}
