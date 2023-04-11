package area;

import java.util.List;

import general.Pokemon;

public class Pokecenter {

	private final String name;

	public Pokecenter(String name) {
		this.name = name;
	}

	// TODO: US-PKM-O-12
	public void healPokemon(List<Pokemon> pokemonToHeal) {
		for(Pokemon p : pokemonToHeal) {
			p.setCurrentHp(p.getMaxHp());
			p.status();
		}
	}
}
