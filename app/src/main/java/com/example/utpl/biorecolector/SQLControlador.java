package com.example.utpl.biorecolector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created by ramiro on 08/06/17.
 */
public class SQLControlador {
    private DBhelper dbhelper;
    private Context ourcontext;
    private SQLiteDatabase database;

    public SQLControlador(Context c) {
        ourcontext = c;
    }

    public SQLControlador abrirBaseDeDatos() throws SQLException {
        dbhelper = new DBhelper(ourcontext);
        database = dbhelper.getWritableDatabase();
        return this;
    }

    public void cerrar() {
        dbhelper.close();
    }

    public void insertarDatos(String name,String fecha,String lugar, String cantidad, String estado) {
        ContentValues cv = new ContentValues();
        cv.put(DBhelper.MUESTRA_NOMBRE, name);
        cv.put(DBhelper.MUESTRA_COLOR, fecha);
        cv.put(DBhelper.MUESTRA_TURBIEDAD, lugar);
        cv.put(DBhelper.MUESTRA_PH, cantidad);
        cv.put(DBhelper.MUESTRA_TEMPERATURA, estado);
        cv.put(DBhelper.MUESTRA_CONDUCTIVIDAD, estado);
        cv.put(DBhelper.MUESTRA_STD, estado);
        cv.put(DBhelper.MUESTRA_ALUMINIO, estado);
        cv.put(DBhelper.MUESTRA_COBRE, estado);
        cv.put(DBhelper.MUESTRA_CLORO, estado);
        cv.put(DBhelper.MUESTRA_FOSFATOS, estado);
        cv.put(DBhelper.MUESTRA_FLUORUROS, estado);
        cv.put(DBhelper.MUESTRA_HIERRO, estado);
        cv.put(DBhelper.MUESTRA_MANGANESO, estado);
        cv.put(DBhelper.MUESTRA_NITRATOS, estado);
        cv.put(DBhelper.MUESTRA_NITRITOS, estado);
        cv.put(DBhelper.MUESTRA_NITROGENO, estado);
        database.insert(DBhelper.TABLE_MUESTRA, null, cv);
    }

    public Cursor leerDatos() {
        String[] todasLasColumnas = new String[] {
                DBhelper.MUESTRA_ID,
                DBhelper.MUESTRA_NOMBRE,
                DBhelper.MUESTRA_COLOR,
                DBhelper.MUESTRA_TURBIEDAD,
                DBhelper.MUESTRA_PH,
                DBhelper.MUESTRA_TEMPERATURA,
                DBhelper.MUESTRA_CONDUCTIVIDAD,
                DBhelper.MUESTRA_STD,
                DBhelper.MUESTRA_ALUMINIO,
                DBhelper.MUESTRA_COBRE,
                DBhelper.MUESTRA_CLORO,
                DBhelper.MUESTRA_FOSFATOS,
                DBhelper.MUESTRA_FLUORUROS,
                DBhelper.MUESTRA_HIERRO,
                DBhelper.MUESTRA_MANGANESO,
                DBhelper.MUESTRA_NITRATOS,
                DBhelper.MUESTRA_NITRITOS,
                DBhelper.MUESTRA_NITROGENO
        };
        Cursor c = database.query(DBhelper.TABLE_MUESTRA, todasLasColumnas, null,
                null, null, null, null, null);
        if (c != null) {
            c.moveToFirst();
        }
        return c;
    }

    public int actualizarDatos(long memberID, String memberName, String memberColor, String memberTurbiedad, String memberPh,
                               String memberTemperatura, String memberConductividad, String memberStd, String memberAluminio,
                               String memberCobre, String memberCloro, String memberFosfatos, String memberFluoruros, String memberHierro,
                               String memberManganeso, String memberNitratos, String memberNitritos, String memberNitrogeno) {
        ContentValues cvActualizar = new ContentValues();
        cvActualizar.put(DBhelper.MUESTRA_NOMBRE, memberName);
        cvActualizar.put(DBhelper.MUESTRA_COLOR, memberColor);
        cvActualizar.put(DBhelper.MUESTRA_TURBIEDAD, memberTurbiedad);
        cvActualizar.put(DBhelper.MUESTRA_PH, memberPh);
        cvActualizar.put(DBhelper.MUESTRA_TEMPERATURA, memberTemperatura);
        cvActualizar.put(DBhelper.MUESTRA_CONDUCTIVIDAD, memberConductividad);
        cvActualizar.put(DBhelper.MUESTRA_STD, memberStd);
        cvActualizar.put(DBhelper.MUESTRA_ALUMINIO, memberAluminio);
        cvActualizar.put(DBhelper.MUESTRA_COBRE, memberCobre);
        cvActualizar.put(DBhelper.MUESTRA_CLORO, memberCloro);
        cvActualizar.put(DBhelper.MUESTRA_FOSFATOS, memberFosfatos);
        cvActualizar.put(DBhelper.MUESTRA_FLUORUROS, memberFluoruros);
        cvActualizar.put(DBhelper.MUESTRA_HIERRO, memberHierro);
        cvActualizar.put(DBhelper.MUESTRA_MANGANESO, memberManganeso);
        cvActualizar.put(DBhelper.MUESTRA_NITRATOS, memberNitratos);
        cvActualizar.put(DBhelper.MUESTRA_NITRITOS, memberNitritos);
        cvActualizar.put(DBhelper.MUESTRA_NITROGENO, memberNitrogeno);
        int i = database.update(DBhelper.TABLE_MUESTRA, cvActualizar,
                DBhelper.MUESTRA_ID + " = " + memberID, null);
        return i;
    }

    public void deleteData(long memberID) {
        database.delete(DBhelper.TABLE_MUESTRA, DBhelper.MUESTRA_ID + "="
                + memberID, null);
    }
}
