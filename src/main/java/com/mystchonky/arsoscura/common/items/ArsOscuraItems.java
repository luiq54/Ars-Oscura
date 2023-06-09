package com.mystchonky.arsoscura.common.items;

import com.hollingsworth.arsnouveau.api.spell.SpellTier;
import com.mystchonky.arsoscura.ArsOscura;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;

public class ArsOscuraItems {
    private static final Registrate REGISTRATE = ArsOscura.registrate();

    public static final ItemEntry<TomeOfBlood> NOVICE_TOME = REGISTRATE.item("novice_tome_of_blood", (properties) -> new TomeOfBlood(properties, SpellTier.ONE))
            .lang("Novice Tome of Blood")
            .properties((properties -> properties.stacksTo(1)))
            .tab(() -> ArsOscura.ArsOscuraTab)
            .model((ctx, prov) -> {
            })
            .register();

    public static final ItemEntry<TomeOfBlood> APPRENTICE_TOME = REGISTRATE.item("apprentice_tome_of_blood", (properties) -> new TomeOfBlood(properties, SpellTier.TWO))
            .lang("Apprentice Tome of Blood")
            .properties((properties -> properties.stacksTo(1)))
            .tab(() -> ArsOscura.ArsOscuraTab)
            .model((ctx, prov) -> {
            })
            .register();
    public static final ItemEntry<TomeOfBlood> ARCHMAGE_TOME = REGISTRATE.item("archmage_tome_of_blood", (properties) -> new TomeOfBlood(properties, SpellTier.THREE))
            .lang("Archmage Tome of Blood")
            .properties((properties -> properties.stacksTo(1)))
            .tab(() -> ArsOscura.ArsOscuraTab)
            .model((ctx, prov) -> {
            })
            .register();


    public static void register() {
    }
}
