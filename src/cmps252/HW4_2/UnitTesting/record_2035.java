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

@Tag("39")
class Record_2035 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2035: FirstName is Laverne")
	void FirstNameOfRecord2035() {
		assertEquals("Laverne", customers.get(2034).getFirstName());
	}

	@Test
	@DisplayName("Record 2035: LastName is Tweddle")
	void LastNameOfRecord2035() {
		assertEquals("Tweddle", customers.get(2034).getLastName());
	}

	@Test
	@DisplayName("Record 2035: Company is Tiac C & C Corp")
	void CompanyOfRecord2035() {
		assertEquals("Tiac C & C Corp", customers.get(2034).getCompany());
	}

	@Test
	@DisplayName("Record 2035: Address is 175 Rano St")
	void AddressOfRecord2035() {
		assertEquals("175 Rano St", customers.get(2034).getAddress());
	}

	@Test
	@DisplayName("Record 2035: City is Buffalo")
	void CityOfRecord2035() {
		assertEquals("Buffalo", customers.get(2034).getCity());
	}

	@Test
	@DisplayName("Record 2035: County is Erie")
	void CountyOfRecord2035() {
		assertEquals("Erie", customers.get(2034).getCounty());
	}

	@Test
	@DisplayName("Record 2035: State is NY")
	void StateOfRecord2035() {
		assertEquals("NY", customers.get(2034).getState());
	}

	@Test
	@DisplayName("Record 2035: ZIP is 14207")
	void ZIPOfRecord2035() {
		assertEquals("14207", customers.get(2034).getZIP());
	}

	@Test
	@DisplayName("Record 2035: Phone is 716-695-1475")
	void PhoneOfRecord2035() {
		assertEquals("716-695-1475", customers.get(2034).getPhone());
	}

	@Test
	@DisplayName("Record 2035: Fax is 716-695-3797")
	void FaxOfRecord2035() {
		assertEquals("716-695-3797", customers.get(2034).getFax());
	}

	@Test
	@DisplayName("Record 2035: Email is laverne@tweddle.com")
	void EmailOfRecord2035() {
		assertEquals("laverne@tweddle.com", customers.get(2034).getEmail());
	}

	@Test
	@DisplayName("Record 2035: Web is http://www.lavernetweddle.com")
	void WebOfRecord2035() {
		assertEquals("http://www.lavernetweddle.com", customers.get(2034).getWeb());
	}
}
