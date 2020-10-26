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

@Tag("23")
class Record_978 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 978: FirstName is Isaiah")
	void FirstNameOfRecord978() {
		assertEquals("Isaiah", customers.get(977).getFirstName());
	}

	@Test
	@DisplayName("Record 978: LastName is Ryce")
	void LastNameOfRecord978() {
		assertEquals("Ryce", customers.get(977).getLastName());
	}

	@Test
	@DisplayName("Record 978: Company is William Condon & Company Ltd")
	void CompanyOfRecord978() {
		assertEquals("William Condon & Company Ltd", customers.get(977).getCompany());
	}

	@Test
	@DisplayName("Record 978: Address is 1801 S Lumber St")
	void AddressOfRecord978() {
		assertEquals("1801 S Lumber St", customers.get(977).getAddress());
	}

	@Test
	@DisplayName("Record 978: City is Chicago")
	void CityOfRecord978() {
		assertEquals("Chicago", customers.get(977).getCity());
	}

	@Test
	@DisplayName("Record 978: County is Cook")
	void CountyOfRecord978() {
		assertEquals("Cook", customers.get(977).getCounty());
	}

	@Test
	@DisplayName("Record 978: State is IL")
	void StateOfRecord978() {
		assertEquals("IL", customers.get(977).getState());
	}

	@Test
	@DisplayName("Record 978: ZIP is 60616")
	void ZIPOfRecord978() {
		assertEquals("60616", customers.get(977).getZIP());
	}

	@Test
	@DisplayName("Record 978: Phone is 312-666-9702")
	void PhoneOfRecord978() {
		assertEquals("312-666-9702", customers.get(977).getPhone());
	}

	@Test
	@DisplayName("Record 978: Fax is 312-666-5464")
	void FaxOfRecord978() {
		assertEquals("312-666-5464", customers.get(977).getFax());
	}

	@Test
	@DisplayName("Record 978: Email is isaiah@ryce.com")
	void EmailOfRecord978() {
		assertEquals("isaiah@ryce.com", customers.get(977).getEmail());
	}

	@Test
	@DisplayName("Record 978: Web is http://www.isaiahryce.com")
	void WebOfRecord978() {
		assertEquals("http://www.isaiahryce.com", customers.get(977).getWeb());
	}
}
