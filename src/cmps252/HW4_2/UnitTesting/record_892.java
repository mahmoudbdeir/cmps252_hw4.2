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

@Tag("0")
class Record_892 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 892: FirstName is Ambrose")
	void FirstNameOfRecord892() {
		assertEquals("Ambrose", customers.get(891).getFirstName());
	}

	@Test
	@DisplayName("Record 892: LastName is Ketteringham")
	void LastNameOfRecord892() {
		assertEquals("Ketteringham", customers.get(891).getLastName());
	}

	@Test
	@DisplayName("Record 892: Company is M & M Coach Rentals")
	void CompanyOfRecord892() {
		assertEquals("M & M Coach Rentals", customers.get(891).getCompany());
	}

	@Test
	@DisplayName("Record 892: Address is 532 N York Rd")
	void AddressOfRecord892() {
		assertEquals("532 N York Rd", customers.get(891).getAddress());
	}

	@Test
	@DisplayName("Record 892: City is Bensenville")
	void CityOfRecord892() {
		assertEquals("Bensenville", customers.get(891).getCity());
	}

	@Test
	@DisplayName("Record 892: County is DuPage")
	void CountyOfRecord892() {
		assertEquals("DuPage", customers.get(891).getCounty());
	}

	@Test
	@DisplayName("Record 892: State is IL")
	void StateOfRecord892() {
		assertEquals("IL", customers.get(891).getState());
	}

	@Test
	@DisplayName("Record 892: ZIP is 60106")
	void ZIPOfRecord892() {
		assertEquals("60106", customers.get(891).getZIP());
	}

	@Test
	@DisplayName("Record 892: Phone is 630-350-2811")
	void PhoneOfRecord892() {
		assertEquals("630-350-2811", customers.get(891).getPhone());
	}

	@Test
	@DisplayName("Record 892: Fax is 630-350-7375")
	void FaxOfRecord892() {
		assertEquals("630-350-7375", customers.get(891).getFax());
	}

	@Test
	@DisplayName("Record 892: Email is ambrose@ketteringham.com")
	void EmailOfRecord892() {
		assertEquals("ambrose@ketteringham.com", customers.get(891).getEmail());
	}

	@Test
	@DisplayName("Record 892: Web is http://www.ambroseketteringham.com")
	void WebOfRecord892() {
		assertEquals("http://www.ambroseketteringham.com", customers.get(891).getWeb());
	}
}
