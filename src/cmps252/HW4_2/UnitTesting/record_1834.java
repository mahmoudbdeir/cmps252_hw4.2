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

@Tag("42")
class Record_1834 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1834: FirstName is Millard")
	void FirstNameOfRecord1834() {
		assertEquals("Millard", customers.get(1833).getFirstName());
	}

	@Test
	@DisplayName("Record 1834: LastName is Gena")
	void LastNameOfRecord1834() {
		assertEquals("Gena", customers.get(1833).getLastName());
	}

	@Test
	@DisplayName("Record 1834: Company is Tapella, Carlena L Esq")
	void CompanyOfRecord1834() {
		assertEquals("Tapella, Carlena L Esq", customers.get(1833).getCompany());
	}

	@Test
	@DisplayName("Record 1834: Address is 4216 W Jefferson Blvd")
	void AddressOfRecord1834() {
		assertEquals("4216 W Jefferson Blvd", customers.get(1833).getAddress());
	}

	@Test
	@DisplayName("Record 1834: City is Los Angeles")
	void CityOfRecord1834() {
		assertEquals("Los Angeles", customers.get(1833).getCity());
	}

	@Test
	@DisplayName("Record 1834: County is Los Angeles")
	void CountyOfRecord1834() {
		assertEquals("Los Angeles", customers.get(1833).getCounty());
	}

	@Test
	@DisplayName("Record 1834: State is CA")
	void StateOfRecord1834() {
		assertEquals("CA", customers.get(1833).getState());
	}

	@Test
	@DisplayName("Record 1834: ZIP is 90016")
	void ZIPOfRecord1834() {
		assertEquals("90016", customers.get(1833).getZIP());
	}

	@Test
	@DisplayName("Record 1834: Phone is 323-730-9862")
	void PhoneOfRecord1834() {
		assertEquals("323-730-9862", customers.get(1833).getPhone());
	}

	@Test
	@DisplayName("Record 1834: Fax is 323-730-0691")
	void FaxOfRecord1834() {
		assertEquals("323-730-0691", customers.get(1833).getFax());
	}

	@Test
	@DisplayName("Record 1834: Email is millard@gena.com")
	void EmailOfRecord1834() {
		assertEquals("millard@gena.com", customers.get(1833).getEmail());
	}

	@Test
	@DisplayName("Record 1834: Web is http://www.millardgena.com")
	void WebOfRecord1834() {
		assertEquals("http://www.millardgena.com", customers.get(1833).getWeb());
	}
}
