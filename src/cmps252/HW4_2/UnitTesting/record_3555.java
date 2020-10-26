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
class Record_3555 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3555: FirstName is Kristen")
	void FirstNameOfRecord3555() {
		assertEquals("Kristen", customers.get(3554).getFirstName());
	}

	@Test
	@DisplayName("Record 3555: LastName is Hackenberg")
	void LastNameOfRecord3555() {
		assertEquals("Hackenberg", customers.get(3554).getLastName());
	}

	@Test
	@DisplayName("Record 3555: Company is Diberville Ford Inc")
	void CompanyOfRecord3555() {
		assertEquals("Diberville Ford Inc", customers.get(3554).getCompany());
	}

	@Test
	@DisplayName("Record 3555: Address is 4151 Street Rd")
	void AddressOfRecord3555() {
		assertEquals("4151 Street Rd", customers.get(3554).getAddress());
	}

	@Test
	@DisplayName("Record 3555: City is Feasterville Trevose")
	void CityOfRecord3555() {
		assertEquals("Feasterville Trevose", customers.get(3554).getCity());
	}

	@Test
	@DisplayName("Record 3555: County is Bucks")
	void CountyOfRecord3555() {
		assertEquals("Bucks", customers.get(3554).getCounty());
	}

	@Test
	@DisplayName("Record 3555: State is PA")
	void StateOfRecord3555() {
		assertEquals("PA", customers.get(3554).getState());
	}

	@Test
	@DisplayName("Record 3555: ZIP is 19053")
	void ZIPOfRecord3555() {
		assertEquals("19053", customers.get(3554).getZIP());
	}

	@Test
	@DisplayName("Record 3555: Phone is 215-245-5361")
	void PhoneOfRecord3555() {
		assertEquals("215-245-5361", customers.get(3554).getPhone());
	}

	@Test
	@DisplayName("Record 3555: Fax is 215-245-4401")
	void FaxOfRecord3555() {
		assertEquals("215-245-4401", customers.get(3554).getFax());
	}

	@Test
	@DisplayName("Record 3555: Email is kristen@hackenberg.com")
	void EmailOfRecord3555() {
		assertEquals("kristen@hackenberg.com", customers.get(3554).getEmail());
	}

	@Test
	@DisplayName("Record 3555: Web is http://www.kristenhackenberg.com")
	void WebOfRecord3555() {
		assertEquals("http://www.kristenhackenberg.com", customers.get(3554).getWeb());
	}
}
