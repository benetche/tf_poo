import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Idade {
	private static final int CSV_ESTADO = 0;
	private static final int CSV_IDADE = 1;
	private static final int CSV_DATA = 2;
	private static BufferedReader br = criarBufferedReader();
	private static String[][] linhasCsv = lerLinhasCSV();
	private int idade;
	private String estado;

	public Idade(int i, String e) {
		idade=i;
		estado=e;
	}

	private static BufferedReader criarBufferedReader() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./data/datas.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return br;
	}

	private static String[][] lerLinhasCSV() {
		String[][] linhas = new String[57][16];
		String linhaAtual = "";
		try {
			for (int i = 0; (linhaAtual = br.readLine()) != null; i++)
				linhas[i] = linhaAtual.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
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

	private String obterDataVacinacao() {
		for (int i = 0; i < linhasCsv.length; i++) {
			if (linhasCsv[i][CSV_ESTADO].equals(this.estado) && Integer.parseInt(linhasCsv[i][CSV_IDADE]) <= this.idade)
				return linhasCsv[i][CSV_DATA];
		}
		return null;
	}

	@Override
	public String toString() {
		String dataVacinacao = obterDataVacinacao();
	    if (dataVacinacao == null)
	    	return "O estado " + this.estado + " não tem previsão concreta para vacinar pessoas de sua faixa etária :(";
	    LocalDate dataAtual = LocalDate.now();
	    if (dataVacinacao.compareTo(dataAtual.toString()) <= 0)
	    	return "Pessoas com " + this.idade + " anos já podem se vacinar em " + this.estado;
	    String[] dataFormatada = dataVacinacao.split("-");
	    return "Sua vacinação está prevista para " + dataFormatada[2] + "/" + dataFormatada[1] + "/" + dataFormatada[0];
	}
}
