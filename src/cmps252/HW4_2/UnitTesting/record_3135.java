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

@Tag("22")
class Record_3135 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3135: FirstName is Modesto")
	void FirstNameOfRecord3135() {
		assertEquals("Modesto", customers.get(3134).getFirstName());
	}

	@Test
	@DisplayName("Record 3135: LastName is Menzie")
	void LastNameOfRecord3135() {
		assertEquals("Menzie", customers.get(3134).getLastName());
	}

	@Test
	@DisplayName("Record 3135: Company is Dow Warner Inc")
	void CompanyOfRecord3135() {
		assertEquals("Dow Warner Inc", customers.get(3134).getCompany());
	}

	@Test
	@DisplayName("Record 3135: Address is 5658 N 51st Ave")
	void AddressOfRecord3135() {
		assertEquals("5658 N 51st Ave", customers.get(3134).getAddress());
	}

	@Test
	@DisplayName("Record 3135: City is Glendale")
	void CityOfRecord3135() {
		assertEquals("Glendale", customers.get(3134).getCity());
	}

	@Test
	@DisplayName("Record 3135: County is Maricopa")
	void CountyOfRecord3135() {
		assertEquals("Maricopa", customers.get(3134).getCounty());
	}

	@Test
	@DisplayName("Record 3135: State is AZ")
	void StateOfRecord3135() {
		assertEquals("AZ", customers.get(3134).getState());
	}

	@Test
	@DisplayName("Record 3135: ZIP is 85301")
	void ZIPOfRecord3135() {
		assertEquals("85301", customers.get(3134).getZIP());
	}

	@Test
	@DisplayName("Record 3135: Phone is 623-937-8454")
	void PhoneOfRecord3135() {
		assertEquals("623-937-8454", customers.get(3134).getPhone());
	}

	@Test
	@DisplayName("Record 3135: Fax is 623-937-1986")
	void FaxOfRecord3135() {
		assertEquals("623-937-1986", customers.get(3134).getFax());
	}

	@Test
	@DisplayName("Record 3135: Email is modesto@menzie.com")
	void EmailOfRecord3135() {
		assertEquals("modesto@menzie.com", customers.get(3134).getEmail());
	}

	@Test
	@DisplayName("Record 3135: Web is http://www.modestomenzie.com")
	void WebOfRecord3135() {
		assertEquals("http://www.modestomenzie.com", customers.get(3134).getWeb());
	}
}
