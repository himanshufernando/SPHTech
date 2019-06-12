package emarge.project.caloriecaffe.network.api;

import java.lang.System;

/**
 * Created by Himanshu on 9/6/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lemarge/project/caloriecaffe/network/api/APIInterface;", "", "getDataStore", "Lio/reactivex/Observable;", "Lhimanshu/projects/sphtech/model/datamodel/Datastore;", "resource_id", "", "offset", "", "app_debug"})
public abstract interface APIInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "action/datastore_search")
    public abstract io.reactivex.Observable<himanshu.projects.sphtech.model.datamodel.Datastore> getDataStore(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "resource_id")
    java.lang.String resource_id, @retrofit2.http.Query(value = "offset")
    int offset);
}