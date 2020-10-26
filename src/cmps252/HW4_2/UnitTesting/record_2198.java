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
class Record_2198 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2198: FirstName is Marie")
	void FirstNameOfRecord2198() {
		assertEquals("Marie", customers.get(2197).getFirstName());
	}

	@Test
	@DisplayName("Record 2198: LastName is Mexicano")
	void LastNameOfRecord2198() {
		assertEquals("Mexicano", customers.get(2197).getLastName());
	}

	@Test
	@DisplayName("Record 2198: Company is Pearce, J Wray")
	void CompanyOfRecord2198() {
		assertEquals("Pearce, J Wray", customers.get(2197).getCompany());
	}

	@Test
	@DisplayName("Record 2198: Address is 2105 Morrie Ave")
	void AddressOfRecord2198() {
		assertEquals("2105 Morrie Ave", customers.get(2197).getAddress());
	}

	@Test
	@DisplayName("Record 2198: City is Cheyenne")
	void CityOfRecord2198() {
		assertEquals("Cheyenne", customers.get(2197).getCity());
	}

	@Test
	@DisplayName("Record 2198: County is Laramie")
	void CountyOfRecord2198() {
		assertEquals("Laramie", customers.get(2197).getCounty());
	}

	@Test
	@DisplayName("Record 2198: State is WY")
	void StateOfRecord2198() {
		assertEquals("WY", customers.get(2197).getState());
	}

	@Test
	@DisplayName("Record 2198: ZIP is 82001")
	void ZIPOfRecord2198() {
		assertEquals("82001", customers.get(2197).getZIP());
	}

	@Test
	@DisplayName("Record 2198: Phone is 307-778-2521")
	void PhoneOfRecord2198() {
		assertEquals("307-778-2521", customers.get(2197).getPhone());
	}

	@Test
	@DisplayName("Record 2198: Fax is 307-778-0082")
	void FaxOfRecord2198() {
		assertEquals("307-778-0082", customers.get(2197).getFax());
	}

	@Test
	@DisplayName("Record 2198: Email is marie@mexicano.com")
	void EmailOfRecord2198() {
		assertEquals("marie@mexicano.com", customers.get(2197).getEmail());
	}

	@Test
	@DisplayName("Record 2198: Web is http://www.mariemexicano.com")
	void WebOfRecord2198() {
		assertEquals("http://www.mariemexicano.com", customers.get(2197).getWeb());
	}
}
