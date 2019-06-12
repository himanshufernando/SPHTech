package himanshu.projects.sphtech.model.datamodel

import com.google.gson.annotations.SerializedName

 public class Result  {

     @SerializedName("resource_id") val resource_id : String = ""
     @SerializedName("offset") val offset : Int = 0
     @SerializedName("total") val total : Int = 0
     @SerializedName("records")
     lateinit var records: ArrayList<Records>

     constructor()
}