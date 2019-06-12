package himanshu.projects.sphtech.view.ui

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import himanshu.projects.sphtech.R
import himanshu.projects.sphtech.databinding.ActivityMainBinding
import himanshu.projects.sphtech.model.datamodel.RecordsForYear
import himanshu.projects.sphtech.view.adaptor.DataAdapter
import himanshu.projects.sphtech.view.adaptor.DataQuarterAdapter
import himanshu.projects.sphtech.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),DataAdapter.ClickListener {


    lateinit var bindingMain :ActivityMainBinding

    lateinit var dataAdapter: DataAdapter
    lateinit var dataQuarterAdapter: DataQuarterAdapter

    lateinit var dialogQuarter : Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingMain = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        bindingMain.main = ViewModelProviders.of(this).get(MainViewModel::class.java)
        bindingMain.main?.setViewListener(application)


        var layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()

        dataAdapter = DataAdapter(this, this)
        dataQuarterAdapter = DataQuarterAdapter(this)

        recyclerView.adapter = dataAdapter


        bindingMain.main!!.showProgressbar.observe(this, Observer<Boolean> {
            it?.let { result ->
                if(result){ progressBar.visibility= View.VISIBLE }else{ progressBar.visibility= View.GONE }
            }
        })


        bindingMain.main!!.mutableRecordsForYear.observe(this, Observer<ArrayList<RecordsForYear>> {
            it?.let { result ->
                dataAdapter.setYearList(result)
                dataAdapter.notifyDataSetChanged()

            }
        })


    }

    override fun onImageClick(v: View?, recordsForYear: RecordsForYear?) {

        dialogQuarter = Dialog(this)
        dialogQuarter.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogQuarter.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogQuarter.setContentView(R.layout.dialog_quarter)
        dialogQuarter.setCancelable(true)


        var layoutManagerQuarter = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var recyclerViewQuarter = dialogQuarter.findViewById<RecyclerView>(R.id.recyclerView_quarter)
        var textYear = dialogQuarter.findViewById<TextView>(R.id.textViewYear)
        textYear.text = recordsForYear?.year


        recyclerViewQuarter!!.layoutManager = layoutManagerQuarter
        recyclerViewQuarter.itemAnimator = DefaultItemAnimator()

        recyclerViewQuarter.adapter = dataQuarterAdapter

        dataQuarterAdapter.setYearList(recordsForYear?.recordsForQuarter)
        dataQuarterAdapter.notifyDataSetChanged()




        dialogQuarter.show()

    }

}
