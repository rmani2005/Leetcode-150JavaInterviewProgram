class demo
{
    public static void main(String[] args) {
    
        //Sum of all the numbers present in a string
        //Input – “a10bb10de11”
        //output – 31

        String in="a10bb10de11";
        int sum=0;

       // String[] outStr=in.split(".*[a-z]*.");
       // for (String string : outStr) {
       //     System.out.println(string.toString());
       // }
        
        for(int i=0;i<in.length();i++)
        {
            try {
                //sum=sum+in.charAt(i);
                try
                {
                        sum=sum+Integer.parseInt((in.charAt(i)+""+in.charAt(i+1)));
                        System.out.println("sumvalue-" + sum);
                }catch (NumberFormatException e) {
                // TODO: handle exception
            }

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Output:" + sum);
    }


}