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

@Tag("0")
class Record_3178 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3178: FirstName is Harvey")
	void FirstNameOfRecord3178() {
		assertEquals("Harvey", customers.get(3177).getFirstName());
	}

	@Test
	@DisplayName("Record 3178: LastName is Pero")
	void LastNameOfRecord3178() {
		assertEquals("Pero", customers.get(3177).getLastName());
	}

	@Test
	@DisplayName("Record 3178: Company is Mcglothlin Balivet Co")
	void CompanyOfRecord3178() {
		assertEquals("Mcglothlin Balivet Co", customers.get(3177).getCompany());
	}

	@Test
	@DisplayName("Record 3178: Address is State Hwy  #-73")
	void AddressOfRecord3178() {
		assertEquals("State Hwy  #-73", customers.get(3177).getAddress());
	}

	@Test
	@DisplayName("Record 3178: City is Berlin")
	void CityOfRecord3178() {
		assertEquals("Berlin", customers.get(3177).getCity());
	}

	@Test
	@DisplayName("Record 3178: County is Camden")
	void CountyOfRecord3178() {
		assertEquals("Camden", customers.get(3177).getCounty());
	}

	@Test
	@DisplayName("Record 3178: State is NJ")
	void StateOfRecord3178() {
		assertEquals("NJ", customers.get(3177).getState());
	}

	@Test
	@DisplayName("Record 3178: ZIP is 8009")
	void ZIPOfRecord3178() {
		assertEquals("8009", customers.get(3177).getZIP());
	}

	@Test
	@DisplayName("Record 3178: Phone is 856-767-8878")
	void PhoneOfRecord3178() {
		assertEquals("856-767-8878", customers.get(3177).getPhone());
	}

	@Test
	@DisplayName("Record 3178: Fax is 856-767-5767")
	void FaxOfRecord3178() {
		assertEquals("856-767-5767", customers.get(3177).getFax());
	}

	@Test
	@DisplayName("Record 3178: Email is harvey@pero.com")
	void EmailOfRecord3178() {
		assertEquals("harvey@pero.com", customers.get(3177).getEmail());
	}

	@Test
	@DisplayName("Record 3178: Web is http://www.harveypero.com")
	void WebOfRecord3178() {
		assertEquals("http://www.harveypero.com", customers.get(3177).getWeb());
	}
}
