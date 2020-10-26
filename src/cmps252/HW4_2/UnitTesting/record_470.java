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

@Tag("14")
class Record_470 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 470: FirstName is Ned")
	void FirstNameOfRecord470() {
		assertEquals("Ned", customers.get(469).getFirstName());
	}

	@Test
	@DisplayName("Record 470: LastName is Natter")
	void LastNameOfRecord470() {
		assertEquals("Natter", customers.get(469).getLastName());
	}

	@Test
	@DisplayName("Record 470: Company is All American Golf Sales Inc")
	void CompanyOfRecord470() {
		assertEquals("All American Golf Sales Inc", customers.get(469).getCompany());
	}

	@Test
	@DisplayName("Record 470: Address is 6525 Upland St")
	void AddressOfRecord470() {
		assertEquals("6525 Upland St", customers.get(469).getAddress());
	}

	@Test
	@DisplayName("Record 470: City is Philadelphia")
	void CityOfRecord470() {
		assertEquals("Philadelphia", customers.get(469).getCity());
	}

	@Test
	@DisplayName("Record 470: County is Philadelphia")
	void CountyOfRecord470() {
		assertEquals("Philadelphia", customers.get(469).getCounty());
	}

	@Test
	@DisplayName("Record 470: State is PA")
	void StateOfRecord470() {
		assertEquals("PA", customers.get(469).getState());
	}

	@Test
	@DisplayName("Record 470: ZIP is 19142")
	void ZIPOfRecord470() {
		assertEquals("19142", customers.get(469).getZIP());
	}

	@Test
	@DisplayName("Record 470: Phone is 215-724-1936")
	void PhoneOfRecord470() {
		assertEquals("215-724-1936", customers.get(469).getPhone());
	}

	@Test
	@DisplayName("Record 470: Fax is 215-724-5518")
	void FaxOfRecord470() {
		assertEquals("215-724-5518", customers.get(469).getFax());
	}

	@Test
	@DisplayName("Record 470: Email is ned@natter.com")
	void EmailOfRecord470() {
		assertEquals("ned@natter.com", customers.get(469).getEmail());
	}

	@Test
	@DisplayName("Record 470: Web is http://www.nednatter.com")
	void WebOfRecord470() {
		assertEquals("http://www.nednatter.com", customers.get(469).getWeb());
	}
}
