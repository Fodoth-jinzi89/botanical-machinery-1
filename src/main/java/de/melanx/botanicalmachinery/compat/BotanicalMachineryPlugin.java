package de.melanx.botanicalmachinery.compat;

import de.melanx.botanicalmachinery.BotanicalMachinery;
import de.melanx.botanicalmachinery.blocks.screens.ScreenAlfheimMarket;
import de.melanx.botanicalmachinery.blocks.screens.ScreenMechanicalDaisy;
import de.melanx.botanicalmachinery.blocks.screens.ScreenMechanicalManaPool;
import de.melanx.botanicalmachinery.blocks.screens.ScreenMechanicalRunicAltar;
import de.melanx.botanicalmachinery.core.Registration;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import vazkii.botania.client.integration.jei.elventrade.ElvenTradeRecipeCategory;
import vazkii.botania.client.integration.jei.manapool.ManaPoolRecipeCategory;
import vazkii.botania.client.integration.jei.puredaisy.PureDaisyRecipeCategory;
import vazkii.botania.client.integration.jei.runicaltar.RunicAltarRecipeCategory;

@JeiPlugin
public class BotanicalMachineryPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(BotanicalMachinery.MODID, "jei_plugin");
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(ScreenAlfheimMarket.class, 77, 36, 22, 15, ElvenTradeRecipeCategory.UID);
        registration.addRecipeClickArea(ScreenMechanicalManaPool.class, 77, 36, 22, 15, ManaPoolRecipeCategory.UID);
        registration.addRecipeClickArea(ScreenMechanicalRunicAltar.class, 87, 65, 22, 15, RunicAltarRecipeCategory.UID);
        registration.addRecipeClickArea(ScreenMechanicalDaisy.class, 24, 16, 24, 48, PureDaisyRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(Registration.BLOCK_ALFHEIM_MARKET.get()), ElvenTradeRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(Registration.BLOCK_MECHANICAL_MANA_POOL.get()), ManaPoolRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(Registration.BLOCK_MECHANICAL_RUNIC_ALTAR.get()), RunicAltarRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(Registration.BLOCK_MECHANICAL_DAISY.get()), PureDaisyRecipeCategory.UID);
    }
}
