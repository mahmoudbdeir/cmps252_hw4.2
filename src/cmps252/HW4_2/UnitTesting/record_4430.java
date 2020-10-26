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

@Tag("9")
class Record_4430 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4430: FirstName is Jerrold")
	void FirstNameOfRecord4430() {
		assertEquals("Jerrold", customers.get(4429).getFirstName());
	}

	@Test
	@DisplayName("Record 4430: LastName is Kettler")
	void LastNameOfRecord4430() {
		assertEquals("Kettler", customers.get(4429).getLastName());
	}

	@Test
	@DisplayName("Record 4430: Company is Rexnord Technical Services")
	void CompanyOfRecord4430() {
		assertEquals("Rexnord Technical Services", customers.get(4429).getCompany());
	}

	@Test
	@DisplayName("Record 4430: Address is 970 Garcia Ave  #-a")
	void AddressOfRecord4430() {
		assertEquals("970 Garcia Ave  #-a", customers.get(4429).getAddress());
	}

	@Test
	@DisplayName("Record 4430: City is Pittsburg")
	void CityOfRecord4430() {
		assertEquals("Pittsburg", customers.get(4429).getCity());
	}

	@Test
	@DisplayName("Record 4430: County is Contra Costa")
	void CountyOfRecord4430() {
		assertEquals("Contra Costa", customers.get(4429).getCounty());
	}

	@Test
	@DisplayName("Record 4430: State is CA")
	void StateOfRecord4430() {
		assertEquals("CA", customers.get(4429).getState());
	}

	@Test
	@DisplayName("Record 4430: ZIP is 94565")
	void ZIPOfRecord4430() {
		assertEquals("94565", customers.get(4429).getZIP());
	}

	@Test
	@DisplayName("Record 4430: Phone is 925-427-3334")
	void PhoneOfRecord4430() {
		assertEquals("925-427-3334", customers.get(4429).getPhone());
	}

	@Test
	@DisplayName("Record 4430: Fax is 925-427-3551")
	void FaxOfRecord4430() {
		assertEquals("925-427-3551", customers.get(4429).getFax());
	}

	@Test
	@DisplayName("Record 4430: Email is jerrold@kettler.com")
	void EmailOfRecord4430() {
		assertEquals("jerrold@kettler.com", customers.get(4429).getEmail());
	}

	@Test
	@DisplayName("Record 4430: Web is http://www.jerroldkettler.com")
	void WebOfRecord4430() {
		assertEquals("http://www.jerroldkettler.com", customers.get(4429).getWeb());
	}
}
