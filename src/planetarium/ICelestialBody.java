package planetarium;

import java.awt.Point;
import java.util.ArrayList;

public interface ICelestialBody {
	boolean addCelestialBody(String name, Point coords, int mass);

	boolean addCelestialBody(ICelestialBody body);

	Point getPosition();

	ArrayList<ICelestialBody> getChildren();

	String getName();

	int getMass();
}
