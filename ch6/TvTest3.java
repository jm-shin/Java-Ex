class Tv{
    String color;
    boolean power;
    int channel;

    //Tv기능
    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class TvTest{
    public static void main(String[] args) {
        Tv t1 = new Tv(); 
        Tv t2 = new Tv();

        System.out.println("t1의 channel의 값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel의 값은 "+t2.channel+"입니다.");

        t2 = t1;
        t1.channel = 7; 
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        
        System.out.println("t1의 channel의 값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel의 값은 "+t2.channel+"입니다.");
    }
}