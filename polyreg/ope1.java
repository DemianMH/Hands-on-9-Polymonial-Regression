package polyreg;
public class ope1 {
public double Opexpox(double n[],double n2[]){
    double res=0;
    for(int i=0;i<n.length;i++){
        res+=(n[i]*n2[i]);
    }
    return res;//Xi*Yi
}
public double Opex2poy(double n[],double n2[]){
    double res=0;
    for(int i=0;i<n.length;i++){
        res+=(Math.pow(n[i],2))*n2[i];
    }
    return res;//X^2*Y
}
}
