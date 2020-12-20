import java.util.*;
public class calculator{

public static Scaner scanner;
    public static void main(String[]args){
        scanner=new Scanner(System.in);
        //TODO add command line things
        System.out.println("Matrix calculator v0.");
        System.out.println("Type 1 to add Matrix");
        System.out.println("Type 2 to + matrices");
        int inputCL=scanner.nextInt();

        switch (inputCL) {
            case 1:
                addMatrix();
                break;
            case 2:

            break;
        
            default:
                break;
        }
    }
    public static void addMatrxi(){
        System.out.println("Enter matrice : ");
        String matrice=scanner.nextLine();
        System.out.println(matriceformatter(matrice));
    }

    public static String matriceformatter(String matriceinput){ 
        int rowcount=0, columncount=0;
        String[] row=matriceinput.split("/");
        List<String> rowList = new ArrayList<>(); 
        Collections.addAll(rowList, row); 
        rowcount=rowList.size();
        columncount=checkColumn(rowList);
        System.out.println(rowList);
        
        return "Aww";



    }
    
    public static int checkColumn(List rowList){ //Checks matrix for any column count mistakes and if evrything ok returns column count
        int columncount=0;
        for(int i=0;i<rowList.size();i++){
            if(columncount==0){
                columncount=rowList.get(i).toString().length();
            }else{
                if(columncount!=rowList.get(i).toString().length()){
                    System.out.println("Incorrect matrix ");
                    System.exit(0);
                }
            }
            System.out.println(columncount);

        }
return columncount;
    }

}
