package br.com.adssearch.dto;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchGoogleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String statusPesquisa;
	private String respostaPesquisa;


}
