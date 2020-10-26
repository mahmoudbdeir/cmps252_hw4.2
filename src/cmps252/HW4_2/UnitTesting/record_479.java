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

@Tag("20")
class Record_479 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 479: FirstName is Elida")
	void FirstNameOfRecord479() {
		assertEquals("Elida", customers.get(478).getFirstName());
	}

	@Test
	@DisplayName("Record 479: LastName is Selva")
	void LastNameOfRecord479() {
		assertEquals("Selva", customers.get(478).getLastName());
	}

	@Test
	@DisplayName("Record 479: Company is California Sea Coast Lodge")
	void CompanyOfRecord479() {
		assertEquals("California Sea Coast Lodge", customers.get(478).getCompany());
	}

	@Test
	@DisplayName("Record 479: Address is 3525 Longhorn Dr")
	void AddressOfRecord479() {
		assertEquals("3525 Longhorn Dr", customers.get(478).getAddress());
	}

	@Test
	@DisplayName("Record 479: City is Houston")
	void CityOfRecord479() {
		assertEquals("Houston", customers.get(478).getCity());
	}

	@Test
	@DisplayName("Record 479: County is Harris")
	void CountyOfRecord479() {
		assertEquals("Harris", customers.get(478).getCounty());
	}

	@Test
	@DisplayName("Record 479: State is TX")
	void StateOfRecord479() {
		assertEquals("TX", customers.get(478).getState());
	}

	@Test
	@DisplayName("Record 479: ZIP is 77084")
	void ZIPOfRecord479() {
		assertEquals("77084", customers.get(478).getZIP());
	}

	@Test
	@DisplayName("Record 479: Phone is 281-579-1237")
	void PhoneOfRecord479() {
		assertEquals("281-579-1237", customers.get(478).getPhone());
	}

	@Test
	@DisplayName("Record 479: Fax is 281-579-0384")
	void FaxOfRecord479() {
		assertEquals("281-579-0384", customers.get(478).getFax());
	}

	@Test
	@DisplayName("Record 479: Email is elida@selva.com")
	void EmailOfRecord479() {
		assertEquals("elida@selva.com", customers.get(478).getEmail());
	}

	@Test
	@DisplayName("Record 479: Web is http://www.elidaselva.com")
	void WebOfRecord479() {
		assertEquals("http://www.elidaselva.com", customers.get(478).getWeb());
	}
}
