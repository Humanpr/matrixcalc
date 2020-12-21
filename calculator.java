import java.util.*;
public class calculator{

public static Scanner scanner;
public static HashMap<String,Matrix> matrixMap;

    public static void main(String[]args){
        scanner=new Scanner(System.in);
        matrixMap=new HashMap();
        //TODO add command line things
        System.out.println("Matrix calculator v0.");
        commandLine();  //initiates command line 
        
    }
    public static void commandLine(){
        boolean cond=true;
        LOOP:
        while(cond){

        System.out.println(">> Type 1 to add matrix");
        System.out.println(">> Type 2 to show matrices");
        System.out.println(">> Type 3 to EXIT");
        int inputCL=scanner.nextInt();

        switch (inputCL) {
            case 1:          // add new matrix
                addMatrix();
                break;
            case 2:        // show added matrices
                showMatrices();
                break;
            case 3:
                cond=false;
                break;
        
            default:
                break;
        }
         
        }
        

    }

    public static void showMatrices(){  //shows matrices with their name
        System.out.println(matrixMap.size());
        for (String key : matrixMap.keySet()) {
            Matrix matrix = matrixMap.get(key);
            //System.out.println(matrix.matrixPform.toString());
            for(int[]a:matrix.matrixPform){
                System.out.println(" ");
                for(int i:a){
                    System.out.println(i);
                }
            }
            System.out.println("Matrix name is "+matrix.name);
            for(int i=0;i<matrix.matrixrowList.size();i++){
                System.out.println(matrix.matrixrowList.get(i));
            }
            System.out.println("<><><><><><><><><><><><><><><><><><><><>");
        }
        }

    public static void addMatrix(){
        System.out.println("Enter matrice : ");
        scanner=new Scanner(System.in);
        String matrice=scanner.nextLine();
        matriceformatter(matrice); // checks syntax and addes new matrix to matrixmap
    }
    

    public static void matriceformatter(String matriceinput){ 
        boolean cond=true;
        int rowcount=0, columncount=0;
        String[] row=matriceinput.split("/");
        List<String> rowList = new ArrayList<>(); 
        Collections.addAll(rowList, row); 
        rowcount=rowList.size();
        columncount=checkColumn(rowList);
        System.out.println(rowList);
        String matrixName=null;
        LOOP:                                           //TODO seperate matrix adding to map part below
        while(cond){

        System.out.println("Enter matrix name : ");
        matrixName=scanner.nextLine();
        if(matrixMap.keySet().contains(matrixName)){
            System.out.println("Name already in use !");
            continue LOOP;
        }
        break;

        }
       
        matrixMap.put(matrixName,new Matrix(matrixName,rowcount,columncount,rowList)); //creating new matrix and adding to matrixmap
       // System.out.println("Test "+matrixMap.get("V").columncount);
        System.out.println("Added new matrix ");
        
    }
    
    public static int checkColumn(List rowList){ //Checks matrix for any column count mistakes and if evrything ok returns column count
        int columncount=0;
        for(int i=0;i<rowList.size();i++){
            if(columncount==0){
                columncount=rowList.get(i).toString().length();
            }else{
                if(columncount!=rowList.get(i).toString().length()){
                    System.out.println("Incorrect matrix F off !");
                    System.exit(0);
                }
            }
            System.out.println(columncount);

        }
return columncount;
    }

}
