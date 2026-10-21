void main() {
    final int radius = 6378; //단위 km
    final float PI = 3.141592f;
    final int KOREA = 100505; //㎢

    double surface = 4 * PI * radius * radius;

    double ratio = KOREA / surface;

    System.out.printf("지구의 표면적은 %,.0f㎢\n",surface);
    System.out.printf("대한민국 영토 %d㎢는 지구의 %,.5f입니다",KOREA,ratio);

}
