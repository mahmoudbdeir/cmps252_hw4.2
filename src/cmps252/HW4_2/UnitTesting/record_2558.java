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

@Tag("13")
class Record_2558 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2558: FirstName is Jarred")
	void FirstNameOfRecord2558() {
		assertEquals("Jarred", customers.get(2557).getFirstName());
	}

	@Test
	@DisplayName("Record 2558: LastName is Condiff")
	void LastNameOfRecord2558() {
		assertEquals("Condiff", customers.get(2557).getLastName());
	}

	@Test
	@DisplayName("Record 2558: Company is Sparta Foods Inc")
	void CompanyOfRecord2558() {
		assertEquals("Sparta Foods Inc", customers.get(2557).getCompany());
	}

	@Test
	@DisplayName("Record 2558: Address is 225 Rynekers Ln")
	void AddressOfRecord2558() {
		assertEquals("225 Rynekers Ln", customers.get(2557).getAddress());
	}

	@Test
	@DisplayName("Record 2558: City is Alexandria")
	void CityOfRecord2558() {
		assertEquals("Alexandria", customers.get(2557).getCity());
	}

	@Test
	@DisplayName("Record 2558: County is Alexandria City")
	void CountyOfRecord2558() {
		assertEquals("Alexandria City", customers.get(2557).getCounty());
	}

	@Test
	@DisplayName("Record 2558: State is VA")
	void StateOfRecord2558() {
		assertEquals("VA", customers.get(2557).getState());
	}

	@Test
	@DisplayName("Record 2558: ZIP is 22314")
	void ZIPOfRecord2558() {
		assertEquals("22314", customers.get(2557).getZIP());
	}

	@Test
	@DisplayName("Record 2558: Phone is 703-836-9591")
	void PhoneOfRecord2558() {
		assertEquals("703-836-9591", customers.get(2557).getPhone());
	}

	@Test
	@DisplayName("Record 2558: Fax is 703-836-8065")
	void FaxOfRecord2558() {
		assertEquals("703-836-8065", customers.get(2557).getFax());
	}

	@Test
	@DisplayName("Record 2558: Email is jarred@condiff.com")
	void EmailOfRecord2558() {
		assertEquals("jarred@condiff.com", customers.get(2557).getEmail());
	}

	@Test
	@DisplayName("Record 2558: Web is http://www.jarredcondiff.com")
	void WebOfRecord2558() {
		assertEquals("http://www.jarredcondiff.com", customers.get(2557).getWeb());
	}
}
