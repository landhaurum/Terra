package com.dfsek.terra.api.generic.world.vector;

import com.dfsek.terra.api.generic.world.World;
import com.dfsek.terra.api.generic.world.block.Block;

public class Location implements Cloneable {
    private final World world;
    private final Vector3 vector;

    public Location(World w, double x, double y, double z) {
        this.world = w;
        this.vector = new Vector3(x, y, z);
    }

    public Location(World w, Vector3 vector) {
        this.world = w;
        this.vector = vector;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new Error(e);
        }
    }

    public int getBlockX() {
        return vector.getBlockX();
    }

    public int getBlockY() {
        return vector.getBlockY();
    }

    public int getBlockZ() {
        return vector.getBlockZ();
    }

    public double getY() {
        return vector.getY();
    }

    public Location setY(double y) {
        vector.setY(y);
        return this;
    }

    public double getX() {
        return vector.getX();
    }

    public Location setX(double x) {
        vector.setX(x);
        return this;
    }

    public double getZ() {
        return vector.getZ();
    }

    public Location setZ(double z) {
        vector.setZ(z);
        return this;
    }

    public World getWorld() {
        return world;
    }

    public Location add(double x, double y, double z) {
        vector.add(x, y, z);
        return this;
    }

    public Block getBlock() {
        return world.getBlockAt(this);
    }
}
