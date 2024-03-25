//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Anjing hely= new Anjing("hely", "cihuahua", "coklat", 3);
            hely.berlari();
            hely.makan();
            hely.tidur();
            hely.menggongong();

            Anjing shiro= new Anjing("shiro", "pitbull", "putih", 2);
            shiro.tidur();
            shiro.menggongong();
            shiro.makan();
            shiro.berlari();

            Anjing satya= new Anjing("satya", "chinese crested", "hitam", 19);
            satya.tidur();
            satya.menggongong();
            satya.makan();
            satya.berlari();
    }

}
