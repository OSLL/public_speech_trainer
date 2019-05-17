package ru.spb.speech;

import java.lang.System;

/**
 * * A [PreferenceActivity] that presents a set of application settings. On
 * * handset devices, settings are presented as a single list. On tablets,
 * * settings are split by category, with category headers shown to the left of
 * * the list of settings.
 * *
 * * See [Android Design: Settings](http://developer.android.com/design/patterns/settings.html)
 * * for design guidelines and the [Settings API Guide](http://developer.android.com/guide/topics/ui/settings.html)
 * * for more information on developing a Settings UI.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017J\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0002\u00a8\u0006\u0018"}, d2 = {"Lru/spb/speech/SettingsActivity;", "Lru/spb/speech/AppCompatPreferenceActivity;", "()V", "isValidFragment", "", "fragmentName", "", "onBuildHeaders", "", "target", "", "Landroid/preference/PreferenceActivity$Header;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onIsMultiPane", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupActionBar", "Companion", "DebModePreferenceFragment", "GeneralPreferenceFragment", "NotificationPreferenceFragment", "app_debug"})
public final class SettingsActivity extends ru.spb.speech.AppCompatPreferenceActivity {
    
    /**
     * * A preference value change listener that updates the preference's summary
     *         * to reflect its new value.
     */
    private static final android.preference.Preference.OnPreferenceChangeListener sBindPreferenceSummaryToValueListener = null;
    public static final ru.spb.speech.SettingsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * Set up the [android.app.ActionBar], if the API is available.
     */
    private final void setupActionBar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * * {@inheritDoc}
     */
    @java.lang.Override()
    public boolean onIsMultiPane() {
        return false;
    }
    
    /**
     * * {@inheritDoc}
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    @java.lang.Override()
    public void onBuildHeaders(@org.jetbrains.annotations.NotNull()
    java.util.List<android.preference.PreferenceActivity.Header> target) {
    }
    
    /**
     * * This method stops fragment injection in malicious applications.
     *     * Make sure to deny any unknown fragments here.
     */
    @java.lang.Override()
    protected boolean isValidFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentName) {
        return false;
    }
    
    public SettingsActivity() {
        super();
    }
    
    /**
     * * This fragment shows general preferences only. It is used when the
     *     * activity is showing a two-pane settings UI.
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lru/spb/speech/SettingsActivity$GeneralPreferenceFragment;", "Landroid/preference/PreferenceFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPreferenceTreeClick", "preferenceScreen", "Landroid/preference/PreferenceScreen;", "preference", "Landroid/preference/Preference;", "app_debug"})
    public static final class GeneralPreferenceFragment extends android.preference.PreferenceFragment {
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onPreferenceTreeClick(@org.jetbrains.annotations.Nullable()
        android.preference.PreferenceScreen preferenceScreen, @org.jetbrains.annotations.Nullable()
        android.preference.Preference preference) {
            return false;
        }
        
        public GeneralPreferenceFragment() {
            super();
        }
    }
    
    /**
     * * This fragment shows notification preferences only. It is used when the
     *     * activity is showing a two-pane settings UI.
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016\u00a8\u0006\u0012"}, d2 = {"Lru/spb/speech/SettingsActivity$NotificationPreferenceFragment;", "Landroid/preference/PreferenceFragment;", "()V", "bindNotifications", "", "isNotificationsEnabled", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPreferenceTreeClick", "preferenceScreen", "Landroid/preference/PreferenceScreen;", "preference", "Landroid/preference/Preference;", "app_debug"})
    public static final class NotificationPreferenceFragment extends android.preference.PreferenceFragment {
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onPreferenceTreeClick(@org.jetbrains.annotations.Nullable()
        android.preference.PreferenceScreen preferenceScreen, @org.jetbrains.annotations.Nullable()
        android.preference.Preference preference) {
            return false;
        }
        
        private final void bindNotifications(boolean isNotificationsEnabled) {
        }
        
        public NotificationPreferenceFragment() {
            super();
        }
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lru/spb/speech/SettingsActivity$DebModePreferenceFragment;", "Landroid/preference/PreferenceFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
    public static final class DebModePreferenceFragment extends android.preference.PreferenceFragment {
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        public DebModePreferenceFragment() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lru/spb/speech/SettingsActivity$Companion;", "", "()V", "sBindPreferenceSummaryToValueListener", "Landroid/preference/Preference$OnPreferenceChangeListener;", "bindPreferenceSummaryToValue", "", "preference", "Landroid/preference/Preference;", "isXLargeTablet", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        /**
         * * Helper method to determine if the device has an extra-large screen. For
         *         * example, 10" tablets are extra-large.
         */
        private final boolean isXLargeTablet(android.content.Context context) {
            return false;
        }
        
        /**
         * * Binds a preference's summary to its value. More specifically, when the
         *         * preference's value is changed, its summary (line of text below the
         *         * preference title) is updated to reflect the value. The summary is also
         *         * immediately updated upon calling this method. The exact display format is
         *         * dependent on the type of preference.
         *
         *         * @see .sBindPreferenceSummaryToValueListener
         */
        private final void bindPreferenceSummaryToValue(android.preference.Preference preference) {
        }
        
        private Companion() {
            super();
        }
    }
}