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

@Tag("43")
class Record_3653 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3653: FirstName is Celeste")
	void FirstNameOfRecord3653() {
		assertEquals("Celeste", customers.get(3652).getFirstName());
	}

	@Test
	@DisplayName("Record 3653: LastName is Merryweather")
	void LastNameOfRecord3653() {
		assertEquals("Merryweather", customers.get(3652).getLastName());
	}

	@Test
	@DisplayName("Record 3653: Company is Imperial China Restaurant")
	void CompanyOfRecord3653() {
		assertEquals("Imperial China Restaurant", customers.get(3652).getCompany());
	}

	@Test
	@DisplayName("Record 3653: Address is 1330 Nw 6th St")
	void AddressOfRecord3653() {
		assertEquals("1330 Nw 6th St", customers.get(3652).getAddress());
	}

	@Test
	@DisplayName("Record 3653: City is Gainesville")
	void CityOfRecord3653() {
		assertEquals("Gainesville", customers.get(3652).getCity());
	}

	@Test
	@DisplayName("Record 3653: County is Alachua")
	void CountyOfRecord3653() {
		assertEquals("Alachua", customers.get(3652).getCounty());
	}

	@Test
	@DisplayName("Record 3653: State is FL")
	void StateOfRecord3653() {
		assertEquals("FL", customers.get(3652).getState());
	}

	@Test
	@DisplayName("Record 3653: ZIP is 32601")
	void ZIPOfRecord3653() {
		assertEquals("32601", customers.get(3652).getZIP());
	}

	@Test
	@DisplayName("Record 3653: Phone is 352-378-4703")
	void PhoneOfRecord3653() {
		assertEquals("352-378-4703", customers.get(3652).getPhone());
	}

	@Test
	@DisplayName("Record 3653: Fax is 352-378-6552")
	void FaxOfRecord3653() {
		assertEquals("352-378-6552", customers.get(3652).getFax());
	}

	@Test
	@DisplayName("Record 3653: Email is celeste@merryweather.com")
	void EmailOfRecord3653() {
		assertEquals("celeste@merryweather.com", customers.get(3652).getEmail());
	}

	@Test
	@DisplayName("Record 3653: Web is http://www.celestemerryweather.com")
	void WebOfRecord3653() {
		assertEquals("http://www.celestemerryweather.com", customers.get(3652).getWeb());
	}
}
