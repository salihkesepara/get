package com.skesepara.get;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class DownLoadImageTask extends AsyncTask<String,Void,Bitmap>{
    ImageView imageView;

    public DownLoadImageTask(ImageView imageView){
        this.imageView = imageView;
    }

    /**
     * Override this method to perform a computation on a background thread.
     * @param urls String
     * @return Bitmap
     */
    protected Bitmap doInBackground(String...urls){
        String urlOfImage = urls[0];
        Bitmap logo = null;
        try{
            InputStream is = new URL(urlOfImage).openStream();

            /* Decode an input stream into a bitmap. */
            logo = BitmapFactory.decodeStream(is);
        }catch(Exception e){ // Catch the download exception
            e.printStackTrace();
        }
        return logo;
    }

    /**
     * Runs on the UI thread after doInBackground(Params...)
     * @param result Bitmap
     */
    protected void onPostExecute(Bitmap result){
        imageView.setImageBitmap(result);
    }
}