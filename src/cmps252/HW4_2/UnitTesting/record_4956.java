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
class Record_4956 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4956: FirstName is Tyron")
	void FirstNameOfRecord4956() {
		assertEquals("Tyron", customers.get(4955).getFirstName());
	}

	@Test
	@DisplayName("Record 4956: LastName is Estey")
	void LastNameOfRecord4956() {
		assertEquals("Estey", customers.get(4955).getLastName());
	}

	@Test
	@DisplayName("Record 4956: Company is Torpy, Richard E Esq")
	void CompanyOfRecord4956() {
		assertEquals("Torpy, Richard E Esq", customers.get(4955).getCompany());
	}

	@Test
	@DisplayName("Record 4956: Address is 114 Chestnut Ridge Dr")
	void AddressOfRecord4956() {
		assertEquals("114 Chestnut Ridge Dr", customers.get(4955).getAddress());
	}

	@Test
	@DisplayName("Record 4956: City is Leonardtown")
	void CityOfRecord4956() {
		assertEquals("Leonardtown", customers.get(4955).getCity());
	}

	@Test
	@DisplayName("Record 4956: County is Saint Marys")
	void CountyOfRecord4956() {
		assertEquals("Saint Marys", customers.get(4955).getCounty());
	}

	@Test
	@DisplayName("Record 4956: State is MD")
	void StateOfRecord4956() {
		assertEquals("MD", customers.get(4955).getState());
	}

	@Test
	@DisplayName("Record 4956: ZIP is 20650")
	void ZIPOfRecord4956() {
		assertEquals("20650", customers.get(4955).getZIP());
	}

	@Test
	@DisplayName("Record 4956: Phone is 301-475-1631")
	void PhoneOfRecord4956() {
		assertEquals("301-475-1631", customers.get(4955).getPhone());
	}

	@Test
	@DisplayName("Record 4956: Fax is 301-475-1382")
	void FaxOfRecord4956() {
		assertEquals("301-475-1382", customers.get(4955).getFax());
	}

	@Test
	@DisplayName("Record 4956: Email is tyron@estey.com")
	void EmailOfRecord4956() {
		assertEquals("tyron@estey.com", customers.get(4955).getEmail());
	}

	@Test
	@DisplayName("Record 4956: Web is http://www.tyronestey.com")
	void WebOfRecord4956() {
		assertEquals("http://www.tyronestey.com", customers.get(4955).getWeb());
	}
}
