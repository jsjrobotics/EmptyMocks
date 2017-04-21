package nyc.jsjrobotics.emptymocks.template;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Optional;

public interface IDefaultView {
    Optional<View> getLoadingView();
    Optional<View> getLoadedView();
    Optional<View> getErrorView();
    View getRoot();
    void setLoading(boolean isLoading);
    void setError();

}
