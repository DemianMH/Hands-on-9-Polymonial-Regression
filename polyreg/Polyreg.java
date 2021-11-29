//Gerardo Demian Mora Hernandez
//Hands-on 9: Polymonial Regression
//Simulacion
//29/11/21
package polyreg;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;


public class Polyreg extends Agent {
    double x[] = {0,20,40,60,80,100};//Polynomial Regression Temperatura x
    double y[] = {0.0002,0.0012,0.0060,0.0300,0.0900,0.2700};//Polynomial Regression Temperatura y

    @Override
    public void setup(){
        
        addBehaviour(new MyOneshotBehaviour());
           System.out.println("Agente ejecutado");
    }

    private class MyOneshotBehaviour extends OneShotBehaviour {
    
        @Override 
        public void action(){
        
        //Lamado de los Metodos
        ope2 op = new ope2();
        Beta beta = new Beta();
        ope1 ope1 = new ope1();
       
        int n = x.length; 
        double xy = ope1.Opexpox(x,y);
        double x2y = ope1.Opex2poy(x,y);
        double x1 = op.X1(x);
        double x2 = op.X2(x);
        double x3 = op.X3(x);
        double x4 = op.X4(x);
        double y1 = op.Y1(y);
        
        double ds = beta.Ds(n, x1, x2, x3, x4, y1, xy, x2y); //DS
        double b0 = beta.B0(n, x1, x2, x3, x4, y1, xy, x2y)/ds; //B0
        double b1 = beta.B1(n, x1, x2, x3, x4, y1, xy, x2y)/ds;//B1
        double b2 = beta.B2(n, x1, x2, x3, x4, y1, xy, x2y)/ds;//B2
        
        System.out.println("N: "+n);
        System.out.println("(X*Y): "+xy);
        System.out.println("(X^2)*Y: "+x2y);
        System.out.println("X: "+x1);
        System.out.println("X^2: "+x2);
        System.out.println("X^3: "+x3);
        System.out.println("X^4: "+x4);
        System.out.println("Y: "+y1+"\n");
        System.out.println("DS: "+ds);
        System.out.println("B0: " + b0);
        System.out.println("B1: " + b1);
        System.out.println("B2: " + b2);
        }
        
        @Override
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }

}

//Apuntes------------------------------
//Arreglos
    //double x[]={-3,-2,-1,0,1,2,3};//Cuadratico x
    //double y[]={7.5,3,0.5,1,3,6,14};//Cuadratico x
    
    //double x[] = {50, 50, 50, 70, 70, 70, 80,80,80,90,90,90,100,100,100};//Polynomial Regression x
    //double y[] = {3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5,2.9,2.4,3.0,3.1,2.8,3.3,3.5,3.0};//Polynomial Regression y

    //double x[] = {0,20,40,60,80,100};//Polynomial Regression Temperatura x
    //double y[] = {0.0002,0.0012,0.0060,0.0300,0.0900,0.2700};//Polynomial Regression Temperatura y

//Operaciones
//Quadratic Regression : y=ax^2 + bx + c donde a ≠0
//Polynomial Regression:
// y = a + bx + e
//y = a + b1x + b2^2 + e
//y = a + b1x + b2x^2 +....+ bnx^n
//Polynomial Regression Temperatura:
//y= (b0+b1x+b2x^2 ) + E