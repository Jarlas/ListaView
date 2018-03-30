package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import model.Categoria;

public class FXMLCadastroControll implements Initializable {
	
	@FXML
	private ListView<Categoria> lvCategorias;
	
	private List<Categoria> categorias = new ArrayList<>();

	private ObservableList<Categoria> obsCategorias;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	carregarCategoria();
		
	}
	
	public void carregarCategoria() {
		
		
		Categoria c1 = new Categoria(1, "Comidas");
		Categoria c2 = new Categoria(2, "bebidas");
		Categoria c3 = new Categoria(3, "Materiais");
		
		categorias.add(c1);
		categorias.add(c2);
		categorias.add(c3);
		
		obsCategorias = FXCollections.observableArrayList(categorias);
		lvCategorias.setItems(obsCategorias);
		}

}
