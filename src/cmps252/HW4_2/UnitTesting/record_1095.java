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

@Tag("5")
class Record_1095 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1095: FirstName is Orville")
	void FirstNameOfRecord1095() {
		assertEquals("Orville", customers.get(1094).getFirstName());
	}

	@Test
	@DisplayName("Record 1095: LastName is Hurla")
	void LastNameOfRecord1095() {
		assertEquals("Hurla", customers.get(1094).getLastName());
	}

	@Test
	@DisplayName("Record 1095: Company is Jones, Nathan W Esq")
	void CompanyOfRecord1095() {
		assertEquals("Jones, Nathan W Esq", customers.get(1094).getCompany());
	}

	@Test
	@DisplayName("Record 1095: Address is 24 Hill Rd")
	void AddressOfRecord1095() {
		assertEquals("24 Hill Rd", customers.get(1094).getAddress());
	}

	@Test
	@DisplayName("Record 1095: City is Parsippany")
	void CityOfRecord1095() {
		assertEquals("Parsippany", customers.get(1094).getCity());
	}

	@Test
	@DisplayName("Record 1095: County is Morris")
	void CountyOfRecord1095() {
		assertEquals("Morris", customers.get(1094).getCounty());
	}

	@Test
	@DisplayName("Record 1095: State is NJ")
	void StateOfRecord1095() {
		assertEquals("NJ", customers.get(1094).getState());
	}

	@Test
	@DisplayName("Record 1095: ZIP is 7054")
	void ZIPOfRecord1095() {
		assertEquals("7054", customers.get(1094).getZIP());
	}

	@Test
	@DisplayName("Record 1095: Phone is 973-299-2130")
	void PhoneOfRecord1095() {
		assertEquals("973-299-2130", customers.get(1094).getPhone());
	}

	@Test
	@DisplayName("Record 1095: Fax is 973-299-2959")
	void FaxOfRecord1095() {
		assertEquals("973-299-2959", customers.get(1094).getFax());
	}

	@Test
	@DisplayName("Record 1095: Email is orville@hurla.com")
	void EmailOfRecord1095() {
		assertEquals("orville@hurla.com", customers.get(1094).getEmail());
	}

	@Test
	@DisplayName("Record 1095: Web is http://www.orvillehurla.com")
	void WebOfRecord1095() {
		assertEquals("http://www.orvillehurla.com", customers.get(1094).getWeb());
	}
}
