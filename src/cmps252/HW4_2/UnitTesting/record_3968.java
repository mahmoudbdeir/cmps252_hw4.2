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

@Tag("49")
class Record_3968 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3968: FirstName is Emmitt")
	void FirstNameOfRecord3968() {
		assertEquals("Emmitt", customers.get(3967).getFirstName());
	}

	@Test
	@DisplayName("Record 3968: LastName is Lanuza")
	void LastNameOfRecord3968() {
		assertEquals("Lanuza", customers.get(3967).getLastName());
	}

	@Test
	@DisplayName("Record 3968: Company is Mondovi Telephone Co")
	void CompanyOfRecord3968() {
		assertEquals("Mondovi Telephone Co", customers.get(3967).getCompany());
	}

	@Test
	@DisplayName("Record 3968: Address is 71 South St")
	void AddressOfRecord3968() {
		assertEquals("71 South St", customers.get(3967).getAddress());
	}

	@Test
	@DisplayName("Record 3968: City is Freehold")
	void CityOfRecord3968() {
		assertEquals("Freehold", customers.get(3967).getCity());
	}

	@Test
	@DisplayName("Record 3968: County is Monmouth")
	void CountyOfRecord3968() {
		assertEquals("Monmouth", customers.get(3967).getCounty());
	}

	@Test
	@DisplayName("Record 3968: State is NJ")
	void StateOfRecord3968() {
		assertEquals("NJ", customers.get(3967).getState());
	}

	@Test
	@DisplayName("Record 3968: ZIP is 7728")
	void ZIPOfRecord3968() {
		assertEquals("7728", customers.get(3967).getZIP());
	}

	@Test
	@DisplayName("Record 3968: Phone is 732-308-8916")
	void PhoneOfRecord3968() {
		assertEquals("732-308-8916", customers.get(3967).getPhone());
	}

	@Test
	@DisplayName("Record 3968: Fax is 732-308-2514")
	void FaxOfRecord3968() {
		assertEquals("732-308-2514", customers.get(3967).getFax());
	}

	@Test
	@DisplayName("Record 3968: Email is emmitt@lanuza.com")
	void EmailOfRecord3968() {
		assertEquals("emmitt@lanuza.com", customers.get(3967).getEmail());
	}

	@Test
	@DisplayName("Record 3968: Web is http://www.emmittlanuza.com")
	void WebOfRecord3968() {
		assertEquals("http://www.emmittlanuza.com", customers.get(3967).getWeb());
	}
}
