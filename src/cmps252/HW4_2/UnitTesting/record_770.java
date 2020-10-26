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

@Tag("41")
class Record_770 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 770: FirstName is William")
	void FirstNameOfRecord770() {
		assertEquals("William", customers.get(769).getFirstName());
	}

	@Test
	@DisplayName("Record 770: LastName is Guffey")
	void LastNameOfRecord770() {
		assertEquals("Guffey", customers.get(769).getLastName());
	}

	@Test
	@DisplayName("Record 770: Company is Rose, William S Esq")
	void CompanyOfRecord770() {
		assertEquals("Rose, William S Esq", customers.get(769).getCompany());
	}

	@Test
	@DisplayName("Record 770: Address is 647 Marshall St")
	void AddressOfRecord770() {
		assertEquals("647 Marshall St", customers.get(769).getAddress());
	}

	@Test
	@DisplayName("Record 770: City is Elizabeth")
	void CityOfRecord770() {
		assertEquals("Elizabeth", customers.get(769).getCity());
	}

	@Test
	@DisplayName("Record 770: County is Union")
	void CountyOfRecord770() {
		assertEquals("Union", customers.get(769).getCounty());
	}

	@Test
	@DisplayName("Record 770: State is NJ")
	void StateOfRecord770() {
		assertEquals("NJ", customers.get(769).getState());
	}

	@Test
	@DisplayName("Record 770: ZIP is 7206")
	void ZIPOfRecord770() {
		assertEquals("7206", customers.get(769).getZIP());
	}

	@Test
	@DisplayName("Record 770: Phone is 908-965-3679")
	void PhoneOfRecord770() {
		assertEquals("908-965-3679", customers.get(769).getPhone());
	}

	@Test
	@DisplayName("Record 770: Fax is 908-965-8677")
	void FaxOfRecord770() {
		assertEquals("908-965-8677", customers.get(769).getFax());
	}

	@Test
	@DisplayName("Record 770: Email is william@guffey.com")
	void EmailOfRecord770() {
		assertEquals("william@guffey.com", customers.get(769).getEmail());
	}

	@Test
	@DisplayName("Record 770: Web is http://www.williamguffey.com")
	void WebOfRecord770() {
		assertEquals("http://www.williamguffey.com", customers.get(769).getWeb());
	}
}
