
package Controlador;
import Modelo.*;

public class Op extends Reloj {
    public Op(int hora, int min, int seg){
        this.hora=hora;
        this.min=min;
        this.seg=seg;
    }
    
    public String printH(){
        String HoraF=hora+":"+min+":"+seg;
        return HoraF;
        }
    public void Sseg(){
        seg=seg+1;
        if(seg==60){
            seg=0;
            min++;
        }
    }
    public void Smin(){
        if(min>=60){
            min=0;
            hora++;
        }
    }
    public void Shora(){
        if(hora>=24){
         hora=0; 
        }
    }
}

