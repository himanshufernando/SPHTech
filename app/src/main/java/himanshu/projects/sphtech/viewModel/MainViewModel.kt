package himanshu.projects.sphtech.viewModel

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Build
import androidx.databinding.Bindable
import androidx.databinding.ObservableBoolean
import io.reactivex.Observer
import androidx.lifecycle.ViewModel
import emarge.project.caloriecaffe.network.api.APIInterface
import emarge.project.caloriecaffe.network.api.ApiClient
import himanshu.projects.sphtech.BuildConfig
import himanshu.projects.sphtech.model.datamodel.Datastore
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import androidx.databinding.adapters.NumberPickerBindingAdapter.setValue
import androidx.lifecycle.MutableLiveData
import himanshu.projects.sphtech.model.datamodel.Records
import himanshu.projects.sphtech.model.datamodel.RecordsForQuarter
import himanshu.projects.sphtech.model.datamodel.RecordsForYear
import io.reactivex.Observable
import java.util.ArrayList
import java.util.stream.Collectors


class MainViewModel : ViewModel() {


    val tokenID = BuildConfig.RESOURCE_ID

    var showProgressbar = MutableLiveData<Boolean>()




    var mutableRecordsForYear = MutableLiveData<ArrayList<RecordsForYear>>()

    var cm: ConnectivityManager? = null
    var apiInterface: APIInterface? = null
    var contx: Application? = null

    fun setViewListener(con: Application) {
        contx = con
        cm = con.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        apiInterface = ApiClient.client(con)
        getDataStore()
    }


    fun getDataStore() {
            showProgressbar.value = true
            apiInterface!!.getDataStore(tokenID, 14)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<Datastore> {
                    override fun onSubscribe(d: Disposable) {}
                    override fun onNext(log: Datastore) {
                        setQuterToYear(log)
                    }

                    override fun onError(e: Throwable) {
                        showProgressbar.value = false
                    }

                    override fun onComplete() {
                        showProgressbar.value = false
                    }
                })

    }


    fun setQuterToYear(set: Datastore) {

        var recordsForYear = ArrayList<RecordsForYear>()
        var recordsForQuarter = ArrayList<RecordsForQuarter>()

        var yearList = ArrayList<String>()

        for (item in set.result.records!!) {
            val quarterInfo = item.quarter.split("-")
            val year = quarterInfo[0]
            val quarterName = quarterInfo[1]

            var valumes = item.volume_of_mobile_data.toDouble()

            recordsForQuarter.add(RecordsForQuarter(String.format("%.3f", valumes), year, quarterName))
            yearList.add(year)
        }


        var recordsForQuarterTem = ArrayList<RecordsForQuarter>()


        for (itemYear in yearList.distinct()) {
            recordsForQuarterTem = ArrayList<RecordsForQuarter>()
            var valumeForYear = 0.0

            for (itemQuarter in recordsForQuarter) {
                if(itemQuarter.year==itemYear){
                    recordsForQuarterTem.add(RecordsForQuarter(itemQuarter.volume_of_mobile_data,itemYear,itemQuarter.quarter))
                    valumeForYear += itemQuarter.volume_of_mobile_data.toDouble()
                }
            }

            var isDecrease = false
            for (i in 0 until recordsForQuarterTem.size) {
                if(i==recordsForQuarterTem.lastIndex){ }else{ if(recordsForQuarterTem[i].volume_of_mobile_data.toDouble()> recordsForQuarterTem[i+1].volume_of_mobile_data.toDouble()){ isDecrease = true } }
            }

            recordsForYear.add(RecordsForYear(String.format("%.3f", valumeForYear), itemYear, recordsForQuarterTem,isDecrease))
        }

        mutableRecordsForYear.value = recordsForYear
    }


}

