package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private Pokemon[] pokemons;
	private int level=1;
	
	public String PLAYERNAME(){
		return playerName;
	}

	public void PLAYERNAME(String playerName)
	{
		this.playerName = playerName;
	}

	public Pokemon[] POKEMON()
	{
		return pokemons;
	}

	public void POKEMON(Pokemon[] pokemons)
	{
		this.pokemons = pokemons;
	}

	public int LEVEL()
	{
		return level;
	}

	public void LEVEL(int level)
	{
		this.level = level;
	}

	public Player(String playerName)
	{
		this.playerName = playerName;
		this.level = 1;
	}
	
}