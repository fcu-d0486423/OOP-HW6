package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {

	public static Player fight(Player p1,Player p2){
		Random rand = new Random();
		int win1=0,win2=0,i;
		
		Pokemon[] po1 = p1.POKEMON();
		Pokemon[] po2 = p2.POKEMON();
		
		for(i=0;i<3;i++)
		{
			if(po1[i].TYPE()==PokemonType.FIRE && po2[i].TYPE()==PokemonType.GRASS)
				win1++;
			else if(po2[i].TYPE()==PokemonType.FIRE && po1[i].TYPE()==PokemonType.GRASS)
				win2++;
			else if(po1[i].TYPE()==PokemonType.GRASS && po2[i].TYPE()==PokemonType.WATER)
				win1++;
			else if(po2[i].TYPE()==PokemonType.GRASS && po1[i].TYPE()==PokemonType.WATER)
				win2++;
			else if(po1[i].TYPE()==PokemonType.WATER && po2[i].TYPE()==PokemonType.FIRE)
				win1++;
			else if(po2[i].TYPE()==PokemonType.WATER && po1[i].TYPE()==PokemonType.FIRE)
				win2++;
			else if(po1[i].TYPE()==po2[i].TYPE()){
				if(po1[i].CP()>po2[i].CP())
					win1++;
				else if(po1[i].CP()<po2[i].CP())
					win2++;
				else if(po1[i].CP()==po2[i].CP()){
					int  n = rand.nextInt(2) + 1;
					if(n==1)
						win1++;
					else
						win2++;
				}
			}
		}
		
		if(win1>=2){
			int level=p1.LEVEL();
			level++;
			p1.LEVEL(level);
			System.out.println("Winner is ["+p1.PLAYERNAME()+"], and his/her level becomes ["+p1.LEVEL()+"]");
			return p1;
		}else if(win2>=2){
			int level=p2.LEVEL();
			level++;
			p2.LEVEL(level);
			System.out.println("Winner is ["+p2.PLAYERNAME()+"], and his/her level becomes ["+ p2.LEVEL()+"]");
			return p2;
		}
		return p2;

	}

}
