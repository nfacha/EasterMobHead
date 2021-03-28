package com.nunofacha.eastermobhead.listeners;

import com.nunofacha.eastermobhead.HeadUtils;
import com.nunofacha.eastermobhead.Main;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Random;

public class EntityListener implements Listener {

    @EventHandler
    public void entitySpawn(CreatureSpawnEvent e) {
        if(e.getEntityType() == EntityType.ZOMBIE){
            Entity entity = e.getEntity();
            Zombie zombie = (Zombie) entity;
            Random r = new Random();
            if(e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER){
                return;
            }
            int n = r.nextInt(100);
            if(n <= 10){
                Main.logger.info("Spawning with easter egg head");
                zombie.getEquipment().setHelmet(getEasterItemStack());
                zombie.getEquipment().setHelmetDropChance(75);
            }
            if(n == 1){
                Main.logger.info("Spawning with easter chick");
                zombie.getEquipment().setHelmet(getEasterEggChickStack());
                zombie.getEquipment().setHelmetDropChance(75);
            }
        }
    }

    public ItemStack getEasterItemStack() {
        String[] heads = {
                "https://textures.minecraft.net/texture/5ffed7ac15d67ec5a4cb92367f9d75432eb16105aff2c291c88946c7478fcb5",
                "https://textures.minecraft.net/texture/656f7f3f3536506626d5f35b45d7fdf2d8aab26008456659efeb91e4c3a9c5",
                "http://textures.minecraft.net/texture/40d3fb9ebf30c9d0fa2c68ec73ee3b1f2d481923195b50e48d2ac831e2ca55a9",
                "http://textures.minecraft.net/texture/c76595effcc5627e85b14c9c8824671b5ec2965659c8c417849a667878fa490",
                "http://textures.minecraft.net/texture/b2cd5df9d7f1fa8341fcce2f3c118e2f517e4d2d99df2c51d61d93ed7f83e13",
                "http://textures.minecraft.net/texture/17daff4239e560f7f53b1ccbcebc614f0ddf3581a6fad5bd81567291ecf4571",
                "http://textures.minecraft.net/texture/9ebf78e1c1b01decfb6b3df5258168c3aa874871be4bc4db25584ed590a557b2",
                "http://textures.minecraft.net/texture/83c25a7a188196b18717264ffe837ca348cf719e827179edc4b78cbcb8c7dd8",
                "http://textures.minecraft.net/texture/83df652b0c7ddb94461fc6c074aa5e5fd15731d7dd3d533351c7065bd82ba554",
                "http://textures.minecraft.net/texture/f0d6d4dea9a898f31ccdf5b46260443d2c138048e223be9c3752e5b6114a1d2a",
        };
        int rnd = new Random().nextInt(heads.length);
        return HeadUtils.getSkull(heads[rnd]);
    }

    public ItemStack getEasterEggChickStack() {
        return HeadUtils.getSkull("http://textures.minecraft.net/texture/40014ce074ea6e719287e74a79615d5929fc6ff42ac81a7e1e45a005f7642179");
    }

}
