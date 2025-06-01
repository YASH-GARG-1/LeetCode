class Solution {
  public String multiply(String num1, String num2) {
    int num1Len = num1.length();
    int num2Len = num2.length();
    int[] array = new int[num1Len + num2Len];
    for (int i = num1Len - 1; i > -1; i--) {
      for (int j = num2Len - 1; j > -1; j--) {
        int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int carryIndex = i + j;
        int digitIndex = i + j + 1;
        int total = mul + array[digitIndex];
        array[digitIndex] = total % 10;
        array[carryIndex] += total / 10;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int ele : array) {
      if (!(sb.length() == 0 && ele == 0)) {
        sb.append(ele);
      }
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }
}