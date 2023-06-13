import java.util.Scanner;

 class Array1 {

   public static void main (String[] args){
     int[]arr=new int[5];
     Scanner scan= new Scanner(System.in);
     for (int i=0; i<arr.length; i++){
	     System.out.println("Enter element"+(i+1));
	     arr[i]= scan.nextInt();
     }
     System.out.println("Entered"+ arr.length+"elements");
     for (int element:arr){
	     System.out.println(element);
     }


   }

}
