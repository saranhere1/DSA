import java.math.BigInteger;
import java.util.*;

class Solution {
    private static final int[] PRIMES = {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
        31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        73, 79, 83, 89, 97, 101
    };
    
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<BigInteger, List<String>> groups = new HashMap<>();
        
        for (String str : strs) {
            BigInteger hash = computePrimeHash(str);
            groups.computeIfAbsent(hash, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(groups.values());
    }
    
    private BigInteger computePrimeHash(String s) {
        BigInteger hash = BigInteger.ONE;
        for (char c : s.toCharArray()) {
            hash = hash.multiply(BigInteger.valueOf(PRIMES[c - 'a']));
        }
        return hash;
    }
}