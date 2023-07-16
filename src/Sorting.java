

public class Sorting {

    public static void main(String[] arg) {
//       int arr[]=new int[]{10,1,56,56,21,90,2,34};
//       System.out.println(Arrays.toString(arr));
//       for(int i:arr){
//           System.out.println(i);
//       }
//
//        String str="Hello";
//        System.out.println(str);
//        StringBuilder stb=new StringBuilder();
//        stb.append(str);
//        stb=stb.reverse();
//        System.out.println(stb);

//        int count=12;
//        int a=0,b=1,c=1;
//        for (int i=1;i<=count;i++){
//            System.out.print(a +",");
//            a=b;
//            b=c;
//            c=a+b;
        //System.out.println(new Sorting().facto(10));



Sorting srt=new Sorting();
System.out.println(srt.isPrime(4));
System.out.println(srt.isPrime(3));
System.out.println(srt.isPrime(6));

    }
//    public int facto(int count){
//
//        if(count==1)
//            return 1;
//        else {
//        return(count*facto(count-1));
//    }

    public boolean isPrime(int no){
    if(no<=1)
        return false;
    for(int i=2;i<=Math.sqrt(no);i++){
        if(no%i==0)
            return false;
    }

return true;
}

}
