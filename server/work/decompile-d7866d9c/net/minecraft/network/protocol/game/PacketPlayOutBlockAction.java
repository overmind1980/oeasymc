package net.minecraft.network.protocol.game;

import java.io.IOException;
import net.minecraft.core.BlockPosition;
import net.minecraft.core.IRegistry;
import net.minecraft.network.PacketDataSerializer;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.level.block.Block;

public class PacketPlayOutBlockAction implements Packet<PacketListenerPlayOut> {

    private BlockPosition a;
    private int b;
    private int c;
    private Block d;

    public PacketPlayOutBlockAction() {}

    public PacketPlayOutBlockAction(BlockPosition blockposition, Block block, int i, int j) {
        this.a = blockposition;
        this.d = block;
        this.b = i;
        this.c = j;
    }

    @Override
    public void a(PacketDataSerializer packetdataserializer) throws IOException {
        this.a = packetdataserializer.e();
        this.b = packetdataserializer.readUnsignedByte();
        this.c = packetdataserializer.readUnsignedByte();
        this.d = (Block) IRegistry.BLOCK.fromId(packetdataserializer.i());
    }

    @Override
    public void b(PacketDataSerializer packetdataserializer) throws IOException {
        packetdataserializer.a(this.a);
        packetdataserializer.writeByte(this.b);
        packetdataserializer.writeByte(this.c);
        packetdataserializer.d(IRegistry.BLOCK.a((Object) this.d));
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
        packetlistenerplayout.a(this);
    }
}
