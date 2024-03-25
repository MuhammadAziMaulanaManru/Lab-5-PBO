public class Java_Operator {
    public static void main(String[] args) {
        int firstNum = 3;
        double secondNum = 4.2;

        int thirdNum = 4;
        thirdNum *= 3;

//        TODO : Declare the rest
        System.out.println();
        System.out.println("\n\n");


        double addRes = firstNum + secondNum;
        double substractRes = firstNum - secondNum;
        double multiplyRes = firstNum * secondNum;
        double divideRes = firstNum / secondNum;
        double moduloRes = firstNum % secondNum;

//        TODO : Declare the rest
        System.out.println(addRes);
        System.out.println(substractRes);
        System.out.println(multiplyRes);
        System.out.println(divideRes);
        System.out.println(moduloRes);
        System.out.println("\n\n");


        int preIncrement = ++firstNum;
        int postIncrement = firstNum++;
        int preDecrement = ++firstNum;
        int postDecrement = firstNum++;

//        TODO : Declare the rest
        System.out.println(preIncrement);
        System.out.println(postIncrement);
        System.out.println(preDecrement);
        System.out.println(postDecrement);
        System.out.println(firstNum);
        System.out.println("\n\n");

        boolean isEqual = firstNum == secondNum;
        boolean isBigger = firstNum > secondNum;
        boolean isSmaller = firstNum < secondNum;
        boolean isSmallerOrEqual = firstNum <= secondNum;
        boolean isEqualOrSmall = firstNum >= secondNum;
        boolean isDifferent = firstNum != secondNum;

//        TODO : Declare the rest
        System.out.println(isEqual);
        System.out.println(isBigger);
        System.out.println(isSmaller);
        System.out.println(isSmallerOrEqual);
        System.out.println(isEqualOrSmall);
        System.out.println(isDifferent);
        System.out.println("\n\n");


        boolean isFalse = isEqual && isBigger;
        boolean isTrue = isEqual || isBigger;
        boolean falsy = !isBigger;

        System.out.println(isFalse);
        System.out.println(isTrue);
        System.out.println(falsy);
        System.out.println("\n\n");
    }
}