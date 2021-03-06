package net.minecraft.server.level;

import java.util.function.Function;
import net.minecraft.core.BlockPosition;
import net.minecraft.world.level.TickList;
import net.minecraft.world.level.TickListPriority;

public class TickListWorldGen<T> implements TickList<T> {

    private final Function<BlockPosition, TickList<T>> a;

    public TickListWorldGen(Function<BlockPosition, TickList<T>> function) {
        this.a = function;
    }

    @Override
    public boolean a(BlockPosition blockposition, T t0) {
        return ((TickList) this.a.apply(blockposition)).a(blockposition, t0);
    }

    @Override
    public void a(BlockPosition blockposition, T t0, int i, TickListPriority ticklistpriority) {
        ((TickList) this.a.apply(blockposition)).a(blockposition, t0, i, ticklistpriority);
    }

    @Override
    public boolean b(BlockPosition blockposition, T t0) {
        return false;
    }
}
