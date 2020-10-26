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

@Tag("4")
class Record_139 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 139: FirstName is Aurelio")
	void FirstNameOfRecord139() {
		assertEquals("Aurelio", customers.get(138).getFirstName());
	}

	@Test
	@DisplayName("Record 139: LastName is Golumski")
	void LastNameOfRecord139() {
		assertEquals("Golumski", customers.get(138).getLastName());
	}

	@Test
	@DisplayName("Record 139: Company is Centennial Bank")
	void CompanyOfRecord139() {
		assertEquals("Centennial Bank", customers.get(138).getCompany());
	}

	@Test
	@DisplayName("Record 139: Address is 5410 Ne 109th Ave")
	void AddressOfRecord139() {
		assertEquals("5410 Ne 109th Ave", customers.get(138).getAddress());
	}

	@Test
	@DisplayName("Record 139: City is Portland")
	void CityOfRecord139() {
		assertEquals("Portland", customers.get(138).getCity());
	}

	@Test
	@DisplayName("Record 139: County is Multnomah")
	void CountyOfRecord139() {
		assertEquals("Multnomah", customers.get(138).getCounty());
	}

	@Test
	@DisplayName("Record 139: State is OR")
	void StateOfRecord139() {
		assertEquals("OR", customers.get(138).getState());
	}

	@Test
	@DisplayName("Record 139: ZIP is 97220")
	void ZIPOfRecord139() {
		assertEquals("97220", customers.get(138).getZIP());
	}

	@Test
	@DisplayName("Record 139: Phone is 503-257-5174")
	void PhoneOfRecord139() {
		assertEquals("503-257-5174", customers.get(138).getPhone());
	}

	@Test
	@DisplayName("Record 139: Fax is 503-257-4758")
	void FaxOfRecord139() {
		assertEquals("503-257-4758", customers.get(138).getFax());
	}

	@Test
	@DisplayName("Record 139: Email is aurelio@golumski.com")
	void EmailOfRecord139() {
		assertEquals("aurelio@golumski.com", customers.get(138).getEmail());
	}

	@Test
	@DisplayName("Record 139: Web is http://www.aureliogolumski.com")
	void WebOfRecord139() {
		assertEquals("http://www.aureliogolumski.com", customers.get(138).getWeb());
	}
}
