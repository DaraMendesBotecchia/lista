package mendes.botecchia.lista.model;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import mendes.botecchia.lista.util.MyItem;

public class MainActivityViewModel extends ViewModel {

    List<MyItem> itens = new ArrayList<>();

    public List<MyItem> getItens() {
        return itens;
    }
}


