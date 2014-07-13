package com.example.kyokomi.helloandroidwear;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MyActivity extends Activity {

    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // タイトル、テキスト
                int notificationId = 1;
                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MyActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("今日も一日がんばるぞい！")
                        .setContentText("m9( ﾟдﾟ)")
                        ;
                NotificationManagerCompat notificationManager = NotificationManagerCompat
                        .from(MyActivity.this);
                notificationManager.notify(notificationId,
                        notificationBuilder.build());
            }
        });
        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Content Intent
                int notificationId = 2;

                Intent intent = new Intent(MyActivity.this, MyActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MyActivity.this, 0, intent, 0);

                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MyActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("ふがふが")
                        .setContentText("ほげほげ")
                        .setContentIntent(pendingIntent)
                        ;
                NotificationManagerCompat notificationManager = NotificationManagerCompat
                        .from(MyActivity.this);
                notificationManager.notify(notificationId,
                        notificationBuilder.build());
            }
        });
        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // InboxStyle
                int notificationId = 3;

                Intent intent = new Intent(MyActivity.this, MyActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MyActivity.this, 0, intent, 0);

                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MyActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentIntent(pendingIntent)
                        .setStyle(new NotificationCompat.InboxStyle()
                                        .addLine("1 line")
                                        .addLine("2 line")
                                        .setBigContentTitle("In tile")
                                        .setSummaryText("+3 more")
                        );
                NotificationManagerCompat notificationManager = NotificationManagerCompat
                        .from(MyActivity.this);
                notificationManager.notify(notificationId,
                        notificationBuilder.build());
            }
        });
        mButton4 = (Button) findViewById(R.id.button4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // InboxStyle
                int notificationId = 4;

                Intent intent = new Intent(MyActivity.this, MyActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MyActivity.this, 0, intent, 0);

                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MyActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentIntent(pendingIntent)
                        .setContentTitle("盟約に従い")
                        .setContentText("アッシェンテ")
                        .setStyle(new NotificationCompat.BigTextStyle()
                                        .bigText(getString(R.string.test))
                                        .setBigContentTitle("十の盟約（じゅうのめいやく）")
                                        .setSummaryText("BIG")
                        );
                NotificationManagerCompat notificationManager = NotificationManagerCompat
                        .from(MyActivity.this);
                notificationManager.notify(notificationId,
                        notificationBuilder.build());
            }
        });
        mButton5 = (Button) findViewById(R.id.button5);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // InboxStyle
                int notificationId = 5;

                Intent intent = new Intent(MyActivity.this, MyActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MyActivity.this, 0, intent, 0);

                Bitmap bitmap = BitmapFactory.decodeResource(MyActivity.this.getResources(), R.drawable.gopher);
                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MyActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentIntent(pendingIntent)
                        .setContentTitle("Gopher")
                        .setContentText("開けます...")
                        .setStyle(new NotificationCompat.BigPictureStyle()
                                        .bigPicture(bitmap)
                                        .setBigContentTitle("Gopher")
                                        .setSummaryText("GoいいよGo")
                        );
                NotificationManagerCompat notificationManager = NotificationManagerCompat
                        .from(MyActivity.this);
                notificationManager.notify(notificationId,
                        notificationBuilder.build());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
