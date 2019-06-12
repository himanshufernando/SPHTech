package himanshu.projects.sphtech.model.datamodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lhimanshu/projects/sphtech/model/datamodel/Result;", "", "()V", "offset", "", "getOffset", "()I", "records", "Ljava/util/ArrayList;", "Lhimanshu/projects/sphtech/model/datamodel/Records;", "Lkotlin/collections/ArrayList;", "getRecords", "()Ljava/util/ArrayList;", "setRecords", "(Ljava/util/ArrayList;)V", "resource_id", "", "getResource_id", "()Ljava/lang/String;", "total", "getTotal", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "resource_id")
    private final java.lang.String resource_id = "";
    @com.google.gson.annotations.SerializedName(value = "offset")
    private final int offset = 0;
    @com.google.gson.annotations.SerializedName(value = "total")
    private final int total = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "records")
    public java.util.ArrayList<himanshu.projects.sphtech.model.datamodel.Records> records;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResource_id() {
        return null;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<himanshu.projects.sphtech.model.datamodel.Records> getRecords() {
        return null;
    }
    
    public final void setRecords(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<himanshu.projects.sphtech.model.datamodel.Records> p0) {
    }
    
    public Result() {
        super();
    }
}