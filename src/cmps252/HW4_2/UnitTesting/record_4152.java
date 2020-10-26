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

@Tag("1")
class Record_4152 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4152: FirstName is Ervin")
	void FirstNameOfRecord4152() {
		assertEquals("Ervin", customers.get(4151).getFirstName());
	}

	@Test
	@DisplayName("Record 4152: LastName is Cooke")
	void LastNameOfRecord4152() {
		assertEquals("Cooke", customers.get(4151).getLastName());
	}

	@Test
	@DisplayName("Record 4152: Company is Precision Steel Services")
	void CompanyOfRecord4152() {
		assertEquals("Precision Steel Services", customers.get(4151).getCompany());
	}

	@Test
	@DisplayName("Record 4152: Address is 711 E Main St")
	void AddressOfRecord4152() {
		assertEquals("711 E Main St", customers.get(4151).getAddress());
	}

	@Test
	@DisplayName("Record 4152: City is Moorestown")
	void CityOfRecord4152() {
		assertEquals("Moorestown", customers.get(4151).getCity());
	}

	@Test
	@DisplayName("Record 4152: County is Burlington")
	void CountyOfRecord4152() {
		assertEquals("Burlington", customers.get(4151).getCounty());
	}

	@Test
	@DisplayName("Record 4152: State is NJ")
	void StateOfRecord4152() {
		assertEquals("NJ", customers.get(4151).getState());
	}

	@Test
	@DisplayName("Record 4152: ZIP is 8057")
	void ZIPOfRecord4152() {
		assertEquals("8057", customers.get(4151).getZIP());
	}

	@Test
	@DisplayName("Record 4152: Phone is 856-866-7160")
	void PhoneOfRecord4152() {
		assertEquals("856-866-7160", customers.get(4151).getPhone());
	}

	@Test
	@DisplayName("Record 4152: Fax is 856-866-2234")
	void FaxOfRecord4152() {
		assertEquals("856-866-2234", customers.get(4151).getFax());
	}

	@Test
	@DisplayName("Record 4152: Email is ervin@cooke.com")
	void EmailOfRecord4152() {
		assertEquals("ervin@cooke.com", customers.get(4151).getEmail());
	}

	@Test
	@DisplayName("Record 4152: Web is http://www.ervincooke.com")
	void WebOfRecord4152() {
		assertEquals("http://www.ervincooke.com", customers.get(4151).getWeb());
	}
}
