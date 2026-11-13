void main() throws IOException{
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동","이예린","김명성","경복대","이대학","여성학","정대인","학성기","조동기","박대박"};
    int[] kor ={90,87,75,100,100,79,83,92,90,77};
    int[] matn ={90,88,100,100,75,70,69,91,65,71};
    int[] eng ={95,90,96,99,89,65,89,98,89,100};

    int [] sum = new int[name.length];
    float [] avg = new float[name.length];
    int [] rank = new int[name.length];


    int i =0;
    /*
    while (i< name.length){
        System.out.printf("%s 학생의 국어, 수학, 영어 성적입력: ",name[i]);
        kor[i] = keyboard.nextInt();
        matn[i] = keyboard.nextInt();
        eng[i] = keyboard.nextInt();

         if ((kor[i] >= 0 && kor[i] <= 100) &&
                (math[i] >= 0 && math[i] <= 100) &&
                (eng[i] >= 0 && eng[i] <= 100)) {
            i++;
        } else {
            System.err.println("ERROR : 점수는 0 ~ 100");
            System.in.read();
    }
*/

    for (i = 0;i< name.length;i++){
        sum[i] = kor[i] + matn[i] + eng[i];
    }
    for (i = 0;i< name.length;i++){
        avg[i] = sum[i] / 3.0f;
    }
    /*
    for (int i = 0;i< name.length;i++){
        for (int j = 0;j< name.length;j++){
            if(sum[i]>sum[j]){
               String temp = name[i];
               name[i] = name[j];
               name[j] = temp;

               int test = kor[i];
               kor[i] = kor[j];
               kor[j] = test;

               test = matn[i];
               matn[i] = matn[j];
               matn[j] = test;

               test = eng[i];
               eng[i] = eng[j];
               eng[j] = test;
            }

        }
    }
    */
    for(i = 0; i <name.length;i++){
        int step = 1;
        for (int j=0;j < name.length;j++){
            if(sum[j] > sum[i]){
                step++;
            }
        }
        rank[i] = step;
    }


    /*
    for ( i = 0;i< name.length;i++)
        rank[i] = i +1;
    for (i = 0;i< name.length;i++)
        for (int j = 0;j< name.length;j++)
            if(sum[i] == sum[j]){
                rank[i] = rank[j];
            }
     */
    System.out.println("****************************************");
    System.out.println("  이름   국어  수학  영어  총합   평균  등수");
    System.out.println("****************************************");

    for (i = 0;i< name.length;i++){
        System.out.printf(" %3s %4s %4s %4s %5s  %.2f  %2d\n",
                name[i],kor[i],matn[i],eng[i],sum[i],avg[i],rank[i]);
    }
    System.out.println("****************************************");
}
