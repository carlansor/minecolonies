package com.minecolonies.api.colony.buildings.modules.settings;

/**
 * Client side part of the settings module.
 */
public interface ISettingsModuleView
{
    /**
     * Trigger a setting of a specific key.
     * @param key the settings key.
     */
    void trigger(final ISettingKey<?> key);

    /**
     * Get a specific setting.
     * @param key the key of the setting.
     * @param <T> the type of setting.
     * @return the setting.
     */
    <T extends ISetting> T getSetting(final ISettingKey<T> key);
}
