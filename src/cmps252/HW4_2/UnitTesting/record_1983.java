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

@Tag("33")
class Record_1983 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1983: FirstName is Guillermo")
	void FirstNameOfRecord1983() {
		assertEquals("Guillermo", customers.get(1982).getFirstName());
	}

	@Test
	@DisplayName("Record 1983: LastName is Thompkins")
	void LastNameOfRecord1983() {
		assertEquals("Thompkins", customers.get(1982).getLastName());
	}

	@Test
	@DisplayName("Record 1983: Company is Winet, Randall L Esq")
	void CompanyOfRecord1983() {
		assertEquals("Winet, Randall L Esq", customers.get(1982).getCompany());
	}

	@Test
	@DisplayName("Record 1983: Address is 8440 S 116th St")
	void AddressOfRecord1983() {
		assertEquals("8440 S 116th St", customers.get(1982).getAddress());
	}

	@Test
	@DisplayName("Record 1983: City is Franklin")
	void CityOfRecord1983() {
		assertEquals("Franklin", customers.get(1982).getCity());
	}

	@Test
	@DisplayName("Record 1983: County is Milwaukee")
	void CountyOfRecord1983() {
		assertEquals("Milwaukee", customers.get(1982).getCounty());
	}

	@Test
	@DisplayName("Record 1983: State is WI")
	void StateOfRecord1983() {
		assertEquals("WI", customers.get(1982).getState());
	}

	@Test
	@DisplayName("Record 1983: ZIP is 53132")
	void ZIPOfRecord1983() {
		assertEquals("53132", customers.get(1982).getZIP());
	}

	@Test
	@DisplayName("Record 1983: Phone is 414-529-6199")
	void PhoneOfRecord1983() {
		assertEquals("414-529-6199", customers.get(1982).getPhone());
	}

	@Test
	@DisplayName("Record 1983: Fax is 414-529-5036")
	void FaxOfRecord1983() {
		assertEquals("414-529-5036", customers.get(1982).getFax());
	}

	@Test
	@DisplayName("Record 1983: Email is guillermo@thompkins.com")
	void EmailOfRecord1983() {
		assertEquals("guillermo@thompkins.com", customers.get(1982).getEmail());
	}

	@Test
	@DisplayName("Record 1983: Web is http://www.guillermothompkins.com")
	void WebOfRecord1983() {
		assertEquals("http://www.guillermothompkins.com", customers.get(1982).getWeb());
	}
}
