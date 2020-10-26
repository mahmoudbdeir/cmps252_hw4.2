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

@Tag("34")
class Record_3775 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3775: FirstName is Clement")
	void FirstNameOfRecord3775() {
		assertEquals("Clement", customers.get(3774).getFirstName());
	}

	@Test
	@DisplayName("Record 3775: LastName is Fitts")
	void LastNameOfRecord3775() {
		assertEquals("Fitts", customers.get(3774).getLastName());
	}

	@Test
	@DisplayName("Record 3775: Company is Preferred Bldrs Warranty Corp")
	void CompanyOfRecord3775() {
		assertEquals("Preferred Bldrs Warranty Corp", customers.get(3774).getCompany());
	}

	@Test
	@DisplayName("Record 3775: Address is 6137 N 55th Ave")
	void AddressOfRecord3775() {
		assertEquals("6137 N 55th Ave", customers.get(3774).getAddress());
	}

	@Test
	@DisplayName("Record 3775: City is Glendale")
	void CityOfRecord3775() {
		assertEquals("Glendale", customers.get(3774).getCity());
	}

	@Test
	@DisplayName("Record 3775: County is Maricopa")
	void CountyOfRecord3775() {
		assertEquals("Maricopa", customers.get(3774).getCounty());
	}

	@Test
	@DisplayName("Record 3775: State is AZ")
	void StateOfRecord3775() {
		assertEquals("AZ", customers.get(3774).getState());
	}

	@Test
	@DisplayName("Record 3775: ZIP is 85301")
	void ZIPOfRecord3775() {
		assertEquals("85301", customers.get(3774).getZIP());
	}

	@Test
	@DisplayName("Record 3775: Phone is 623-934-7935")
	void PhoneOfRecord3775() {
		assertEquals("623-934-7935", customers.get(3774).getPhone());
	}

	@Test
	@DisplayName("Record 3775: Fax is 623-934-5234")
	void FaxOfRecord3775() {
		assertEquals("623-934-5234", customers.get(3774).getFax());
	}

	@Test
	@DisplayName("Record 3775: Email is clement@fitts.com")
	void EmailOfRecord3775() {
		assertEquals("clement@fitts.com", customers.get(3774).getEmail());
	}

	@Test
	@DisplayName("Record 3775: Web is http://www.clementfitts.com")
	void WebOfRecord3775() {
		assertEquals("http://www.clementfitts.com", customers.get(3774).getWeb());
	}
}
