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

@Tag("4")
class Record_3058 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3058: FirstName is Hunter")
	void FirstNameOfRecord3058() {
		assertEquals("Hunter", customers.get(3057).getFirstName());
	}

	@Test
	@DisplayName("Record 3058: LastName is Breau")
	void LastNameOfRecord3058() {
		assertEquals("Breau", customers.get(3057).getLastName());
	}

	@Test
	@DisplayName("Record 3058: Company is Ny Bd Of Rabbis")
	void CompanyOfRecord3058() {
		assertEquals("Ny Bd Of Rabbis", customers.get(3057).getCompany());
	}

	@Test
	@DisplayName("Record 3058: Address is 203 E Chgo")
	void AddressOfRecord3058() {
		assertEquals("203 E Chgo", customers.get(3057).getAddress());
	}

	@Test
	@DisplayName("Record 3058: City is Elgin")
	void CityOfRecord3058() {
		assertEquals("Elgin", customers.get(3057).getCity());
	}

	@Test
	@DisplayName("Record 3058: County is Kane")
	void CountyOfRecord3058() {
		assertEquals("Kane", customers.get(3057).getCounty());
	}

	@Test
	@DisplayName("Record 3058: State is IL")
	void StateOfRecord3058() {
		assertEquals("IL", customers.get(3057).getState());
	}

	@Test
	@DisplayName("Record 3058: ZIP is 60120")
	void ZIPOfRecord3058() {
		assertEquals("60120", customers.get(3057).getZIP());
	}

	@Test
	@DisplayName("Record 3058: Phone is 847-742-7353")
	void PhoneOfRecord3058() {
		assertEquals("847-742-7353", customers.get(3057).getPhone());
	}

	@Test
	@DisplayName("Record 3058: Fax is 847-742-3113")
	void FaxOfRecord3058() {
		assertEquals("847-742-3113", customers.get(3057).getFax());
	}

	@Test
	@DisplayName("Record 3058: Email is hunter@breau.com")
	void EmailOfRecord3058() {
		assertEquals("hunter@breau.com", customers.get(3057).getEmail());
	}

	@Test
	@DisplayName("Record 3058: Web is http://www.hunterbreau.com")
	void WebOfRecord3058() {
		assertEquals("http://www.hunterbreau.com", customers.get(3057).getWeb());
	}
}
