import java.util.Objects;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        String[] nums = new String[3];
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пример используя ('+', '-', '*', '/')");
        String problem = scan.nextLine();
        if(problem.contains("+")) {
            nums = problem.split(" ");
            for (int i = 0; i < nums.length; i++) {
                if (isNumeric(nums[i])) {
                    result += Integer.parseInt(nums[i]);
                }
            }
        }
        if(problem.contains("-")){
            nums = problem.split(" ");
            int num_one = Integer.parseInt(nums[0]);
            for (int i = 1; i < nums.length; i++){
                if(isNumeric(nums[i])){
                    result = num_one - Integer.parseInt(nums[i]);
                }
            }
        }
        if(problem.contains("*")) {
            result = 1;
            nums = problem.split(" ");
            for (int i = 0; i < nums.length; i++) {
                if (isNumeric(nums[i])) {
                    result *= Integer.parseInt(nums[i]);
                }
            }
        }
        if(problem.contains("/")){
            nums = problem.split(" ");
            int num_one = Integer.parseInt(nums[0]);
            for (int i = 1; i < nums.length; i++){
                if(isNumeric(nums[i])){
                    result = num_one / Integer.parseInt(nums[i]);
                }
            }
        }
        System.out.println(result);
        }

    public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);

    }
}

