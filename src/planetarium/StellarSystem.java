package planetarium;

import java.awt.Point;
import java.util.ArrayList;

public class StellarSystem {
	private ICelestialBody sun;

	public StellarSystem(String name, Point coords, int mass) {
		this.addSun(name, coords, mass);
	}

	public ICelestialBody getSun() {
		return this.sun;
	}

	public boolean addSun(String name, Point coords, int mass) {
		if (this.sun != null) {
			return false;
		} else {
			this.sun = new Sun(name, coords, mass);
			return true;
		}
	}

	public boolean addPlanet(String name, Point coords, int mass) {
		return this.sun.addCelestialBody(new Planet(name, coords, mass));
	}

	public boolean addMoon(String planetName, String moonName, Point coords, int mass) {
		for (ICelestialBody body : this.sun.getChildren()) {
			if (body.getName().equals(planetName)) {
				body.getChildren().add(new Moon(moonName, coords, mass));
				return true;
			}
		}
		return false;
	}

	public ArrayList<ICelestialBody> getAllBodies() {
		ArrayList<ICelestialBody> bodies = new ArrayList<>();
		bodies.add(sun);
		for (ICelestialBody b : sun.getChildren()) {

			bodies.add(b);
			for (ICelestialBody moon : b.getChildren()) {
				bodies.add(moon);
			}
		}
		return bodies;
	}

	public Point getCenterOfMass() {
		Point centerOfMass = new Point();
		int totalMass = 0;
		for (ICelestialBody body : getAllBodies()) {
			Point position = body.getPosition();
			int mass = body.getMass();
			centerOfMass.x += position.x * mass;
			centerOfMass.y += position.y * mass;
			totalMass += mass;
		}
		centerOfMass.x /= totalMass;
		centerOfMass.y /= totalMass;
		return centerOfMass;
	}
}
