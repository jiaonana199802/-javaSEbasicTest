public class Test6 {
	public static void main(String[] args){
    int m, n;
        int i, j;
        m=n=6;
        for(i=0;i<m;++i)
        {
            if(i==0 || i==m-1)
            {
                for(j=0;j<n;++j)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(j=0;j<n-2;++j)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}