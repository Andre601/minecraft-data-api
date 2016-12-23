/*
 * Copyright (C) 2016 Florian Stober
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.codecrafter47.data.bukkit.vanishnopacket;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.kitteh.vanish.VanishManager;
import org.kitteh.vanish.VanishPlugin;

import java.util.function.Function;

public class VanishNoPacketIsVanishedProvider implements Function<Player, Boolean> {
    @Override
    public Boolean apply(Player player) {
        VanishPlugin plugin = (VanishPlugin) Bukkit.getPluginManager().getPlugin("VanishNoPacket");
        if (plugin != null) {
            VanishManager manager = plugin.getManager();
            if (manager != null) {
                return manager.isVanished(player);
            }
        }
        return null;
    }
}
