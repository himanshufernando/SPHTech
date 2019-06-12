package himanshu.projects.sphtech.model.datamodel

import com.google.gson.annotations.SerializedName

public class RecordsForQuarter{

    lateinit var volume_of_mobile_data: String
    lateinit var year: String
    lateinit var quarter: String

    constructor(volume_of_mobile_data: String, year: String, quarter: String) {
        this.volume_of_mobile_data = volume_of_mobile_data
        this.year = year
        this.quarter = quarter
    }
}