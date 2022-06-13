package planetarium;

import java.awt.Point;
import java.util.ArrayList;

public class CelestialBody {
	private Point coords;
	private int mass;
	private String name;
	private int id;
	protected ArrayList<ICelestialBody> children;

	public static int public_id = 0;

	public CelestialBody(String name, Point coords, int mass) {
		this.coords = coords;
		this.name = name;
		this.mass = mass;
		this.id = CelestialBody.public_id++;
		this.children = new ArrayList<>();
	}

	public Point getCoords() {
		return this.coords;
	}

	public int getMass() {
		return this.mass;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}
}
