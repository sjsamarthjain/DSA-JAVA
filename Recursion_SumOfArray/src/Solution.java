public static class Solution {

    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(input.length<1){
            return 0;
        }
        int[] sInput = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            sInput[i-1]=input[i];
        }
        int ans = sum(sInput);
        int finalans = input[0]+ans;
        return finalans;
    }
}
