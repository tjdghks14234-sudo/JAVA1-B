void main() {
    long a = 3000000000L; // 30억
    long b = 4000000000L; // 40억
    long c = a * b;
    System.out.printf("a=%,d,b=%,d,c=%,d\n", a, b, c);
    BigInteger a1 = BigInteger.valueOf(3000000000L);
    BigInteger b1 = BigInteger.valueOf(4000000000L);
    BigInteger c1 = a1.multiply(b1);
    System.out.printf("a1=%,d, b1=%,d, c1=%,d", a1, b1, c1);
}
