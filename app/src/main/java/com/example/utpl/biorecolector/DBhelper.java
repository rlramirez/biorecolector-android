package com.example.utpl.biorecolector;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ramiro on 08/06/17.
 */
class DBhelper extends SQLiteOpenHelper {

    // Información de la tabla
    public static final String TABLE_MUESTRA = "muestras";
    public static final String MUESTRA_ID = "_id";
    public static final String MUESTRA_NOMBRE = "nombre";
    public static final String MUESTRA_COLOR = "color";
    public static final String MUESTRA_TURBIEDAD = "turbiedad";
    public static final String MUESTRA_PH = "ph";
    public static final String MUESTRA_TEMPERATURA = "temperatura";
    public static final String MUESTRA_CONDUCTIVIDAD = "cunductividad";

    public static final String MUESTRA_STD = "std";
    public static final String MUESTRA_ALUMINIO = "aluminio";
    public static final String MUESTRA_COBRE = "cobre";
    public static final String MUESTRA_CLORO = "cloro";
    public static final String MUESTRA_FOSFATOS = "fosfatos";
    public static final String MUESTRA_FLUORUROS = "fluoruros";
    public static final String MUESTRA_HIERRO = "hierro";
    public static final String MUESTRA_MANGANESO = "manganeso";
    public static final String MUESTRA_NITRATOS = "nitratos";
    public static final String MUESTRA_NITRITOS = "nitritos";
    public static final String MUESTRA_NITROGENO = "nitrogeno";

    // información del a base de datos
    static final String DB_NAME = "DBBIOMUESTRA";
    static final int DB_VERSION = 1;

    // Información de la base de datos
    private static final String CREATE_TABLE = "create table "
            + TABLE_MUESTRA + "(" + MUESTRA_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MUESTRA_NOMBRE + " TEXT NOT NULL ,"
            + MUESTRA_COLOR + " TEXT NOT NULL ,"
            + MUESTRA_TURBIEDAD + " TEXT NOT NULL ,"
            + MUESTRA_PH + " TEXT NOT NULL ,"
            + MUESTRA_TEMPERATURA + " TEXT NOT NULL ,"
            + MUESTRA_CONDUCTIVIDAD + " TEXT NOT NULL ,"
            + MUESTRA_STD + " TEXT NOT NULL ,"
            + MUESTRA_ALUMINIO + " TEXT NOT NULL ,"
            + MUESTRA_COBRE + " TEXT NOT NULL ,"
            + MUESTRA_CLORO + " TEXT NOT NULL ,"
            + MUESTRA_FOSFATOS + " TEXT NOT NULL ,"
            + MUESTRA_FLUORUROS + " TEXT NOT NULL ,"
            + MUESTRA_HIERRO + " TEXT NOT NULL ,"
            + MUESTRA_MANGANESO + " TEXT NOT NULL ,"
            + MUESTRA_NITRATOS + " TEXT NOT NULL ,"
            + MUESTRA_NITRITOS + " TEXT NOT NULL ,"
            + MUESTRA_NITROGENO + " TEXT NOT NULL);";

    public DBhelper(Context context) {
        super(context, DB_NAME, null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MUESTRA);
        onCreate(db);
    }
}