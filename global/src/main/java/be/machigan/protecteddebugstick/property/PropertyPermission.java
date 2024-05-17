package be.machigan.protecteddebugstick.property;

import org.bukkit.entity.Player;

public class PropertyPermission {
    private final String permission;
    public PropertyPermission(String permission) {
        this.permission = permission;
    }

    public boolean has(Player player) {
        return true;
    }

    @Override
    public String toString() {
        return this.permission;
    }
}
