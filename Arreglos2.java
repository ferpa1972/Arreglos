public class Arreglos2 {
    public static void main(String[] args) {
        double [] ejer = new double[20];
        double[] par = new double[20];
        double[] impar = new double[20];
        double num;

        for(int i=0;i< ejer.length; i++){
            ejer[i] = Math.random(2);
        } 
        for(int i=0;i< ejer.length; i++){
            num = ejer[i] % 2;
            if( num == 0){
                for(int j=0;i< par.length; j++){
                    par[j] = ejer[i];
                }
                }else{
                    
                    impar[i] = ejer[i];
            }
        }
        System.out.println("Pares");
        for(int i= 0;i < par.length; i++){
        System.out.println(par[i]);}
        System.out.println(" ");
        System.out.println("Impares");
        for(int i= 0;i < impar.length; i++){
            System.out.println(impar[i]);}
    }
}
