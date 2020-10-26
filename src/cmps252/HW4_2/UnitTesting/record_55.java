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
class Record_55 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 55: FirstName is Rhett")
	void FirstNameOfRecord55() {
		assertEquals("Rhett", customers.get(54).getFirstName());
	}

	@Test
	@DisplayName("Record 55: LastName is Malena")
	void LastNameOfRecord55() {
		assertEquals("Malena", customers.get(54).getLastName());
	}

	@Test
	@DisplayName("Record 55: Company is Riverside Community Cllg Dist")
	void CompanyOfRecord55() {
		assertEquals("Riverside Community Cllg Dist", customers.get(54).getCompany());
	}

	@Test
	@DisplayName("Record 55: Address is 7001 W 20th Ave")
	void AddressOfRecord55() {
		assertEquals("7001 W 20th Ave", customers.get(54).getAddress());
	}

	@Test
	@DisplayName("Record 55: City is Hialeah")
	void CityOfRecord55() {
		assertEquals("Hialeah", customers.get(54).getCity());
	}

	@Test
	@DisplayName("Record 55: County is Miami-Dade")
	void CountyOfRecord55() {
		assertEquals("Miami-Dade", customers.get(54).getCounty());
	}

	@Test
	@DisplayName("Record 55: State is FL")
	void StateOfRecord55() {
		assertEquals("FL", customers.get(54).getState());
	}

	@Test
	@DisplayName("Record 55: ZIP is 33014")
	void ZIPOfRecord55() {
		assertEquals("33014", customers.get(54).getZIP());
	}

	@Test
	@DisplayName("Record 55: Phone is 305-823-5229")
	void PhoneOfRecord55() {
		assertEquals("305-823-5229", customers.get(54).getPhone());
	}

	@Test
	@DisplayName("Record 55: Fax is 305-823-6917")
	void FaxOfRecord55() {
		assertEquals("305-823-6917", customers.get(54).getFax());
	}

	@Test
	@DisplayName("Record 55: Email is rhett@malena.com")
	void EmailOfRecord55() {
		assertEquals("rhett@malena.com", customers.get(54).getEmail());
	}

	@Test
	@DisplayName("Record 55: Web is http://www.rhettmalena.com")
	void WebOfRecord55() {
		assertEquals("http://www.rhettmalena.com", customers.get(54).getWeb());
	}
}
