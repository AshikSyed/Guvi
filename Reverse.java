import java.util.*;
class Reverse
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str=new String();
        str=in.next();
        StringBuffer sb=new StringBuffer(str);
        sb=sb.reverse();
        System.out.print(sb);
    }
}
