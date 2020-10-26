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
class Record_2213 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2213: FirstName is Jae")
	void FirstNameOfRecord2213() {
		assertEquals("Jae", customers.get(2212).getFirstName());
	}

	@Test
	@DisplayName("Record 2213: LastName is Milham")
	void LastNameOfRecord2213() {
		assertEquals("Milham", customers.get(2212).getLastName());
	}

	@Test
	@DisplayName("Record 2213: Company is Pennsylvania Vly Cheml Co Inc")
	void CompanyOfRecord2213() {
		assertEquals("Pennsylvania Vly Cheml Co Inc", customers.get(2212).getCompany());
	}

	@Test
	@DisplayName("Record 2213: Address is 142 Peconic Ave")
	void AddressOfRecord2213() {
		assertEquals("142 Peconic Ave", customers.get(2212).getAddress());
	}

	@Test
	@DisplayName("Record 2213: City is Medford")
	void CityOfRecord2213() {
		assertEquals("Medford", customers.get(2212).getCity());
	}

	@Test
	@DisplayName("Record 2213: County is Suffolk")
	void CountyOfRecord2213() {
		assertEquals("Suffolk", customers.get(2212).getCounty());
	}

	@Test
	@DisplayName("Record 2213: State is NY")
	void StateOfRecord2213() {
		assertEquals("NY", customers.get(2212).getState());
	}

	@Test
	@DisplayName("Record 2213: ZIP is 11763")
	void ZIPOfRecord2213() {
		assertEquals("11763", customers.get(2212).getZIP());
	}

	@Test
	@DisplayName("Record 2213: Phone is 631-654-0686")
	void PhoneOfRecord2213() {
		assertEquals("631-654-0686", customers.get(2212).getPhone());
	}

	@Test
	@DisplayName("Record 2213: Fax is 631-654-9991")
	void FaxOfRecord2213() {
		assertEquals("631-654-9991", customers.get(2212).getFax());
	}

	@Test
	@DisplayName("Record 2213: Email is jae@milham.com")
	void EmailOfRecord2213() {
		assertEquals("jae@milham.com", customers.get(2212).getEmail());
	}

	@Test
	@DisplayName("Record 2213: Web is http://www.jaemilham.com")
	void WebOfRecord2213() {
		assertEquals("http://www.jaemilham.com", customers.get(2212).getWeb());
	}
}
