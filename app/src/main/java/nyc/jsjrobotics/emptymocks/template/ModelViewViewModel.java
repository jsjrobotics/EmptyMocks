package nyc.jsjrobotics.emptymocks.template;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public interface ModelViewViewModel<Presenter extends IDefaultViewModel<View>, View extends IDefaultView> {
    Presenter buildPresenter();
    View createView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState);
}
