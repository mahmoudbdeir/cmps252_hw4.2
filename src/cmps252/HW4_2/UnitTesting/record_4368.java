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

@Tag("7")
class Record_4368 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4368: FirstName is Teresa")
	void FirstNameOfRecord4368() {
		assertEquals("Teresa", customers.get(4367).getFirstName());
	}

	@Test
	@DisplayName("Record 4368: LastName is Dockus")
	void LastNameOfRecord4368() {
		assertEquals("Dockus", customers.get(4367).getLastName());
	}

	@Test
	@DisplayName("Record 4368: Company is Knowlton & Mc Leary Co")
	void CompanyOfRecord4368() {
		assertEquals("Knowlton & Mc Leary Co", customers.get(4367).getCompany());
	}

	@Test
	@DisplayName("Record 4368: Address is 86 Buck Rd")
	void AddressOfRecord4368() {
		assertEquals("86 Buck Rd", customers.get(4367).getAddress());
	}

	@Test
	@DisplayName("Record 4368: City is Southampton")
	void CityOfRecord4368() {
		assertEquals("Southampton", customers.get(4367).getCity());
	}

	@Test
	@DisplayName("Record 4368: County is Bucks")
	void CountyOfRecord4368() {
		assertEquals("Bucks", customers.get(4367).getCounty());
	}

	@Test
	@DisplayName("Record 4368: State is PA")
	void StateOfRecord4368() {
		assertEquals("PA", customers.get(4367).getState());
	}

	@Test
	@DisplayName("Record 4368: ZIP is 18966")
	void ZIPOfRecord4368() {
		assertEquals("18966", customers.get(4367).getZIP());
	}

	@Test
	@DisplayName("Record 4368: Phone is 215-355-0061")
	void PhoneOfRecord4368() {
		assertEquals("215-355-0061", customers.get(4367).getPhone());
	}

	@Test
	@DisplayName("Record 4368: Fax is 215-355-6804")
	void FaxOfRecord4368() {
		assertEquals("215-355-6804", customers.get(4367).getFax());
	}

	@Test
	@DisplayName("Record 4368: Email is teresa@dockus.com")
	void EmailOfRecord4368() {
		assertEquals("teresa@dockus.com", customers.get(4367).getEmail());
	}

	@Test
	@DisplayName("Record 4368: Web is http://www.teresadockus.com")
	void WebOfRecord4368() {
		assertEquals("http://www.teresadockus.com", customers.get(4367).getWeb());
	}
}
