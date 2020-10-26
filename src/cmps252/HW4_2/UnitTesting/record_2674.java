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

@Tag("11")
class Record_2674 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2674: FirstName is Raquel")
	void FirstNameOfRecord2674() {
		assertEquals("Raquel", customers.get(2673).getFirstName());
	}

	@Test
	@DisplayName("Record 2674: LastName is Howdyshell")
	void LastNameOfRecord2674() {
		assertEquals("Howdyshell", customers.get(2673).getLastName());
	}

	@Test
	@DisplayName("Record 2674: Company is Midwest Moving & Storage")
	void CompanyOfRecord2674() {
		assertEquals("Midwest Moving & Storage", customers.get(2673).getCompany());
	}

	@Test
	@DisplayName("Record 2674: Address is 4343 S Ashland Ave")
	void AddressOfRecord2674() {
		assertEquals("4343 S Ashland Ave", customers.get(2673).getAddress());
	}

	@Test
	@DisplayName("Record 2674: City is Chicago")
	void CityOfRecord2674() {
		assertEquals("Chicago", customers.get(2673).getCity());
	}

	@Test
	@DisplayName("Record 2674: County is Cook")
	void CountyOfRecord2674() {
		assertEquals("Cook", customers.get(2673).getCounty());
	}

	@Test
	@DisplayName("Record 2674: State is IL")
	void StateOfRecord2674() {
		assertEquals("IL", customers.get(2673).getState());
	}

	@Test
	@DisplayName("Record 2674: ZIP is 60609")
	void ZIPOfRecord2674() {
		assertEquals("60609", customers.get(2673).getZIP());
	}

	@Test
	@DisplayName("Record 2674: Phone is 773-254-5033")
	void PhoneOfRecord2674() {
		assertEquals("773-254-5033", customers.get(2673).getPhone());
	}

	@Test
	@DisplayName("Record 2674: Fax is 773-254-6197")
	void FaxOfRecord2674() {
		assertEquals("773-254-6197", customers.get(2673).getFax());
	}

	@Test
	@DisplayName("Record 2674: Email is raquel@howdyshell.com")
	void EmailOfRecord2674() {
		assertEquals("raquel@howdyshell.com", customers.get(2673).getEmail());
	}

	@Test
	@DisplayName("Record 2674: Web is http://www.raquelhowdyshell.com")
	void WebOfRecord2674() {
		assertEquals("http://www.raquelhowdyshell.com", customers.get(2673).getWeb());
	}
}
