package com.example.firmanskripsi.mms;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;


public class MmsIntent {


    private Uri uri;
    private final Context context;

    public Uri getUri() {
        return uri;
    }


    public void setUri(Uri uri) {
        this.uri = uri;
    }



    /**
     * buat template untuk kirim MMS dengan image encoded.
     * @param uri, adalah Uri dari encoded image.
     * @param context, Handler untuk memulai Activity.
     */
    public MmsIntent(Uri uri,Context context) {
        this.uri = uri;
        this.context=context;
    }


    /**
     * memanggil default android editor MMS, dengan encoded image terlampir.
     */
    public void send()
    {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra("sms_body", "");
        sendIntent.putExtra(Intent.EXTRA_STREAM,uri);
        sendIntent.setType("image/png");
        context.startActivity(sendIntent);
    }

}

