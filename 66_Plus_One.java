class Solution {
  public int[] plusOne(int[] digits) {
    int index = digits.length - 1;
    int carry = (digits[index] + 1) / 10;
    digits[index] = (digits[index] + 1) % 10;
    while (--index > -1 && carry > 0) {
      carry = (digits[index] + 1) / 10;
      digits[index] = (digits[index] + 1) % 10;
    }
    if (index == -1 && carry == 1) {
      int[] array = new int[digits.length + 1];
      array[0] = 1;
      return array;
    }
    return digits;
  }
}