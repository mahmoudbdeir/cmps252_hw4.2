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

@Tag("36")
class Record_4429 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4429: FirstName is Angie")
	void FirstNameOfRecord4429() {
		assertEquals("Angie", customers.get(4428).getFirstName());
	}

	@Test
	@DisplayName("Record 4429: LastName is Giorno")
	void LastNameOfRecord4429() {
		assertEquals("Giorno", customers.get(4428).getLastName());
	}

	@Test
	@DisplayName("Record 4429: Company is Valuecare")
	void CompanyOfRecord4429() {
		assertEquals("Valuecare", customers.get(4428).getCompany());
	}

	@Test
	@DisplayName("Record 4429: Address is 50 Simpson St")
	void AddressOfRecord4429() {
		assertEquals("50 Simpson St", customers.get(4428).getAddress());
	}

	@Test
	@DisplayName("Record 4429: City is Asheville")
	void CityOfRecord4429() {
		assertEquals("Asheville", customers.get(4428).getCity());
	}

	@Test
	@DisplayName("Record 4429: County is Buncombe")
	void CountyOfRecord4429() {
		assertEquals("Buncombe", customers.get(4428).getCounty());
	}

	@Test
	@DisplayName("Record 4429: State is NC")
	void StateOfRecord4429() {
		assertEquals("NC", customers.get(4428).getState());
	}

	@Test
	@DisplayName("Record 4429: ZIP is 28803")
	void ZIPOfRecord4429() {
		assertEquals("28803", customers.get(4428).getZIP());
	}

	@Test
	@DisplayName("Record 4429: Phone is 828-251-5387")
	void PhoneOfRecord4429() {
		assertEquals("828-251-5387", customers.get(4428).getPhone());
	}

	@Test
	@DisplayName("Record 4429: Fax is 828-251-0686")
	void FaxOfRecord4429() {
		assertEquals("828-251-0686", customers.get(4428).getFax());
	}

	@Test
	@DisplayName("Record 4429: Email is angie@giorno.com")
	void EmailOfRecord4429() {
		assertEquals("angie@giorno.com", customers.get(4428).getEmail());
	}

	@Test
	@DisplayName("Record 4429: Web is http://www.angiegiorno.com")
	void WebOfRecord4429() {
		assertEquals("http://www.angiegiorno.com", customers.get(4428).getWeb());
	}
}
