public class gs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.changeColor("Blue");
        System.out.println(p1.getcolor());

        p1.changeTip(2);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    void changeColor(String newcolor){
        this.color = newcolor;
    }

    void changeTip(int newTip){
        this.tip = newTip;
    }

    String getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}