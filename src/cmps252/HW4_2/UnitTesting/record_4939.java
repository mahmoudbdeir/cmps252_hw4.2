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

@Tag("11")
class Record_4939 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4939: FirstName is Aldo")
	void FirstNameOfRecord4939() {
		assertEquals("Aldo", customers.get(4938).getFirstName());
	}

	@Test
	@DisplayName("Record 4939: LastName is Styber")
	void LastNameOfRecord4939() {
		assertEquals("Styber", customers.get(4938).getLastName());
	}

	@Test
	@DisplayName("Record 4939: Company is Greenspan Landscaping Inc")
	void CompanyOfRecord4939() {
		assertEquals("Greenspan Landscaping Inc", customers.get(4938).getCompany());
	}

	@Test
	@DisplayName("Record 4939: Address is 1100 Wilson Blvd")
	void AddressOfRecord4939() {
		assertEquals("1100 Wilson Blvd", customers.get(4938).getAddress());
	}

	@Test
	@DisplayName("Record 4939: City is Arlington")
	void CityOfRecord4939() {
		assertEquals("Arlington", customers.get(4938).getCity());
	}

	@Test
	@DisplayName("Record 4939: County is Arlington")
	void CountyOfRecord4939() {
		assertEquals("Arlington", customers.get(4938).getCounty());
	}

	@Test
	@DisplayName("Record 4939: State is VA")
	void StateOfRecord4939() {
		assertEquals("VA", customers.get(4938).getState());
	}

	@Test
	@DisplayName("Record 4939: ZIP is 22209")
	void ZIPOfRecord4939() {
		assertEquals("22209", customers.get(4938).getZIP());
	}

	@Test
	@DisplayName("Record 4939: Phone is 703-528-4447")
	void PhoneOfRecord4939() {
		assertEquals("703-528-4447", customers.get(4938).getPhone());
	}

	@Test
	@DisplayName("Record 4939: Fax is 703-528-0038")
	void FaxOfRecord4939() {
		assertEquals("703-528-0038", customers.get(4938).getFax());
	}

	@Test
	@DisplayName("Record 4939: Email is aldo@styber.com")
	void EmailOfRecord4939() {
		assertEquals("aldo@styber.com", customers.get(4938).getEmail());
	}

	@Test
	@DisplayName("Record 4939: Web is http://www.aldostyber.com")
	void WebOfRecord4939() {
		assertEquals("http://www.aldostyber.com", customers.get(4938).getWeb());
	}
}
