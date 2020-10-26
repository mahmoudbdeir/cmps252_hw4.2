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

@Tag("27")
class Record_1537 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1537: FirstName is Alfred")
	void FirstNameOfRecord1537() {
		assertEquals("Alfred", customers.get(1536).getFirstName());
	}

	@Test
	@DisplayName("Record 1537: LastName is Nimox")
	void LastNameOfRecord1537() {
		assertEquals("Nimox", customers.get(1536).getLastName());
	}

	@Test
	@DisplayName("Record 1537: Company is Wilde Meyer Gallery Ltd")
	void CompanyOfRecord1537() {
		assertEquals("Wilde Meyer Gallery Ltd", customers.get(1536).getCompany());
	}

	@Test
	@DisplayName("Record 1537: Address is 700 W 28th St")
	void AddressOfRecord1537() {
		assertEquals("700 W 28th St", customers.get(1536).getAddress());
	}

	@Test
	@DisplayName("Record 1537: City is Charlotte")
	void CityOfRecord1537() {
		assertEquals("Charlotte", customers.get(1536).getCity());
	}

	@Test
	@DisplayName("Record 1537: County is Mecklenburg")
	void CountyOfRecord1537() {
		assertEquals("Mecklenburg", customers.get(1536).getCounty());
	}

	@Test
	@DisplayName("Record 1537: State is NC")
	void StateOfRecord1537() {
		assertEquals("NC", customers.get(1536).getState());
	}

	@Test
	@DisplayName("Record 1537: ZIP is 28206")
	void ZIPOfRecord1537() {
		assertEquals("28206", customers.get(1536).getZIP());
	}

	@Test
	@DisplayName("Record 1537: Phone is 704-375-7773")
	void PhoneOfRecord1537() {
		assertEquals("704-375-7773", customers.get(1536).getPhone());
	}

	@Test
	@DisplayName("Record 1537: Fax is 704-375-2072")
	void FaxOfRecord1537() {
		assertEquals("704-375-2072", customers.get(1536).getFax());
	}

	@Test
	@DisplayName("Record 1537: Email is alfred@nimox.com")
	void EmailOfRecord1537() {
		assertEquals("alfred@nimox.com", customers.get(1536).getEmail());
	}

	@Test
	@DisplayName("Record 1537: Web is http://www.alfrednimox.com")
	void WebOfRecord1537() {
		assertEquals("http://www.alfrednimox.com", customers.get(1536).getWeb());
	}
}
