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
class Record_658 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 658: FirstName is Buck")
	void FirstNameOfRecord658() {
		assertEquals("Buck", customers.get(657).getFirstName());
	}

	@Test
	@DisplayName("Record 658: LastName is Reeder")
	void LastNameOfRecord658() {
		assertEquals("Reeder", customers.get(657).getLastName());
	}

	@Test
	@DisplayName("Record 658: Company is Metal Tite Products")
	void CompanyOfRecord658() {
		assertEquals("Metal Tite Products", customers.get(657).getCompany());
	}

	@Test
	@DisplayName("Record 658: Address is 4545 W 77th St")
	void AddressOfRecord658() {
		assertEquals("4545 W 77th St", customers.get(657).getAddress());
	}

	@Test
	@DisplayName("Record 658: City is Minneapolis")
	void CityOfRecord658() {
		assertEquals("Minneapolis", customers.get(657).getCity());
	}

	@Test
	@DisplayName("Record 658: County is Hennepin")
	void CountyOfRecord658() {
		assertEquals("Hennepin", customers.get(657).getCounty());
	}

	@Test
	@DisplayName("Record 658: State is MN")
	void StateOfRecord658() {
		assertEquals("MN", customers.get(657).getState());
	}

	@Test
	@DisplayName("Record 658: ZIP is 55435")
	void ZIPOfRecord658() {
		assertEquals("55435", customers.get(657).getZIP());
	}

	@Test
	@DisplayName("Record 658: Phone is 952-893-4388")
	void PhoneOfRecord658() {
		assertEquals("952-893-4388", customers.get(657).getPhone());
	}

	@Test
	@DisplayName("Record 658: Fax is 952-893-4521")
	void FaxOfRecord658() {
		assertEquals("952-893-4521", customers.get(657).getFax());
	}

	@Test
	@DisplayName("Record 658: Email is buck@reeder.com")
	void EmailOfRecord658() {
		assertEquals("buck@reeder.com", customers.get(657).getEmail());
	}

	@Test
	@DisplayName("Record 658: Web is http://www.buckreeder.com")
	void WebOfRecord658() {
		assertEquals("http://www.buckreeder.com", customers.get(657).getWeb());
	}
}
