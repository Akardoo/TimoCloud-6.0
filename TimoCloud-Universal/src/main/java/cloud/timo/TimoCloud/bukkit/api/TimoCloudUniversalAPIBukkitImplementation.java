package cloud.timo.TimoCloud.bukkit.api;

import cloud.timo.TimoCloud.api.TimoCloudUniversalAPI;
import cloud.timo.TimoCloud.api.implementations.TimoCloudUniversalAPIBasicImplementation;

public class TimoCloudUniversalAPIBukkitImplementation extends TimoCloudUniversalAPIBasicImplementation implements TimoCloudUniversalAPI {

    public TimoCloudUniversalAPIBukkitImplementation() {
        super(ServerObjectBukkitImplementation.class, ProxyObjectBukkitImplementation.class, ServerGroupObjectBukkitImplementation.class, ProxyGroupObjectBukkitImplementation.class, PlayerObjectBukkitImplementation.class, BaseObjectBukkitImplementation.class, CordObjectBukkitImplementation.class);
    }

}
