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

@Tag("46")
class Record_4284 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4284: FirstName is Buddy")
	void FirstNameOfRecord4284() {
		assertEquals("Buddy", customers.get(4283).getFirstName());
	}

	@Test
	@DisplayName("Record 4284: LastName is Vanwormer")
	void LastNameOfRecord4284() {
		assertEquals("Vanwormer", customers.get(4283).getLastName());
	}

	@Test
	@DisplayName("Record 4284: Company is Sard, Michael Esq")
	void CompanyOfRecord4284() {
		assertEquals("Sard, Michael Esq", customers.get(4283).getCompany());
	}

	@Test
	@DisplayName("Record 4284: Address is 1101 Market St")
	void AddressOfRecord4284() {
		assertEquals("1101 Market St", customers.get(4283).getAddress());
	}

	@Test
	@DisplayName("Record 4284: City is Philadelphia")
	void CityOfRecord4284() {
		assertEquals("Philadelphia", customers.get(4283).getCity());
	}

	@Test
	@DisplayName("Record 4284: County is Philadelphia")
	void CountyOfRecord4284() {
		assertEquals("Philadelphia", customers.get(4283).getCounty());
	}

	@Test
	@DisplayName("Record 4284: State is PA")
	void StateOfRecord4284() {
		assertEquals("PA", customers.get(4283).getState());
	}

	@Test
	@DisplayName("Record 4284: ZIP is 19107")
	void ZIPOfRecord4284() {
		assertEquals("19107", customers.get(4283).getZIP());
	}

	@Test
	@DisplayName("Record 4284: Phone is 215-238-5465")
	void PhoneOfRecord4284() {
		assertEquals("215-238-5465", customers.get(4283).getPhone());
	}

	@Test
	@DisplayName("Record 4284: Fax is 215-238-3678")
	void FaxOfRecord4284() {
		assertEquals("215-238-3678", customers.get(4283).getFax());
	}

	@Test
	@DisplayName("Record 4284: Email is buddy@vanwormer.com")
	void EmailOfRecord4284() {
		assertEquals("buddy@vanwormer.com", customers.get(4283).getEmail());
	}

	@Test
	@DisplayName("Record 4284: Web is http://www.buddyvanwormer.com")
	void WebOfRecord4284() {
		assertEquals("http://www.buddyvanwormer.com", customers.get(4283).getWeb());
	}
}
