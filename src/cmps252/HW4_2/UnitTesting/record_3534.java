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

@Tag("11")
class Record_3534 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3534: FirstName is Mac")
	void FirstNameOfRecord3534() {
		assertEquals("Mac", customers.get(3533).getFirstName());
	}

	@Test
	@DisplayName("Record 3534: LastName is Gowens")
	void LastNameOfRecord3534() {
		assertEquals("Gowens", customers.get(3533).getLastName());
	}

	@Test
	@DisplayName("Record 3534: Company is Quality Inn Of Kernersville")
	void CompanyOfRecord3534() {
		assertEquals("Quality Inn Of Kernersville", customers.get(3533).getCompany());
	}

	@Test
	@DisplayName("Record 3534: Address is 32 Heckel St")
	void AddressOfRecord3534() {
		assertEquals("32 Heckel St", customers.get(3533).getAddress());
	}

	@Test
	@DisplayName("Record 3534: City is Belleville")
	void CityOfRecord3534() {
		assertEquals("Belleville", customers.get(3533).getCity());
	}

	@Test
	@DisplayName("Record 3534: County is Essex")
	void CountyOfRecord3534() {
		assertEquals("Essex", customers.get(3533).getCounty());
	}

	@Test
	@DisplayName("Record 3534: State is NJ")
	void StateOfRecord3534() {
		assertEquals("NJ", customers.get(3533).getState());
	}

	@Test
	@DisplayName("Record 3534: ZIP is 7109")
	void ZIPOfRecord3534() {
		assertEquals("7109", customers.get(3533).getZIP());
	}

	@Test
	@DisplayName("Record 3534: Phone is 973-751-7332")
	void PhoneOfRecord3534() {
		assertEquals("973-751-7332", customers.get(3533).getPhone());
	}

	@Test
	@DisplayName("Record 3534: Fax is 973-751-0832")
	void FaxOfRecord3534() {
		assertEquals("973-751-0832", customers.get(3533).getFax());
	}

	@Test
	@DisplayName("Record 3534: Email is mac@gowens.com")
	void EmailOfRecord3534() {
		assertEquals("mac@gowens.com", customers.get(3533).getEmail());
	}

	@Test
	@DisplayName("Record 3534: Web is http://www.macgowens.com")
	void WebOfRecord3534() {
		assertEquals("http://www.macgowens.com", customers.get(3533).getWeb());
	}
}
