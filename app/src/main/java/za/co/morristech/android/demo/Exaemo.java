package za.co.morristech.android.demo;

import android.app.Application;
import android.util.Log;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Wade Morris.
 */
public class Exaemo extends Application {

    private static final String TAG = Exaemo.class.getName();

    private static GoogleAnalytics sAnalytics;
    private static Tracker sTracker;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Initialize GoogleAnalytics Instance");
        sAnalytics = GoogleAnalytics.getInstance(this);
        Log.d(TAG, "Initialize GoogleAnalytics Tracker");
        sTracker = sAnalytics.newTracker("UA-40864984-2");
        // Provide unhandled exceptions reports. Do that first after creating the tracker
        sTracker.enableExceptionReporting(true);
        // Enable Remarketing, Demographics & Interests reports
        // https://developers.google.com/analytics/devguides/collection/android/display-features
        sTracker.enableAdvertisingIdCollection(true);
        // Enable automatic activity tracking for your app
        sTracker.enableAutoActivityTracking(true);
    }

    /**
     * Access to the global Analytics singleton. If this method returns null you forgot to either
     * set android:name="&lt;this.class.name&gt;" attribute on your application element in
     * AndroidManifest.xml or you are not setting this.analytics field in onCreate method override.
     */
    public static GoogleAnalytics analytics() {
        return sAnalytics;
    }

    /**
     * The default app tracker. If this method returns null you forgot to either set
     * android:name="&lt;this.class.name&gt;" attribute on your application element in
     * AndroidManifest.xml or you are not setting this.tracker field in onCreate method override.
     */
    public static Tracker tracker() {
        return sTracker;
    }

}
