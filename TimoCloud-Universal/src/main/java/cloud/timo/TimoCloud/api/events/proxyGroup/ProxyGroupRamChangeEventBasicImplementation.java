package cloud.timo.TimoCloud.api.events.proxyGroup;

import cloud.timo.TimoCloud.api.events.EventType;
import cloud.timo.TimoCloud.api.objects.ProxyGroupObject;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProxyGroupRamChangeEventBasicImplementation extends ProxyGroupPropertyChangeEvent<Integer> implements ProxyGroupRamChangeEvent {

    public ProxyGroupRamChangeEventBasicImplementation(ProxyGroupObject instance, Integer oldValue, Integer newValue) {
        super(instance, oldValue, newValue);
    }

    @Override
    public EventType getType() {
        return EventType.PG_RAM_CHANGE;
    }
}
