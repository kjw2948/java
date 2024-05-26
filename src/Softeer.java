import java.io.*;
import java.util.*;

class Softeer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer>[] nums = new ArrayList[10];
        String max = "";
        String min = "";
        for (int i = 0; i < 10; i++) {
            nums[i] = new ArrayList<>();
        }

        if (st.countTokens() == 6) {
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                int start = str.charAt(0) - '0';
                nums[start].add(Integer.parseInt(str));
            }
            for (int i = 1; i < 10; i++) {
                Collections.sort(nums[i]);
            }
        } else if (st.countTokens() == 9) {
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                int start = str.charAt(0) - '0';
                nums[start].add(Integer.parseInt(str));
            }
            for (int i = 1; i < 10; i++) {
                Collections.sort(nums[i]);
                int index = 0;
                if (nums[i].get(0) == i) {
                    for (int j = 1; j < nums[i].size(); j++) {
                        if(nums[i].get(j)/10!=0 && nums[i].get(j)%10 < i){
                            int tmp = nums[i].get(index);
                            nums[i].set(index, nums[i].get(j));
                            nums[i].set(j, tmp);
                            index = j;
                        }
                    }
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < nums[i].size(); j++) {
                min += Integer.toString(nums[i].get(j));
            }
        }

        int result = Integer.parseInt(max) + Integer.parseInt(min);
        System.out.println(result);
    }
}
