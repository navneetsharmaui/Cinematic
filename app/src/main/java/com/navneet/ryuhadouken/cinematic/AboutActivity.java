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
                .setDescription("This app helps users to discover popular, top rated, currently playing and upcoming movies on the web.User can also search for movies. Save their favorite movies locally and access it offline. It displays a scrolling grid of movie trailers and launches a details screen is launched whenever a particular movie is selected. Where users can watch trailers and read reviews about the movies. Users can also share movie plots and trailers.")
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
