package org.getspout.commons.math;

/**
 * Represents a 3d vector.
 */
public class Vector3 {

	protected double x, y, z;
	
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public Vector3 add(Vector3 that){
		return Vector3.add(this, that);
	}
	
	public Vector3 subtract(Vector3 that){
		return Vector3.subtract(this, that);
	}
	
	public double dot(Vector3 that){
		return Vector3.dot(this, that);
	}
	public Vector3 cross(Vector3 that){
		return Vector3.cross(this, that);
	}
	
	
	public static Vector3 subtract(Vector3 a, Vector3 b){
		return new Vector3(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ() );
	}
	
	public static Vector3 add(Vector3 a, Vector3 b){
		return new Vector3(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ() );
	}
	
	public static double dot(Vector3 a, Vector3 b){
		return (a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() + b.getZ() );
	}
	
	public static Vector3 cross(Vector3 a, Vector3 b){
		return new Vector3( a.getY()*b.getZ() - a.getZ() * b.getY(), a.getZ()*b.getX() - a.getX() * b.getZ(), a.getX() * b.getY() - a.getY() * b.getX());
	}
	
}