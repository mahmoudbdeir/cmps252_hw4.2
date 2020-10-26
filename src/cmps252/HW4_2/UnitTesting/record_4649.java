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

@Tag("13")
class Record_4649 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4649: FirstName is Truman")
	void FirstNameOfRecord4649() {
		assertEquals("Truman", customers.get(4648).getFirstName());
	}

	@Test
	@DisplayName("Record 4649: LastName is Tenny")
	void LastNameOfRecord4649() {
		assertEquals("Tenny", customers.get(4648).getLastName());
	}

	@Test
	@DisplayName("Record 4649: Company is Villa Restaurant")
	void CompanyOfRecord4649() {
		assertEquals("Villa Restaurant", customers.get(4648).getCompany());
	}

	@Test
	@DisplayName("Record 4649: Address is 103 Charmonie Ln")
	void AddressOfRecord4649() {
		assertEquals("103 Charmonie Ln", customers.get(4648).getAddress());
	}

	@Test
	@DisplayName("Record 4649: City is Lafayette")
	void CityOfRecord4649() {
		assertEquals("Lafayette", customers.get(4648).getCity());
	}

	@Test
	@DisplayName("Record 4649: County is Lafayette")
	void CountyOfRecord4649() {
		assertEquals("Lafayette", customers.get(4648).getCounty());
	}

	@Test
	@DisplayName("Record 4649: State is LA")
	void StateOfRecord4649() {
		assertEquals("LA", customers.get(4648).getState());
	}

	@Test
	@DisplayName("Record 4649: ZIP is 70507")
	void ZIPOfRecord4649() {
		assertEquals("70507", customers.get(4648).getZIP());
	}

	@Test
	@DisplayName("Record 4649: Phone is 337-981-3068")
	void PhoneOfRecord4649() {
		assertEquals("337-981-3068", customers.get(4648).getPhone());
	}

	@Test
	@DisplayName("Record 4649: Fax is 337-981-6468")
	void FaxOfRecord4649() {
		assertEquals("337-981-6468", customers.get(4648).getFax());
	}

	@Test
	@DisplayName("Record 4649: Email is truman@tenny.com")
	void EmailOfRecord4649() {
		assertEquals("truman@tenny.com", customers.get(4648).getEmail());
	}

	@Test
	@DisplayName("Record 4649: Web is http://www.trumantenny.com")
	void WebOfRecord4649() {
		assertEquals("http://www.trumantenny.com", customers.get(4648).getWeb());
	}
}
