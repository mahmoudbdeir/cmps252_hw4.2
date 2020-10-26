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

@Tag("0")
class Record_3078 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3078: FirstName is Irene")
	void FirstNameOfRecord3078() {
		assertEquals("Irene", customers.get(3077).getFirstName());
	}

	@Test
	@DisplayName("Record 3078: LastName is Biby")
	void LastNameOfRecord3078() {
		assertEquals("Biby", customers.get(3077).getLastName());
	}

	@Test
	@DisplayName("Record 3078: Company is Harmon, James V")
	void CompanyOfRecord3078() {
		assertEquals("Harmon, James V", customers.get(3077).getCompany());
	}

	@Test
	@DisplayName("Record 3078: Address is 378 Page St")
	void AddressOfRecord3078() {
		assertEquals("378 Page St", customers.get(3077).getAddress());
	}

	@Test
	@DisplayName("Record 3078: City is Stoughton")
	void CityOfRecord3078() {
		assertEquals("Stoughton", customers.get(3077).getCity());
	}

	@Test
	@DisplayName("Record 3078: County is Norfolk")
	void CountyOfRecord3078() {
		assertEquals("Norfolk", customers.get(3077).getCounty());
	}

	@Test
	@DisplayName("Record 3078: State is MA")
	void StateOfRecord3078() {
		assertEquals("MA", customers.get(3077).getState());
	}

	@Test
	@DisplayName("Record 3078: ZIP is 2072")
	void ZIPOfRecord3078() {
		assertEquals("2072", customers.get(3077).getZIP());
	}

	@Test
	@DisplayName("Record 3078: Phone is 781-344-1937")
	void PhoneOfRecord3078() {
		assertEquals("781-344-1937", customers.get(3077).getPhone());
	}

	@Test
	@DisplayName("Record 3078: Fax is 781-344-6211")
	void FaxOfRecord3078() {
		assertEquals("781-344-6211", customers.get(3077).getFax());
	}

	@Test
	@DisplayName("Record 3078: Email is irene@biby.com")
	void EmailOfRecord3078() {
		assertEquals("irene@biby.com", customers.get(3077).getEmail());
	}

	@Test
	@DisplayName("Record 3078: Web is http://www.irenebiby.com")
	void WebOfRecord3078() {
		assertEquals("http://www.irenebiby.com", customers.get(3077).getWeb());
	}
}
