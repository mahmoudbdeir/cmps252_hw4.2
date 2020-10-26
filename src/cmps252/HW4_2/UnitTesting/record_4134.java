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

@Tag("35")
class Record_4134 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4134: FirstName is Michell")
	void FirstNameOfRecord4134() {
		assertEquals("Michell", customers.get(4133).getFirstName());
	}

	@Test
	@DisplayName("Record 4134: LastName is Mansi")
	void LastNameOfRecord4134() {
		assertEquals("Mansi", customers.get(4133).getLastName());
	}

	@Test
	@DisplayName("Record 4134: Company is Mosler Schermer Wallstrom")
	void CompanyOfRecord4134() {
		assertEquals("Mosler Schermer Wallstrom", customers.get(4133).getCompany());
	}

	@Test
	@DisplayName("Record 4134: Address is 2130 Highway 35")
	void AddressOfRecord4134() {
		assertEquals("2130 Highway 35", customers.get(4133).getAddress());
	}

	@Test
	@DisplayName("Record 4134: City is Sea Girt")
	void CityOfRecord4134() {
		assertEquals("Sea Girt", customers.get(4133).getCity());
	}

	@Test
	@DisplayName("Record 4134: County is Monmouth")
	void CountyOfRecord4134() {
		assertEquals("Monmouth", customers.get(4133).getCounty());
	}

	@Test
	@DisplayName("Record 4134: State is NJ")
	void StateOfRecord4134() {
		assertEquals("NJ", customers.get(4133).getState());
	}

	@Test
	@DisplayName("Record 4134: ZIP is 8750")
	void ZIPOfRecord4134() {
		assertEquals("8750", customers.get(4133).getZIP());
	}

	@Test
	@DisplayName("Record 4134: Phone is 732-974-8694")
	void PhoneOfRecord4134() {
		assertEquals("732-974-8694", customers.get(4133).getPhone());
	}

	@Test
	@DisplayName("Record 4134: Fax is 732-974-7985")
	void FaxOfRecord4134() {
		assertEquals("732-974-7985", customers.get(4133).getFax());
	}

	@Test
	@DisplayName("Record 4134: Email is michell@mansi.com")
	void EmailOfRecord4134() {
		assertEquals("michell@mansi.com", customers.get(4133).getEmail());
	}

	@Test
	@DisplayName("Record 4134: Web is http://www.michellmansi.com")
	void WebOfRecord4134() {
		assertEquals("http://www.michellmansi.com", customers.get(4133).getWeb());
	}
}
