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

@Tag("13")
class Record_867 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 867: FirstName is Juana")
	void FirstNameOfRecord867() {
		assertEquals("Juana", customers.get(866).getFirstName());
	}

	@Test
	@DisplayName("Record 867: LastName is Niebla")
	void LastNameOfRecord867() {
		assertEquals("Niebla", customers.get(866).getLastName());
	}

	@Test
	@DisplayName("Record 867: Company is Clifton Sheet Metal Inc")
	void CompanyOfRecord867() {
		assertEquals("Clifton Sheet Metal Inc", customers.get(866).getCompany());
	}

	@Test
	@DisplayName("Record 867: Address is 10611 Ramona Ave")
	void AddressOfRecord867() {
		assertEquals("10611 Ramona Ave", customers.get(866).getAddress());
	}

	@Test
	@DisplayName("Record 867: City is Montclair")
	void CityOfRecord867() {
		assertEquals("Montclair", customers.get(866).getCity());
	}

	@Test
	@DisplayName("Record 867: County is San Bernardino")
	void CountyOfRecord867() {
		assertEquals("San Bernardino", customers.get(866).getCounty());
	}

	@Test
	@DisplayName("Record 867: State is CA")
	void StateOfRecord867() {
		assertEquals("CA", customers.get(866).getState());
	}

	@Test
	@DisplayName("Record 867: ZIP is 91763")
	void ZIPOfRecord867() {
		assertEquals("91763", customers.get(866).getZIP());
	}

	@Test
	@DisplayName("Record 867: Phone is 909-624-1966")
	void PhoneOfRecord867() {
		assertEquals("909-624-1966", customers.get(866).getPhone());
	}

	@Test
	@DisplayName("Record 867: Fax is 909-624-7328")
	void FaxOfRecord867() {
		assertEquals("909-624-7328", customers.get(866).getFax());
	}

	@Test
	@DisplayName("Record 867: Email is juana@niebla.com")
	void EmailOfRecord867() {
		assertEquals("juana@niebla.com", customers.get(866).getEmail());
	}

	@Test
	@DisplayName("Record 867: Web is http://www.juananiebla.com")
	void WebOfRecord867() {
		assertEquals("http://www.juananiebla.com", customers.get(866).getWeb());
	}
}
