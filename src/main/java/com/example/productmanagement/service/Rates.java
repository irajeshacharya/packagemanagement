package com.example.productmanagement.service;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
public class Rates implements Serializable {
	private static final long serialVersionUID = 6678067061511539085L;
	@JsonProperty("CAD")
	public Double cad;

	@JsonProperty("HKD")
	public Double hkd;

	@JsonProperty("ISK")
	private Double isk;

	@JsonProperty("PHP")
	private Double php;

	@JsonProperty("DKK")
	private Double dkk;

	@JsonProperty("HUF")
	private Double huf;

	@JsonProperty("CZK")
	private Double czk;

	@JsonProperty("AUD")
	private Double aud;

	@JsonProperty("RON")
	private Double ron;

	@JsonProperty("SEK")
	private Double sek;

	@JsonProperty("IDR")
	private Double idr;

	@JsonProperty("INR")
	private Double inr;

	@JsonProperty("BRL")
	private Double brl;

	@JsonProperty("RUB")
	private Double rub;

	@JsonProperty("HRK")
	private Double hrk;

	@JsonProperty("JPY")
	private Double jpy;

	@JsonProperty("THB")
	private Double thb;

	@JsonProperty("CHF")
	private Double chf;

	@JsonProperty("SGD")
	private Double sgd;

	@JsonProperty("PLN")
	private Double pln;

	@JsonProperty("BGN")
	private Double bgn;

	@JsonProperty("TRY")
	private Double tryC;

	@JsonProperty("CNY")
	private Double cny;

	@JsonProperty("NOK")
	private Double nok;

	@JsonProperty("NZD")
	private Double nzd;

	@JsonProperty("ZAR")
	private Double zar;

	@JsonProperty("USD")
	private Double usd;

	@JsonProperty("MXN")
	private Double mxn;

	@JsonProperty("ILS")
	private Double ils;

	@JsonProperty("GBP")
	private Double gbp;

	@JsonProperty("KRW")
	private Double krw;

	@JsonProperty("MYR")
	private Double myr;

	public Double getCad() {
		return cad;
	}

	public void setCad(Double cad) {
		this.cad = cad;
	}

	public Double getHkd() {
		return hkd;
	}

	public void setHkd(Double hkd) {
		this.hkd = hkd;
	}

	public Double getIsk() {
		return isk;
	}

	public void setIsk(Double isk) {
		this.isk = isk;
	}

	public Double getPhp() {
		return php;
	}

	public void setPhp(Double php) {
		this.php = php;
	}

	public Double getDkk() {
		return dkk;
	}

	public void setDkk(Double dkk) {
		this.dkk = dkk;
	}

	public Double getHuf() {
		return huf;
	}

	public void setHuf(Double huf) {
		this.huf = huf;
	}

	public Double getCzk() {
		return czk;
	}

	public void setCzk(Double czk) {
		this.czk = czk;
	}

	public Double getAud() {
		return aud;
	}

	public void setAud(Double aud) {
		this.aud = aud;
	}

	public Double getRon() {
		return ron;
	}

	public void setRon(Double ron) {
		this.ron = ron;
	}

	public Double getSek() {
		return sek;
	}

	public void setSek(Double sek) {
		this.sek = sek;
	}

	public Double getIdr() {
		return idr;
	}

	public void setIdr(Double idr) {
		this.idr = idr;
	}

	public Double getInr() {
		return inr;
	}

	public void setInr(Double inr) {
		this.inr = inr;
	}

	public Double getBrl() {
		return brl;
	}

	public void setBrl(Double brl) {
		this.brl = brl;
	}

	public Double getRub() {
		return rub;
	}

	public void setRub(Double rub) {
		this.rub = rub;
	}

	public Double getHrk() {
		return hrk;
	}

	public void setHrk(Double hrk) {
		this.hrk = hrk;
	}

	public Double getJpy() {
		return jpy;
	}

	public void setJpy(Double jpy) {
		this.jpy = jpy;
	}

	public Double getThb() {
		return thb;
	}

	public void setThb(Double thb) {
		this.thb = thb;
	}

	public Double getChf() {
		return chf;
	}

	public void setChf(Double chf) {
		this.chf = chf;
	}

	public Double getSgd() {
		return sgd;
	}

	public void setSgd(Double sgd) {
		this.sgd = sgd;
	}

	public Double getPln() {
		return pln;
	}

	public void setPln(Double pln) {
		this.pln = pln;
	}

	public Double getBgn() {
		return bgn;
	}

	public void setBgn(Double bgn) {
		this.bgn = bgn;
	}

	public Double getTryC() {
		return tryC;
	}

	public void setTryC(Double tryC) {
		this.tryC = tryC;
	}

	public Double getCny() {
		return cny;
	}

	public void setCny(Double cny) {
		this.cny = cny;
	}

	public Double getNok() {
		return nok;
	}

	public void setNok(Double nok) {
		this.nok = nok;
	}

	public Double getNzd() {
		return nzd;
	}

	public void setNzd(Double nzd) {
		this.nzd = nzd;
	}

	public Double getZar() {
		return zar;
	}

	public void setZar(Double zar) {
		this.zar = zar;
	}

	public Double getUsd() {
		return usd;
	}

	public void setUsd(Double usd) {
		this.usd = usd;
	}

	public Double getMxn() {
		return mxn;
	}

	public void setMxn(Double mxn) {
		this.mxn = mxn;
	}

	public Double getIls() {
		return ils;
	}

	public void setIls(Double ils) {
		this.ils = ils;
	}

	public Double getGbp() {
		return gbp;
	}

	public void setGbp(Double gbp) {
		this.gbp = gbp;
	}

	public Double getKrw() {
		return krw;
	}

	public void setKrw(Double krw) {
		this.krw = krw;
	}

	public Double getMyr() {
		return myr;
	}

	public void setMyr(Double myr) {
		this.myr = myr;
	}

}
