import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    return CallRecursiveFun(list, "", 0, n);
  }

  public List<String> CallRecursiveFun(List<String> listStr, String str, int openParenthesis, int remainParenthesis) {
    if (openParenthesis == 0 && remainParenthesis == 0) {
      listStr.add(str);
      return listStr;
    }

    if (remainParenthesis > 0) {
      CallRecursiveFun(listStr, str + "(", openParenthesis + 1, remainParenthesis - 1);
    }

    if (openParenthesis > 0) {
      CallRecursiveFun(listStr, str + ")", openParenthesis - 1, remainParenthesis);
    }

    return listStr;
  }
}