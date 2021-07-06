
public class Idade {
	private int idade;
	private String estado;
	
	public Idade(int i, String e) {
		idade=i;
		estado=e;
	}
	
	public void setIdade(int i) {
		idade=i;
	}
	public int getIdade() {
		return idade;
	}
	public void setEstado(String e) {
		estado=e;
	}
	public String getEstado() {
		return estado;
	}
	
	@Override
	public String toString() {
		String data="";
		if(estado.equals("SP")) {
			if(idade>=40) {
				data="Pessoas com mais de 40 anos já podem se vacinar em São Paulo\n";
			}
			else if(idade>=35) {
				data="Pessoas com mais de 35 a 39 anos podem se vacinar de 15/7 a 29/7\n";
			}
			else if(idade>=30) {
				data="Pessoas com mais de 30 a 34 anos podem se vacinar de 30/7 a 15/8\n";
			}
			else if(idade>=25) {
				data="Pessoas com mais de 25 a 29 anos podem se vacinar de 16/8 a 31/8\n";
			}
			else if(idade>=18) {
				data="Pessoas com mais de 18 a 24 anos podem se vacinar de 1/9 a 15/9\n";
			}
			else {
				data="Pessoas com menos de 18 ainda não tem data marcada para se vacinarem";
			}
		}
		else if(estado.equals("MG")) {
			if(idade>=55) {
				data="Pessoas com mais de 55 anos já podem se vacinar em Minas Gerais\n";
			}
			else if(idade>=50) {
				data="Pessoas com mais de 50 a 54 anos podem se vacinar em Julho\n";
			}
			else if(idade>=35) {
				data="Pessoas com mais de 35 a 49 anos podem se vacinar em Agosto\n";
			}
			else if(idade>=25) {
				data="Pessoas com mais de 25 a 34 anos podem se vacinar em Setembro\n";
			}
			else if(idade>=18) {
				data="Pessoas com mais de 18 a 24 anos podem se vacinar em Outubro\n";
			}
			else {
				data="Pessoas com menos de 18 ainda não tem data marcada para se vacinarem";
			}
		}
		else if(estado.equals("BH")) {
			if(idade>=55) {
				data="Pessoas com mais de 55 anos já podem se vacinar em Belo Horizonte\n";
			}
			else if(idade>=50) {
				data="Pessoas com mais de 50 a 54 anos podem se vacinar em Julho\n";
			}
			else if(idade>=35) {
				data="Pessoas com mais de 35 a 49 anos podem se vacinar em Agosto\n";
			}
			else if(idade>=25) {
				data="Pessoas com mais de 25 a 34 anos podem se vacinar em Setembro\n";
			}
			else if(idade>=18) {
				data="Pessoas com mais de 18 a 24 anos podem se vacinar em Outubro\n";
			}
			else {
				data="Pessoas com menos de 18 ainda não tem data marcada para se vacinarem";
			}
		}
		else if(estado.equals("RJ")) {
			if(idade>=51) {
				data="Pessoas com mais de 51 anos já podem se vacinar no estado no Rio de Janeiro\n";
			}
			else if(idade>=42) {
				data="Pessoas com mais de 42 a 50 anos podem se vacinar em Julho\n";
			}
			else if(idade>=33) {
				data="Pessoas com mais de 33 a 41 anos podem se vacinar em Agosto\n";
			}
			else if(idade>=25) {
				data="Pessoas com mais de 25 a 32 anos podem se vacinar em Setembro\n";
			}
			else if(idade>=18) {
				data="Pessoas com mais de 18 a 24 anos podem se vacinar em Outubro\n";
			}
			else {
				data="Pessoas com menos de 18 ainda não tem data marcada para se vacinarem";
			}
		}
		else {
			data="Estado foi digitado incorretamente";
		}
		return data;
	}
}
