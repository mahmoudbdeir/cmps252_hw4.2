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

@Tag("35")
class Record_2714 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2714: FirstName is Augusta")
	void FirstNameOfRecord2714() {
		assertEquals("Augusta", customers.get(2713).getFirstName());
	}

	@Test
	@DisplayName("Record 2714: LastName is Delosreyes")
	void LastNameOfRecord2714() {
		assertEquals("Delosreyes", customers.get(2713).getLastName());
	}

	@Test
	@DisplayName("Record 2714: Company is Owobopte Industries")
	void CompanyOfRecord2714() {
		assertEquals("Owobopte Industries", customers.get(2713).getCompany());
	}

	@Test
	@DisplayName("Record 2714: Address is 1726 Westwood Blvd")
	void AddressOfRecord2714() {
		assertEquals("1726 Westwood Blvd", customers.get(2713).getAddress());
	}

	@Test
	@DisplayName("Record 2714: City is Los Angeles")
	void CityOfRecord2714() {
		assertEquals("Los Angeles", customers.get(2713).getCity());
	}

	@Test
	@DisplayName("Record 2714: County is Los Angeles")
	void CountyOfRecord2714() {
		assertEquals("Los Angeles", customers.get(2713).getCounty());
	}

	@Test
	@DisplayName("Record 2714: State is CA")
	void StateOfRecord2714() {
		assertEquals("CA", customers.get(2713).getState());
	}

	@Test
	@DisplayName("Record 2714: ZIP is 90024")
	void ZIPOfRecord2714() {
		assertEquals("90024", customers.get(2713).getZIP());
	}

	@Test
	@DisplayName("Record 2714: Phone is 310-474-8021")
	void PhoneOfRecord2714() {
		assertEquals("310-474-8021", customers.get(2713).getPhone());
	}

	@Test
	@DisplayName("Record 2714: Fax is 310-474-4788")
	void FaxOfRecord2714() {
		assertEquals("310-474-4788", customers.get(2713).getFax());
	}

	@Test
	@DisplayName("Record 2714: Email is augusta@delosreyes.com")
	void EmailOfRecord2714() {
		assertEquals("augusta@delosreyes.com", customers.get(2713).getEmail());
	}

	@Test
	@DisplayName("Record 2714: Web is http://www.augustadelosreyes.com")
	void WebOfRecord2714() {
		assertEquals("http://www.augustadelosreyes.com", customers.get(2713).getWeb());
	}
}
