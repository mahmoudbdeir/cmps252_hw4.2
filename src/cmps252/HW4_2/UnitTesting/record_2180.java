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

@Tag("3")
class Record_2180 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2180: FirstName is Elida")
	void FirstNameOfRecord2180() {
		assertEquals("Elida", customers.get(2179).getFirstName());
	}

	@Test
	@DisplayName("Record 2180: LastName is Schiffer")
	void LastNameOfRecord2180() {
		assertEquals("Schiffer", customers.get(2179).getLastName());
	}

	@Test
	@DisplayName("Record 2180: Company is Oliker, David C Cpa")
	void CompanyOfRecord2180() {
		assertEquals("Oliker, David C Cpa", customers.get(2179).getCompany());
	}

	@Test
	@DisplayName("Record 2180: Address is 3533 N 27th St")
	void AddressOfRecord2180() {
		assertEquals("3533 N 27th St", customers.get(2179).getAddress());
	}

	@Test
	@DisplayName("Record 2180: City is Milwaukee")
	void CityOfRecord2180() {
		assertEquals("Milwaukee", customers.get(2179).getCity());
	}

	@Test
	@DisplayName("Record 2180: County is Milwaukee")
	void CountyOfRecord2180() {
		assertEquals("Milwaukee", customers.get(2179).getCounty());
	}

	@Test
	@DisplayName("Record 2180: State is WI")
	void StateOfRecord2180() {
		assertEquals("WI", customers.get(2179).getState());
	}

	@Test
	@DisplayName("Record 2180: ZIP is 53216")
	void ZIPOfRecord2180() {
		assertEquals("53216", customers.get(2179).getZIP());
	}

	@Test
	@DisplayName("Record 2180: Phone is 414-447-7612")
	void PhoneOfRecord2180() {
		assertEquals("414-447-7612", customers.get(2179).getPhone());
	}

	@Test
	@DisplayName("Record 2180: Fax is 414-447-2051")
	void FaxOfRecord2180() {
		assertEquals("414-447-2051", customers.get(2179).getFax());
	}

	@Test
	@DisplayName("Record 2180: Email is elida@schiffer.com")
	void EmailOfRecord2180() {
		assertEquals("elida@schiffer.com", customers.get(2179).getEmail());
	}

	@Test
	@DisplayName("Record 2180: Web is http://www.elidaschiffer.com")
	void WebOfRecord2180() {
		assertEquals("http://www.elidaschiffer.com", customers.get(2179).getWeb());
	}
}
