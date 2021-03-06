
package com.shenkar.tamar.todolist_vr6;


        import android.app.Notification;
        import android.app.NotificationManager;
        import android.app.PendingIntent;
        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;

public class ReminderNotification extends BroadcastReceiver{

    public ReminderNotification() {
        // TODO Auto-generated constructor stub
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        // The PendingIntent to launch our activity if the user selects this notification
        Task task = (Task)intent.getSerializableExtra("task");
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 0);
        // Set the info for the views that show in the notification panel.

        NotificationManager notificationManager =
                (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        // Build notification
        Notification notification = new Notification.Builder(context)
                .setContentTitle("This is a reminder for task:").setContentText(task.getTaskDescription())
                .setSmallIcon(R.drawable.ic_launcher).setContentIntent(contentIntent)
                .build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notification.defaults |= Notification.DEFAULT_SOUND;
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notificationManager.notify(0, notification);


    }

}