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

@Tag("29")
class Record_2489 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2489: FirstName is Percy")
	void FirstNameOfRecord2489() {
		assertEquals("Percy", customers.get(2488).getFirstName());
	}

	@Test
	@DisplayName("Record 2489: LastName is Hesley")
	void LastNameOfRecord2489() {
		assertEquals("Hesley", customers.get(2488).getLastName());
	}

	@Test
	@DisplayName("Record 2489: Company is Argent Corporation")
	void CompanyOfRecord2489() {
		assertEquals("Argent Corporation", customers.get(2488).getCompany());
	}

	@Test
	@DisplayName("Record 2489: Address is 3006 E Thousand Oaks Blvd")
	void AddressOfRecord2489() {
		assertEquals("3006 E Thousand Oaks Blvd", customers.get(2488).getAddress());
	}

	@Test
	@DisplayName("Record 2489: City is Thousand Oaks")
	void CityOfRecord2489() {
		assertEquals("Thousand Oaks", customers.get(2488).getCity());
	}

	@Test
	@DisplayName("Record 2489: County is Ventura")
	void CountyOfRecord2489() {
		assertEquals("Ventura", customers.get(2488).getCounty());
	}

	@Test
	@DisplayName("Record 2489: State is CA")
	void StateOfRecord2489() {
		assertEquals("CA", customers.get(2488).getState());
	}

	@Test
	@DisplayName("Record 2489: ZIP is 91362")
	void ZIPOfRecord2489() {
		assertEquals("91362", customers.get(2488).getZIP());
	}

	@Test
	@DisplayName("Record 2489: Phone is 805-494-4631")
	void PhoneOfRecord2489() {
		assertEquals("805-494-4631", customers.get(2488).getPhone());
	}

	@Test
	@DisplayName("Record 2489: Fax is 805-494-9201")
	void FaxOfRecord2489() {
		assertEquals("805-494-9201", customers.get(2488).getFax());
	}

	@Test
	@DisplayName("Record 2489: Email is percy@hesley.com")
	void EmailOfRecord2489() {
		assertEquals("percy@hesley.com", customers.get(2488).getEmail());
	}

	@Test
	@DisplayName("Record 2489: Web is http://www.percyhesley.com")
	void WebOfRecord2489() {
		assertEquals("http://www.percyhesley.com", customers.get(2488).getWeb());
	}
}
