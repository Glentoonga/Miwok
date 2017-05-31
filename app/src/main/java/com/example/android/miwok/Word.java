package com.example.android.miwok;

/**
 * Created by Glen on 17/03/2017.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image for words*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
        }

    /** Get the default translation of the word */
    public String getDefaultTranslation()    {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /** Get the image associared with the word */
    public int getImageResourceId() { return mImageResourceId;}

    public boolean hasImage () {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() { return mAudioResourceId; }


}
