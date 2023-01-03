public class ColumnSorted {
    public static void main(String[] args) {
        String[] str = {"cba","daf","ghi"};
        int count=0;

        for (int j = 0; j < str[0].length(); j++) {
            String s1 = "";
            for (int i = 0; i < str.length; i++) {
                s1 += str[i].charAt(j);
            }
            if(isSorted(s1)==false) count++;
        }
        System.out.println(count);
    }
    public static boolean isSorted(String s)
    {
        if(s.length()<=1)return true;
        else
        {
            for(int i=0; i<s.length()-1; i++)
            {
                if(s.charAt(i)>=s.charAt(i+1))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
