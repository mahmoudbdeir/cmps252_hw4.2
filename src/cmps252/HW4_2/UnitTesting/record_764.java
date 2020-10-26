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

@Tag("41")
class Record_764 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 764: FirstName is Corinne")
	void FirstNameOfRecord764() {
		assertEquals("Corinne", customers.get(763).getFirstName());
	}

	@Test
	@DisplayName("Record 764: LastName is Arnholts")
	void LastNameOfRecord764() {
		assertEquals("Arnholts", customers.get(763).getLastName());
	}

	@Test
	@DisplayName("Record 764: Company is Language Lab")
	void CompanyOfRecord764() {
		assertEquals("Language Lab", customers.get(763).getCompany());
	}

	@Test
	@DisplayName("Record 764: Address is 71896 Us Highway 111")
	void AddressOfRecord764() {
		assertEquals("71896 Us Highway 111", customers.get(763).getAddress());
	}

	@Test
	@DisplayName("Record 764: City is Rancho Mirage")
	void CityOfRecord764() {
		assertEquals("Rancho Mirage", customers.get(763).getCity());
	}

	@Test
	@DisplayName("Record 764: County is Riverside")
	void CountyOfRecord764() {
		assertEquals("Riverside", customers.get(763).getCounty());
	}

	@Test
	@DisplayName("Record 764: State is CA")
	void StateOfRecord764() {
		assertEquals("CA", customers.get(763).getState());
	}

	@Test
	@DisplayName("Record 764: ZIP is 92270")
	void ZIPOfRecord764() {
		assertEquals("92270", customers.get(763).getZIP());
	}

	@Test
	@DisplayName("Record 764: Phone is 760-340-4888")
	void PhoneOfRecord764() {
		assertEquals("760-340-4888", customers.get(763).getPhone());
	}

	@Test
	@DisplayName("Record 764: Fax is 760-340-3331")
	void FaxOfRecord764() {
		assertEquals("760-340-3331", customers.get(763).getFax());
	}

	@Test
	@DisplayName("Record 764: Email is corinne@arnholts.com")
	void EmailOfRecord764() {
		assertEquals("corinne@arnholts.com", customers.get(763).getEmail());
	}

	@Test
	@DisplayName("Record 764: Web is http://www.corinnearnholts.com")
	void WebOfRecord764() {
		assertEquals("http://www.corinnearnholts.com", customers.get(763).getWeb());
	}
}
