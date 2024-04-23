import android.app.Activity;

import java.util.concurrent.atomic.AtomicBoolean;

public class GDPR {




    Activity activity;
    String GDPR_DEBUG_TAG = "";
    private final AtomicBoolean isMobileAdsInitializeCalled = new AtomicBoolean(false);

    public GDPR(Activity activity) {
        this.activity = activity;
    }

    public void setGDPR() {
        ConsentRequestParameters params = new ConsentRequestParameters
                .Builder()
                .setTagForUnderAgeOfConsent(false)
                .build();

        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        consentInformation.requestConsentInfoUpdate(activity, params, (ConsentInformation.OnConsentInfoUpdateSuccessListener) () -> {
            UserMessagingPlatform.loadAndShowConsentFormIfRequired(
                    activity,
                    (ConsentForm.OnConsentFormDismissedListener) loadAndShowError -> {
                        if (loadAndShowError != null) {
                            Log.w(GDPR_DEBUG_TAG, String.format("%s: %s", loadAndShowError.getErrorCode(), loadAndShowError.getMessage()));
                        }

                        // Consent has been gathered.
                        if (consentInformation.canRequestAds()) {
                            initializeMobileAdsSdk();
                        }
                    }
            );

        }, (ConsentInformation.OnConsentInfoUpdateFailureListener) requestConsentError -> {
            Log.w(GDPR_DEBUG_TAG, String.format("%s: %s", requestConsentError.getErrorCode(), requestConsentError.getMessage()));
        });

        if (consentInformation.canRequestAds()) {
            initializeMobileAdsSdk();
        }

    } // setGDPR End here ======================

    private void initializeMobileAdsSdk() {
        if (isMobileAdsInitializeCalled.getAndSet(true)) {
            return;
        }
        MobileAds.initialize(activity);
    } // initializeMobileAdsSdk end here =========

} // GDPR End Here ===============================


