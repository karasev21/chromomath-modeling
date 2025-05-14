package io.github.karasev21.chromomath.hmm;

import java.math.BigInteger;

public class Tribonacci {
  private static BigInteger calculate(int n){
    if (n == 0 || n == 1) return BigInteger.ZERO;
    if (n == 2) return BigInteger.ONE;


    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ZERO;
    BigInteger c = BigInteger.ONE;

    for(int i = 3; i < n; i++){
      BigInteger next = a.add(b).add(c);
      a = b;
      b = c;
      c = next;
    }
    return c;
  }
}