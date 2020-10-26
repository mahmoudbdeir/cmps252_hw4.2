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

@Tag("8")
class Record_1976 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1976: FirstName is Allen")
	void FirstNameOfRecord1976() {
		assertEquals("Allen", customers.get(1975).getFirstName());
	}

	@Test
	@DisplayName("Record 1976: LastName is Aleksey")
	void LastNameOfRecord1976() {
		assertEquals("Aleksey", customers.get(1975).getLastName());
	}

	@Test
	@DisplayName("Record 1976: Company is Realty Company The Realty Mrtg")
	void CompanyOfRecord1976() {
		assertEquals("Realty Company The Realty Mrtg", customers.get(1975).getCompany());
	}

	@Test
	@DisplayName("Record 1976: Address is 645 N Michigan Ave")
	void AddressOfRecord1976() {
		assertEquals("645 N Michigan Ave", customers.get(1975).getAddress());
	}

	@Test
	@DisplayName("Record 1976: City is Chicago")
	void CityOfRecord1976() {
		assertEquals("Chicago", customers.get(1975).getCity());
	}

	@Test
	@DisplayName("Record 1976: County is Cook")
	void CountyOfRecord1976() {
		assertEquals("Cook", customers.get(1975).getCounty());
	}

	@Test
	@DisplayName("Record 1976: State is IL")
	void StateOfRecord1976() {
		assertEquals("IL", customers.get(1975).getState());
	}

	@Test
	@DisplayName("Record 1976: ZIP is 60611")
	void ZIPOfRecord1976() {
		assertEquals("60611", customers.get(1975).getZIP());
	}

	@Test
	@DisplayName("Record 1976: Phone is 312-755-0408")
	void PhoneOfRecord1976() {
		assertEquals("312-755-0408", customers.get(1975).getPhone());
	}

	@Test
	@DisplayName("Record 1976: Fax is 312-755-6674")
	void FaxOfRecord1976() {
		assertEquals("312-755-6674", customers.get(1975).getFax());
	}

	@Test
	@DisplayName("Record 1976: Email is allen@aleksey.com")
	void EmailOfRecord1976() {
		assertEquals("allen@aleksey.com", customers.get(1975).getEmail());
	}

	@Test
	@DisplayName("Record 1976: Web is http://www.allenaleksey.com")
	void WebOfRecord1976() {
		assertEquals("http://www.allenaleksey.com", customers.get(1975).getWeb());
	}
}
