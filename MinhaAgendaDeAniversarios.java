package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	private ArrayList<Aniversariante> aniversariantes;

	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = new ArrayList<>();
	}

	public ArrayList<Aniversariante> getAniversariantes() {
		return aniversariantes;
	}

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		aniversariantes.add(new Aniversariante(nome, dia, mes));
	}

	@Override
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
		ArrayList<String> nomesDoDia = new ArrayList<>();
		for (Aniversariante aniversariante : aniversariantes) {
			if (aniversariante.getDataAniversario() != null
					&& aniversariante.getDataAniversario().getDia() == dia
					&& aniversariante.getDataAniversario().getMes() == mes) {
				nomesDoDia.add(aniversariante.getNome());
			}
		}
		return nomesDoDia;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) {
		for (int i = 0; i < aniversariantes.size(); i++) {
			Aniversariante atual = aniversariantes.get(i);
			if (atual.getNome().equals(nomeAniversariante)) {
				aniversariantes.remove(i);
				i--;
			}
		}
	}
}
