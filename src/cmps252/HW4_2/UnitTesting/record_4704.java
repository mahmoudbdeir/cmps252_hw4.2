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

@Tag("32")
class Record_4704 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4704: FirstName is Jami")
	void FirstNameOfRecord4704() {
		assertEquals("Jami", customers.get(4703).getFirstName());
	}

	@Test
	@DisplayName("Record 4704: LastName is Schrauger")
	void LastNameOfRecord4704() {
		assertEquals("Schrauger", customers.get(4703).getLastName());
	}

	@Test
	@DisplayName("Record 4704: Company is Minuteman Press")
	void CompanyOfRecord4704() {
		assertEquals("Minuteman Press", customers.get(4703).getCompany());
	}

	@Test
	@DisplayName("Record 4704: Address is 311 3rd St")
	void AddressOfRecord4704() {
		assertEquals("311 3rd St", customers.get(4703).getAddress());
	}

	@Test
	@DisplayName("Record 4704: City is Annapolis")
	void CityOfRecord4704() {
		assertEquals("Annapolis", customers.get(4703).getCity());
	}

	@Test
	@DisplayName("Record 4704: County is Anne Arundel")
	void CountyOfRecord4704() {
		assertEquals("Anne Arundel", customers.get(4703).getCounty());
	}

	@Test
	@DisplayName("Record 4704: State is MD")
	void StateOfRecord4704() {
		assertEquals("MD", customers.get(4703).getState());
	}

	@Test
	@DisplayName("Record 4704: ZIP is 21403")
	void ZIPOfRecord4704() {
		assertEquals("21403", customers.get(4703).getZIP());
	}

	@Test
	@DisplayName("Record 4704: Phone is 410-269-3803")
	void PhoneOfRecord4704() {
		assertEquals("410-269-3803", customers.get(4703).getPhone());
	}

	@Test
	@DisplayName("Record 4704: Fax is 410-269-6574")
	void FaxOfRecord4704() {
		assertEquals("410-269-6574", customers.get(4703).getFax());
	}

	@Test
	@DisplayName("Record 4704: Email is jami@schrauger.com")
	void EmailOfRecord4704() {
		assertEquals("jami@schrauger.com", customers.get(4703).getEmail());
	}

	@Test
	@DisplayName("Record 4704: Web is http://www.jamischrauger.com")
	void WebOfRecord4704() {
		assertEquals("http://www.jamischrauger.com", customers.get(4703).getWeb());
	}
}
