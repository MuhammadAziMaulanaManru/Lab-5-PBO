public class Java_DataType {


        public static void main(String[] args){

            //PRIMITIVE DATA TYPES

            //Integer
            int intEx = 1;

            //Double
            double doubleEx = 17.4;

            //  int charEx = 'A';

            //Char
            char charEx1 = 'A';

            //Boolean
            boolean isRegistered = true;

            // REFERENCE DATA TYPE

            //String
            String StringEx = "Hello World";

            char[] arrayOfChar = {'K','U','C','I','N','G'};
            String kucingText = new String(arrayOfChar);

            //Array
            int[] numbers = {1,2,3,5,6};
            String[] people = {"Joe", "Nico"};
            int[][] multidimensionalArray = {
                    {1,2,3,4},
                    {8,7,9,10},
                    {0,1,5,2}
            };

            System.out.println(multidimensionalArray[1][2]);
//        System.out.println(multidimensionalArray[3][1]);
            System.out.println(multidimensionalArray[0][2] * multidimensionalArray[1][2]);


//        TODO : PRINT ALL VARIABLES
            System.out.println(charEx1);
            System.out.println("Hello World");
        }
    }

