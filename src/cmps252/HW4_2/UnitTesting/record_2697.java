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

@Tag("20")
class Record_2697 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2697: FirstName is Connie")
	void FirstNameOfRecord2697() {
		assertEquals("Connie", customers.get(2696).getFirstName());
	}

	@Test
	@DisplayName("Record 2697: LastName is Demendonca")
	void LastNameOfRecord2697() {
		assertEquals("Demendonca", customers.get(2696).getLastName());
	}

	@Test
	@DisplayName("Record 2697: Company is Ben Wa Novlt Corp Untd States")
	void CompanyOfRecord2697() {
		assertEquals("Ben Wa Novlt Corp Untd States", customers.get(2696).getCompany());
	}

	@Test
	@DisplayName("Record 2697: Address is 7370 Sw 152nd Ter")
	void AddressOfRecord2697() {
		assertEquals("7370 Sw 152nd Ter", customers.get(2696).getAddress());
	}

	@Test
	@DisplayName("Record 2697: City is Miami")
	void CityOfRecord2697() {
		assertEquals("Miami", customers.get(2696).getCity());
	}

	@Test
	@DisplayName("Record 2697: County is Miami-Dade")
	void CountyOfRecord2697() {
		assertEquals("Miami-Dade", customers.get(2696).getCounty());
	}

	@Test
	@DisplayName("Record 2697: State is FL")
	void StateOfRecord2697() {
		assertEquals("FL", customers.get(2696).getState());
	}

	@Test
	@DisplayName("Record 2697: ZIP is 33157")
	void ZIPOfRecord2697() {
		assertEquals("33157", customers.get(2696).getZIP());
	}

	@Test
	@DisplayName("Record 2697: Phone is 305-251-4488")
	void PhoneOfRecord2697() {
		assertEquals("305-251-4488", customers.get(2696).getPhone());
	}

	@Test
	@DisplayName("Record 2697: Fax is 305-251-3866")
	void FaxOfRecord2697() {
		assertEquals("305-251-3866", customers.get(2696).getFax());
	}

	@Test
	@DisplayName("Record 2697: Email is connie@demendonca.com")
	void EmailOfRecord2697() {
		assertEquals("connie@demendonca.com", customers.get(2696).getEmail());
	}

	@Test
	@DisplayName("Record 2697: Web is http://www.conniedemendonca.com")
	void WebOfRecord2697() {
		assertEquals("http://www.conniedemendonca.com", customers.get(2696).getWeb());
	}
}
