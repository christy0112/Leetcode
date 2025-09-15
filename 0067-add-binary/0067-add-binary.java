class Solution {
    public String addBinary(String a, String b) {
        long num1=Long.parseLong(a,2);
        long num2=Long.parseLong(b,2);
        long res=num1+num2;
        String cou=Long.toBinaryString(res);
       return cou;
    }
}