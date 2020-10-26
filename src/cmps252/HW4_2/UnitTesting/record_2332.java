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

@Tag("8")
class Record_2332 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2332: FirstName is Cyril")
	void FirstNameOfRecord2332() {
		assertEquals("Cyril", customers.get(2331).getFirstName());
	}

	@Test
	@DisplayName("Record 2332: LastName is Vradenburg")
	void LastNameOfRecord2332() {
		assertEquals("Vradenburg", customers.get(2331).getLastName());
	}

	@Test
	@DisplayName("Record 2332: Company is Mccubbin Hosiery Inc")
	void CompanyOfRecord2332() {
		assertEquals("Mccubbin Hosiery Inc", customers.get(2331).getCompany());
	}

	@Test
	@DisplayName("Record 2332: Address is 248 Columbia Tpke")
	void AddressOfRecord2332() {
		assertEquals("248 Columbia Tpke", customers.get(2331).getAddress());
	}

	@Test
	@DisplayName("Record 2332: City is Florham Park")
	void CityOfRecord2332() {
		assertEquals("Florham Park", customers.get(2331).getCity());
	}

	@Test
	@DisplayName("Record 2332: County is Morris")
	void CountyOfRecord2332() {
		assertEquals("Morris", customers.get(2331).getCounty());
	}

	@Test
	@DisplayName("Record 2332: State is NJ")
	void StateOfRecord2332() {
		assertEquals("NJ", customers.get(2331).getState());
	}

	@Test
	@DisplayName("Record 2332: ZIP is 7932")
	void ZIPOfRecord2332() {
		assertEquals("7932", customers.get(2331).getZIP());
	}

	@Test
	@DisplayName("Record 2332: Phone is 973-966-5328")
	void PhoneOfRecord2332() {
		assertEquals("973-966-5328", customers.get(2331).getPhone());
	}

	@Test
	@DisplayName("Record 2332: Fax is 973-966-0956")
	void FaxOfRecord2332() {
		assertEquals("973-966-0956", customers.get(2331).getFax());
	}

	@Test
	@DisplayName("Record 2332: Email is cyril@vradenburg.com")
	void EmailOfRecord2332() {
		assertEquals("cyril@vradenburg.com", customers.get(2331).getEmail());
	}

	@Test
	@DisplayName("Record 2332: Web is http://www.cyrilvradenburg.com")
	void WebOfRecord2332() {
		assertEquals("http://www.cyrilvradenburg.com", customers.get(2331).getWeb());
	}
}
