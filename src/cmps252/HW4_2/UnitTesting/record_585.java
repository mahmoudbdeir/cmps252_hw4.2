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

@Tag("38")
class Record_585 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 585: FirstName is Allison")
	void FirstNameOfRecord585() {
		assertEquals("Allison", customers.get(584).getFirstName());
	}

	@Test
	@DisplayName("Record 585: LastName is Lambey")
	void LastNameOfRecord585() {
		assertEquals("Lambey", customers.get(584).getLastName());
	}

	@Test
	@DisplayName("Record 585: Company is Hanna Stanley St John Advtsng")
	void CompanyOfRecord585() {
		assertEquals("Hanna Stanley St John Advtsng", customers.get(584).getCompany());
	}

	@Test
	@DisplayName("Record 585: Address is 12595 Sw Beaverdam Rd")
	void AddressOfRecord585() {
		assertEquals("12595 Sw Beaverdam Rd", customers.get(584).getAddress());
	}

	@Test
	@DisplayName("Record 585: City is Beaverton")
	void CityOfRecord585() {
		assertEquals("Beaverton", customers.get(584).getCity());
	}

	@Test
	@DisplayName("Record 585: County is Washington")
	void CountyOfRecord585() {
		assertEquals("Washington", customers.get(584).getCounty());
	}

	@Test
	@DisplayName("Record 585: State is OR")
	void StateOfRecord585() {
		assertEquals("OR", customers.get(584).getState());
	}

	@Test
	@DisplayName("Record 585: ZIP is 97005")
	void ZIPOfRecord585() {
		assertEquals("97005", customers.get(584).getZIP());
	}

	@Test
	@DisplayName("Record 585: Phone is 503-643-2554")
	void PhoneOfRecord585() {
		assertEquals("503-643-2554", customers.get(584).getPhone());
	}

	@Test
	@DisplayName("Record 585: Fax is 503-643-0307")
	void FaxOfRecord585() {
		assertEquals("503-643-0307", customers.get(584).getFax());
	}

	@Test
	@DisplayName("Record 585: Email is allison@lambey.com")
	void EmailOfRecord585() {
		assertEquals("allison@lambey.com", customers.get(584).getEmail());
	}

	@Test
	@DisplayName("Record 585: Web is http://www.allisonlambey.com")
	void WebOfRecord585() {
		assertEquals("http://www.allisonlambey.com", customers.get(584).getWeb());
	}
}
