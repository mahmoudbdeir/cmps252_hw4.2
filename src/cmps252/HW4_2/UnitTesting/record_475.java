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
class Record_475 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 475: FirstName is Gussie")
	void FirstNameOfRecord475() {
		assertEquals("Gussie", customers.get(474).getFirstName());
	}

	@Test
	@DisplayName("Record 475: LastName is Bodle")
	void LastNameOfRecord475() {
		assertEquals("Bodle", customers.get(474).getLastName());
	}

	@Test
	@DisplayName("Record 475: Company is Precision Printing")
	void CompanyOfRecord475() {
		assertEquals("Precision Printing", customers.get(474).getCompany());
	}

	@Test
	@DisplayName("Record 475: Address is Woodfield")
	void AddressOfRecord475() {
		assertEquals("Woodfield", customers.get(474).getAddress());
	}

	@Test
	@DisplayName("Record 475: City is Schaumburg")
	void CityOfRecord475() {
		assertEquals("Schaumburg", customers.get(474).getCity());
	}

	@Test
	@DisplayName("Record 475: County is Cook")
	void CountyOfRecord475() {
		assertEquals("Cook", customers.get(474).getCounty());
	}

	@Test
	@DisplayName("Record 475: State is IL")
	void StateOfRecord475() {
		assertEquals("IL", customers.get(474).getState());
	}

	@Test
	@DisplayName("Record 475: ZIP is 60173")
	void ZIPOfRecord475() {
		assertEquals("60173", customers.get(474).getZIP());
	}

	@Test
	@DisplayName("Record 475: Phone is 847-619-2943")
	void PhoneOfRecord475() {
		assertEquals("847-619-2943", customers.get(474).getPhone());
	}

	@Test
	@DisplayName("Record 475: Fax is 847-619-3171")
	void FaxOfRecord475() {
		assertEquals("847-619-3171", customers.get(474).getFax());
	}

	@Test
	@DisplayName("Record 475: Email is gussie@bodle.com")
	void EmailOfRecord475() {
		assertEquals("gussie@bodle.com", customers.get(474).getEmail());
	}

	@Test
	@DisplayName("Record 475: Web is http://www.gussiebodle.com")
	void WebOfRecord475() {
		assertEquals("http://www.gussiebodle.com", customers.get(474).getWeb());
	}
}
