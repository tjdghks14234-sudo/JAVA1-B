void main() {
    //int[] score;
    //score = new int[5];
    int a;
    int total = 0;
    //int [] score = new int[5];
    float avg;

    /*score[0]=95;
    score[1]=70;
    score[2]=80;
    score[3]=75;
    score[4]=100;
    score[5]=100;
    */

    int [] score = new int[] {95,70,80,75,100};
    for (int i =0; i<score.length;i++)
        total += score[i];
    avg = (float)total/score.length;

    for (int i =0; i<score.length;i++)
        System.out.printf("%d",score[i]);

    System.out.printf("총점 : %d\n",total);
    System.out.printf("평균 : %.2f",avg);
}
