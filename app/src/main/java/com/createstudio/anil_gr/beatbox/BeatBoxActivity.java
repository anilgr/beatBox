package com.createstudio.anil_gr.beatbox;

import android.support.v4.app.Fragment;

/**
 * Created by anil_gr on 30-01-2017.
 */
public class BeatBoxActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }




}
