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

@Tag("22")
class Record_844 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 844: FirstName is Danna")
	void FirstNameOfRecord844() {
		assertEquals("Danna", customers.get(843).getFirstName());
	}

	@Test
	@DisplayName("Record 844: LastName is Pickell")
	void LastNameOfRecord844() {
		assertEquals("Pickell", customers.get(843).getLastName());
	}

	@Test
	@DisplayName("Record 844: Company is Lester Assocs Inc")
	void CompanyOfRecord844() {
		assertEquals("Lester Assocs Inc", customers.get(843).getCompany());
	}

	@Test
	@DisplayName("Record 844: Address is 21625 Doral Rd")
	void AddressOfRecord844() {
		assertEquals("21625 Doral Rd", customers.get(843).getAddress());
	}

	@Test
	@DisplayName("Record 844: City is Waukesha")
	void CityOfRecord844() {
		assertEquals("Waukesha", customers.get(843).getCity());
	}

	@Test
	@DisplayName("Record 844: County is Waukesha")
	void CountyOfRecord844() {
		assertEquals("Waukesha", customers.get(843).getCounty());
	}

	@Test
	@DisplayName("Record 844: State is WI")
	void StateOfRecord844() {
		assertEquals("WI", customers.get(843).getState());
	}

	@Test
	@DisplayName("Record 844: ZIP is 53186")
	void ZIPOfRecord844() {
		assertEquals("53186", customers.get(843).getZIP());
	}

	@Test
	@DisplayName("Record 844: Phone is 262-784-5450")
	void PhoneOfRecord844() {
		assertEquals("262-784-5450", customers.get(843).getPhone());
	}

	@Test
	@DisplayName("Record 844: Fax is 262-784-5118")
	void FaxOfRecord844() {
		assertEquals("262-784-5118", customers.get(843).getFax());
	}

	@Test
	@DisplayName("Record 844: Email is danna@pickell.com")
	void EmailOfRecord844() {
		assertEquals("danna@pickell.com", customers.get(843).getEmail());
	}

	@Test
	@DisplayName("Record 844: Web is http://www.dannapickell.com")
	void WebOfRecord844() {
		assertEquals("http://www.dannapickell.com", customers.get(843).getWeb());
	}
}
