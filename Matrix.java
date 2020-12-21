import java.util.*;
class Matrix{

String name;
int rowcount;
int columncount;
List<String> matrixrowList=new ArrayList();
int[][] matrixPform;

Matrix(String name,int rowcount,int columncount,List matrixrowlList){ //TODO no need for matrixrowList
    this.name=name;
    this.rowcount=rowcount;
    this.columncount=columncount;
    this.matrixrowList=matrixrowlList;
    proccess();
}
public void proccess(){  // populating two dimensional int array with contents of matrix
    matrixPform=new int[rowcount][columncount];
    for(int row=0;row<rowcount;row++){
        System.out.println(" ");
        for(int col=0;col<columncount;col++){
                matrixPform[row][col]=Integer.valueOf(matrixrowList.get(row).toString().split("")[col]);
                System.out.print(matrixPform[row][col]);
        }
    }

}



}