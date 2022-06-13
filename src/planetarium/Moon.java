package planetarium;

import java.awt.Point;
import java.util.ArrayList;

public class Moon extends CelestialBody implements ICelestialBody {

	public Moon(String name, Point coords, int mass) {
		super(name, coords, mass);
	}

	@Override
	public boolean addCelestialBody(String name, Point coords, int mass) {
		return false;
	}

	@Override
	public boolean addCelestialBody(ICelestialBody body) {
		return false;

	}

	public ArrayList<ICelestialBody> getChildren() {
		return null;
	}

	@Override
	public Point getPosition() {
		return getCoords();

	}

}
