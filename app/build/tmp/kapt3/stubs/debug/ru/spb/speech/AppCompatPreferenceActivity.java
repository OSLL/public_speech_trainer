package ru.spb.speech;

import java.lang.System;

/**
 * * A [android.preference.PreferenceActivity] which implements and proxies the necessary calls
 * * to be used with AppCompat.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0014J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u000eH\u0014J\b\u0010\u001f\u001a\u00020\u000eH\u0014J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010%\u001a\u00020\u000e2\b\b\u0001\u0010&\u001a\u00020$H\u0016J\u0010\u0010\'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006*"}, d2 = {"Lru/spb/speech/AppCompatPreferenceActivity;", "Landroid/preference/PreferenceActivity;", "()V", "delegate", "Landroid/support/v7/app/AppCompatDelegate;", "getDelegate", "()Landroid/support/v7/app/AppCompatDelegate;", "delegate$delegate", "Lkotlin/Lazy;", "supportActionBar", "Landroid/support/v7/app/ActionBar;", "getSupportActionBar", "()Landroid/support/v7/app/ActionBar;", "addContentView", "", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "getMenuInflater", "Landroid/view/MenuInflater;", "invalidateOptionsMenu", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPostCreate", "onPostResume", "onStop", "onTitleChanged", "title", "", "color", "", "setContentView", "layoutResID", "setSupportActionBar", "toolbar", "Landroid/support/v7/widget/Toolbar;", "app_debug"})
public abstract class AppCompatPreferenceActivity extends android.preference.PreferenceActivity {
    private final kotlin.Lazy delegate$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.app.ActionBar getSupportActionBar() {
        return null;
    }
    
    public final void setSupportActionBar(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.Toolbar toolbar) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.MenuInflater getMenuInflater() {
        return null;
    }
    
    @java.lang.Override()
    public void setContentView(@android.support.annotation.LayoutRes()
    int layoutResID) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams params) {
    }
    
    @java.lang.Override()
    public void addContentView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams params) {
    }
    
    @java.lang.Override()
    protected void onPostResume() {
    }
    
    @java.lang.Override()
    protected void onTitleChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence title, int color) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void invalidateOptionsMenu() {
    }
    
    private final android.support.v7.app.AppCompatDelegate getDelegate() {
        return null;
    }
    
    public AppCompatPreferenceActivity() {
        super();
    }
}