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

@Tag("40")
class Record_2083 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2083: FirstName is Dennis")
	void FirstNameOfRecord2083() {
		assertEquals("Dennis", customers.get(2082).getFirstName());
	}

	@Test
	@DisplayName("Record 2083: LastName is Creagh")
	void LastNameOfRecord2083() {
		assertEquals("Creagh", customers.get(2082).getLastName());
	}

	@Test
	@DisplayName("Record 2083: Company is Waller & Mark Pc")
	void CompanyOfRecord2083() {
		assertEquals("Waller & Mark Pc", customers.get(2082).getCompany());
	}

	@Test
	@DisplayName("Record 2083: Address is 1610 Westchester Dr")
	void AddressOfRecord2083() {
		assertEquals("1610 Westchester Dr", customers.get(2082).getAddress());
	}

	@Test
	@DisplayName("Record 2083: City is High Point")
	void CityOfRecord2083() {
		assertEquals("High Point", customers.get(2082).getCity());
	}

	@Test
	@DisplayName("Record 2083: County is Guilford")
	void CountyOfRecord2083() {
		assertEquals("Guilford", customers.get(2082).getCounty());
	}

	@Test
	@DisplayName("Record 2083: State is NC")
	void StateOfRecord2083() {
		assertEquals("NC", customers.get(2082).getState());
	}

	@Test
	@DisplayName("Record 2083: ZIP is 27262")
	void ZIPOfRecord2083() {
		assertEquals("27262", customers.get(2082).getZIP());
	}

	@Test
	@DisplayName("Record 2083: Phone is 336-885-9859")
	void PhoneOfRecord2083() {
		assertEquals("336-885-9859", customers.get(2082).getPhone());
	}

	@Test
	@DisplayName("Record 2083: Fax is 336-885-7296")
	void FaxOfRecord2083() {
		assertEquals("336-885-7296", customers.get(2082).getFax());
	}

	@Test
	@DisplayName("Record 2083: Email is dennis@creagh.com")
	void EmailOfRecord2083() {
		assertEquals("dennis@creagh.com", customers.get(2082).getEmail());
	}

	@Test
	@DisplayName("Record 2083: Web is http://www.denniscreagh.com")
	void WebOfRecord2083() {
		assertEquals("http://www.denniscreagh.com", customers.get(2082).getWeb());
	}
}
