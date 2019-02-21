package Modelo;




public class Roland_Banks extends Investigador {

 
     
       public Roland_Banks(){
           
        this.tipo="Guardián";
        this.voluntad=3;
        this.intelecto=3;
        this.combate=4;
        this.agilidad=2;
        this.vida=9;
        this.numeroPistas=0;
        this.numeroRecursos=5;
        //this.lugar=new Salita();
        
        
    }
    @Override
    public int efectoEstrella() {
       // Lugar l=getLugar();
//        return l.getPistas();
        return 1;
       
    }
    public String toString(){
        return "tipo "+ this.getTipo()+ " voluntad "+this.getVoluntad() + " intelecto " +this.getIntelecto()+ " combate "+this.getCombate() + " agilidad " +this.getAgilidad()+
                " vida "+this.getVida() + " numero de pistas " + this.getNumeroPistas() + " recursos " +this.getNumeroRecursos(); //+"lugar "+this.lugar;
    }
}
