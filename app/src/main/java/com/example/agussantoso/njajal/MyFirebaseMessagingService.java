package com.example.agussantoso.njajal;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FCM_GUE" ;

    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String token = FirebaseInstanceId.getInstance().getToken();
//        Log.d(TAG, "NEW_TOKEN" + token);
        Log.d(TAG, "Refrestoken" + token);

    }
    @Override
    public void onNewToken ( String s ) {
        super . onNewToken ( s );
        Log. e ( "NEW_TOKEN" , s );
    }

    @Override
    public void onMessageReceived ( RemoteMessage remoteMessage ) {
        super . onMessageReceived ( remoteMessage );
        Log . d ( TAG , "Pengirim: " + remoteMessage . getFrom ());
        if ( remoteMessage . getData (). size () > 0 ) {
            Log . d ( TAG , "Pesennya bang: " + remoteMessage . getData (). get ( "body" ));

            MyNotificationManager.getmInstance(this).displayNotification(
                    remoteMessage.getData().get("body"),
                    remoteMessage.getData().get("title")
            );
        }
    }
}
