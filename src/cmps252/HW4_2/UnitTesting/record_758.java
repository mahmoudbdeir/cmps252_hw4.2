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

@Tag("30")
class Record_758 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 758: FirstName is Haywood")
	void FirstNameOfRecord758() {
		assertEquals("Haywood", customers.get(757).getFirstName());
	}

	@Test
	@DisplayName("Record 758: LastName is Nunnelee")
	void LastNameOfRecord758() {
		assertEquals("Nunnelee", customers.get(757).getLastName());
	}

	@Test
	@DisplayName("Record 758: Company is Gateway Printing")
	void CompanyOfRecord758() {
		assertEquals("Gateway Printing", customers.get(757).getCompany());
	}

	@Test
	@DisplayName("Record 758: Address is 4743 Clayton Rd")
	void AddressOfRecord758() {
		assertEquals("4743 Clayton Rd", customers.get(757).getAddress());
	}

	@Test
	@DisplayName("Record 758: City is Concord")
	void CityOfRecord758() {
		assertEquals("Concord", customers.get(757).getCity());
	}

	@Test
	@DisplayName("Record 758: County is Contra Costa")
	void CountyOfRecord758() {
		assertEquals("Contra Costa", customers.get(757).getCounty());
	}

	@Test
	@DisplayName("Record 758: State is CA")
	void StateOfRecord758() {
		assertEquals("CA", customers.get(757).getState());
	}

	@Test
	@DisplayName("Record 758: ZIP is 94521")
	void ZIPOfRecord758() {
		assertEquals("94521", customers.get(757).getZIP());
	}

	@Test
	@DisplayName("Record 758: Phone is 925-825-2292")
	void PhoneOfRecord758() {
		assertEquals("925-825-2292", customers.get(757).getPhone());
	}

	@Test
	@DisplayName("Record 758: Fax is 925-825-1818")
	void FaxOfRecord758() {
		assertEquals("925-825-1818", customers.get(757).getFax());
	}

	@Test
	@DisplayName("Record 758: Email is haywood@nunnelee.com")
	void EmailOfRecord758() {
		assertEquals("haywood@nunnelee.com", customers.get(757).getEmail());
	}

	@Test
	@DisplayName("Record 758: Web is http://www.haywoodnunnelee.com")
	void WebOfRecord758() {
		assertEquals("http://www.haywoodnunnelee.com", customers.get(757).getWeb());
	}
}
