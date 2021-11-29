package polyreg;
public class ope2 {
public double X1(double numeros[]){
     double res=0;
    for(int i=0;i<numeros.length;i++){
        res+=numeros[i];  
      }  
  return res; //Xi 
} 

public double X2(double numeros[]){
    double res=0;
    for(int i=0;i<numeros.length;i++){
        res+=Math.pow(numeros[i],2);
    }
    return res;//X^2
}

public double X3(double numeros[]){
    double res=0;
    for(int i=0;i<numeros.length;i++){
        res+=Math.pow(numeros[i],3);
    }
    return res;//X^3
}
public double X4(double numeros[]){
    double res=0;
    for(int i=0;i<numeros.length;i++){
        res+=Math.pow(numeros[i],4);
    }
    return res;//X^4
}


public double Y1(double numeros[]){
    double res=0;
    for(int i=0;i<numeros.length;i++){
        res+=numeros[i];    
    }
    return res;//Yi
}   
}
