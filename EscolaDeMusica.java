/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.estudo.poo;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author pedrolucas.melo
 */
public class EscolaDeMusica {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciar a Orquestra");
        
        InstrumentosMusicais[] banda = new InstrumentosMusicais[4];
        
        banda[0] = new ViolaoExercicio ("Violão Clássico", "Madeira", 6);
        banda[1] = new PianoExercicio ("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new BateriaExercicio ("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new SaxofoneExercicio ("Saxofone", "Latão", "Alto");
        
        EscolaDeMusica escola = new EscolaDeMusica();
        
        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda);
    }
    
    public void apresentar(InstrumentosMusicais[] banda){
        System.out.println("=== A ORQUESTRA VAI COMEÇAR ===\n");
        
        System.out.println("--- Afinação dos Instrumentos --- ");
        for(InstrumentosMusicais instrumento : banda) {
            instrumento.afinar();
        }
        
        System.out.println();
        
        System.out.println("--- Instrumentos começaram a tocar ---");
        for(InstrumentosMusicais instrumento : banda) {
            instrumento.tocar();
        }
        
        System.out.println();
        
        System.out.println("--- Mostrando informações do instrumento ---");
        for(int i = 0; i < banda.length; i++) {
            System.out.println("Instrumento musical " + (i + 1) + " : ");
            banda[i].MostrarInformacoes();
            System.out.println();
        }
    }
    
    public void contarInstrumentosPorTipo(InstrumentosMusicais[] instrumentos) {
        System.out.println("\n=== ESTATÍSTICAS DA ORQUESTRA ===");
        
        int violoes = 0, pianos = 0, baterias = 0, saxofones = 0, outros = 0;
        
        for(InstrumentosMusicais instrumento : instrumentos) {
            if(instrumento instanceof ViolaoExercicio) {
                violoes++;
            } else if (instrumento instanceof PianoExercicio) {
                pianos++;
            } else if (instrumento instanceof BateriaExercicio) {
                baterias++;
            } else if (instrumento instanceof SaxofoneExercicio) {
                saxofones++;
            } else {
                outros++;
            }
        }
        
        System.out.println("Total de instrumentos: " + instrumentos);
        System.out.println("Violões: " + violoes);
        System.out.println("Pianos: " + pianos);
        System.out.println("Baterias: " + baterias);
        System.out.println("Saxofones: " + saxofones);
        System.out.println("Outros: " + outros);
    }
}