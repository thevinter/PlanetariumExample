package planetarium;

import java.awt.Point;
import java.util.ArrayList;

public class Planet extends CelestialBody implements ICelestialBody {
	public Planet(String name, Point coords, int mass) {
		super(name, coords, mass);
	}

	@Override
	public boolean addCelestialBody(ICelestialBody body) {
		if (!(body instanceof Moon)) {
			return false;
		}
		getChildren().add(body);
		return true;
	}

	@Override
	public boolean addCelestialBody(String name, Point coords, int mass) {
		getChildren().add(new Moon(name, coords, mass));
		return true;
	}

	@Override
	public Point getPosition() {
		return this.getCoords();
	}

	@Override
	public int getMass() {
		return this.getMass();
	}

	@Override
	public ArrayList<ICelestialBody> getChildren() {
		return children;
	}

}
