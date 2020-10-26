package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("48")
class Record_4886 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4886: FirstName is Val")
	void FirstNameOfRecord4886() {
		assertEquals("Val", customers.get(4885).getFirstName());
	}

	@Test
	@DisplayName("Record 4886: LastName is Moradian")
	void LastNameOfRecord4886() {
		assertEquals("Moradian", customers.get(4885).getLastName());
	}

	@Test
	@DisplayName("Record 4886: Company is Stockpot Soups")
	void CompanyOfRecord4886() {
		assertEquals("Stockpot Soups", customers.get(4885).getCompany());
	}

	@Test
	@DisplayName("Record 4886: Address is 770 S Acco Plz")
	void AddressOfRecord4886() {
		assertEquals("770 S Acco Plz", customers.get(4885).getAddress());
	}

	@Test
	@DisplayName("Record 4886: City is Wheeling")
	void CityOfRecord4886() {
		assertEquals("Wheeling", customers.get(4885).getCity());
	}

	@Test
	@DisplayName("Record 4886: County is Cook")
	void CountyOfRecord4886() {
		assertEquals("Cook", customers.get(4885).getCounty());
	}

	@Test
	@DisplayName("Record 4886: State is IL")
	void StateOfRecord4886() {
		assertEquals("IL", customers.get(4885).getState());
	}

	@Test
	@DisplayName("Record 4886: ZIP is 60090")
	void ZIPOfRecord4886() {
		assertEquals("60090", customers.get(4885).getZIP());
	}

	@Test
	@DisplayName("Record 4886: Phone is 847-541-0161")
	void PhoneOfRecord4886() {
		assertEquals("847-541-0161", customers.get(4885).getPhone());
	}

	@Test
	@DisplayName("Record 4886: Fax is 847-541-4859")
	void FaxOfRecord4886() {
		assertEquals("847-541-4859", customers.get(4885).getFax());
	}

	@Test
	@DisplayName("Record 4886: Email is val@moradian.com")
	void EmailOfRecord4886() {
		assertEquals("val@moradian.com", customers.get(4885).getEmail());
	}

	@Test
	@DisplayName("Record 4886: Web is http://www.valmoradian.com")
	void WebOfRecord4886() {
		assertEquals("http://www.valmoradian.com", customers.get(4885).getWeb());
	}
}
