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

@Tag("38")
class Record_598 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 598: FirstName is Summer")
	void FirstNameOfRecord598() {
		assertEquals("Summer", customers.get(597).getFirstName());
	}

	@Test
	@DisplayName("Record 598: LastName is Nollette")
	void LastNameOfRecord598() {
		assertEquals("Nollette", customers.get(597).getLastName());
	}

	@Test
	@DisplayName("Record 598: Company is Green Bay Education Assn")
	void CompanyOfRecord598() {
		assertEquals("Green Bay Education Assn", customers.get(597).getCompany());
	}

	@Test
	@DisplayName("Record 598: Address is 5560 E Slauson Ave")
	void AddressOfRecord598() {
		assertEquals("5560 E Slauson Ave", customers.get(597).getAddress());
	}

	@Test
	@DisplayName("Record 598: City is Los Angeles")
	void CityOfRecord598() {
		assertEquals("Los Angeles", customers.get(597).getCity());
	}

	@Test
	@DisplayName("Record 598: County is Los Angeles")
	void CountyOfRecord598() {
		assertEquals("Los Angeles", customers.get(597).getCounty());
	}

	@Test
	@DisplayName("Record 598: State is CA")
	void StateOfRecord598() {
		assertEquals("CA", customers.get(597).getState());
	}

	@Test
	@DisplayName("Record 598: ZIP is 90040")
	void ZIPOfRecord598() {
		assertEquals("90040", customers.get(597).getZIP());
	}

	@Test
	@DisplayName("Record 598: Phone is 323-722-1214")
	void PhoneOfRecord598() {
		assertEquals("323-722-1214", customers.get(597).getPhone());
	}

	@Test
	@DisplayName("Record 598: Fax is 323-722-8437")
	void FaxOfRecord598() {
		assertEquals("323-722-8437", customers.get(597).getFax());
	}

	@Test
	@DisplayName("Record 598: Email is summer@nollette.com")
	void EmailOfRecord598() {
		assertEquals("summer@nollette.com", customers.get(597).getEmail());
	}

	@Test
	@DisplayName("Record 598: Web is http://www.summernollette.com")
	void WebOfRecord598() {
		assertEquals("http://www.summernollette.com", customers.get(597).getWeb());
	}
}
