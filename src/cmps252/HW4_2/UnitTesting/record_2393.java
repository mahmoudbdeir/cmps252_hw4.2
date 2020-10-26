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

@Tag("47")
class Record_2393 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2393: FirstName is Nelda")
	void FirstNameOfRecord2393() {
		assertEquals("Nelda", customers.get(2392).getFirstName());
	}

	@Test
	@DisplayName("Record 2393: LastName is Nyghbors")
	void LastNameOfRecord2393() {
		assertEquals("Nyghbors", customers.get(2392).getLastName());
	}

	@Test
	@DisplayName("Record 2393: Company is La Jolla Palms Inn")
	void CompanyOfRecord2393() {
		assertEquals("La Jolla Palms Inn", customers.get(2392).getCompany());
	}

	@Test
	@DisplayName("Record 2393: Address is 7350 E Progress Pl  #-100")
	void AddressOfRecord2393() {
		assertEquals("7350 E Progress Pl  #-100", customers.get(2392).getAddress());
	}

	@Test
	@DisplayName("Record 2393: City is Englewood")
	void CityOfRecord2393() {
		assertEquals("Englewood", customers.get(2392).getCity());
	}

	@Test
	@DisplayName("Record 2393: County is Arapahoe")
	void CountyOfRecord2393() {
		assertEquals("Arapahoe", customers.get(2392).getCounty());
	}

	@Test
	@DisplayName("Record 2393: State is CO")
	void StateOfRecord2393() {
		assertEquals("CO", customers.get(2392).getState());
	}

	@Test
	@DisplayName("Record 2393: ZIP is 80111")
	void ZIPOfRecord2393() {
		assertEquals("80111", customers.get(2392).getZIP());
	}

	@Test
	@DisplayName("Record 2393: Phone is 303-779-8114")
	void PhoneOfRecord2393() {
		assertEquals("303-779-8114", customers.get(2392).getPhone());
	}

	@Test
	@DisplayName("Record 2393: Fax is 303-779-9005")
	void FaxOfRecord2393() {
		assertEquals("303-779-9005", customers.get(2392).getFax());
	}

	@Test
	@DisplayName("Record 2393: Email is nelda@nyghbors.com")
	void EmailOfRecord2393() {
		assertEquals("nelda@nyghbors.com", customers.get(2392).getEmail());
	}

	@Test
	@DisplayName("Record 2393: Web is http://www.neldanyghbors.com")
	void WebOfRecord2393() {
		assertEquals("http://www.neldanyghbors.com", customers.get(2392).getWeb());
	}
}
