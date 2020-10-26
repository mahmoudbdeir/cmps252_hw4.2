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
class Record_1419 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1419: FirstName is Abram")
	void FirstNameOfRecord1419() {
		assertEquals("Abram", customers.get(1418).getFirstName());
	}

	@Test
	@DisplayName("Record 1419: LastName is Larde")
	void LastNameOfRecord1419() {
		assertEquals("Larde", customers.get(1418).getLastName());
	}

	@Test
	@DisplayName("Record 1419: Company is Pro Indpndnt Ins Agtts Il")
	void CompanyOfRecord1419() {
		assertEquals("Pro Indpndnt Ins Agtts Il", customers.get(1418).getCompany());
	}

	@Test
	@DisplayName("Record 1419: Address is 906 S French Ave")
	void AddressOfRecord1419() {
		assertEquals("906 S French Ave", customers.get(1418).getAddress());
	}

	@Test
	@DisplayName("Record 1419: City is Sanford")
	void CityOfRecord1419() {
		assertEquals("Sanford", customers.get(1418).getCity());
	}

	@Test
	@DisplayName("Record 1419: County is Seminole")
	void CountyOfRecord1419() {
		assertEquals("Seminole", customers.get(1418).getCounty());
	}

	@Test
	@DisplayName("Record 1419: State is FL")
	void StateOfRecord1419() {
		assertEquals("FL", customers.get(1418).getState());
	}

	@Test
	@DisplayName("Record 1419: ZIP is 32771")
	void ZIPOfRecord1419() {
		assertEquals("32771", customers.get(1418).getZIP());
	}

	@Test
	@DisplayName("Record 1419: Phone is 407-830-5481")
	void PhoneOfRecord1419() {
		assertEquals("407-830-5481", customers.get(1418).getPhone());
	}

	@Test
	@DisplayName("Record 1419: Fax is 407-830-1846")
	void FaxOfRecord1419() {
		assertEquals("407-830-1846", customers.get(1418).getFax());
	}

	@Test
	@DisplayName("Record 1419: Email is abram@larde.com")
	void EmailOfRecord1419() {
		assertEquals("abram@larde.com", customers.get(1418).getEmail());
	}

	@Test
	@DisplayName("Record 1419: Web is http://www.abramlarde.com")
	void WebOfRecord1419() {
		assertEquals("http://www.abramlarde.com", customers.get(1418).getWeb());
	}
}
