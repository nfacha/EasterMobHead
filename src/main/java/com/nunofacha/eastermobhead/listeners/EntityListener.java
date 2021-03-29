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
            int n = r.nextInt(200);
            if(n <= 5){
                Main.logger.info("Spawning with easter egg head");
                zombie.getEquipment().setHelmet(getEasterItemStack());
                zombie.getEquipment().setHelmetDropChance(100);
            }
            if(n == 1){
                Main.logger.info("Spawning with easter chick");
                zombie.getEquipment().setHelmet(getEasterEggChickStack());
                zombie.getEquipment().setHelmetDropChance(100);
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
                "http://textures.minecraft.net/texture/b5dbec524a95dea4d4d5802c95b0cf5eafebd31a9876772716a4862d6c88a",
                "http://textures.minecraft.net/texture/9d50fe15a2128648c7bd1a985c320badbfdf6ebb4682cac4912909620ccf",
                "http://textures.minecraft.net/texture/f2109079dde15adae559c47aa6de4bdadb186a4b30da5acbee7415a9788f7e",
                "http://textures.minecraft.net/texture/40d3fb9ebf30c9d0fa2c68ec73ee3b1f2d481923195b50e48d2ac831e2ca55a9",
                "http://textures.minecraft.net/texture/924869799efd3e3e267feb45f12c94aba12bad31956cf2e42f035d7e9b4c",
                "http://textures.minecraft.net/texture/3066ac587165d50a1af1117cf38e4b06bc7ebbaf0c17dd24ffd44e9ff845e555",
                "http://textures.minecraft.net/texture/a4dae5076572fc31cfc7fcda0fd5b7ebf4ae1d56a9b625bd556df1f095e9a77f",
                "http://textures.minecraft.net/texture/1c0d0443add49047f348644ab2e563617e79f257b72f87387e04ddd6b30187f9",
                "http://textures.minecraft.net/texture/c8b80574b23f275e12946cc620cb961ac298d954a82f1dd1d12125bb2f939e16",
                "http://textures.minecraft.net/texture/27983fb495d382f9d878260de99e4e6cecf618b67a3b5c2051e3fad2b69b",
                "http://textures.minecraft.net/texture/f119be668d45193a08c7bc9af286dc514382e75352e9b3c278522339e84a",
                "http://textures.minecraft.net/texture/d60f695557f1c13e3e62e5ca05faf4a730db772c8fab1f072a73297f20",
                "http://textures.minecraft.net/texture/213a278ae9902f7c15bf39699c6a14261425ccafedab24fa6a859c415a305d4a",
                "http://textures.minecraft.net/texture/bb884d61f235235047483ac4ba4ce528691e6424bac13814159272d9673ac",
                "http://textures.minecraft.net/texture/d095587aa5658377efbe5ff7daf54feffe6d5f6bdaba3dc19ee7d2f18626247d",
                "http://textures.minecraft.net/texture/377ed23fd720d8d96de4a703077c24b433eafd69c6f057aed8427c4640a1b7d9",
                "http://textures.minecraft.net/texture/e8a4fb25afbc6b7aec15abe872fcead1e5b33c1ab12525141d77bfd298fc32d9",
                "http://textures.minecraft.net/texture/4b127325bfbd2e1a99cc0e6a1f68a1aaf78ba821390a0f2879d803db2eae6",
                "http://textures.minecraft.net/texture/1ccd53b8d9e8f463bc1f06fc1a367b624c21ef93695a4071f269d8bc779d",
                "http://textures.minecraft.net/texture/8e3ba54e46f4fcd9281ec592a5c817901ce3f811185f77a938cf0c63346e0e62",
                "http://textures.minecraft.net/texture/8c50aee88013e8faf427e19f3b89828b86bbf03dd2f17c4c760d1dde22de3",
        };
        int rnd = new Random().nextInt(heads.length);
        return HeadUtils.getSkull(heads[rnd]);
    }

    public ItemStack getEasterEggChickStack() {
        return HeadUtils.getSkull("http://textures.minecraft.net/texture/3d2719271c714980226ff1bef4cbb1d54411ce3a914d7df731bcc7f61e94e5c");
    }

}
