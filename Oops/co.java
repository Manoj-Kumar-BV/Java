public class co{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.changeColor("Blue");
        System.out.println("The new Pen Color is : "+p1.color);

        p1.changeTip(2);
        System.out.println("The new Pen Tip is : "+p1.tip);
    }
}

class Pen{  //Pen is an object Blueprint and it's not created here we have just described the functions, attributes of the object that must be there.
    String color;
    int tip;

    void changeColor(String newcolor){
        color = newcolor;
    }

    void changeTip(int newTip){
        tip = newTip;
    }
}
