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

@Tag("6")
class Record_3573 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3573: FirstName is Elise")
	void FirstNameOfRecord3573() {
		assertEquals("Elise", customers.get(3572).getFirstName());
	}

	@Test
	@DisplayName("Record 3573: LastName is Pless")
	void LastNameOfRecord3573() {
		assertEquals("Pless", customers.get(3572).getLastName());
	}

	@Test
	@DisplayName("Record 3573: Company is Logan, Richard G Jr")
	void CompanyOfRecord3573() {
		assertEquals("Logan, Richard G Jr", customers.get(3572).getCompany());
	}

	@Test
	@DisplayName("Record 3573: Address is 97 Fairfield Rd")
	void AddressOfRecord3573() {
		assertEquals("97 Fairfield Rd", customers.get(3572).getAddress());
	}

	@Test
	@DisplayName("Record 3573: City is Fairfield")
	void CityOfRecord3573() {
		assertEquals("Fairfield", customers.get(3572).getCity());
	}

	@Test
	@DisplayName("Record 3573: County is Essex")
	void CountyOfRecord3573() {
		assertEquals("Essex", customers.get(3572).getCounty());
	}

	@Test
	@DisplayName("Record 3573: State is NJ")
	void StateOfRecord3573() {
		assertEquals("NJ", customers.get(3572).getState());
	}

	@Test
	@DisplayName("Record 3573: ZIP is 7004")
	void ZIPOfRecord3573() {
		assertEquals("7004", customers.get(3572).getZIP());
	}

	@Test
	@DisplayName("Record 3573: Phone is 973-882-4968")
	void PhoneOfRecord3573() {
		assertEquals("973-882-4968", customers.get(3572).getPhone());
	}

	@Test
	@DisplayName("Record 3573: Fax is 973-882-7894")
	void FaxOfRecord3573() {
		assertEquals("973-882-7894", customers.get(3572).getFax());
	}

	@Test
	@DisplayName("Record 3573: Email is elise@pless.com")
	void EmailOfRecord3573() {
		assertEquals("elise@pless.com", customers.get(3572).getEmail());
	}

	@Test
	@DisplayName("Record 3573: Web is http://www.elisepless.com")
	void WebOfRecord3573() {
		assertEquals("http://www.elisepless.com", customers.get(3572).getWeb());
	}
}
