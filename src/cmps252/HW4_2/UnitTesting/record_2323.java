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

@Tag("8")
class Record_2323 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2323: FirstName is Lucy")
	void FirstNameOfRecord2323() {
		assertEquals("Lucy", customers.get(2322).getFirstName());
	}

	@Test
	@DisplayName("Record 2323: LastName is Orsburn")
	void LastNameOfRecord2323() {
		assertEquals("Orsburn", customers.get(2322).getLastName());
	}

	@Test
	@DisplayName("Record 2323: Company is Middletown Cruise & Travel")
	void CompanyOfRecord2323() {
		assertEquals("Middletown Cruise & Travel", customers.get(2322).getCompany());
	}

	@Test
	@DisplayName("Record 2323: Address is 529 Main St")
	void AddressOfRecord2323() {
		assertEquals("529 Main St", customers.get(2322).getAddress());
	}

	@Test
	@DisplayName("Record 2323: City is Spotswood")
	void CityOfRecord2323() {
		assertEquals("Spotswood", customers.get(2322).getCity());
	}

	@Test
	@DisplayName("Record 2323: County is Middlesex")
	void CountyOfRecord2323() {
		assertEquals("Middlesex", customers.get(2322).getCounty());
	}

	@Test
	@DisplayName("Record 2323: State is NJ")
	void StateOfRecord2323() {
		assertEquals("NJ", customers.get(2322).getState());
	}

	@Test
	@DisplayName("Record 2323: ZIP is 8884")
	void ZIPOfRecord2323() {
		assertEquals("8884", customers.get(2322).getZIP());
	}

	@Test
	@DisplayName("Record 2323: Phone is 732-251-4436")
	void PhoneOfRecord2323() {
		assertEquals("732-251-4436", customers.get(2322).getPhone());
	}

	@Test
	@DisplayName("Record 2323: Fax is 732-251-5462")
	void FaxOfRecord2323() {
		assertEquals("732-251-5462", customers.get(2322).getFax());
	}

	@Test
	@DisplayName("Record 2323: Email is lucy@orsburn.com")
	void EmailOfRecord2323() {
		assertEquals("lucy@orsburn.com", customers.get(2322).getEmail());
	}

	@Test
	@DisplayName("Record 2323: Web is http://www.lucyorsburn.com")
	void WebOfRecord2323() {
		assertEquals("http://www.lucyorsburn.com", customers.get(2322).getWeb());
	}
}
