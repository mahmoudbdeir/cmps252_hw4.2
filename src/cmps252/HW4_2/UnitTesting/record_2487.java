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

@Tag("17")
class Record_2487 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2487: FirstName is Ines")
	void FirstNameOfRecord2487() {
		assertEquals("Ines", customers.get(2486).getFirstName());
	}

	@Test
	@DisplayName("Record 2487: LastName is Korns")
	void LastNameOfRecord2487() {
		assertEquals("Korns", customers.get(2486).getLastName());
	}

	@Test
	@DisplayName("Record 2487: Company is Jackson Machinery Company")
	void CompanyOfRecord2487() {
		assertEquals("Jackson Machinery Company", customers.get(2486).getCompany());
	}

	@Test
	@DisplayName("Record 2487: Address is 2410 W Brooklyn Ave")
	void AddressOfRecord2487() {
		assertEquals("2410 W Brooklyn Ave", customers.get(2486).getAddress());
	}

	@Test
	@DisplayName("Record 2487: City is Dallas")
	void CityOfRecord2487() {
		assertEquals("Dallas", customers.get(2486).getCity());
	}

	@Test
	@DisplayName("Record 2487: County is Dallas")
	void CountyOfRecord2487() {
		assertEquals("Dallas", customers.get(2486).getCounty());
	}

	@Test
	@DisplayName("Record 2487: State is TX")
	void StateOfRecord2487() {
		assertEquals("TX", customers.get(2486).getState());
	}

	@Test
	@DisplayName("Record 2487: ZIP is 75211")
	void ZIPOfRecord2487() {
		assertEquals("75211", customers.get(2486).getZIP());
	}

	@Test
	@DisplayName("Record 2487: Phone is 214-941-3019")
	void PhoneOfRecord2487() {
		assertEquals("214-941-3019", customers.get(2486).getPhone());
	}

	@Test
	@DisplayName("Record 2487: Fax is 214-941-6942")
	void FaxOfRecord2487() {
		assertEquals("214-941-6942", customers.get(2486).getFax());
	}

	@Test
	@DisplayName("Record 2487: Email is ines@korns.com")
	void EmailOfRecord2487() {
		assertEquals("ines@korns.com", customers.get(2486).getEmail());
	}

	@Test
	@DisplayName("Record 2487: Web is http://www.ineskorns.com")
	void WebOfRecord2487() {
		assertEquals("http://www.ineskorns.com", customers.get(2486).getWeb());
	}
}
