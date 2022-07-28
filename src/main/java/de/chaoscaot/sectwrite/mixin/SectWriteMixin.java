package de.chaoscaot.sectwrite.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class SectWriteMixin {

    @Inject(method = "isValidChar", at = @At("TAIL"), cancellable = true)
    private static void isValidCharOverride(char chr, CallbackInfoReturnable<Boolean> cir) {
        if (chr == '§') {
            cir.setReturnValue(true);
        }
    }
}
