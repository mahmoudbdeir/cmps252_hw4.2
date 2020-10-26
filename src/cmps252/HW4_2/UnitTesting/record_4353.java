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

@Tag("5")
class Record_4353 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4353: FirstName is Gale")
	void FirstNameOfRecord4353() {
		assertEquals("Gale", customers.get(4352).getFirstName());
	}

	@Test
	@DisplayName("Record 4353: LastName is Winik")
	void LastNameOfRecord4353() {
		assertEquals("Winik", customers.get(4352).getLastName());
	}

	@Test
	@DisplayName("Record 4353: Company is Gainesville North Ind Pk")
	void CompanyOfRecord4353() {
		assertEquals("Gainesville North Ind Pk", customers.get(4352).getCompany());
	}

	@Test
	@DisplayName("Record 4353: Address is 1 E Wacker Dr")
	void AddressOfRecord4353() {
		assertEquals("1 E Wacker Dr", customers.get(4352).getAddress());
	}

	@Test
	@DisplayName("Record 4353: City is Chicago")
	void CityOfRecord4353() {
		assertEquals("Chicago", customers.get(4352).getCity());
	}

	@Test
	@DisplayName("Record 4353: County is Cook")
	void CountyOfRecord4353() {
		assertEquals("Cook", customers.get(4352).getCounty());
	}

	@Test
	@DisplayName("Record 4353: State is IL")
	void StateOfRecord4353() {
		assertEquals("IL", customers.get(4352).getState());
	}

	@Test
	@DisplayName("Record 4353: ZIP is 60601")
	void ZIPOfRecord4353() {
		assertEquals("60601", customers.get(4352).getZIP());
	}

	@Test
	@DisplayName("Record 4353: Phone is 312-527-7278")
	void PhoneOfRecord4353() {
		assertEquals("312-527-7278", customers.get(4352).getPhone());
	}

	@Test
	@DisplayName("Record 4353: Fax is 312-527-5447")
	void FaxOfRecord4353() {
		assertEquals("312-527-5447", customers.get(4352).getFax());
	}

	@Test
	@DisplayName("Record 4353: Email is gale@winik.com")
	void EmailOfRecord4353() {
		assertEquals("gale@winik.com", customers.get(4352).getEmail());
	}

	@Test
	@DisplayName("Record 4353: Web is http://www.galewinik.com")
	void WebOfRecord4353() {
		assertEquals("http://www.galewinik.com", customers.get(4352).getWeb());
	}
}
