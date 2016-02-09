# Problem 1: doubleX

Given a string, return true if the first instance of “x” in the string is immediately followed by another “x”.

doubleX(“axxbb”) → true
doubleX(“axaxax”) → false
doubleX(“xxxxx”) → true

```
boolean doubleX(String str) {

  for (int i = 1; i <= str.length(); i++ ){
      if (i == str.indexOf(‘x’) && i++ == str.indexOf(‘x’)){
          return true;
      } else {
      return false;
      }
  }
  return false;
}
```
