package br.ufpi.lost.viagens.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.ufpi.lost.viagens.R;
import br.ufpi.lost.viagens.model.Pacote;

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private Context contexto;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context contexto){
        this.pacotes = pacotes;
        this.contexto = contexto;
    }


    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        TextView local = view.findViewById(R.id.item_pacote_local);
        local.setText(pacote.getLocal());


        return view;
    }
}
