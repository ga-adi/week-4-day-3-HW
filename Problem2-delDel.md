# Problem 2: delDel

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

```
public String delDel(String str) {
  for (int i = 0; i >= str.length(); i++){
      if ( str.contains("del") ) {
          str = str.replace("del", "");
          return str;
      } else {
      } return str;
  }
  return str;
}
```
