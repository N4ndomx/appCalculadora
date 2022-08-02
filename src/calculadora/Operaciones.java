/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author cflor
 */
public class Operaciones {

    private float numero1;
    //private float numero2;
    private char OperacionAntes;
    //private boolean avisoOpAntes;
    private float resultados;

    public Operaciones() {
        this.resultados = 0;
    }

    public void suma() {
        if (OperacionAntes != '+') {
            resultados = 0;
        }
        resultados = resultados + numero1;

    }

    public void resta() {
        if (OperacionAntes != '-') {
            resultados = 0;
        }
        resultados = -resultados - numero1;
    }

    public void multiplicacion() {
        if (OperacionAntes != 'x') {
            resultados = 1;
        }
        resultados = resultados * numero1;
    }

    public void divicion() {
        if (OperacionAntes != '/') {
            resultados = 1;
        }
        if(resultados == 1){
            resultados = numero1 /resultados;
        }else{
            resultados = resultados /numero1;
        }
        
    }

    public char getOperacionAntes() {
        return OperacionAntes;
    }

    public void setOperacionAntes(char OperacionAntes) {
        this.OperacionAntes = OperacionAntes;
    }

    public float getResultados() {
        return resultados;
    }

    public void setResultados(float resultados) {
        this.resultados = resultados;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

//    public float getNumero2() {
//        return numero2;
//    }
//
//    public void setNumero2(float numero2) {
//        this.numero2 = numero2;
//    }
    public void operacionAnterior() {
        switch (OperacionAntes) {
            case '+':
                suma();
                break;
            case '-':
                resta();
                break;
            case 'x':
                multiplicacion();
                break;
            case '/':
                divicion();
                break;

        }
    }

}
