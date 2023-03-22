package number_tasks;

public class Number_Fibonacci {
    public static void main(String[] args) {
        int num = 20;
        int j = 0;
        int z = 1;
        int result = 0;

            for (int i = 0; i < num; i++) {
              if (result <= num -z){
                result = j + z;
                j = z;
                z = result;
                System.out.println(z);
            }

        }
    }
        public static int fibonacci ( int num){

            int result = 0;
            int j = 0;
            int z = 1;

            for (int i = 1; i < num; i++) {
                result = j + z;
                j = z;
                z = result;
            }

            return result;
        }

    }

