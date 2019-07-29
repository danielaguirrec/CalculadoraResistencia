package com.example.calculadoraresistenciassabado


import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.zip.Adler32
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    //Variables globales
    private var  R0: Double = 0.0
    private var  R1: Double = 0.0
    private var  R2: Double = 1.0
    private var  Raux: Double = 0.0
    private var  R2aux: Double = 0.0
    private var  R3: String = "\u00B1 1%"
    private var  Res: String = "Ω"


    private var b: Double =10.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Botones que modifican la primera banda
        bBotonPrim0.setOnClickListener { addValor("0",0)}
        bBotonPrim1.setOnClickListener { addValor("1",0)}
        bBotonPrim2.setOnClickListener { addValor("2",0)}
        bBotonPrim3.setOnClickListener { addValor("3",0)}
        bBotonPrim4.setOnClickListener { addValor("4",0)}
        bBotonPrim5.setOnClickListener { addValor("5",0)}
        bBotonPrim6.setOnClickListener { addValor("6",0)}
        bBotonPrim7.setOnClickListener { addValor("7",0)}
        bBotonPrim8.setOnClickListener { addValor("8",0)}
        bBotonPrim9.setOnClickListener { addValor("9",0)}
        //Botones que modifican la segunda banda
        bBotonSec0.setOnClickListener { addValor("0",1)}
        bBotonSec1.setOnClickListener { addValor("1",1)}
        bBotonSec2.setOnClickListener { addValor("2",1)}
        bBotonSec3.setOnClickListener { addValor("3",1)}
        bBotonSec4.setOnClickListener { addValor("4",1)}
        bBotonSec5.setOnClickListener { addValor("5",1)}
        bBotonSec6.setOnClickListener { addValor("6",1)}
        bBotonSec7.setOnClickListener { addValor("7",1)}
        bBotonSec8.setOnClickListener { addValor("8",1)}
        bBotonSec9.setOnClickListener { addValor("9",1)}
        //Botones que modifican la tercera banda
        bBotonMult0.setOnClickListener { addValor("0",2)}
        bBotonMult1.setOnClickListener { addValor("1",2)}
        bBotonMult2.setOnClickListener { addValor("2",2)}
        bBotonMult3.setOnClickListener { addValor("3",2)}
        bBotonMult4.setOnClickListener { addValor("4",2)}
        bBotonMult5.setOnClickListener { addValor("5",2)}
        bBotonMult6.setOnClickListener { addValor("6",2)}
        bBotonMult7.setOnClickListener { addValor("7",2)}
        bBotonMult8.setOnClickListener { addValor("8",2)}
        bBotonMult9.setOnClickListener { addValor("9",2)}
        //Botones que modifican tolerancia
        bBotonTole0.setOnClickListener { addValor("0",3)}
        bBotonTole1.setOnClickListener { addValor("1",3)}
        bBotonTole2.setOnClickListener { addValor("2",3)}
        bBotonTole3.setOnClickListener { addValor("3",3)}
        bBotonTole4.setOnClickListener { addValor("4",3)}
        bBotonTole5.setOnClickListener { addValor("5",3)}
        bBotonTole6.setOnClickListener { addValor("6",3)}
        bBotonTole7.setOnClickListener { addValor("7",3)}
        bBotonTole8.setOnClickListener { addValor("8",3)}
        bBotonTole9.setOnClickListener { addValor("9",3)}
        //Botones que modifican tolerancia

}

    fun addValor(valor : String , pos : Int){


        if(pos==0){
            when(valor){
                "0"->{
                    var bgShape = bBotonPrim0.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=0.0
                }
                "1"->{
                    var bgShape = bBotonPrim1.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=10.0
                }
                "2"->{
                    var bgShape = bBotonPrim2.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=20.0
                }
                "3"->{
                    var bgShape = bBotonPrim3.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=30.0
                }
                "4"->{
                    var bgShape = bBotonPrim4.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=40.0
                }
                "5"->{
                    var bgShape = bBotonPrim5.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=50.0
                }
                "6"->{
                    var bgShape = bBotonPrim6.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=60.0
                }
                "7"->{
                    var bgShape = bBotonPrim7.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=70.0
                }
                "8"->{
                    var bgShape = bBotonPrim8.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=80.0
                }
                "9"->{
                    var bgShape = bBotonPrim9.getBackground() as Drawable
                    tvbanda0.background=bgShape
                    R0=90.0
                }
            }

        }
        else if(pos==1){
            when(valor){
                "0"->{
                    var bgShape = bBotonPrim0.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=0.0
                }
                "1"->{
                    var bgShape = bBotonPrim1.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=1.0
                }
                "2"->{
                    var bgShape = bBotonPrim2.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=2.0
                }
                "3"->{
                    var bgShape = bBotonPrim3.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=3.0
                }
                "4"->{
                    var bgShape = bBotonPrim4.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=4.0
                }
                "5"->{
                    var bgShape = bBotonPrim5.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=5.0
                }
                "6"->{
                    var bgShape = bBotonPrim6.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=6.0
                }
                "7"->{
                    var bgShape = bBotonPrim7.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=7.0
                }
                "8"->{
                    var bgShape = bBotonPrim8.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=8.0
                }
                "9"->{
                    var bgShape = bBotonPrim9.getBackground() as Drawable
                    tvbanda1.background=bgShape
                    R1=9.0
                }
            }
        }
        else if(pos==2){
            when(valor){
                "0"->{
                    var bgShape = bBotonPrim0.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(0.0)
                }
                "1"->{
                    var bgShape = bBotonPrim1.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(1.0)
                }
                "2"->{
                    var bgShape = bBotonPrim2.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(2.0)
                }
                "3"->{
                    var bgShape = bBotonPrim3.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(3.0)
                }
                "4"->{
                    var bgShape = bBotonPrim4.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(4.0)
                }
                "5"->{
                    var bgShape = bBotonPrim5.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(5.0)
                }
                "6"->{
                    var bgShape = bBotonPrim6.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(6.0)
                }
                "7"->{
                    var bgShape = bBotonPrim7.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(7.0)
                }
                "8"->{
                    var bgShape = bBotonPrim8.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(8.0)
                }
                "9"->{
                    var bgShape = bBotonPrim9.getBackground() as Drawable
                    tvbanda2.background=bgShape
                    R2 = b.pow(9.0)
                }
            }
        }
        else if(pos==3){
            when(valor){
                "0"->{
                    var bgShape = bBotonPrim0.getBackground() as Drawable
                    tvbanda0.background=bgShape

                }
                "1"->{
                    var bgShape = bBotonPrim1.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 1%"
                }
                "2"->{
                    var bgShape = bBotonPrim2.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 2%"
                }
                "3"->{
                    var bgShape = bBotonPrim3.getBackground() as Drawable
                    tvbanda3.background=bgShape

                }
                "4"->{
                    var bgShape = bBotonTole4.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 5%"
                }
                "5"->{
                    var bgShape = bBotonPrim5.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 0.5%"
                }
                "6"->{
                    var bgShape = bBotonPrim6.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 0.25%"
                }
                "7"->{
                    var bgShape = bBotonPrim7.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 0.1%"
                }
                "8"->{
                    var bgShape = bBotonPrim8.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 0.05%"
                }
                "9"->{
                    var bgShape = bBotonTole9.getBackground() as Drawable
                    tvbanda3.background=bgShape
                    R3="\u00B1 10%"
                }
            }
        }
        else{
            Res="Dato invalido"
        }
        //Res=R0+R1+R2+R3
        //Matematica y mostrar resultado
        Raux=R0 +R1
        R2aux=Raux*R2

        //organizo los mulriplos del resultado
        if(R2aux >= b.pow(9.0)){
            R2aux=R2aux / b.pow(9.0)
            Res=R2aux.toString()
            Res+=" GΩ"
        }
        else if(R2aux >= b.pow(8.0)){
            R2aux=R2aux / b.pow(6.0)
            Res=R2aux.toString()
            Res+=" MΩ"
        }
        else if(R2aux >= b.pow(7.0)){
            R2aux=R2aux / b.pow(6.0)
            Res=R2aux.toString()
            Res+=" MΩ"
        }
        else if(R2aux >= b.pow(6.0)){
            R2aux=R2aux / b.pow(6.0)
            Res=R2aux.toString()
            Res+=" MΩ"
        }
        else if(R2aux >= b.pow(5.0)){
            R2aux=R2aux / b.pow(3.0)
            Res=R2aux.toString()
            Res+=" KΩ"
        }
        else if(R2aux >= b.pow(4.0)){
            R2aux=R2aux / b.pow(3.0)
            Res=R2aux.toString()
            Res+=" KΩ"
        }
        else if(R2aux >= b.pow(3.0)){
            R2aux=R2aux / b.pow(3.0)
            Res=R2aux.toString()
            Res+=" KΩ"
        }
        else if(R2aux >= b.pow(2.0)){
            Res=R2aux.toString()
            Res+=" Ω"
        }
        else if(R2aux >= b.pow(1.0)){
            Res=R2aux.toString()
            Res+=" Ω"
        }
        else{
            Res=R2aux.toString()
            Res+=" Ω"
        }
        tResultado.text= Res +R3

    }

}

