class countdigit{
    public static void main(String[] args) {
         long num; 
         num =335137691;
         int i = 0;
         while(num!=0){
             num = num/10;
             i++;
             if(num == 1){
                 i++;
                 break;
             }
         }
         System.out.println("Number of Digits: "+ i);
     }
 }
