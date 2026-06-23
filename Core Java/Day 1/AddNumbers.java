class AddNumbers{
    public static void main(String[] args){
           System.out.println("Length: "+args.length);
           int sum=0; 
           for(int j=0;j<args.length;j++){
               sum=sum+Integer.parseInt(args[j]);	   
           }
			  System.out.println("Addition:"+sum);
				
    }

}