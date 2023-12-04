package io.github.charlesanjos.atividade02charles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class IniciarJogo extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_iniciar_jogo);
    if(getSupportActionBar() != null){
      getSupportActionBar().setTitle("Iniciar Jogo!");
    }
  }

  public void jogar(View view) {
    // acessar bd local
    // selecionar o numero de países desejado
    // criar banco firebase
    // armazenar dados do jogo (nome do jogador, paises selecionados) no firebase
  }
}