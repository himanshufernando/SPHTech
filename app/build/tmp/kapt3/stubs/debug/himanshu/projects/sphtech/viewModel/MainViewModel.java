package himanshu.projects.sphtech.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\"X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006,"}, d2 = {"Lhimanshu/projects/sphtech/viewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiInterface", "Lemarge/project/caloriecaffe/network/api/APIInterface;", "getApiInterface", "()Lemarge/project/caloriecaffe/network/api/APIInterface;", "setApiInterface", "(Lemarge/project/caloriecaffe/network/api/APIInterface;)V", "cm", "Landroid/net/ConnectivityManager;", "getCm", "()Landroid/net/ConnectivityManager;", "setCm", "(Landroid/net/ConnectivityManager;)V", "contx", "Landroid/app/Application;", "getContx", "()Landroid/app/Application;", "setContx", "(Landroid/app/Application;)V", "mutableRecordsForYear", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lhimanshu/projects/sphtech/model/datamodel/RecordsForYear;", "getMutableRecordsForYear", "()Landroidx/lifecycle/MutableLiveData;", "setMutableRecordsForYear", "(Landroidx/lifecycle/MutableLiveData;)V", "showProgressbar", "", "getShowProgressbar", "setShowProgressbar", "tokenID", "", "getTokenID", "()Ljava/lang/String;", "getDataStore", "", "setQuterToYear", "set", "Lhimanshu/projects/sphtech/model/datamodel/Datastore;", "setViewListener", "con", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tokenID = "a807b7ab-6cad-4aa6-87d0-e283a7353a0f";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressbar;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<himanshu.projects.sphtech.model.datamodel.RecordsForYear>> mutableRecordsForYear;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager cm;
    @org.jetbrains.annotations.Nullable()
    private emarge.project.caloriecaffe.network.api.APIInterface apiInterface;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application contx;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgressbar() {
        return null;
    }
    
    public final void setShowProgressbar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<himanshu.projects.sphtech.model.datamodel.RecordsForYear>> getMutableRecordsForYear() {
        return null;
    }
    
    public final void setMutableRecordsForYear(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<himanshu.projects.sphtech.model.datamodel.RecordsForYear>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.ConnectivityManager getCm() {
        return null;
    }
    
    public final void setCm(@org.jetbrains.annotations.Nullable()
    android.net.ConnectivityManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final emarge.project.caloriecaffe.network.api.APIInterface getApiInterface() {
        return null;
    }
    
    public final void setApiInterface(@org.jetbrains.annotations.Nullable()
    emarge.project.caloriecaffe.network.api.APIInterface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getContx() {
        return null;
    }
    
    public final void setContx(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    public final void setViewListener(@org.jetbrains.annotations.NotNull()
    android.app.Application con) {
    }
    
    public final void getDataStore() {
    }
    
    public final void setQuterToYear(@org.jetbrains.annotations.NotNull()
    himanshu.projects.sphtech.model.datamodel.Datastore set) {
    }
    
    public MainViewModel() {
        super();
    }
}