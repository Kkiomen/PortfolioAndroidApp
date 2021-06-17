package com.example.navigationdrawerapapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ConcertAdapter (private val context: Context, private val dataSource: ArrayList<Concert>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    //2
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    //3
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //4



    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val rowView = inflater.inflate(R.layout.list_item_concert, parent, false)

        val titleTextView = rowView.findViewById(R.id.recipe_list_title) as TextView

// Get subtitle element
        val subtitleTextView = rowView.findViewById(R.id.recipe_list_subtitle) as TextView

// Get detail element
        val detailTextView = rowView.findViewById(R.id.recipe_list_detail) as TextView

// Get thumbnail element
        val thumbnailImageView = rowView.findViewById(R.id.recipe_list_thumbnail) as ImageView


        val concert = getItem(position) as Concert

// 2
        titleTextView.text = concert.place
        subtitleTextView.text = concert.date + ", " + concert.address
        detailTextView.text = ""

// 3
        thumbnailImageView.setImageResource(concert.image)


        return rowView
    }




}