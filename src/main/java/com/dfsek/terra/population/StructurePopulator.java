package com.dfsek.terra.population;

import com.dfsek.terra.Terra;
import com.dfsek.terra.TerraProfiler;
import com.dfsek.terra.structure.GaeaStructure;
import com.dfsek.terra.structure.StructureSpawn;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.jetbrains.annotations.NotNull;
import org.polydev.gaea.population.GaeaBlockPopulator;
import org.polydev.gaea.profiler.ProfileFuture;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class StructurePopulator extends BlockPopulator {
    StructureSpawn spawnTest = new StructureSpawn(250, 250);
    GaeaStructure struc = GaeaStructure.load(new File(Terra.getInstance().getDataFolder() + File.separator + "export" + File.separator + "structures", "demo2.tstructure"));
    double horizontal = struc.getStructureInfo().getMaxHorizontal()/16D + 1D;

    public StructurePopulator() throws IOException {
    }

    @Override
    public void populate(@NotNull World world, @NotNull Random random, @NotNull Chunk chunk) {
        try(ProfileFuture ignored = TerraProfiler.fromWorld(world).measure("StructureTime")) {

        }
    }
}