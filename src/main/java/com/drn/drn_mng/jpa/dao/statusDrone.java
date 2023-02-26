package com.drn.drn_mng.jpa.dao;

import com.drn.drn_mng.dto.StatusDrn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="stdrone")
@Entity(name="statusDrone")
@Getter //Gera os metodos getters 
@NoArgsConstructor //Constructor default sem argumentos 
@AllArgsConstructor  //Consructor para receber todos os dados 
@EqualsAndHashCode(of="id")

//Entidade para posterior uso na isert dos dados em banco relacional
public class statusDrone {
	public statusDrone() {
		
	}
	public statusDrone(StatusDrn sts) {
		this.longitude = sts.longitude();
		this.latitude = sts.latitude();
		this.barox = sts.barox();
		this.baroy = sts.baroy();
		this.baroz = sts.baroz();
		this.baroC = sts.baroC();
		// TODO Auto-generated constructor stub
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id; 
	
	 double longitude; 
	 double latitude; 
	 float barox;
	 float baroy; 
	 float baroz; 
	 float baroC; 
	
	//@Embedded caso seja adicionado outra classe com os demais dados
	//@Enumerated caso seja usado uma classe enum 
}
