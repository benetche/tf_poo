
public class Comorbidades {
	private String comorbidade;
	public Comorbidades(String c) {
		comorbidade=c;
	}
	public void setComorbidade(String c) {
		comorbidade=c;
	}
	public String getComorbidade() {
		return comorbidade;
	}
	
	@Override
	public String toString() {
		String possoVacinar="A lista de comorbidades aceitas no Brasil são:\n\t";
		possoVacinar+="Diabetis Mellitus, Pneumopatias Crônicas Graves, Hipertensão Arterial Resistente, Hipertensão Arterial, Insuficiência Cardíaca, Cor-Pulmonale, Hipertensão Pulmonar";
		possoVacinar+=", Cardiopatia Hipertensiva, Síndromes Coronarianas, Valvopatias, Miocardiopatias, Pericardiopatiasm Doenças da aorta, Doença dos grandes vasos, Fístulas Arteriovenosas";
		possoVacinar+=", Arritmias Cardíacas, Cardiopatias congênita no adulto, Próteses valvares, Dispositivos cardíacos implantados, doença renal crônica, Imunossuprimidos, Anemia falciforme";
		possoVacinar+=", Obesidade mórbida, Síndorme de down e Cirrose hepática.";
		return possoVacinar;
	}
}
