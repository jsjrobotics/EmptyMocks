package nyc.jsjrobotics.emptymocks.selectSubject;

import nyc.jsjrobotics.emptymocks.template.IDefaultViewModel;

class SelectSubjectPresenter implements IDefaultViewModel<SelectSubjectView> {
    private SelectSubjectView view;

    @Override
    public void bindView(final SelectSubjectView v) {
        view = v;
    }
}
