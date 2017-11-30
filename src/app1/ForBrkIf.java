package app1;

public class ForBrkIf {  
public static void main(String[] args) {  
            for(int i=1;i<=5;i++){    
                    for(int j=1;j<=10;j++){    
                        if(i==5&&j==5){    
                            break;    
                        }    
                        System.out.println(i+""+j);    
                    }    
            }    
}  
}  