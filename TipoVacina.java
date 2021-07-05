
public class TipoVacina {	
	private String nomeVacina;
	
	public TipoVacina(String nome) {
		nomeVacina=nome;
	}
	public void setNomeVacina(String nome) {
		nomeVacina=nome;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	
	@Override
	public String toString() {
		String dados="";
		if(nomeVacina.toLowerCase().equals("pfizer") || nomeVacina.toLowerCase().equals("biontech")) {
			dados+="Voce deve tomar sua segunda dose 3 meses depois da primeira\n";
			dados+="Essaa vacina contra a covid-19 reduziu as infecções sintomáticas pela doença em 97% e diminuiu as assintomáticas em 86%.\n";
		}
		else if(nomeVacina.toLowerCase().equals("coronavac") || nomeVacina.toLowerCase().equals("sinovac") || nomeVacina.toLowerCase().equals("butantan")) {
			dados+="Voce deve tomar sua segunda dose 14 a 24 dias depois da primeira\n";
			dados+="A eficácia geral apresentada pelo Instituto Butantan para a CoronaVac nos testes brasileiros foi de 50,38% e a vacina mostrou-se 100% eficaz nos casos moderados e graves e 78% eficaz nos casos leves da covid-19\n";
		}
		else if(nomeVacina.toLowerCase().equals("astrazeneca") || nomeVacina.toLowerCase().equals("oxford") || nomeVacina.toLowerCase().equals("fiocruz")) {
			dados+="Voce deve tomar sua segunda dose 3 meses depois da primeira\n";
			dados+="A eficácia geral apresentada pela AstraZeneca para a vacina nos testes foi de cerca de 70% (entre 62% e 90%), após a aplicação das duas doses.\n";	
		}

		else if(nomeVacina.toLowerCase().equals("janssen") || nomeVacina.toLowerCase().equals("johnson") || nomeVacina.toLowerCase().equals("johnson & johnson")) {
			dados+="Essa vacina não necessita segunda dose\n";
			dados+="Com uma dose essa vacina demonstrou eficácia de 66% contra os casos moderados e graves da Covid-19, eficácia de 85,4% apenas contra os casos graves"
					+ "e 100% de proteção contra hospitalização e morte por Covid depois de 28 dias da aplicação\n";			
		}
		return dados;
	}
}
