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
        array[index]=0;

    }

}