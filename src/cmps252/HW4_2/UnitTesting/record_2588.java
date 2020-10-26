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
class Record_2588 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2588: FirstName is Dwight")
	void FirstNameOfRecord2588() {
		assertEquals("Dwight", customers.get(2587).getFirstName());
	}

	@Test
	@DisplayName("Record 2588: LastName is Niewieroski")
	void LastNameOfRecord2588() {
		assertEquals("Niewieroski", customers.get(2587).getLastName());
	}

	@Test
	@DisplayName("Record 2588: Company is Three Sisters")
	void CompanyOfRecord2588() {
		assertEquals("Three Sisters", customers.get(2587).getCompany());
	}

	@Test
	@DisplayName("Record 2588: Address is 2719 Kurts St")
	void AddressOfRecord2588() {
		assertEquals("2719 Kurts St", customers.get(2587).getAddress());
	}

	@Test
	@DisplayName("Record 2588: City is San Diego")
	void CityOfRecord2588() {
		assertEquals("San Diego", customers.get(2587).getCity());
	}

	@Test
	@DisplayName("Record 2588: County is San Diego")
	void CountyOfRecord2588() {
		assertEquals("San Diego", customers.get(2587).getCounty());
	}

	@Test
	@DisplayName("Record 2588: State is CA")
	void StateOfRecord2588() {
		assertEquals("CA", customers.get(2587).getState());
	}

	@Test
	@DisplayName("Record 2588: ZIP is 92110")
	void ZIPOfRecord2588() {
		assertEquals("92110", customers.get(2587).getZIP());
	}

	@Test
	@DisplayName("Record 2588: Phone is 858-291-4203")
	void PhoneOfRecord2588() {
		assertEquals("858-291-4203", customers.get(2587).getPhone());
	}

	@Test
	@DisplayName("Record 2588: Fax is 858-291-2187")
	void FaxOfRecord2588() {
		assertEquals("858-291-2187", customers.get(2587).getFax());
	}

	@Test
	@DisplayName("Record 2588: Email is dwight@niewieroski.com")
	void EmailOfRecord2588() {
		assertEquals("dwight@niewieroski.com", customers.get(2587).getEmail());
	}

	@Test
	@DisplayName("Record 2588: Web is http://www.dwightniewieroski.com")
	void WebOfRecord2588() {
		assertEquals("http://www.dwightniewieroski.com", customers.get(2587).getWeb());
	}
}
