package com.laytonsmith.abstraction.bukkit.entities;

import com.laytonsmith.abstraction.MCFireball;
import com.laytonsmith.abstraction.MVector3D;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.util.Vector;

/**
 * 
 * @author jb_aero
 */
public class BukkitMCFireball extends BukkitMCProjectile implements MCFireball {

	Fireball f;

	public BukkitMCFireball(Entity be) {
		super(be);
		f = (Fireball) be;
	}

	@Override
	public MVector3D getDirection() {
		return new MVector3D(f.getDirection().getX(), f.getDirection().getY(), f.getDirection().getZ());
	}

	@Override
	public void setDirection(MVector3D vector) {
		f.setDirection(new Vector(vector.x, vector.y, vector.z));
	}

}