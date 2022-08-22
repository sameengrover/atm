import java.util.Scanner;

public class FormatTheNumber {



    static int removeAlphabets(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            try {
                stringBuilder.append(Integer.parseInt(String.valueOf(str.charAt(i))));
            }catch (NumberFormatException e){
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        System.out.println(removeAlphabets(str));


        while(true){
           int i =0;
           if(i<10){
               System.out.println("Mai lodu hu");
               i++;
           } else{
               break;
           }

            System.out.println("Sameen hu mai bete.....");
        }


    }




//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        //declare a new character array of size of string entered
//        char[] chars = new char[str.length()];
//
//        //fill the array of chars with the appropriate char in string
//        for(int i =0 ; i<str.length(); i++){
//            chars[i] = str.charAt(i);
//        }
//
//        //see if char can be convered into number
//        int counter = 0;
//        int[] nums = new int[str.length()];
//        for(char c : chars){
//            int n = -1;
//            try{
//                n = Integer.parseInt(String.valueOf(c));
//            }catch (Exception e){
////                System.out.println(c + " is not a number, skipping");
//            }finally{
//                nums[counter++] = n;
//            }
//        }
//
//        //make number from Interger array, skipping -1
//        int num = 0;
//        int j = 0;
//        for(int i = nums.length-1; i>=0; i--){
//            if(nums[i]!=-1){
//                num += nums[i]*Math.pow(10, j);
//                j++;
//            }
//        }
//
//        System.out.println("Bhai nikli hai value num ki "+num);
//
//
//
//
//
//
//    }



}
