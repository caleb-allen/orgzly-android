package com.orgzly.android.git

import android.net.Uri
import com.orgzly.android.repos.SyncRepo
import com.orgzly.android.repos.TwoWaySyncRepo
import com.orgzly.android.repos.TwoWaySyncResult
import com.orgzly.android.repos.VersionedRook
import java.io.File

class GitRepo: SyncRepo, TwoWaySyncRepo {
    override fun syncBook(uri: Uri, current: VersionedRook, fromDB: File): TwoWaySyncResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun requiresConnection() = true

    override fun getUri(): Uri {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBooks(): List<VersionedRook> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun retrieveBook(fileName: String?, destination: File?): VersionedRook {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun storeBook(file: File?, fileName: String?): VersionedRook {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun renameBook(from: Uri?, name: String?): VersionedRook {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(uri: Uri?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        final val SCHEME = "git"
    }

}