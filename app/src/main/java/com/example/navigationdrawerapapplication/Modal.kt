package com.example.navigationdrawerapapplication

import java.io.Serializable

class Modal : Serializable{


    var image:Int? = null

    constructor( image:Int ){
        this.image = image;
    }

}