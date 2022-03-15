package classe;

public class DataTeste {

public static void main(String[] args) {
		
	Data d1 = new Data(10,"janeiro",2022);
	
	System.out.println(d1.obterDataFormatada());
	
	Data d2 = new Data();
		
    System.out.println("data: "+d2.obterDataFormatada());
	
    
}

}
