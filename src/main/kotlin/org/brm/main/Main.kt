package org.brm.main

import org.bukkit.plugin.java.JavaPlugin
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class Main: JavaPlugin() {

    override fun onLoad() {

        val s1 : File = File(dataFolder.absolutePath+"settings.json")
        if(!s1.exists()){
            s1.createNewFile()
            val s = FileWriter(s1)
            s.write("{\n\n}")
            s.close()
        }
        s = FileReader(s1)
    }
    companion object{
        lateinit var s: FileReader
    }
}