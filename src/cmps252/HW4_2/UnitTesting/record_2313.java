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

@Tag("32")
class Record_2313 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2313: FirstName is Rosalyn")
	void FirstNameOfRecord2313() {
		assertEquals("Rosalyn", customers.get(2312).getFirstName());
	}

	@Test
	@DisplayName("Record 2313: LastName is Belflower")
	void LastNameOfRecord2313() {
		assertEquals("Belflower", customers.get(2312).getLastName());
	}

	@Test
	@DisplayName("Record 2313: Company is Biltmore Glass Inc")
	void CompanyOfRecord2313() {
		assertEquals("Biltmore Glass Inc", customers.get(2312).getCompany());
	}

	@Test
	@DisplayName("Record 2313: Address is 36440 Us Highway 19n N")
	void AddressOfRecord2313() {
		assertEquals("36440 Us Highway 19n N", customers.get(2312).getAddress());
	}

	@Test
	@DisplayName("Record 2313: City is Palm Harbor")
	void CityOfRecord2313() {
		assertEquals("Palm Harbor", customers.get(2312).getCity());
	}

	@Test
	@DisplayName("Record 2313: County is Pinellas")
	void CountyOfRecord2313() {
		assertEquals("Pinellas", customers.get(2312).getCounty());
	}

	@Test
	@DisplayName("Record 2313: State is FL")
	void StateOfRecord2313() {
		assertEquals("FL", customers.get(2312).getState());
	}

	@Test
	@DisplayName("Record 2313: ZIP is 34684")
	void ZIPOfRecord2313() {
		assertEquals("34684", customers.get(2312).getZIP());
	}

	@Test
	@DisplayName("Record 2313: Phone is 727-784-1059")
	void PhoneOfRecord2313() {
		assertEquals("727-784-1059", customers.get(2312).getPhone());
	}

	@Test
	@DisplayName("Record 2313: Fax is 727-784-7291")
	void FaxOfRecord2313() {
		assertEquals("727-784-7291", customers.get(2312).getFax());
	}

	@Test
	@DisplayName("Record 2313: Email is rosalyn@belflower.com")
	void EmailOfRecord2313() {
		assertEquals("rosalyn@belflower.com", customers.get(2312).getEmail());
	}

	@Test
	@DisplayName("Record 2313: Web is http://www.rosalynbelflower.com")
	void WebOfRecord2313() {
		assertEquals("http://www.rosalynbelflower.com", customers.get(2312).getWeb());
	}
}
