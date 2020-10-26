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

@Tag("46")
class Record_3437 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3437: FirstName is Shyla")
	void FirstNameOfRecord3437() {
		assertEquals("Shyla", customers.get(3436).getFirstName());
	}

	@Test
	@DisplayName("Record 3437: LastName is Balda")
	void LastNameOfRecord3437() {
		assertEquals("Balda", customers.get(3436).getLastName());
	}

	@Test
	@DisplayName("Record 3437: Company is Smith Metals Co Inc")
	void CompanyOfRecord3437() {
		assertEquals("Smith Metals Co Inc", customers.get(3436).getCompany());
	}

	@Test
	@DisplayName("Record 3437: Address is 117 Downing St")
	void AddressOfRecord3437() {
		assertEquals("117 Downing St", customers.get(3436).getAddress());
	}

	@Test
	@DisplayName("Record 3437: City is Crescent City")
	void CityOfRecord3437() {
		assertEquals("Crescent City", customers.get(3436).getCity());
	}

	@Test
	@DisplayName("Record 3437: County is Del Norte")
	void CountyOfRecord3437() {
		assertEquals("Del Norte", customers.get(3436).getCounty());
	}

	@Test
	@DisplayName("Record 3437: State is CA")
	void StateOfRecord3437() {
		assertEquals("CA", customers.get(3436).getState());
	}

	@Test
	@DisplayName("Record 3437: ZIP is 95531")
	void ZIPOfRecord3437() {
		assertEquals("95531", customers.get(3436).getZIP());
	}

	@Test
	@DisplayName("Record 3437: Phone is 707-464-9876")
	void PhoneOfRecord3437() {
		assertEquals("707-464-9876", customers.get(3436).getPhone());
	}

	@Test
	@DisplayName("Record 3437: Fax is 707-464-6983")
	void FaxOfRecord3437() {
		assertEquals("707-464-6983", customers.get(3436).getFax());
	}

	@Test
	@DisplayName("Record 3437: Email is shyla@balda.com")
	void EmailOfRecord3437() {
		assertEquals("shyla@balda.com", customers.get(3436).getEmail());
	}

	@Test
	@DisplayName("Record 3437: Web is http://www.shylabalda.com")
	void WebOfRecord3437() {
		assertEquals("http://www.shylabalda.com", customers.get(3436).getWeb());
	}
}
