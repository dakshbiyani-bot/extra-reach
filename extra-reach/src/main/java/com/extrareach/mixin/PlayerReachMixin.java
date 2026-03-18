package com.extrareach.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerReachMixin {

    // Default survival reach is 4.5, creative is 5.0
    // We add 1.0 to both
    @Inject(method = "getBlockInteractionRange", at = @At("RETURN"), cancellable = true)
    private void increaseBlockReach(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(cir.getReturnValue() + 1.0);
    }

    @Inject(method = "getEntityInteractionRange", at = @At("RETURN"), cancellable = true)
    private void increaseEntityReach(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(cir.getReturnValue() + 1.0);
    }
}
