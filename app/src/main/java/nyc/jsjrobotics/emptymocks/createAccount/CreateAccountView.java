package nyc.jsjrobotics.emptymocks.createAccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.List;
import nyc.jsjrobotics.emptymocks.R;
import nyc.jsjrobotics.emptymocks.template.DefaultView;

class CreateAccountView extends DefaultView {
    private final GridView gridView;

    CreateAccountView(final LayoutInflater inflater,
                      final ViewGroup parent,
                      final Bundle savedInstanceState) {
        super(inflater, parent, savedInstanceState);
        gridView = (GridView) getRoot().findViewById(R.id.gridview);
    }

    @Override protected int getLayoutId() {
        return R.layout.enroll;
    }

    @Override protected int getLoadingViewId() {
        return 0;
    }

    @Override protected int getLoadedViewId() {
        return 0;
    }

    @Override protected int getErrorViewId() {
        return 0;
    }

    void setInputBoxes(final List<EditTextDescriptor> editTextDescriptors) {
        gridView.setAdapter(new EditTextAdapter(editTextDescriptors));
    }
}
