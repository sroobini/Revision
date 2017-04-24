/*
 * Write a logic to count of number of numbers in the given input string
 * Input is String
 * Output will print the number of occurences for each number
 *
 * Ex. 933262154439441526816992388562667004907159682643816
 * Output will be
 *  0 occurs 3 times
    1 occurs 5 times
    2 occurs 6 times
    3 occurs 5 times
    4 occurs 6 times
    5 occurs 4 times
    6 occurs 9 times
    7 occurs 2 times
    8 occurs 5 times
    9 occurs 6 times
 *
 * Also print the output as bar graph with x axis as numbers
 * and y axis with "#"  as of number of occurences
 *
 *
 *               #
 *               #
 *               #
 *       #   #   #     #
 *     # # # #   #   # #
 *     # # # # # #   # #
 *   # # # # # # #   # #
 *   # # # # # # # # # #
 *   # # # # # # # # # #
 *   0 1 2 3 4 5 6 7 8 9
 *
 *
 */

public class NumbersCountSolution {

    private static int[] countNumbers(String s){
        if(s == null){
            return null;
        }
        int nums[] = new int[10];
        for(int i = 0; i < s.length(); i++){
            int asciiValue = s.charAt(i);
            if(asciiValue > 47 && asciiValue < 58){
                nums[asciiValue-48]++;
            }
        }
        return nums;
    }

    private static void drawHistogram(int[] nums){
        if(nums == null){
            return;
        }
        int max = -1;
        for(int i = 0; i < nums.length; i++) {
            System.out.println(i + " occurs " + nums[i] + " times");
            if(max < nums[i]){
                max = nums[i];
            }
        }

        for(int y = max; y > 0; y--){
            for(int x = 0; x < 10; x++){
                if(nums[x] >= y) {
                    System.out.print("# ");
                    nums[x]--;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6 7 8 9");
    }

    private static void testBench(){
        NumbersCountSolution numbersCount = new NumbersCountSolution();
        int[] output = numbersCount.countNumbers("2146859296389521599993229915608941463961565182");
        numbersCount.drawHistogram(output);
        output = numbersCount.countNumbers(null);
        numbersCount.drawHistogram(output);
        output = numbersCount.countNumbers("Abc");
        numbersCount.drawHistogram(output);
        output = numbersCount.countNumbers("");
        numbersCount.drawHistogram(output);
    }
    public static void main(String[] args) {
        testBench();
    }
}
