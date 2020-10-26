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

@Tag("37")
class Record_4830 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4830: FirstName is Deana")
	void FirstNameOfRecord4830() {
		assertEquals("Deana", customers.get(4829).getFirstName());
	}

	@Test
	@DisplayName("Record 4830: LastName is Forkosh")
	void LastNameOfRecord4830() {
		assertEquals("Forkosh", customers.get(4829).getLastName());
	}

	@Test
	@DisplayName("Record 4830: Company is Oregon Iron Works Inc")
	void CompanyOfRecord4830() {
		assertEquals("Oregon Iron Works Inc", customers.get(4829).getCompany());
	}

	@Test
	@DisplayName("Record 4830: Address is 1154 Fort Stre")
	void AddressOfRecord4830() {
		assertEquals("1154 Fort Stre", customers.get(4829).getAddress());
	}

	@Test
	@DisplayName("Record 4830: City is Honolulu")
	void CityOfRecord4830() {
		assertEquals("Honolulu", customers.get(4829).getCity());
	}

	@Test
	@DisplayName("Record 4830: County is Honolulu")
	void CountyOfRecord4830() {
		assertEquals("Honolulu", customers.get(4829).getCounty());
	}

	@Test
	@DisplayName("Record 4830: State is HI")
	void StateOfRecord4830() {
		assertEquals("HI", customers.get(4829).getState());
	}

	@Test
	@DisplayName("Record 4830: ZIP is 96813")
	void ZIPOfRecord4830() {
		assertEquals("96813", customers.get(4829).getZIP());
	}

	@Test
	@DisplayName("Record 4830: Phone is 808-531-5062")
	void PhoneOfRecord4830() {
		assertEquals("808-531-5062", customers.get(4829).getPhone());
	}

	@Test
	@DisplayName("Record 4830: Fax is 808-531-6978")
	void FaxOfRecord4830() {
		assertEquals("808-531-6978", customers.get(4829).getFax());
	}

	@Test
	@DisplayName("Record 4830: Email is deana@forkosh.com")
	void EmailOfRecord4830() {
		assertEquals("deana@forkosh.com", customers.get(4829).getEmail());
	}

	@Test
	@DisplayName("Record 4830: Web is http://www.deanaforkosh.com")
	void WebOfRecord4830() {
		assertEquals("http://www.deanaforkosh.com", customers.get(4829).getWeb());
	}
}
