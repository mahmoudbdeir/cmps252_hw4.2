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

@Tag("34")
class Record_1178 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1178: FirstName is Alexandra")
	void FirstNameOfRecord1178() {
		assertEquals("Alexandra", customers.get(1177).getFirstName());
	}

	@Test
	@DisplayName("Record 1178: LastName is Phearsdorf")
	void LastNameOfRecord1178() {
		assertEquals("Phearsdorf", customers.get(1177).getLastName());
	}

	@Test
	@DisplayName("Record 1178: Company is United Services Fed Crdt Un")
	void CompanyOfRecord1178() {
		assertEquals("United Services Fed Crdt Un", customers.get(1177).getCompany());
	}

	@Test
	@DisplayName("Record 1178: Address is 56 S White Horse Pike")
	void AddressOfRecord1178() {
		assertEquals("56 S White Horse Pike", customers.get(1177).getAddress());
	}

	@Test
	@DisplayName("Record 1178: City is Berlin")
	void CityOfRecord1178() {
		assertEquals("Berlin", customers.get(1177).getCity());
	}

	@Test
	@DisplayName("Record 1178: County is Camden")
	void CountyOfRecord1178() {
		assertEquals("Camden", customers.get(1177).getCounty());
	}

	@Test
	@DisplayName("Record 1178: State is NJ")
	void StateOfRecord1178() {
		assertEquals("NJ", customers.get(1177).getState());
	}

	@Test
	@DisplayName("Record 1178: ZIP is 8009")
	void ZIPOfRecord1178() {
		assertEquals("8009", customers.get(1177).getZIP());
	}

	@Test
	@DisplayName("Record 1178: Phone is 856-767-1928")
	void PhoneOfRecord1178() {
		assertEquals("856-767-1928", customers.get(1177).getPhone());
	}

	@Test
	@DisplayName("Record 1178: Fax is 856-767-5869")
	void FaxOfRecord1178() {
		assertEquals("856-767-5869", customers.get(1177).getFax());
	}

	@Test
	@DisplayName("Record 1178: Email is alexandra@phearsdorf.com")
	void EmailOfRecord1178() {
		assertEquals("alexandra@phearsdorf.com", customers.get(1177).getEmail());
	}

	@Test
	@DisplayName("Record 1178: Web is http://www.alexandraphearsdorf.com")
	void WebOfRecord1178() {
		assertEquals("http://www.alexandraphearsdorf.com", customers.get(1177).getWeb());
	}
}
