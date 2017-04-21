package nyc.jsjrobotics.emptymocks.template;


public interface IDefaultViewModel<T extends IDefaultView> {
    void bindView(T view);
}
