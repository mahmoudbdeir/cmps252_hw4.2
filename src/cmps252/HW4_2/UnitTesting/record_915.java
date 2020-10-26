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

@Tag("11")
class Record_915 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 915: FirstName is Susana")
	void FirstNameOfRecord915() {
		assertEquals("Susana", customers.get(914).getFirstName());
	}

	@Test
	@DisplayName("Record 915: LastName is Bedee")
	void LastNameOfRecord915() {
		assertEquals("Bedee", customers.get(914).getLastName());
	}

	@Test
	@DisplayName("Record 915: Company is Carolina Trophies")
	void CompanyOfRecord915() {
		assertEquals("Carolina Trophies", customers.get(914).getCompany());
	}

	@Test
	@DisplayName("Record 915: Address is 444 Washington St")
	void AddressOfRecord915() {
		assertEquals("444 Washington St", customers.get(914).getAddress());
	}

	@Test
	@DisplayName("Record 915: City is Providence")
	void CityOfRecord915() {
		assertEquals("Providence", customers.get(914).getCity());
	}

	@Test
	@DisplayName("Record 915: County is Providence")
	void CountyOfRecord915() {
		assertEquals("Providence", customers.get(914).getCounty());
	}

	@Test
	@DisplayName("Record 915: State is RI")
	void StateOfRecord915() {
		assertEquals("RI", customers.get(914).getState());
	}

	@Test
	@DisplayName("Record 915: ZIP is 2903")
	void ZIPOfRecord915() {
		assertEquals("2903", customers.get(914).getZIP());
	}

	@Test
	@DisplayName("Record 915: Phone is 401-453-5090")
	void PhoneOfRecord915() {
		assertEquals("401-453-5090", customers.get(914).getPhone());
	}

	@Test
	@DisplayName("Record 915: Fax is 401-453-7868")
	void FaxOfRecord915() {
		assertEquals("401-453-7868", customers.get(914).getFax());
	}

	@Test
	@DisplayName("Record 915: Email is susana@bedee.com")
	void EmailOfRecord915() {
		assertEquals("susana@bedee.com", customers.get(914).getEmail());
	}

	@Test
	@DisplayName("Record 915: Web is http://www.susanabedee.com")
	void WebOfRecord915() {
		assertEquals("http://www.susanabedee.com", customers.get(914).getWeb());
	}
}
