package planetarium;

import java.awt.Point;
import java.util.ArrayList;

public class Sun extends CelestialBody implements ICelestialBody {
	public Sun(String name, Point coords, int mass) {
		super(name, coords, mass);
	}

	@Override
	public boolean addCelestialBody(String name, Point coords, int mass) {
		getChildren().add(new Planet(name, coords, mass));
		return true;
	}

	@Override
	public boolean addCelestialBody(ICelestialBody body) {
		if (!(body instanceof Planet)) {
			return false;
		}
		getChildren().add(body);
		return true;
	}

	@Override
	public Point getPosition() {
		return getCoords();
	}

	@Override
	public int getMass() {
		return getMass();
	}

	@Override
	public ArrayList<ICelestialBody> getChildren() {
		return this.children;
	}

}
