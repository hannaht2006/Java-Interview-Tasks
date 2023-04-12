package number_tasks;

public class Task_interview {
    public static void main(String[] args) {
//        int num = 20;
//        int firstNum = 0;
//        int nextNum = 1;
//        int result = 0;
//        for (int i = 0; i < num; i++) {
//            if (result <= num - nextNum) {
//                result = firstNum + nextNum;
//                firstNum = nextNum;
//                nextNum = result;
//                System.out.println(result);
//            }
//        }
//    }
        System.out.println(fibonaci(20));
    }
        public static int fibonaci ( int num){
            int firstNum = 0;
            int nextNum = 1;
            int result = 0;
            for (int i = 1; i < num; i++) {
                if (result <= num - nextNum) {
                    result = firstNum + nextNum;

                    firstNum = nextNum;
                    nextNum = result;
                    System.out.println(result);
                }

            }
            return nextNum;
        }
    }

