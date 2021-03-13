public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k    = scan.nextInt();
        scan.close();
        
        
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String curr = s.substring(i, i + k);
            if (smallest.compareTo(curr) > 0){
                smallest = curr;
            }
            if (largest.compareTo(curr) < 0) {
                largest = curr;
            }
        }
        
       
        System.out.println(smallest);
        System.out.println(largest);
    }
}
