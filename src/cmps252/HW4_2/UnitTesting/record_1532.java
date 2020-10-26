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

@Tag("8")
class Record_1532 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1532: FirstName is Dolly")
	void FirstNameOfRecord1532() {
		assertEquals("Dolly", customers.get(1531).getFirstName());
	}

	@Test
	@DisplayName("Record 1532: LastName is Mccamey")
	void LastNameOfRecord1532() {
		assertEquals("Mccamey", customers.get(1531).getLastName());
	}

	@Test
	@DisplayName("Record 1532: Company is M S S I")
	void CompanyOfRecord1532() {
		assertEquals("M S S I", customers.get(1531).getCompany());
	}

	@Test
	@DisplayName("Record 1532: Address is 735 North Ave")
	void AddressOfRecord1532() {
		assertEquals("735 North Ave", customers.get(1531).getAddress());
	}

	@Test
	@DisplayName("Record 1532: City is Garden City")
	void CityOfRecord1532() {
		assertEquals("Garden City", customers.get(1531).getCity());
	}

	@Test
	@DisplayName("Record 1532: County is Nassau")
	void CountyOfRecord1532() {
		assertEquals("Nassau", customers.get(1531).getCounty());
	}

	@Test
	@DisplayName("Record 1532: State is NY")
	void StateOfRecord1532() {
		assertEquals("NY", customers.get(1531).getState());
	}

	@Test
	@DisplayName("Record 1532: ZIP is 11530")
	void ZIPOfRecord1532() {
		assertEquals("11530", customers.get(1531).getZIP());
	}

	@Test
	@DisplayName("Record 1532: Phone is 516-222-4821")
	void PhoneOfRecord1532() {
		assertEquals("516-222-4821", customers.get(1531).getPhone());
	}

	@Test
	@DisplayName("Record 1532: Fax is 516-222-2581")
	void FaxOfRecord1532() {
		assertEquals("516-222-2581", customers.get(1531).getFax());
	}

	@Test
	@DisplayName("Record 1532: Email is dolly@mccamey.com")
	void EmailOfRecord1532() {
		assertEquals("dolly@mccamey.com", customers.get(1531).getEmail());
	}

	@Test
	@DisplayName("Record 1532: Web is http://www.dollymccamey.com")
	void WebOfRecord1532() {
		assertEquals("http://www.dollymccamey.com", customers.get(1531).getWeb());
	}
}
