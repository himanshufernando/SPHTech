package emarge.project.caloriecaffe.network.api


import com.google.gson.JsonObject
import himanshu.projects.sphtech.model.datamodel.Datastore


import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

import java.util.ArrayList

/**
 * Created by Himanshu on 9/6/19.
 */
interface APIInterface{

    @GET("action/datastore_search")
    fun getDataStore(@Query("resource_id") resource_id: String,@Query("offset") offset: Int): Observable<Datastore>



}
