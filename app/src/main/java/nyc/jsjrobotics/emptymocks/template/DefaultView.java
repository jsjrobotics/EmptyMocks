package nyc.jsjrobotics.emptymocks.template;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import java.util.Optional;

public abstract class DefaultView implements IDefaultView {

    private View mRoot;
    private Optional<View> mLoadingView;
    private Optional<View> mLoadedView;
    private Optional<View> mErrorView;

    public DefaultView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflateLayout(inflater, container);
    }

    private View inflateLayout(LayoutInflater inflater, ViewGroup container) {
        mRoot = inflater.inflate(getLayoutId(), container, false);
        mLoadingView = Optional.ofNullable(mRoot.findViewById(getLoadingViewId()));
        mLoadedView = Optional.ofNullable(mRoot.findViewById(getLoadedViewId()));
        mErrorView = Optional.ofNullable(mRoot.findViewById(getErrorViewId()));
        if (mRoot == null ) {
            throw new IllegalStateException("Must define all view ids in layout");
        }
        return mRoot;
    }

    public final View getRoot() {
        return mRoot;
    }

    public final Optional<View> getLoadingView(){
        return mLoadingView;
    }

    public final Optional<View> getLoadedView(){
        return mLoadedView;
    }

    public final Optional<View> getErrorView() {
        return mErrorView;
    }

    abstract protected int getLayoutId();
    abstract protected int getLoadingViewId();
    abstract protected int getLoadedViewId();
    abstract protected int getErrorViewId();

    public final void setLoading(boolean isLoading) {
        if (isLoading) {
            getLoadingView().ifPresent(view -> view.setVisibility(View.VISIBLE));
            getLoadedView().ifPresent(view -> view.setVisibility(View.GONE));
            getErrorView().ifPresent(view -> view.setVisibility(View.GONE));
        } else {
            getLoadingView().ifPresent(view -> view.setVisibility(View.GONE));
            getLoadedView().ifPresent(view -> view.setVisibility(View.VISIBLE));
            getErrorView().ifPresent(view -> view.setVisibility(View.GONE));
        }
    }

    public final void animateLoading(boolean isLoading, int duration) {
        final Animation fadeIn = fadeInAnimation(duration);
        final Animation fadeOut = fadeOutAnimation(duration);
        if (isLoading) {
            getLoadingView().ifPresent(v -> v.startAnimation(fadeIn));
            getLoadedView().ifPresent(v -> v.startAnimation(fadeOut));
            getErrorView().ifPresent(v -> v.startAnimation(fadeOut));
        } else {
            getLoadingView().ifPresent(v -> v.startAnimation(fadeOut));
            getLoadedView().ifPresent(v -> v.startAnimation(fadeIn));
            getErrorView().ifPresent(v -> v.startAnimation(fadeOut));
        }
    }

    private Animation fadeOutAnimation(int duration) {
        AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(duration);
        return animation;
    }

    private Animation fadeInAnimation(int duration) {
        AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
        animation.setDuration(duration);
        return animation;
    }

    public final void setError() {
        getLoadingView().ifPresent(view -> view.setVisibility(View.GONE));
        getLoadedView().ifPresent(view -> view.setVisibility(View.GONE));
        getErrorView().ifPresent(view -> view.setVisibility(View.VISIBLE));
    }



}
