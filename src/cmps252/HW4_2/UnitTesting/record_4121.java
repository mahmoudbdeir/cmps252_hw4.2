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

@Tag("16")
class Record_4121 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4121: FirstName is Tamra")
	void FirstNameOfRecord4121() {
		assertEquals("Tamra", customers.get(4120).getFirstName());
	}

	@Test
	@DisplayName("Record 4121: LastName is Ivins")
	void LastNameOfRecord4121() {
		assertEquals("Ivins", customers.get(4120).getLastName());
	}

	@Test
	@DisplayName("Record 4121: Company is Nebraska Commercial Lndry Sls")
	void CompanyOfRecord4121() {
		assertEquals("Nebraska Commercial Lndry Sls", customers.get(4120).getCompany());
	}

	@Test
	@DisplayName("Record 4121: Address is 243 Mount Hermon Rd")
	void AddressOfRecord4121() {
		assertEquals("243 Mount Hermon Rd", customers.get(4120).getAddress());
	}

	@Test
	@DisplayName("Record 4121: City is Scotts Valley")
	void CityOfRecord4121() {
		assertEquals("Scotts Valley", customers.get(4120).getCity());
	}

	@Test
	@DisplayName("Record 4121: County is Santa Cruz")
	void CountyOfRecord4121() {
		assertEquals("Santa Cruz", customers.get(4120).getCounty());
	}

	@Test
	@DisplayName("Record 4121: State is CA")
	void StateOfRecord4121() {
		assertEquals("CA", customers.get(4120).getState());
	}

	@Test
	@DisplayName("Record 4121: ZIP is 95066")
	void ZIPOfRecord4121() {
		assertEquals("95066", customers.get(4120).getZIP());
	}

	@Test
	@DisplayName("Record 4121: Phone is 831-438-9571")
	void PhoneOfRecord4121() {
		assertEquals("831-438-9571", customers.get(4120).getPhone());
	}

	@Test
	@DisplayName("Record 4121: Fax is 831-438-2342")
	void FaxOfRecord4121() {
		assertEquals("831-438-2342", customers.get(4120).getFax());
	}

	@Test
	@DisplayName("Record 4121: Email is tamra@ivins.com")
	void EmailOfRecord4121() {
		assertEquals("tamra@ivins.com", customers.get(4120).getEmail());
	}

	@Test
	@DisplayName("Record 4121: Web is http://www.tamraivins.com")
	void WebOfRecord4121() {
		assertEquals("http://www.tamraivins.com", customers.get(4120).getWeb());
	}
}
