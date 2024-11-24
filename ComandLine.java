class ComandLine{
    public static void main(String args[])
    {
        int n=args.length;
        if(n<=0)
        {
            System.out.println("Please Provide The argumet Ar run time..");

        }
        else{
            for(String i : args)
            System.out.println(i);
        }
    }
}