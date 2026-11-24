void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    class Customer {
        String waterNo;
        String name;
        char type;
        String typeName;
        float usage;
        int useCharge;
        int tax;

        public Customer(String waterNo, String name, char type) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
        }

        public Customer(String waterNo, String name, char type, float usage) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
            this.usage = usage;
        }
    }

    Customer[] customers = new Customer[]{
            new Customer("1111", "홍길동", '1', 123.6f),
            new Customer("1211", "이대한", '3', 456.7f),
            new Customer("1311", "한민국", '5', 234.7f),
            new Customer("1411", "정동진", '4', 567.8f),
            new Customer("1511", "한겨울", '3', 234.0f),
            new Customer("1611", "경복대", '2', 567.8f),
            new Customer("1711", "박상열", '1', 789.5f),
            new Customer("1811", "이순신", '4', 567.4f),
            new Customer("1911", "이검색", '5', 234.7f),
            new Customer("2111", "고동진", '4', 875.4f)};

    int count = 0;
    while (count < customers.length) {
        System.out.printf("%s 고객님의 사용량 입력(예 12.5) : ", customers[count].name);
        customers[count].usage = keyboard.nextFloat();
        if (customers[count].usage >= 0.0f)
            count++;
        else {
            System.err.println("ERROR : 사용량은 0 ~ ");
            System.in.read();
        }
    }

    for (int i = 0; i < customers.length; i++) {
        if (customers[i].type == '1')
            customers[i].typeName = "가정용";
        else if (customers[i].type == '2')
            customers[i].typeName = "영업용";
        else if (customers[i].type == '3')
            customers[i].typeName = "공장용";
        else if (customers[i].type == '4')
            customers[i].typeName = "관공서";
        else if (customers[i].type == '5')
            customers[i].typeName = "군기관";
        else
            customers[i].typeName = "";
    }

    for (int i = 0; i < customers.length; i++) {
        customers[i].useCharge = 1200;
        int usage = (int) (customers[i].usage + 0.5f);
        switch (customers[i].type) {
            case '1':
                customers[i].useCharge += usage * 40;
                break;
            case '2':
                customers[i].useCharge += usage * 55;
                break;
            case '3':
                customers[i].useCharge += usage * 78;
                break;
            case '4':
                customers[i].useCharge += usage * 35;
                break;
            case '5':
                customers[i].useCharge += usage * 20;
                break;
            default:
                customers[i].useCharge = 0;
        }
    }

    for (int i = 0; i < customers.length; i++) {
        if (customers[i].type == '1') {
            customers[i].tax = (int) (customers[i].useCharge * 5.0f / 100);
        } else if (customers[i].type == '2') {
            customers[i].tax = (int) (customers[i].useCharge * 3.5f / 100);
        } else if (customers[i].type == '3') {
            customers[i].tax = (int) (customers[i].useCharge * 2.5f / 100);
        } else if (customers[i].type == '4') {
            customers[i].tax = (int) (customers[i].useCharge * 1.5f / 100);
        } else if (customers[i].type == '5') {
            customers[i].tax = (int) (customers[i].useCharge * 0.0f);
        } else {
            customers[i].tax = -1;
        }
    }

    for (int i = 0; i < customers.length; i++) {       // 1.
        for (int j = 1; j < customers.length - i; j++) { // 2.
            if (customers[j - 1].useCharge + customers[j - 1].tax < customers[j].useCharge + customers[j].tax) {             // 3.
                Customer temp = customers[j - 1];
                customers[j - 1] = customers[j];
                customers[j] = temp;
            }
        }
    }


    System.out.println("****************************************************************");
    System.out.println("수도번호 고객명 구분  사용량   사용금액       세금     납부금액  비고  ");
    System.out.println("****************************************************************");

    for (int i = 0; i < customers.length; i++) {
        System.out.printf(" %4s %3s %3s %,6.1f %,9d원 %,7d원 %,9d원 %s\n",
                customers[i].waterNo, customers[i].name, customers[i].typeName, customers[i].usage,
                customers[i].useCharge, customers[i].tax, customers[i].useCharge + customers[i].tax,
                customers[i].type == '5' ? "일괄 징수" : "");
    }
    System.out.println("****************************************************************");
}