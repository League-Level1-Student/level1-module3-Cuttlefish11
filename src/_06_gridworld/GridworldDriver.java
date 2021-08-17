package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldDriver {
public static void main(String[] args) {
World w = new World ();
w.show();
//Bug b = new Bug();
//Location loc = new Location (3, 4);
//w.add(loc, b);
//b.turn();
//b.turn();






for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
	
Flower f = new Flower();
Location loc3 = new Location (i, j);
w.add(loc3, f);
}

}


}

}
