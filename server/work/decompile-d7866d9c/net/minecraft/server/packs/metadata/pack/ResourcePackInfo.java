package net.minecraft.server.packs.metadata.pack;

import net.minecraft.network.chat.IChatBaseComponent;

public class ResourcePackInfo {

    public static final ResourcePackInfoDeserializer a = new ResourcePackInfoDeserializer();
    private final IChatBaseComponent b;
    private final int c;

    public ResourcePackInfo(IChatBaseComponent ichatbasecomponent, int i) {
        this.b = ichatbasecomponent;
        this.c = i;
    }

    public IChatBaseComponent a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}
