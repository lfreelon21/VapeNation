package net.lf3.vapenation.items.custom;

import net.lf3.vapenation.sounds.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GoGreenVapeItem extends Item {
    public GoGreenVapeItem(Properties p){
        super(p);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        level.playSound(null, new BlockPos(player.blockPosition()), ModSounds.GO_GREEN_SOUND.get(), SoundSource.PLAYERS, 1, 1);
        //use vape
        //play go green sound
        //output vape clouds
        //set cooldown

        return super.use(level, player, hand);
    }
}
