class Solution {
    public boolean checkIfPangram(String str) {
        int flag = 0;
        for(char ch:str.toCharArray()){
            int ind = ch - 'a';
            int bin = 1 << ind;
            flag = flag | bin;
            // System.out.println(Integer.toBinaryString(bin));
    }
    int out = (1 << 26) -1;
    if(flag == out){
        return true;
    }else{
        return false;
    }
    }
}
