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
class Record_4051 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4051: FirstName is Margret")
	void FirstNameOfRecord4051() {
		assertEquals("Margret", customers.get(4050).getFirstName());
	}

	@Test
	@DisplayName("Record 4051: LastName is Morsey")
	void LastNameOfRecord4051() {
		assertEquals("Morsey", customers.get(4050).getLastName());
	}

	@Test
	@DisplayName("Record 4051: Company is Kilian, Robert J Ph")
	void CompanyOfRecord4051() {
		assertEquals("Kilian, Robert J Ph", customers.get(4050).getCompany());
	}

	@Test
	@DisplayName("Record 4051: Address is 535 S State St")
	void AddressOfRecord4051() {
		assertEquals("535 S State St", customers.get(4050).getAddress());
	}

	@Test
	@DisplayName("Record 4051: City is Clarks Summit")
	void CityOfRecord4051() {
		assertEquals("Clarks Summit", customers.get(4050).getCity());
	}

	@Test
	@DisplayName("Record 4051: County is Lackawanna")
	void CountyOfRecord4051() {
		assertEquals("Lackawanna", customers.get(4050).getCounty());
	}

	@Test
	@DisplayName("Record 4051: State is PA")
	void StateOfRecord4051() {
		assertEquals("PA", customers.get(4050).getState());
	}

	@Test
	@DisplayName("Record 4051: ZIP is 18411")
	void ZIPOfRecord4051() {
		assertEquals("18411", customers.get(4050).getZIP());
	}

	@Test
	@DisplayName("Record 4051: Phone is 570-586-4301")
	void PhoneOfRecord4051() {
		assertEquals("570-586-4301", customers.get(4050).getPhone());
	}

	@Test
	@DisplayName("Record 4051: Fax is 570-586-3666")
	void FaxOfRecord4051() {
		assertEquals("570-586-3666", customers.get(4050).getFax());
	}

	@Test
	@DisplayName("Record 4051: Email is margret@morsey.com")
	void EmailOfRecord4051() {
		assertEquals("margret@morsey.com", customers.get(4050).getEmail());
	}

	@Test
	@DisplayName("Record 4051: Web is http://www.margretmorsey.com")
	void WebOfRecord4051() {
		assertEquals("http://www.margretmorsey.com", customers.get(4050).getWeb());
	}
}
