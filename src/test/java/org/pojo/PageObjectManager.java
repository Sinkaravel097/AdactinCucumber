package org.pojo;

public class PageObjectManager {

	private PageObjectManager() {

	}

	private static PageObjectManager pom;
	private LoginPojo lp;
	private SearchHotelPojo shp;
	private SelectHotelPojo sh;
	private BookHotelPojo bhp;
	private OrderIdPojo oip;

	public static PageObjectManager getPom() {
		return (pom == null) ? pom = new PageObjectManager() : pom;
	}

	public LoginPojo getLp() {
		return (lp == null) ? lp = new LoginPojo() : lp;
	}

	public SearchHotelPojo getShp() {
		return (shp == null) ? shp = new SearchHotelPojo() : shp;
	}

	public SelectHotelPojo getSh() {
		return (sh == null) ? sh = new SelectHotelPojo() : sh;
	}

	public BookHotelPojo getBhp() {
		return (bhp == null) ? bhp = new BookHotelPojo() : bhp;
	}

	public OrderIdPojo getOip() {
		return (oip == null) ? oip = new OrderIdPojo() : oip;
	}

}
