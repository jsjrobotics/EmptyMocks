package nyc.jsjrobotics.emptymocks.createAccount;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.List;
import nyc.jsjrobotics.emptymocks.R;

class EditTextAdapter extends BaseAdapter {
    private final List<EditTextDescriptor> editTextDescriptors;

    EditTextAdapter(final List<EditTextDescriptor> data) {
        editTextDescriptors = data;
    }

    @Override public int getCount() {
        return editTextDescriptors.size();
    }

    @Override public Object getItem(final int position) {
        return editTextDescriptors.get(position);
    }

    @Override public long getItemId(final int position) {
        return position;
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        final LinearLayout editTextDescriptor;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            editTextDescriptor = (LinearLayout) inflater.inflate(R.layout.edittext_desctiptor_viewholder, parent, false);
        } else {
            editTextDescriptor = (LinearLayout) convertView;
        }

        final TextView label = (TextView) editTextDescriptor.findViewById(R.id.label);
        final EditText input = (EditText) editTextDescriptor.findViewById(R.id.input);
        final EditTextDescriptor data = (EditTextDescriptor) getItem(position);
        label.setText(data.label);
        input.setHint(data.hint);
        return editTextDescriptor;
    }
}
