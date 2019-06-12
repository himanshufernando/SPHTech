package himanshu.projects.sphtech.model.datamodel

import com.google.gson.annotations.SerializedName

public class Datastore{


    @SerializedName("help")
    lateinit var help: String

    @SerializedName("success")
    var success: Boolean = false

    @SerializedName("result")
    var result: Result = Result()


    constructor()
}