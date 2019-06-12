package himanshu.projects.sphtech.model.datamodel

import com.google.gson.annotations.SerializedName

public class RecordsForYear {

    lateinit var volume_of_mobile_data: String
    lateinit var year: String
    var isDecrease: Boolean = false
    lateinit var recordsForQuarter: ArrayList<RecordsForQuarter>


    constructor(volume_of_mobile_data: String, year: String, recordsForQuarter: ArrayList<RecordsForQuarter>,isdecrease: Boolean) {
        this.volume_of_mobile_data = volume_of_mobile_data
        this.year = year
        this.recordsForQuarter = recordsForQuarter
        this.isDecrease = isdecrease
    }
}