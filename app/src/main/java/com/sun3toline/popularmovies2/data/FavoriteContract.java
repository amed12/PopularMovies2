package com.sun3toline.popularmovies2.data;

import android.provider.BaseColumns;

/**
 * Created by AchmadF on 7/30/2017.
 */

public class FavoriteContract {
    public static final class FavoriteEntry implements BaseColumns {

        public static final String TABLE_NAME = "favorite";
        public static final String COLUMN_MOVIEID = "movieid";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_USERRATING = "userrating";
        public static final String COLUMN_POSTER_PATH = "posterpath";
        public static final String COLUMN_PLOT_SYNOPSIS = "overview";
    }
}
