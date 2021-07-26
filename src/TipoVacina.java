
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
			dados+=" <p align=\"justify\"> &emsp A vacina da Pfizer e da BioNTech contra a COVID-19 é baseada no RNA mensageiro, ou mRNA, que ajuda o organismo a gerar a imunidade contra o coronavírus, especificamente o vírus SARS-CoV-2.<br>";
			dados+="&emsp A ideia é que o mRNA sintético dê as instruções ao organismo para a produção de proteínas encontradas na superfície do vírus. Uma vez produzidas no organismo, essas proteínas (ou antígenos) estimulam a resposta do sistema imune resultando, assim, potencialmente em proteção para o indivíduo que recebeu a vacina.<br>";
			dados+="&emsp Você deve tomar sua segunda dose 3 meses depois da primeira.<br>";
			dados+="&emsp Essa vacina contra a covid-19 reduziu as infecções sintomáticas pela doença em 97% e diminuiu as assintomáticas em 86%.<br>";
			dados+="&emsp Link da bula para pacientes: https://www.pfizer.com.br/sites/default/files/inline-files/Comirnaty_Paciente_10.pdf<br>";
			dados+="&emsp Link da bula para profissionais da saúde: https://www.pfizer.com.br/sites/default/files/inline-files/Comirnaty_Profissional_de_Saude_10.pdf</p>";
		}
		else if(nomeVacina.toLowerCase().equals("coronavac") || nomeVacina.toLowerCase().equals("sinovac") || nomeVacina.toLowerCase().equals("butantan")) {
			dados+=" <p align=\"justify\"> &emsp Produzida pelo Instituto Butantan em parceria com o laboratório Sinovac, a CoronaVac funciona com vírus inativados: eles são tratados quimicamente para não serem capazes de desencadear a doença, mas mesmo assim são reconhecidos pelo organismo.<br>";
			dados+="&emsp Deste modo, o sistema imunológico produz células de defesa – os anticorpos – que estarão prontos para atacar os vírus no caso de uma infecção real, evitando que a doença se desenvolva.<br>";
			dados+="&emsp Você deve tomar sua segunda dose 14 a 24 dias depois da primeira.<br>";
			dados+="&emsp A eficácia geral apresentada pelo Instituto Butantan para a CoronaVac nos testes brasileiros foi de 50,38% e a vacina mostrou-se 100% eficaz nos casos moderados e graves e 78% eficaz nos casos leves da covid-19.<br>";
			dados+="&emsp Link da bula para pacientes: https://images.jota.info/wp-content/uploads/2021/01/bula-paciente-vacina-adsorvida-covid-19-inativada-2.pdf<br>";
			dados+="&emsp Link da bula para profissionais da saúde: https://images.jota.info/wp-content/uploads/2021/01/bula-ps-vacina-adsorvida-covid-19-inativada.pdf</p>";
		}
		else if(nomeVacina.toLowerCase().equals("astrazeneca") || nomeVacina.toLowerCase().equals("oxford") || nomeVacina.toLowerCase().equals("fiocruz")) {
			dados+=" <p align=\"justify\">&emsp As doses do imunizante, desenvolvido pela Universidade de Oxford, são produzidas Bio-Manguinhos/Fiocruz, e têm uso emergencial autorizado pela Agência Nacional de Vigilância Sanitária (Anvisa).<br>";
			dados+="&emsp A proteção é baseada no adenovírus (grupo de vírus que causam problemas respiratórios, como resfriados) enfraquecido de um chimpazé. A opção também contém a sequência genética das espículas do SARS-CoV-2.<br>";
			dados+="&emsp Você deve tomar sua segunda dose 3 meses depois da primeira.<br>";
			dados+="&emsp A eficácia geral apresentada pela AstraZeneca para a vacina nos testes foi de cerca de 70% (entre 62% e 90%), após a aplicação das duas doses.<br>";
			dados+="&emsp Link da bula para pacientes: https://www.bio.fiocruz.br/images/bula-vacina-covid-19-recombinante-vp-002-27-01-2021.pdf<br>";
			dados+="&emsp Link da bula para profissionais da saúde: https://www.gov.br/anvisa/pt-br/assuntos/noticias-anvisa/2021/bulas-saiba-mais-sobre-as-vacinas-autorizadas-para-uso-emergencial/bula-vacina-covid-19-recombinante_vps_001_21-01-2021.pdf</p>";
		}

		else if(nomeVacina.toLowerCase().equals("janssen") || nomeVacina.toLowerCase().equals("johnson") || nomeVacina.toLowerCase().equals("johnson & johnson")) {
			dados+=" <p align=\"justify\"> &emsp A vacina da Janssen, da farmacêutica Johnson & Johnson, é uma vacina recombinante de vetor viral, utilizando adenovírus humano não replicante (sorotipo 26) que expressa a proteína S do SARS-CoV-2.<br>";
			dados+="&emsp Essa vacina não necessita segunda dose.<br>";
			dados+="&emsp Com uma dose essa vacina demonstrou eficácia de 66% contra os casos moderados e graves da Covid-19, eficácia de 85,4% apenas contra os casos graves e 100% de proteção contra hospitalização e morte por Covid depois de 28 dias da aplicação.<br>";	
			dados+="&emsp Link da bula para pacientes: https://www.janssen.com/brasil/sites/www_janssen_com_brazil/files/prod_files/live/vacina_covid-19_recombinante_pub_vp.pdf</p>";
		}
		else {
			dados="Essa vacina não está sendo aplicada no Brasil.";
		}
		return dados;
	}
}
