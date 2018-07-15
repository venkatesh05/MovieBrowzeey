package com.hexcreators.moviebrowzeey.MovieDetail;

import com.hexcreators.moviebrowzeey.Data.Model.Movie;
import com.hexcreators.moviebrowzeey.Z_AppUtills.BasePresenter;
import com.hexcreators.moviebrowzeey.Z_AppUtills.BaseView;

public interface MovieDetailContract {

    interface View extends BaseView {

        void showMovie(Movie movie);
    }

    interface Presenter extends BasePresenter {

    }

}
