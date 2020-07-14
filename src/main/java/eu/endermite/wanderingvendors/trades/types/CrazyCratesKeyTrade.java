package eu.endermite.wanderingvendors.trades.types;

import eu.endermite.wanderingvendors.WanderingVendors;
import me.badbones69.crazycrates.api.CrazyCrates;
import me.badbones69.crazycrates.api.objects.Crate;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

public class CrazyCratesKeyTrade {

    private static final Configuration config = WanderingVendors.getPlugin().getConfig();

    public static ItemStack getKey(String configsection, String type) {

        String cratename = config.getString("trades." + configsection + "." + type + ".crate");

        for (Crate crate : CrazyCrates.getInstance().getCrates()) {
            if (crate.getName().equalsIgnoreCase(cratename)) {
                return crate.getKey(1);
            }
        }
        return null;
    }


}
