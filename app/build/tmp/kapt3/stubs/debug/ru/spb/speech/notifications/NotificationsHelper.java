package ru.spb.speech.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/spb/speech/notifications/NotificationsHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "CHANNEL_ID", "", "FINISHED_TRAININGS", "", "NOTIFICATION_ID", "createNotificationChannel", "", "isTrainingEnd", "", "training", "Lru/spb/speech/database/TrainingData;", "slidesCount", "sendNotification", "validateNotification", "finishedTrainings", "Companion", "app_debug"})
public final class NotificationsHelper {
    private final java.lang.String CHANNEL_ID = "1011";
    private final int NOTIFICATION_ID = 15;
    private final int FINISHED_TRAININGS = 5;
    private final android.content.Context context = null;
    private static final int HOUR_FOR_NOTIFICATION = 20;
    private static final int MINUTES_FOR_NOTIFICATION = 30;
    public static final ru.spb.speech.notifications.NotificationsHelper.Companion Companion = null;
    
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
    private final void createNotificationChannel(android.content.Context context) {
    }
    
    public final void sendNotification() {
    }
    
    public final boolean validateNotification(int finishedTrainings) {
        return false;
    }
    
    private final boolean isTrainingEnd(ru.spb.speech.database.TrainingData training, int slidesCount) {
        return false;
    }
    
    public NotificationsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lru/spb/speech/notifications/NotificationsHelper$Companion;", "", "()V", "HOUR_FOR_NOTIFICATION", "", "getHOUR_FOR_NOTIFICATION", "()I", "MINUTES_FOR_NOTIFICATION", "getMINUTES_FOR_NOTIFICATION", "app_debug"})
    public static final class Companion {
        
        public final int getHOUR_FOR_NOTIFICATION() {
            return 0;
        }
        
        public final int getMINUTES_FOR_NOTIFICATION() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}