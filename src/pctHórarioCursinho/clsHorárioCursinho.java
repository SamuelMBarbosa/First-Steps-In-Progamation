package pctHórarioCursinho;

import java.util.Scanner;

public class clsHorárioCursinho {

	public static void main(String[] args){
		while(true){
			Scanner sc = new Scanner(System.in);		
		        String seg, ter, qua, qui, sex;
		        seg = "\nMatutino:\nBiologia (Jaqueline)\nFísica (Eduardo)\nIntervalo\nGeografia (França)\nFísica (Eduardo)\nIntervalo\nMatemática (Valtencir)\nGeografia (França)\n\nVespertino:\nArte (Pedro)\nHistória (Gibran)\nFilosofia (Pedro)\nIntervalo\nQuímica (Henrique)\nMatemática (Valtencir)\n";
		        // não mexe nessa linha senão vai dar merda //
		        ter = "\nMatutino:\nBiologia (Kamilla)\nFísica (Humberto)\nIntervalo\nFísica (Humberto)\nBiologia (Kamilla)\nIntervalo\nMatemática (Valtencir)\nPort/Red (Maroja)\n\nVespertino:\nInglês/Espanhol (Silvana)\nGeografia (França)\nHistória (Gibran)\nIntervalo\nQuímica (Henrique)\nGeografia (França)\\n";
		        qua = "\nMatutino:\nBiologia (Jaqueline)\nPort/Red (Maroja)\nIntervalo\nHistória (Gibran)\nBiologia (Jaqueline)\nIntervalo\nHistória (Gibran)\nQuímica (Henrique)\n\nVespertino:\nPlantão de dúvidas\\n";
		        qui = "\nMatutino:\nPort/Red (Maroja)\nQuímica (Henrique)\nIntervalo\nMatemática (Valtencir)\nFísica (Humberto)\nIntervalo\nPort/Red (Maroja)\nQuímica (Henrique)\n\nVespertino:\nMat. Básica/Atualidades\nMat. Básica/Atualidades\nAula Variável\nIntervalo\nAula Variável\\n";
		        sex = "\nMatutino:\nBiologia (Kamilla)\nSociologia (Gibran)\nIntervalo\nLiteratura (Mariana)\nMatemática (Valtencir)\nIntervalo\nMatemática (Valtencir)\nLiteratura (Mariana)\n\nVespertino:\nSimulados\n";
		        
		        System.out.println("Olá! Você quer saber o horário de qual dia de curso?");
		        String resposta = sc.nextLine();
		        
		        switch(resposta){
		            case "Segunda":
		            System.out.println(seg);
		            break;
		            case "segunda":
		            System.out.println(seg);
		            break;
		            case "Terça":
		            System.out.println(ter);
		            break;
		            case "Terca":
		            System.out.println(ter);
		            break;
		            case "terça":
		            System.out.println(ter);
		            break;
		            case "terca":
		            System.out.println(ter);
		            break;
		            case "Quarta":
		            System.out.println(qua);
		            break;
		            case "quarta":
		            System.out.println(qua);
		            break;
		            case "Quinta":
		            System.out.println(qui);
		            break;
		            case "quinta":
		            System.out.println(qui);
		            break;
		            case "Sexta":
		            System.out.println(sex);
		            break;
		            case "sexta":
		            System.out.println(sex);
		            break;
		            default:
		            System.out.println("Opção inválida, tente verificar se não houve erro ortográfico\n");
		            break;
		        }
        }
	}	    	
}
