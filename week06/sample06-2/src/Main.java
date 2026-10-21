void main() {
    Scanner kyboard = new Scanner(System.in);
    final float DON = 3.75f; //1돈은 3.75g
    final int GOLD = 910000; //금 1돈의 가격
    float weight;
    float don;


    System.out.print("당신의 채중은?");
    weight = kyboard.nextFloat();

    /*int intweight = (int) weight;
    float remainder = weight - intweight;
    int gram1 = (int) (intweight * 1000 + remainder * 1000);*/

    int gram = (int)(weight * 1000);
    don = gram / DON;
    long price = (long)(don * GOLD);
    price /= 1000;
    price *= 1000;

    System.out.printf("%.2f Kg -> %,d g\n",weight,gram);
    System.out.printf("%.2f Kg -> %,.2f 돈\n",weight,don);
    System.out.printf("%.2f Kg -> %,d 원",weight,price);

}
