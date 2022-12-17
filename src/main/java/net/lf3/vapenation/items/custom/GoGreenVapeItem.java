package net.lf3.vapenation.items.custom;

import net.lf3.vapenation.sounds.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class GoGreenVapeItem extends Item {
    private static final int DRINK_DURATION = 32;
    public GoGreenVapeItem(Properties p){
        super(p);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        //play go green sound
        level.playSound(null, new BlockPos(player.blockPosition()), ModSounds.GO_GREEN_SOUND.get(), SoundSource.PLAYERS, 1, 1);
        //use vape
        ItemStack vapeStack = player.getMainHandItem();
        //output vape clouds
        //set cooldown

        return ItemUtils.startUsingInstantly(level, player, hand);
    }
    @Override
    public @NotNull UseAnim getUseAnimation(ItemStack itemstack){
        return UseAnim.TOOT_HORN;
    }
    @Override
    public int getUseDuration(ItemStack itemstack){
        return 32;
    }
}
