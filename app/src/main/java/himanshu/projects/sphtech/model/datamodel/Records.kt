package himanshu.projects.sphtech.model.datamodel

import com.google.gson.annotations.SerializedName

public class Records{

    @SerializedName("volume_of_mobile_data")
    lateinit var volume_of_mobile_data: String
    @SerializedName("quarter")
    lateinit var quarter: String
    @SerializedName("_id") var id: Int = 0

}