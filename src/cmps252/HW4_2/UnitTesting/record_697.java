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
class Record_697 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 697: FirstName is Monique")
	void FirstNameOfRecord697() {
		assertEquals("Monique", customers.get(696).getFirstName());
	}

	@Test
	@DisplayName("Record 697: LastName is Reckner")
	void LastNameOfRecord697() {
		assertEquals("Reckner", customers.get(696).getLastName());
	}

	@Test
	@DisplayName("Record 697: Company is Lindisima")
	void CompanyOfRecord697() {
		assertEquals("Lindisima", customers.get(696).getCompany());
	}

	@Test
	@DisplayName("Record 697: Address is 11385 Exposition Blvd")
	void AddressOfRecord697() {
		assertEquals("11385 Exposition Blvd", customers.get(696).getAddress());
	}

	@Test
	@DisplayName("Record 697: City is Los Angeles")
	void CityOfRecord697() {
		assertEquals("Los Angeles", customers.get(696).getCity());
	}

	@Test
	@DisplayName("Record 697: County is Los Angeles")
	void CountyOfRecord697() {
		assertEquals("Los Angeles", customers.get(696).getCounty());
	}

	@Test
	@DisplayName("Record 697: State is CA")
	void StateOfRecord697() {
		assertEquals("CA", customers.get(696).getState());
	}

	@Test
	@DisplayName("Record 697: ZIP is 90064")
	void ZIPOfRecord697() {
		assertEquals("90064", customers.get(696).getZIP());
	}

	@Test
	@DisplayName("Record 697: Phone is 310-477-0373")
	void PhoneOfRecord697() {
		assertEquals("310-477-0373", customers.get(696).getPhone());
	}

	@Test
	@DisplayName("Record 697: Fax is 310-477-4012")
	void FaxOfRecord697() {
		assertEquals("310-477-4012", customers.get(696).getFax());
	}

	@Test
	@DisplayName("Record 697: Email is monique@reckner.com")
	void EmailOfRecord697() {
		assertEquals("monique@reckner.com", customers.get(696).getEmail());
	}

	@Test
	@DisplayName("Record 697: Web is http://www.moniquereckner.com")
	void WebOfRecord697() {
		assertEquals("http://www.moniquereckner.com", customers.get(696).getWeb());
	}
}
