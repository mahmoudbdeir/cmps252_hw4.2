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

@Tag("7")
class Record_4658 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4658: FirstName is Jayson")
	void FirstNameOfRecord4658() {
		assertEquals("Jayson", customers.get(4657).getFirstName());
	}

	@Test
	@DisplayName("Record 4658: LastName is Masso")
	void LastNameOfRecord4658() {
		assertEquals("Masso", customers.get(4657).getLastName());
	}

	@Test
	@DisplayName("Record 4658: Company is Vermont Sprout House")
	void CompanyOfRecord4658() {
		assertEquals("Vermont Sprout House", customers.get(4657).getCompany());
	}

	@Test
	@DisplayName("Record 4658: Address is 730 Carroll St")
	void AddressOfRecord4658() {
		assertEquals("730 Carroll St", customers.get(4657).getAddress());
	}

	@Test
	@DisplayName("Record 4658: City is Akron")
	void CityOfRecord4658() {
		assertEquals("Akron", customers.get(4657).getCity());
	}

	@Test
	@DisplayName("Record 4658: County is Summit")
	void CountyOfRecord4658() {
		assertEquals("Summit", customers.get(4657).getCounty());
	}

	@Test
	@DisplayName("Record 4658: State is OH")
	void StateOfRecord4658() {
		assertEquals("OH", customers.get(4657).getState());
	}

	@Test
	@DisplayName("Record 4658: ZIP is 44304")
	void ZIPOfRecord4658() {
		assertEquals("44304", customers.get(4657).getZIP());
	}

	@Test
	@DisplayName("Record 4658: Phone is 330-762-0212")
	void PhoneOfRecord4658() {
		assertEquals("330-762-0212", customers.get(4657).getPhone());
	}

	@Test
	@DisplayName("Record 4658: Fax is 330-762-5318")
	void FaxOfRecord4658() {
		assertEquals("330-762-5318", customers.get(4657).getFax());
	}

	@Test
	@DisplayName("Record 4658: Email is jayson@masso.com")
	void EmailOfRecord4658() {
		assertEquals("jayson@masso.com", customers.get(4657).getEmail());
	}

	@Test
	@DisplayName("Record 4658: Web is http://www.jaysonmasso.com")
	void WebOfRecord4658() {
		assertEquals("http://www.jaysonmasso.com", customers.get(4657).getWeb());
	}
}
