package com.saliim.absensimobile.model.absensi;

import com.google.gson.annotations.SerializedName;

public class IsiAbsen{

	@SerializedName("status_absen")
	private String statusAbsen;

	@SerializedName("id")
	private String id;

	@SerializedName("nama")
	private String nama;

	@SerializedName("lokasi")
	private String lokasi;

	@SerializedName("gambar")
	private String gambar;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private String status;

	public void setStatusAbsen(String statusAbsen){
		this.statusAbsen = statusAbsen;
	}

	public String getStatusAbsen(){
		return statusAbsen;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setLokasi(String lokasi){
		this.lokasi = lokasi;
	}

	public String getLokasi(){
		return lokasi;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"IsiAbsen{" + 
			"status_absen = '" + statusAbsen + '\'' + 
			",nama = '" + nama + '\'' + 
			",lokasi = '" + lokasi + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}