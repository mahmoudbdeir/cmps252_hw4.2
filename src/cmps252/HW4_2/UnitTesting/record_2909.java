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

@Tag("7")
class Record_2909 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2909: FirstName is Vicente")
	void FirstNameOfRecord2909() {
		assertEquals("Vicente", customers.get(2908).getFirstName());
	}

	@Test
	@DisplayName("Record 2909: LastName is Luzader")
	void LastNameOfRecord2909() {
		assertEquals("Luzader", customers.get(2908).getLastName());
	}

	@Test
	@DisplayName("Record 2909: Company is Days Inn Santee")
	void CompanyOfRecord2909() {
		assertEquals("Days Inn Santee", customers.get(2908).getCompany());
	}

	@Test
	@DisplayName("Record 2909: Address is 7521 Maumee Western Rd")
	void AddressOfRecord2909() {
		assertEquals("7521 Maumee Western Rd", customers.get(2908).getAddress());
	}

	@Test
	@DisplayName("Record 2909: City is Maumee")
	void CityOfRecord2909() {
		assertEquals("Maumee", customers.get(2908).getCity());
	}

	@Test
	@DisplayName("Record 2909: County is Lucas")
	void CountyOfRecord2909() {
		assertEquals("Lucas", customers.get(2908).getCounty());
	}

	@Test
	@DisplayName("Record 2909: State is OH")
	void StateOfRecord2909() {
		assertEquals("OH", customers.get(2908).getState());
	}

	@Test
	@DisplayName("Record 2909: ZIP is 43537")
	void ZIPOfRecord2909() {
		assertEquals("43537", customers.get(2908).getZIP());
	}

	@Test
	@DisplayName("Record 2909: Phone is 419-867-5041")
	void PhoneOfRecord2909() {
		assertEquals("419-867-5041", customers.get(2908).getPhone());
	}

	@Test
	@DisplayName("Record 2909: Fax is 419-867-4695")
	void FaxOfRecord2909() {
		assertEquals("419-867-4695", customers.get(2908).getFax());
	}

	@Test
	@DisplayName("Record 2909: Email is vicente@luzader.com")
	void EmailOfRecord2909() {
		assertEquals("vicente@luzader.com", customers.get(2908).getEmail());
	}

	@Test
	@DisplayName("Record 2909: Web is http://www.vicenteluzader.com")
	void WebOfRecord2909() {
		assertEquals("http://www.vicenteluzader.com", customers.get(2908).getWeb());
	}
}
