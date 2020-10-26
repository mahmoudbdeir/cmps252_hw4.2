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

@Tag("29")
class Record_4696 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4696: FirstName is Briana")
	void FirstNameOfRecord4696() {
		assertEquals("Briana", customers.get(4695).getFirstName());
	}

	@Test
	@DisplayName("Record 4696: LastName is Westland")
	void LastNameOfRecord4696() {
		assertEquals("Westland", customers.get(4695).getLastName());
	}

	@Test
	@DisplayName("Record 4696: Company is Big B Automtv Wrhse Distribrs")
	void CompanyOfRecord4696() {
		assertEquals("Big B Automtv Wrhse Distribrs", customers.get(4695).getCompany());
	}

	@Test
	@DisplayName("Record 4696: Address is 2560 Madison Ave")
	void AddressOfRecord4696() {
		assertEquals("2560 Madison Ave", customers.get(4695).getAddress());
	}

	@Test
	@DisplayName("Record 4696: City is Baltimore")
	void CityOfRecord4696() {
		assertEquals("Baltimore", customers.get(4695).getCity());
	}

	@Test
	@DisplayName("Record 4696: County is Baltimore City")
	void CountyOfRecord4696() {
		assertEquals("Baltimore City", customers.get(4695).getCounty());
	}

	@Test
	@DisplayName("Record 4696: State is MD")
	void StateOfRecord4696() {
		assertEquals("MD", customers.get(4695).getState());
	}

	@Test
	@DisplayName("Record 4696: ZIP is 21217")
	void ZIPOfRecord4696() {
		assertEquals("21217", customers.get(4695).getZIP());
	}

	@Test
	@DisplayName("Record 4696: Phone is 410-383-1878")
	void PhoneOfRecord4696() {
		assertEquals("410-383-1878", customers.get(4695).getPhone());
	}

	@Test
	@DisplayName("Record 4696: Fax is 410-383-0146")
	void FaxOfRecord4696() {
		assertEquals("410-383-0146", customers.get(4695).getFax());
	}

	@Test
	@DisplayName("Record 4696: Email is briana@westland.com")
	void EmailOfRecord4696() {
		assertEquals("briana@westland.com", customers.get(4695).getEmail());
	}

	@Test
	@DisplayName("Record 4696: Web is http://www.brianawestland.com")
	void WebOfRecord4696() {
		assertEquals("http://www.brianawestland.com", customers.get(4695).getWeb());
	}
}
