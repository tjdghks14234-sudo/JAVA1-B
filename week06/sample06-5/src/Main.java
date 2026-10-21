void main() {
    final long LIGHT = 299_792_458; //m/s
    final float YEAR = 365.2422f; //1년

    float hour = YEAR * 24;
    float minute = hour * 60;
    float second = minute * 60;
    float light = second * LIGHT;

    System.out.printf("빛은 초당 %,d km를 이동 합니다. \n",LIGHT /1000);
    System.out.printf("빛이 1년간 가는 거리는 %,.0f km입니다\n",light/1000);
}
