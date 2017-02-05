package com.jarhax.sevtechores.api.ores;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;

public class OreTier {

	private final String tierId;

	private final List<ResourceLocation> ores;

	public OreTier (String id) {

		this.tierId = id;
		this.ores = new ArrayList<>();
	}

	public OreTier (String tierId, ArrayList<ResourceLocation> ores) {
		this.tierId = tierId;
		this.ores = ores;
	}

	public String getTierId () {

		return this.tierId;
	}
}
