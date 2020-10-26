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

@Tag("36")
class Record_2749 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2749: FirstName is Salvador")
	void FirstNameOfRecord2749() {
		assertEquals("Salvador", customers.get(2748).getFirstName());
	}

	@Test
	@DisplayName("Record 2749: LastName is Machin")
	void LastNameOfRecord2749() {
		assertEquals("Machin", customers.get(2748).getLastName());
	}

	@Test
	@DisplayName("Record 2749: Company is American Swedish Hist Mus")
	void CompanyOfRecord2749() {
		assertEquals("American Swedish Hist Mus", customers.get(2748).getCompany());
	}

	@Test
	@DisplayName("Record 2749: Address is 16590 E 13mile Rd")
	void AddressOfRecord2749() {
		assertEquals("16590 E 13mile Rd", customers.get(2748).getAddress());
	}

	@Test
	@DisplayName("Record 2749: City is Roseville")
	void CityOfRecord2749() {
		assertEquals("Roseville", customers.get(2748).getCity());
	}

	@Test
	@DisplayName("Record 2749: County is Macomb")
	void CountyOfRecord2749() {
		assertEquals("Macomb", customers.get(2748).getCounty());
	}

	@Test
	@DisplayName("Record 2749: State is MI")
	void StateOfRecord2749() {
		assertEquals("MI", customers.get(2748).getState());
	}

	@Test
	@DisplayName("Record 2749: ZIP is 48066")
	void ZIPOfRecord2749() {
		assertEquals("48066", customers.get(2748).getZIP());
	}

	@Test
	@DisplayName("Record 2749: Phone is 586-773-0243")
	void PhoneOfRecord2749() {
		assertEquals("586-773-0243", customers.get(2748).getPhone());
	}

	@Test
	@DisplayName("Record 2749: Fax is 586-773-3878")
	void FaxOfRecord2749() {
		assertEquals("586-773-3878", customers.get(2748).getFax());
	}

	@Test
	@DisplayName("Record 2749: Email is salvador@machin.com")
	void EmailOfRecord2749() {
		assertEquals("salvador@machin.com", customers.get(2748).getEmail());
	}

	@Test
	@DisplayName("Record 2749: Web is http://www.salvadormachin.com")
	void WebOfRecord2749() {
		assertEquals("http://www.salvadormachin.com", customers.get(2748).getWeb());
	}
}
