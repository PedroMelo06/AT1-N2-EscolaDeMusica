/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author pedrolucas.melo
 */
public class SaxofoneExercicio extends InstrumentosMusicais {
    private String tipo;
    
    public SaxofoneExercicio(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + super.getNome() + " " + tipo + "...");
        System.out.println("Melodia envolbente de saxofone ");
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a embucadura e as chaves do saxofone. ");
        
    }    
    @Override
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Tipo: " + tipo);
       
    }
    
    public String getTipo() {
        return tipo;
    }
}
