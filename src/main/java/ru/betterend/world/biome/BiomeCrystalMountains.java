package ru.betterend.world.biome;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import ru.betterend.registry.BlockRegistry;
import ru.betterend.registry.FeatureRegistry;
import ru.betterend.registry.SoundRegistry;
import ru.betterend.registry.StructureRegistry;

public class BiomeCrystalMountains extends EndBiome {
	public BiomeCrystalMountains() {
		super(new BiomeDefinition("crystal_mountains")
				.setPlantsColor(255, 133, 211)
				.setSurface(BlockRegistry.CRYSTAL_MOSS, Blocks.END_STONE)
				.setMusic(SoundRegistry.MUSIC_CRYSTAL_MOUNTAINS)
				.addStructureFeature(StructureRegistry.MOUNTAIN)
				.addFeature(FeatureRegistry.ROUND_CAVE)
				.addMobSpawn(EntityType.ENDERMAN, 50, 1, 2));
	}
}
