package classe;
//01 01 1970
public class Data {

	int dia;
	String mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = "janeiro";
		ano = 1970;
		
	}
	
    Data(int dia, String mes, int ano){
    	this.dia = dia;
    	this.mes = mes;
    	this.ano = ano;
    }
	
	
   String obterDataFormatada (){
	  return String.format("%d/%s/%d",dia,mes,ano);
	   
   }

}
