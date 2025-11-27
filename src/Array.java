import java.util.Scanner;

public class Array {
    Scanner scanner =new Scanner(System.in);


    public void Traversal(int []array){
        for (int i=0; i<array.length;i++)
            System.out.println("Index["+i+"] = "+array[i]);

    }
    public void Traversal2(int []array){
        for (int e:array)
            System.out.println(e);

    }

    public void R_Traversal(int []array){
        for (int i=array.length-1; i>=0;i--)
            System.out.println("Index["+i+"] = "+array[i]);

    }


    public void input(int[]array){
        System.out.println("enter  "+array.length+ " numbers:");
        for(int i=0; i<array.length;i++)
            array[i]=scanner.nextInt();
    }
    public  void update(int []array, int index, int nvalue){
        array[index]=nvalue;

    }
    public  void delete(int []array, int index){
      if(index<0 || index>=array.length)
          System.out.println("index doesnt exists");
      else
          array[index]=0;

      }

public void ShiftLeft_Delete(int []array,int index){

   for(int i=index;i<array.length-1;i++)
       array[i]=array[i+1];
   array[array.length-1]=Integer.MIN_VALUE;

}

public int LinearSearch(int[]array , int Svalue){

        for(int i=0;i<array.length;i++){
            if(Svalue==array[i])
                return i;}

        return -1;


}


    }

