package com.navneet.ryuhadouken.cinematic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * Created by ryuhadouken on 17/5/16.
 */
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element versionElement = new Element();
        versionElement.setTitle("Version 1.1");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.ic_launcher)
                .setDescription("This app helps users to discover popular, top rated, currently playing and upcoming movies. The user can also search for movies whether it is Hollywood or Bollywood. Users can also save their favorite movies and access it offline. A details screen is launched whenever a particular movie is selected. Where users can watch trailers and read reviews about the movies.")
                .addItem(versionElement)
                .addGroup("Connect with us")
                .addEmail("navneetnnavneet1@gmail.com")
                .addFacebook("nannuzz15")
                .addTwitter("navneet240")
                .addYoutube("UC1SmRKYhTCAJdtFupIEsM4Q")
                .addPlayStore("com.navneet.ryuhadouken.cinematic")
                .addInstagram("navneetzz")
                .addGitHub("navneetzz")
                .addWebsite("http://www.navneetsharma.in")
                .create();

        setContentView(aboutPage);
    }
}
