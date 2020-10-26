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

@Tag("31")
class Record_255 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 255: FirstName is Santos")
	void FirstNameOfRecord255() {
		assertEquals("Santos", customers.get(254).getFirstName());
	}

	@Test
	@DisplayName("Record 255: LastName is Delmendo")
	void LastNameOfRecord255() {
		assertEquals("Delmendo", customers.get(254).getLastName());
	}

	@Test
	@DisplayName("Record 255: Company is Greenbeam Interiors")
	void CompanyOfRecord255() {
		assertEquals("Greenbeam Interiors", customers.get(254).getCompany());
	}

	@Test
	@DisplayName("Record 255: Address is 2837 Indiana St")
	void AddressOfRecord255() {
		assertEquals("2837 Indiana St", customers.get(254).getAddress());
	}

	@Test
	@DisplayName("Record 255: City is Baltimore")
	void CityOfRecord255() {
		assertEquals("Baltimore", customers.get(254).getCity());
	}

	@Test
	@DisplayName("Record 255: County is Baltimore City")
	void CountyOfRecord255() {
		assertEquals("Baltimore City", customers.get(254).getCounty());
	}

	@Test
	@DisplayName("Record 255: State is MD")
	void StateOfRecord255() {
		assertEquals("MD", customers.get(254).getState());
	}

	@Test
	@DisplayName("Record 255: ZIP is 21230")
	void ZIPOfRecord255() {
		assertEquals("21230", customers.get(254).getZIP());
	}

	@Test
	@DisplayName("Record 255: Phone is 410-685-9383")
	void PhoneOfRecord255() {
		assertEquals("410-685-9383", customers.get(254).getPhone());
	}

	@Test
	@DisplayName("Record 255: Fax is 410-685-6541")
	void FaxOfRecord255() {
		assertEquals("410-685-6541", customers.get(254).getFax());
	}

	@Test
	@DisplayName("Record 255: Email is santos@delmendo.com")
	void EmailOfRecord255() {
		assertEquals("santos@delmendo.com", customers.get(254).getEmail());
	}

	@Test
	@DisplayName("Record 255: Web is http://www.santosdelmendo.com")
	void WebOfRecord255() {
		assertEquals("http://www.santosdelmendo.com", customers.get(254).getWeb());
	}
}
