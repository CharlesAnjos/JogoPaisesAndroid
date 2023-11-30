package io.github.charlesanjos.atividade02charles.auxiliadores;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

  // Table Name
  public static final String TABLE_NAME = "PAISES";

  // Table columns
  public static final String _ID = "_id";
  public static final String NOME = "nome";
  public static final String REGIAO = "regiao";
  public static final String POPULACAO = "populacao";
  public static final String BANDEIRA = "bandeira";

  // Database Information
  static final String DB_NAME = "AVALIACAO2.DB";

  // database version
  static final int DB_VERSION = 1;

  // Creating table query
  private static final String CREATE_TABLE =
      "create table " + TABLE_NAME + "("
          + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
          + NOME + " TEXT, "
          + REGIAO + " TEXT, "
          + POPULACAO + " TEXT, "
          + BANDEIRA + " TEXT);";

  public DatabaseHelper(Context context) {
    super(context, DB_NAME, null, DB_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    onCreate(db);
  }
}
