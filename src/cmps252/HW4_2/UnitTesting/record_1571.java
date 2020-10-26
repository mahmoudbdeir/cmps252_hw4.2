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

@Tag("12")
class Record_1571 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1571: FirstName is Carmelo")
	void FirstNameOfRecord1571() {
		assertEquals("Carmelo", customers.get(1570).getFirstName());
	}

	@Test
	@DisplayName("Record 1571: LastName is Klutts")
	void LastNameOfRecord1571() {
		assertEquals("Klutts", customers.get(1570).getLastName());
	}

	@Test
	@DisplayName("Record 1571: Company is Western Computer")
	void CompanyOfRecord1571() {
		assertEquals("Western Computer", customers.get(1570).getCompany());
	}

	@Test
	@DisplayName("Record 1571: Address is 401 N Michigan Ave")
	void AddressOfRecord1571() {
		assertEquals("401 N Michigan Ave", customers.get(1570).getAddress());
	}

	@Test
	@DisplayName("Record 1571: City is Chicago")
	void CityOfRecord1571() {
		assertEquals("Chicago", customers.get(1570).getCity());
	}

	@Test
	@DisplayName("Record 1571: County is Cook")
	void CountyOfRecord1571() {
		assertEquals("Cook", customers.get(1570).getCounty());
	}

	@Test
	@DisplayName("Record 1571: State is IL")
	void StateOfRecord1571() {
		assertEquals("IL", customers.get(1570).getState());
	}

	@Test
	@DisplayName("Record 1571: ZIP is 60611")
	void ZIPOfRecord1571() {
		assertEquals("60611", customers.get(1570).getZIP());
	}

	@Test
	@DisplayName("Record 1571: Phone is 312-527-2643")
	void PhoneOfRecord1571() {
		assertEquals("312-527-2643", customers.get(1570).getPhone());
	}

	@Test
	@DisplayName("Record 1571: Fax is 312-527-4668")
	void FaxOfRecord1571() {
		assertEquals("312-527-4668", customers.get(1570).getFax());
	}

	@Test
	@DisplayName("Record 1571: Email is carmelo@klutts.com")
	void EmailOfRecord1571() {
		assertEquals("carmelo@klutts.com", customers.get(1570).getEmail());
	}

	@Test
	@DisplayName("Record 1571: Web is http://www.carmeloklutts.com")
	void WebOfRecord1571() {
		assertEquals("http://www.carmeloklutts.com", customers.get(1570).getWeb());
	}
}
