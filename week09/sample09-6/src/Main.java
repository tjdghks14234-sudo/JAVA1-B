void main() {
    final  int START =1;
    final int TARGET= 200000000;
    int total=0;
    int today =1;

    for (int i=START;true;i*=2){
        total +=i;

        System.out.printf("오늘 저축 금액 = %,11d원, %3d 일 = %,11d 원\n",i,today+=1,total);
        if(total >= TARGET)
            break;
    }
    System.out.printf("2억원 %d일만에 달성",today);
}
