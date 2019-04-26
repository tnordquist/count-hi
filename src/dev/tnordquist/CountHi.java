package dev.tnordquist;

/**
 * CodingBat: Given a string, compute recursively (no loops) the number of times lowercase "hi"
 * appears in the string.
 */
public class CountHi {

  public int countHi(String str) {

    if (str.length() < 2) {
      return 0;
    } else if (str.substring(str.length() - 1).equals("i")
        && str.substring(str.length() - 2).equals("hi")) {
      return 1 + countHi(str.substring(0, str.length() - 2));
    } else {
      return countHi(str.substring(0, str.length() - 1));
    }

  }

}
