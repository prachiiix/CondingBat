
// Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


// parenBit("xyz(abc)123") → "(abc)"
// parenBit("x(hello)") → "(hello)"
// parenBit("(xy)1") → "(xy)"
public String parenBit(String str) {
  if(str.length() < 2){
    return "";
  }
  if(str.charAt(0) == '('){
    return parenBitHelper(str);
  }
  else{
    return parenBit(str.substring(1));
  }
}

public String parenBitHelper(String str){
  if(str.charAt(0) == ')'){
    return str.substring(0, 1);
  }
  else{
    return str.substring(0, 1) + parenBitHelper(str.substring(1));
  }  
}
