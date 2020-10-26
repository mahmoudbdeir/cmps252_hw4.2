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

@Tag("14")
class Record_1232 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1232: FirstName is Janelle")
	void FirstNameOfRecord1232() {
		assertEquals("Janelle", customers.get(1231).getFirstName());
	}

	@Test
	@DisplayName("Record 1232: LastName is Frasure")
	void LastNameOfRecord1232() {
		assertEquals("Frasure", customers.get(1231).getLastName());
	}

	@Test
	@DisplayName("Record 1232: Company is Powerfect Co Inc")
	void CompanyOfRecord1232() {
		assertEquals("Powerfect Co Inc", customers.get(1231).getCompany());
	}

	@Test
	@DisplayName("Record 1232: Address is 1012 Martin Luther King Jr Dr")
	void AddressOfRecord1232() {
		assertEquals("1012 Martin Luther King Jr Dr", customers.get(1231).getAddress());
	}

	@Test
	@DisplayName("Record 1232: City is Seffner")
	void CityOfRecord1232() {
		assertEquals("Seffner", customers.get(1231).getCity());
	}

	@Test
	@DisplayName("Record 1232: County is Hillsborough")
	void CountyOfRecord1232() {
		assertEquals("Hillsborough", customers.get(1231).getCounty());
	}

	@Test
	@DisplayName("Record 1232: State is FL")
	void StateOfRecord1232() {
		assertEquals("FL", customers.get(1231).getState());
	}

	@Test
	@DisplayName("Record 1232: ZIP is 33584")
	void ZIPOfRecord1232() {
		assertEquals("33584", customers.get(1231).getZIP());
	}

	@Test
	@DisplayName("Record 1232: Phone is 813-653-5051")
	void PhoneOfRecord1232() {
		assertEquals("813-653-5051", customers.get(1231).getPhone());
	}

	@Test
	@DisplayName("Record 1232: Fax is 813-653-8445")
	void FaxOfRecord1232() {
		assertEquals("813-653-8445", customers.get(1231).getFax());
	}

	@Test
	@DisplayName("Record 1232: Email is janelle@frasure.com")
	void EmailOfRecord1232() {
		assertEquals("janelle@frasure.com", customers.get(1231).getEmail());
	}

	@Test
	@DisplayName("Record 1232: Web is http://www.janellefrasure.com")
	void WebOfRecord1232() {
		assertEquals("http://www.janellefrasure.com", customers.get(1231).getWeb());
	}
}
