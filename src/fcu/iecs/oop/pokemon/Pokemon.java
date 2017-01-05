package fcu.iecs.oop.pokemon;

public class Pokemon {

	private final String name;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String name, PokemonType type, int cp)
	{
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	
	public int CP()
	{
		return cp;
	}
	
	public void CP(int cp)
	{
		this.cp = cp;
	}
	
	public String NAME()
	{
		return name;
	}
	
	public PokemonType TYPE()
	{
		return type;
	}
}

