package com.example.navigationdrawerapapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryActivity : AppCompatActivity() {

    var modallist = ArrayList<Modal>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        this.setTitle(R.string.show_gallery)
        var images = intArrayOf(R.drawable.concert_1, R.drawable.concert_2, R.drawable.concert_3, R.drawable.concert_4)
        for(i in images.indices){
            modallist.add(Modal(images[i]))
        }
        var customAdapter = CustomAdapter(modallist, this);
        val gridView: GridView = findViewById(R.id.gridView)
        gridView.adapter = customAdapter;

        gridView.setOnItemClickListener { AdapterView, view ,i , l ->
            var intent = Intent(this,GalleryViewActivity::class.java)
            intent.putExtra("data", modallist[i])
            startActivity(intent);


        }
    }


    class CustomAdapter(
        var itemModel: ArrayList<Modal>,
        var context: Context
    ) : BaseAdapter(){

        var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        override fun getView(position: Int, view: View?, viewGroup: ViewGroup?):View {
            var view = view;
            if(view == null){
                view = layoutInflater.inflate(R.layout.portfolia, viewGroup, false);
            }

            var imageView = view?.findViewById<ImageView>(R.id.imageName123);


            imageView?.setImageResource(itemModel[position].image!!)

            return view!!;

        }
        override fun getItem(p0: Int): Any {
            return itemModel[p0]
        }
        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }
        override fun getCount(): Int {
            return itemModel.size
        }
    }
}