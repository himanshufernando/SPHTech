package himanshu.projects.sphtech

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class SPHTech : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}