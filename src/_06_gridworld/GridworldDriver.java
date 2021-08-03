package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldDriver {
public static void main(String[] args) {
World w = new World ();
w.show();
Bug b = new Bug();
Location loc = new Location (3, 4);
w.add(loc, b);
b.turn();
b.turn();
b.move();


Bug b2 = new Bug();
Location loc2 = new Location (8, 3);
w.add(loc2, b2);




Flower f = new Flower();
Location loc3 = new Location (6, 4);
w.add(loc3, f);


}

}
